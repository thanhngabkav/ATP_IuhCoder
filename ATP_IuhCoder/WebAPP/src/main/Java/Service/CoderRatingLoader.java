package Service;

import DataAccess.IATP_WebApiClient;
import Models.CoderRating;
import Models.WebAppException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.ClientResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by THANH NGA on 7/11/2017.
 */

/**
 * Uncompleted
 * Need to add restUri into properties file
 */
@Service
public class CoderRatingLoader implements ICoderRatingLoader{
    @Autowired
    private IATP_WebApiClient atp_webApiClient;

    @Autowired
    Environment environment;

    public List<CoderRating> loadTopCoder(int range) throws WebAppException {
        String restUri = environment.getProperty("LoadTopCoderUri")+range;
        String basAuthString = "";
        ClientResponse response = atp_webApiClient.getRequest(restUri, basAuthString);
        if (response.getStatus() == 200) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                List<CoderRating> coderRatings = (List<CoderRating>) objectMapper.readValue(response.getEntity(String.class), CoderRating.class);
                return  coderRatings;
            } catch (IOException e) {

                //Server Error
                throw new WebAppException(e.getStackTrace(), "SERVER ERROR", "CoderRatingLoader.class", "Can not convert from response entity to List<CoderRating>", "High");
            }
        }
        //response status not Ok (200)
        return null;
    }
}
