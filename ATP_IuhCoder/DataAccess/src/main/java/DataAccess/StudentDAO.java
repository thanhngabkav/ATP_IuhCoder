package DataAccess;

import Entities.Student;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Stateless(name = "StudentDAOEJB")
@LocalBean
public class StudentDAO implements I_Local_StudentDAO {
    @PersistenceContext(unitName = "Entities")
    private EntityManager em;

    public StudentDAO() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void CreateStudent(Student student) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 32, "SudentDAO", "Create Student Fail");
        }
    }

    @Override
    public void DeleteStudent(Student student) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.remove(em.merge(student));
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 45, "SudentDAO", "Delete Student Fail");
        }
    }

    @Override
    public void EditStudent(Student student) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.merge(student);
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 58, "SudentDAO", "Edit Student Fail");
        }
    }

    @Override
    public Student GetStudentByID(String studentID) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("Student.GetByID", Student.class)
                    .setParameter("studentID", studentID)
                    .getSingleResult();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 63, "SudentDAO", "Get Student By ID fail");
        }
    }

    @Override
    public List<Student> GetAllStudent() throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("Student.GetAll", Student.class)
                    .getResultList();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("=====EM: "+em);
            throw new ATP_ExceptionHandler(e.getMessage(), 82, "SudentDAO", "Get All Student fail");
        }
    }

    @Override
    public Student GetStudentByUserName(String userName) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("Student.GetByUserName", Student.class)
                    .setParameter("userName", userName)
                    .getSingleResult();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 94, "StudentDAO", "Get Student By UserName fail");
        }
    }
}
