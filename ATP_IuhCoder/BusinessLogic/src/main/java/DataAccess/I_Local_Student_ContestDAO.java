package DataAccess;

import Entities.StudentContestDetail;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Local
public interface I_Local_Student_ContestDAO {
    /**
     *
     * @param student_ContestDetail
     * @throws ATP_ExceptionHandler
     */
    void CreateStudentContestDetail(StudentContestDetail student_ContestDetail) throws ATP_ExceptionHandler;

    /**
     *
     * @return
     * @throws ATP_ExceptionHandler
     */
    List<StudentContestDetail> GetAllStudentContestDetail() throws ATP_ExceptionHandler;

    /**
     *
     * @param studentID
     * @param contestID
     * @return
     * @throws ATP_ExceptionHandler
     */
    StudentContestDetail GetStudent_ContestDetail(String studentID, String contestID) throws ATP_ExceptionHandler;

    /**
     *
     * @param contestID
     * @return
     * @throws ATP_ExceptionHandler
     */
    List<StudentContestDetail> GetStudentContestDetailByContestID(String contestID) throws ATP_ExceptionHandler;

    /**
     *
     * @param studentID
     * @return
     * @throws ATP_ExceptionHandler
     */
    List<StudentContestDetail> GetStudentContestDetailByStudentID(String studentID) throws ATP_ExceptionHandler;
}
