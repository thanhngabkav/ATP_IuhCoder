package DataAccess;

import Entities.Student;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Local
public interface I_Local_StudentDAO {
    /**
     *
     * @param student
     * @throws ATP_ExceptionHandler
     */
    void CreateStudent(Student student) throws ATP_ExceptionHandler;

    /**
     *
     * @param student
     * @throws ATP_ExceptionHandler
     */
    void DeleteStudent(Student student) throws ATP_ExceptionHandler;

    /**
     *
     * @param student
     * @throws ATP_ExceptionHandler
     */
    void EditStudent(Student student) throws ATP_ExceptionHandler;

    /**
     *
     * @param studentID
     * @return
     * @throws ATP_ExceptionHandler
     */
    Student GetStudentByID(String studentID) throws ATP_ExceptionHandler;

    /**
     *
     * @param userName
     * @return
     * @throws ATP_ExceptionHandler
     */
    Student GetStudentByUserName(String userName) throws ATP_ExceptionHandler;

    /**
     *
     * @return
     * @throws ATP_ExceptionHandler
     */
    List<Student> GetAllStudent() throws ATP_ExceptionHandler;
}
