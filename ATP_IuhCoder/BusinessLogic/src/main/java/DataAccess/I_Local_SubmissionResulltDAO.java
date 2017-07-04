package DataAccess;

import Entities.SubmissionResult;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.Local;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Local
public interface I_Local_SubmissionResulltDAO {
    SubmissionResult GetSubmissionResultBySubmissionID(String submissionID) throws ATP_ExceptionHandler;

    void CreateSubmission(SubmissionResult submissionResult) throws ATP_ExceptionHandler;

    void EditSubmissionResult(SubmissionResult submissionResult) throws ATP_ExceptionHandler;

    void DeleteSubmissionResult(SubmissionResult submissionResult) throws ATP_ExceptionHandler;
}
