package Services;

import Config.ApplicationConfig;
import DataAccess.IATP_WebApiClient;
import Models.CoderRating;
import Models.WebAppException;
import Service.CoderRatingLoader;
import Service.ICoderRatingLoader;
import com.google.gson.Gson;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.header.InBoundHeaders;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by lldtien on 7/17/2017.
 */
@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class CodeRatingLoaderTest {

    @Mock
    Environment environment;

    @Mock
    private IATP_WebApiClient atp_webApiClient;

    @Autowired
    ICoderRatingLoader iCoderRatingLoader;

    @Test
    public void testSuccessLoadTopCoder() throws WebAppException, IOException {
        int range = 10;
        ClientResponse clientResponse = mock(ClientResponse.class);

        //when(environment.getProperty("LoadTopCoderUri") + range).thenReturn("");
        when(atp_webApiClient.getRequest(range + "", "")).thenReturn(clientResponse);
        when(clientResponse.getStatus()).thenReturn(200);
        when(clientResponse.getEntity(String.class)).thenReturn(getTestClientResponse());

        List<CoderRating> actual = iCoderRatingLoader.loadTopCoder(range);
        List<CoderRating> expect = getTestListCoderRating();
        Assert.assertEquals(expect, actual);

    }

    private String getTestClientResponse() throws IOException {
        return  new Gson().toJson(getTestListCoderRating());
    }

    private List<CoderRating> getTestListCoderRating() {
        List<CoderRating> coderRatings = new ArrayList<CoderRating>();
        CoderRating cd = new CoderRating("TIen", "69");
        CoderRating cd2 = new CoderRating("Neit", "96");
        coderRatings.add(cd);
        coderRatings.add(cd2);
        return coderRatings;
    }
}
