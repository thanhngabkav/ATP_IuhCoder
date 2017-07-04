package DataAccess;

import Entities.Submission;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Local
public interface I_Local_SubmissionDAO {
    void CreateSubmission(Submission submission) throws ATP_ExceptionHandler;

    void DeleteSubmission(Submission submisson) throws ATP_ExceptionHandler;

    Submission GetSubmissionByID(String submissionID) throws ATP_ExceptionHandler;

    List<Submission> GetSubmissionByContestID(String contestID) throws ATP_ExceptionHandler;

    List<Submission> GetSubmissionByProblemID(String problemID) throws ATP_ExceptionHandler;

    List<Submission> GetSubmissionByStudentID(String studentID) throws ATP_ExceptionHandler;

    List<Submission> GetSubmissionByStudent_ContestID(String studentID, String contestID) throws ATP_ExceptionHandler;

    List<Submission> GetSubmissionByStudent_ProblemID(String StudentID, String problemID) throws ATP_ExceptionHandler;

    List<Submission> GetAllSubmission() throws ATP_ExceptionHandler;
}
