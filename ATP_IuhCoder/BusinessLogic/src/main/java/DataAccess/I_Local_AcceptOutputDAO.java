package DataAccess;

import Entities.AcceptOutput;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by THANH NGA on 6/18/2017.
 */
@Local
public interface I_Local_AcceptOutputDAO {
    /**
     *
     * @param acceptOutput
     * @throws ATP_ExceptionHandler
     */
    void CreateAcceptOutput(AcceptOutput acceptOutput) throws ATP_ExceptionHandler;

    /**
     *
     * @param submissionID
     * @return
     * @throws ATP_ExceptionHandler
     */
    List<AcceptOutput> GetAllAcceptOutputBySubmission(int submissionID) throws ATP_ExceptionHandler;
}
