package DataAccess;

import Entities.Problem;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Local
public interface I_Local_ProblemDAO {
    void CreateProblem(Problem problem) throws ATP_ExceptionHandler;

    void EditProblem(Problem problem) throws ATP_ExceptionHandler;

    void DeleteProblem(Problem problem) throws ATP_ExceptionHandler;

    List<Problem> GetAllProblem() throws ATP_ExceptionHandler;

    List<Problem> GetProblemByContestID(String contestID) throws ATP_ExceptionHandler;

    Problem GetProblemByID(String problemID) throws ATP_ExceptionHandler;
}
