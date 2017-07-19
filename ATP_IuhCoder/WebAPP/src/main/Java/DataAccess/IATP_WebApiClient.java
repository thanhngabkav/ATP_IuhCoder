package DataAccess;

import com.sun.jersey.api.client.ClientResponse;

/**
 * Created by THANH NGA on 7/11/2017.
 */
public interface IATP_WebApiClient {
    ClientResponse getRequest(String url, String basicAuthentication);
    ClientResponse postRequest(String url, String contentType, String content, String basicAuthentication);
    ClientResponse putRequest(String url, String contentType, String content, String basicAuthentication);
    ClientResponse deleteRequest(String url, String contentType, String content, String basicAuthentication);
}
