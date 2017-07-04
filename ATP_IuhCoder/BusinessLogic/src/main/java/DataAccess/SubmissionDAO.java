package DataAccess;

import Entities.Submission;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Stateless(name = "SubmissionDAOEJB")
@LocalBean
public class SubmissionDAO implements I_Local_SubmissionDAO {
    @PersistenceContext(unitName = "Entities")
    private EntityManager em;

    public SubmissionDAO() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void CreateSubmission(Submission submission) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.persist(submission);
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 34, "SubmissionDAO", "Create Submission Fail");
        }

    }

    @Override
    public void DeleteSubmission(Submission submisson) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.remove(em.merge(submisson));
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 48, "SubissionDAO", "Delete Submission Fail");
        }

    }

    @Override
    public Submission GetSubmissionByID(String submissionID) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("Submission.GetByID", Submission.class)
                    .setParameter("id", submissionID)
                    .getSingleResult();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 61, "SubmissionDAO", "Get Submission By ID fail");
        }
    }

    @Override
    public List<Submission> GetSubmissionByContestID(String contestID) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("Submission.GetByContestID", Submission.class)
                    .setParameter("contestID", contestID)
                    .getResultList();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 74, "SubmissionDAO", "Get Submission By ContestID fail");
        }
    }

    @Override
    public List<Submission> GetSubmissionByProblemID(String problemID) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("Submission.GetByProblemID", Submission.class)
                    .setParameter("problemID", problemID)
                    .getResultList();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 87, "SubmissionDAO", "Get Submission By ProblemID fail");
        }
    }

    @Override
    public List<Submission> GetSubmissionByStudentID(String studentID) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("Submission.GetByStudentID", Submission.class)
                    .setParameter("studentID", studentID)
                    .getResultList();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 100, "SubmissionDAO", "Get Submission By StudentID fail");
        }
    }

    @Override
    public List<Submission> GetSubmissionByStudent_ContestID(String studentID, String contestID)
            throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("Submission.GetByStudent_ContestID", Submission.class)
                    .setParameter("studentID", studentID)
                    .setParameter("contestID", contestID)
                    .getResultList();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 114, "SubmissionDAO", "Get Submission By StudentID and ContestID fail");
        }
    }

    @Override
    public List<Submission> GetSubmissionByStudent_ProblemID(String studentID, String problemID)
            throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("Submission.GetByStudentID_ProblemID", Submission.class)
                    .setParameter("studentID", studentID)
                    .setParameter("problemID", problemID)
                    .getResultList();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 129, "SubmissionDAO", "Get Submission By StudentID and ProblemID fail");
        }
    }

    @Override
    public List<Submission> GetAllSubmission() throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("Submission.GetAll", Submission.class).getResultList();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 129, "SubmissionDAO", "Get All Submission fail");
        }
    }
}
