package DataAccess;

import Entities.Contest;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Stateless(name = "ContestDAOEJB")
@LocalBean
public class ContestDAO implements I_Local_ContestDAO {

    @PersistenceContext(unitName = "Entities")
    private EntityManager em;

    public ContestDAO() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void CreateContest(Contest contest) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.persist(contest);
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 34, "ContestDAO", "Create Conrest Fail");
        }
    }

    @Override
    public void DeleteContest(Contest contest) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.remove(em.merge(contest));
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 48, "ContestDAO", "Delete Contest Fail");
        }
    }

    @Override
    public void EditContest(Contest contest) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.merge(contest);
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 62, "ContestDAO", "Edit Contest Fail");
        }
    }

    @Override
    public List<Contest> GetAllContest() throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("Contest.GetAll", Contest.class).getResultList();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 74, "ContestDAO", "Get All Contest Fail");
        }
    }

    @Override
    public Contest GetContestByID(String contestID) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("Contest.GetByID", Contest.class)
                    .setParameter("contestID", contestID)
                    .getSingleResult();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 85, "ContestDAO", "Get Contest By ID Fail");
        }
    }
}
