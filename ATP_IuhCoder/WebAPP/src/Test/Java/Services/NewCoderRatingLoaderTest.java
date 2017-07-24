package Services;

import Config.ApplicationConfig;
import DataAccess.IATP_WebApiClient;
import Models.CoderRating;
import Models.WebAppException;
import Service.ICoderRatingLoader;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.header.InBoundHeaders;
import com.sun.jersey.core.spi.factory.MessageBodyFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class NewCoderRatingLoaderTest {


    @Mock
    private IATP_WebApiClient atp_webApiClient;

    @Autowired
    ICoderRatingLoader iCoderRatingLoader;

    @Before
    public void before() throws JsonProcessingException {
        //WebResource resource = mock( WebResource.class );
        ClientResponse response = mock(ClientResponse.class);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonValue = objectMapper.writeValueAsString(getTestListCoderRating());
        InputStream in = new ByteArrayInputStream(jsonValue.getBytes());
        response.setEntityInputStream(in);
        response.setStatus(ClientResponse.Status.OK);
        when(atp_webApiClient.getRequest("1010",""))
                .thenReturn(response);
    }

    @Test
    public void Test1() throws WebAppException, JsonProcessingException {
        List<CoderRating> expect = getTestListCoderRating();
        List<CoderRating> actual = iCoderRatingLoader.loadTopCoder(10);
        Assert.assertEquals(expect,actual);
    }
    private List<CoderRating> getTestListCoderRating() {
        List<CoderRating> listCoderRating = new ArrayList<CoderRating>();
        CoderRating cd = new CoderRating("TIen", "69");
        CoderRating cd2 = new CoderRating("Neit", "96");
        listCoderRating.add(cd);
        listCoderRating.add(cd2);
        return listCoderRating;
    }

}
