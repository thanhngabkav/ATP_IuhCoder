package Service;

import DataAccess.IATP_WebApiClient;
import Models.CoderRating;
import Models.ProblemRating;
import Models.WebAppException;
import Utilities.ErrorLevel;
import Utilities.ErrorStatus;
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
public class ProblemRatingLoader implements IProblemRatingLoader{

    @Autowired
    private IATP_WebApiClient atp_webApiClient;

    @Autowired
    private Environment environment;

    public List<ProblemRating> loadTopNewestProblem(int range) throws WebAppException {
        String restUri = environment.getProperty("LoadTopNewestProblem")+range;
        String basAuthString = "";
        ClientResponse response = atp_webApiClient.getRequest(restUri, basAuthString);
        if (response.getStatus() == ClientResponse.Status.OK.getStatusCode()) {
            ObjectMapper objectMapper = new ObjectMapper();
            String json = response.getEntity(String.class);
            try {
                List<ProblemRating> problemRatings = (List<ProblemRating>) objectMapper.readValue(response.getEntity(String.class), ProblemRating.class);
                return problemRatings;
            } catch (IOException e) {
                //Server Error
                throw new WebAppException(e.getStackTrace(), ErrorStatus.SERVER_ERROR, ProblemRatingLoader.class.getSimpleName(), "Can not convert from response entity to List<ProblemRatingLoader>", ErrorLevel.HIGH);
            }
        }
        //response status not Ok (200)
        return null;
    }
}
