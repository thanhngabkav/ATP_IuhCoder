package DataAccess;

import Entities.StudentContestDetail;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Stateless(name = "Student_ContestDAOEJB")
@LocalBean
public class Student_ContestDAO implements I_Local_Student_ContestDAO {
    @PersistenceContext(unitName = "Entities")
    private EntityManager em;

    public Student_ContestDAO() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void CreateStudentContestDetail(StudentContestDetail student_ContestDetail) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.persist(student_ContestDetail);
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 34, "Student_ContestDetailDAO", "Create StudentContestDetail Fail");
        }
    }

    @Override
    public List<StudentContestDetail> GetAllStudentContestDetail() throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("Student_ContestDetail.GetAll", StudentContestDetail.class).getResultList();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 46, "Student_ContestDetailDAO", "Get All Student_ContestDetail Fail");
        }
    }

    @Override
    public StudentContestDetail GetStudent_ContestDetail(String studentID, String contestID)
            throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("GetStudent_ContestDetail.GetByID", StudentContestDetail.class)
                    .setParameter("studentID", studentID)
                    .setParameter("contestID", contestID)
                    .getSingleResult();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 58, "Student_ContestDetailDAO", "Get Student_ContestDetail By ID Fail");
        }
    }

    @Override
    public List<StudentContestDetail> GetStudentContestDetailByContestID(String contestID)
            throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("GetStudent_ContestDetail.GetByContestID", StudentContestDetail.class)
                    .setParameter("contestID", contestID)
                    .getResultList();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 73, "Student_ContestDetailDAO", "Get Student_ContestDetail By ContestID Fail");
        }
    }

    @Override
    public List<StudentContestDetail> GetStudentContestDetailByStudentID(String studentID)
            throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("GetStudent_ContestDetail.GetByStudentID", StudentContestDetail.class)
                    .setParameter("studentID", studentID)
                    .getResultList();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 87, "Student_ContestDetailDAO", "Get Student_ContestDetail By StudentID Fail");
        }
    }
}
