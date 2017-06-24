package DataAccess;

import Entities.SubmissionResult;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Stateless(name = "SubmissionResultDAOEJB")
@LocalBean
public class SubmissionResultDAO implements I_Local_SubmissionResulltDAO {
    @PersistenceContext(unitName = "Entities")
    private EntityManager em;

    public SubmissionResultDAO() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public SubmissionResult GetSubmissionResultBySubmissionID(String submissionID) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("SubmissionResult.GetByID", SubmissionResult.class)
                    .setParameter("id", submissionID)
                    .getSingleResult();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 31, "SubmissionResult", "Get SubmissionResult by ID fail");
        }
    }

    @Override
    public void CreateSubmission(SubmissionResult submissionResult) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.persist(submissionResult);
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 45, "SubmissionResult", "Create SubmissionResult by ID fail");
        }
    }

    @Override
    public void EditSubmissionResult(SubmissionResult submissionResult) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.merge(submissionResult);
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 58, "SubmissionResult", "Edit SubmissionResult by ID fail");
        }
    }

    @Override
    public void DeleteSubmissionResult(SubmissionResult submissionResult) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.remove(em.merge(submissionResult));
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 71, "SubmissionResult", "Delete SubmissionResult by ID fail");
        }
    }
}
