package DataAccess;

import com.sun.jersey.api.client.ClientResponse;

/**
 * Created by THANH NGA on 7/11/2017.
 */
public interface IATP_WebApiClient {
    /**
     * Sent GET request to ATP_WebApi server
     * @param url : web api url
     * @param basicAuthentication : basic authentication string
     * @return ClientResponse
     */

    ClientResponse getRequest(String url, String basicAuthentication);
    /**
     * Sent POST request to ATP_WebApi server
     * @param url : web api url
     * @param content : object to POST
     * @param basicAuthentication : basic authentication string
     * @return ClientResponse
     */
    ClientResponse postRequest(String url, String contentType, String content, String basicAuthentication);

    /**
     * Sent PUT request to ATP_WebApi server
     * @param url : web api url
     * @param contentType : consume type in web api server
     * @param content : object to PUT
     * @param basicAuthentication : basic authentication string
     * @return ClientResponse
     */
    ClientResponse putRequest(String url, String contentType, String content, String basicAuthentication);

    /**
     * Sent DELETE request to ATP_WebApi server
     * @param url : web api url
     * @param contentType : consume type in web api server
     * @param content :  object to DELETE
     * @param basicAuthentication : basic authentication string
     * @return ClientResponse
     */
    ClientResponse deleteRequest(String url, String contentType, String content, String basicAuthentication);
}
