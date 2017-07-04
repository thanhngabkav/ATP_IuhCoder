package DataAccess;

import Entities.Output;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Local
public interface I_Local_OutputDAO {
    void CreateOutput(Output output) throws ATP_ExceptionHandler;

    void EditOutput(Output output) throws ATP_ExceptionHandler;

    void DeleteOutput(Output output) throws ATP_ExceptionHandler;

    Output GetOutput(int outputID, String problemID) throws ATP_ExceptionHandler;

    List<Output> GetOutputByProblemID(String problemID) throws ATP_ExceptionHandler;
}
