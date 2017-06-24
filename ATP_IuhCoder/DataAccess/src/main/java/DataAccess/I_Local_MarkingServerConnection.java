package DataAccess;

import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.Local;
import java.net.HttpURLConnection;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Local
public interface I_Local_MarkingServerConnection {
    HttpURLConnection GetConnection(String serverUrl) throws ATP_ExceptionHandler;

    void CloseConnection(HttpURLConnection connection) throws ATP_ExceptionHandler;
}
