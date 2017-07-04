package DataAccess;

import Entities.NotAcceptOutput;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Stateless(name = "NotAcceptOutputDAOEJB")
@LocalBean
public class NotAcceptOutputDAO implements I_Local_NotAcceptOutputDAO {
    @PersistenceContext(unitName = "Entities")
    private EntityManager em;

    public NotAcceptOutputDAO() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void CreateNotAcceptOutput(NotAcceptOutput notAcceptOutput) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.persist(notAcceptOutput);
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 34, "NotAcceptOutputDAO", "Create NotAcceptOutput Fail");
        }
    }

    @Override
    public List<NotAcceptOutput> GetAllNotAcceptOutputBySubmission(int submissionID) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("NotAcceptOutput.GetBySubmissonID", NotAcceptOutput.class)
                    .setParameter("submissionID", submissionID)
                    .getResultList();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 47, "NotAcceptOutputDAO", "Get All NotAccept Output by Submission Fail");
        }
    }
}
