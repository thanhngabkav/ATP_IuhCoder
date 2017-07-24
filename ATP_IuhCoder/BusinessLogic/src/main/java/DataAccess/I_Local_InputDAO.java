package DataAccess;

import Entities.Input;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Local
public interface I_Local_InputDAO {

    /**
     *
     * @param input
     * @throws ATP_ExceptionHandler
     */
    void CreateInput(Input input) throws ATP_ExceptionHandler;

    /**
     *
     * @param input
     * @throws ATP_ExceptionHandler
     */
    void DeleteInput(Input input) throws ATP_ExceptionHandler;

    /**
     *
     * @param input
     * @throws ATP_ExceptionHandler
     */
    void EditInput(Input input) throws ATP_ExceptionHandler;

    /**
     *
     * @param inputID
     * @param problemID
     * @return
     * @throws ATP_ExceptionHandler
     */
    Input GetInput(int inputID, String problemID) throws ATP_ExceptionHandler;

    /**
     *
     * @param problemID
     * @return
     * @throws ATP_ExceptionHandler
     */
    List<Input> GetInputByProblemID(String problemID) throws ATP_ExceptionHandler;
}
