package DataAccess;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.MediaType;
import java.awt.*;


/**
 * Created by THANH NGA on 7/11/2017.
 */
@Component
/**
 * Connect to webapi and get json response
 */
public class ATP_WebApiClient implements IATP_WebApiClient {

    public ClientResponse getRequest(String url, String basicAuthentication) {
        Client client = Client.create();
        WebResource webResource = client.resource(url);
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON)
                                            .header("Authorization","Basic "+basicAuthentication)
                                            .get(ClientResponse.class);
        return response;
    }

    public ClientResponse postRequest(String url, String contentType, String content, String basicAuthentication) {
        Client client = Client.create();
        WebResource webResource = client.resource(url);
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON)
                .header("Authorization","Basic "+basicAuthentication)
                .post(ClientResponse.class,content);
        return response;
    }

    public ClientResponse putRequest(String url, String contentType, String content, String basicAuthentication) {
        Client client = Client.create();
        WebResource webResource = client.resource(url);
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON)
                .header("Authorization","Basic "+basicAuthentication)
                .put(ClientResponse.class,content);
        return response;
    }

    public ClientResponse deleteRequest(String url, String contentType, String content, String basicAuthentication) {
        Client client = Client.create();
        WebResource webResource = client.resource(url);
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON)
                .header("Authorization","Basic "+basicAuthentication)
                .delete(ClientResponse.class,content);
        return response;
    }

}
