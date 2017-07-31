package DataAccess;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.MediaType;
import java.awt.*;


/**
 * Created by THANH NGA on 7/11/2017.
 */
@Component
/**
 * Connect to web api and get response with json entity
 */
public class ATP_WebApiClient implements IATP_WebApiClient {

    public ClientResponse getRequest(String url, String basicAuthentication, String acceptContentType) {
        Client client = Client.create();
        WebResource webResource = client.resource(url);
        ClientResponse response = webResource.accept(acceptContentType)
                                            .header("Authorization","Basic "+basicAuthentication)
                                            .get(ClientResponse.class);
        return response;
    }

    public ClientResponse postRequest(String url, String contentType, String content, String basicAuthentication) {
        Client client = Client.create();
        WebResource webResource = client.resource(url);
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON)
                .header("Authorization","Basic "+basicAuthentication)
                .type(contentType)
                .post(ClientResponse.class,content);
        return response;
    }

    public ClientResponse putRequest(String url, String contentType, String content, String basicAuthentication) {
        Client client = Client.create();
        WebResource webResource = client.resource(url);
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON)
                .header("Authorization","Basic "+basicAuthentication)
                .type(contentType)
                .put(ClientResponse.class,content);
        return response;
    }

    public ClientResponse deleteRequest(String url, String contentType, String content, String basicAuthentication) {
        Client client = Client.create();
        WebResource webResource = client.resource(url);
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON)
                .header("Authorization","Basic "+basicAuthentication)
                .type(contentType)
                .delete(ClientResponse.class,content);
        return response;
    }

}
