package DataAccess;

import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.core.MediaType;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Stateless(name = "MarkingServerConectionEJB")
@LocalBean
public class MarkingServerConection implements I_Local_MarkingServerConnection {
    public MarkingServerConection() {
    }

    @Override
    public HttpURLConnection GetConnection(String serverUrl) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            URL url = new URL(serverUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestProperty("Content-Type", MediaType.APPLICATION_JSON);
            connection.setRequestMethod("GET");
            return connection;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            throw new ATP_ExceptionHandler(e.getMessage(), 30, "MarkingServerConnection", "Create Connection Fail");
        }
    }

    @Override
    public void CloseConnection(HttpURLConnection connection) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            connection.disconnect();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 48, "MarkingServerConnection", "Disconnect Fail");
        }

    }
}
