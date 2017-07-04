package DataAccess;

import Entities.Teacher;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.Local;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Local
public interface I_Local_TeacherDAO {
    void CreateTeacher(Teacher teacher) throws ATP_ExceptionHandler;

    Teacher GetTeacherInfo(String teacherID) throws ATP_ExceptionHandler;

    void UpdateTeacherInfo(Teacher teacher) throws ATP_ExceptionHandler;
}
