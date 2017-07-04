package DataAccess;

import Entities.Problem;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Stateless(name = "ProblemDAOEJB")
@LocalBean
public class ProblemDAO implements I_Local_ProblemDAO {
    @PersistenceContext(unitName = "Entities")
    private EntityManager em;

    public ProblemDAO() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void CreateProblem(Problem problem) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.persist(problem);
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 31, "ProblemDAO", "Create Problem Fail!");
        }
    }

    @Override
    public void EditProblem(Problem problem) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.merge(problem);
            em.getTransaction().commit();

        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 43, "ProblemDAO", "Edit Problem Fail!");
        }
    }

    @Override
    public void DeleteProblem(Problem problem) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.remove(em.merge(problem));
            em.getTransaction().commit();

        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 56, "ProblemDAO", "Delete Problem Fail!");
        }
    }

    @Override
    public List<Problem> GetAllProblem() throws ATP_ExceptionHandler {
        try {
            return em.createNamedQuery("Problem.GetAll", Problem.class).getResultList();
        } catch (Exception e) {
            throw new ATP_ExceptionHandler(e.getMessage(), 65, "ProblemDAO", "Get ALl Problems Fail!");
        }
    }

    @Override
    public List<Problem> GetProblemByContestID(String contestID) throws ATP_ExceptionHandler {
        try {
            return em.createNamedQuery("Problem.GetByContestID", Problem.class)
                    .setParameter("contestID", contestID)
                    .getResultList();
        } catch (Exception e) {
            throw new ATP_ExceptionHandler(e.getMessage(), 74, "ProblemDAO", "Get Problems by ContestID Fail!");
        }
    }

    @Override
    public Problem GetProblemByID(String problemID) throws ATP_ExceptionHandler {
        try {
            return em.createNamedQuery("Problem.GetByID", Problem.class)
                    .setParameter("problemID", problemID)
                    .getSingleResult();
        } catch (Exception e) {
            throw new ATP_ExceptionHandler(e.getMessage(), 85, "ProblemDAO", "Get Problem By ID Fail!");
        }
    }
}
