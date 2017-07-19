package Services;

import Config.ApplicationConfig;
import DataAccess.IATP_WebApiClient;
import Models.CoderRating;
import Models.WebAppException;
import Service.ICoderRatingLoader;
import com.sun.jersey.api.client.ClientResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

/**
 * Created by lldtien on 7/17/2017.
 */
@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class CodeRatingLoaderTest {

    @Autowired
    Environment environment;
    @Autowired
    ICoderRatingLoader iCoderRatingLoader;
    @Autowired
    private IATP_WebApiClient atp_webApiClient;

    @Test
    public void testSuccessLoadTopCoder() throws WebAppException, IOException {
        int range = 10;
//        ClientResponse clientResponse = getTestClientResponse();
        when(environment.getProperty("LoadTopCoderUri") + range).thenReturn("");
//        when(atp_webApiClient.getRequest("","")).thenReturn();

        iCoderRatingLoader.loadTopCoder(range);

    }

//    private ClientResponse getTestClientResponse() throws IOException {
//        Response.StatusType statusType = Status.OK;
//        ClientResponse testClientResponse = new ClientResponse(statusType,null, );
//        return testClientResponse;
//    }
    private List<CoderRating> getTestListCoderRating(){
        List<CoderRating> coderRatings = new ArrayList<CoderRating>();
        CoderRating cd = new CoderRating("TIen", "69");
        CoderRating cd2 = new CoderRating("Neit", "96");
        coderRatings.add(cd);
        coderRatings.add(cd2);
        return coderRatings;
    }
}
