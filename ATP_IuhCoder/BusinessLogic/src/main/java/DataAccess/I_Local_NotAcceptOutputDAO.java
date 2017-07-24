package DataAccess;

import Entities.NotAcceptOutput;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Local
public interface I_Local_NotAcceptOutputDAO {
    /**
     *
     * @param notAcceptOutput
     * @throws ATP_ExceptionHandler
     */
    void CreateNotAcceptOutput(NotAcceptOutput notAcceptOutput) throws ATP_ExceptionHandler;

    /**
     *
     * @param submissionID
     * @return
     * @throws ATP_ExceptionHandler
     */
    List<NotAcceptOutput> GetAllNotAcceptOutputBySubmission(int submissionID) throws ATP_ExceptionHandler;
}
