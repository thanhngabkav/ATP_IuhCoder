package DataAccess;

import Entities.Input;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Stateless(name = "InputDAOEJB")
@LocalBean
public class InputDAO implements I_Local_InputDAO {
    @PersistenceContext(unitName = "Entities")
    private EntityManager em;

    public InputDAO() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void CreateInput(Input input) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.persist(input);
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 34, "InputDAO", "Create Input Fail");
        }

    }

    @Override
    public void DeleteInput(Input input) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.remove(em.merge(input));
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 48, "InputDAO", "Delete Input Fail");
        }

    }

    @Override
    public void EditInput(Input input) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.merge(input);
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 62, "InputDAO", "Edit Input Fail");
        }
    }

    @Override
    public Input GetInput(int inputID, String problemID) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        return em.createNamedQuery("Input.GetByInput_ProblemID", Input.class)
                .setParameter("inputID", inputID)
                .setParameter("problemID", problemID)
                .getSingleResult();
    }

    @Override
    public List<Input> GetInputByProblemID(String problemID) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        return em.createNamedQuery("Input.GetByProblemID", Input.class)
                .setParameter("problemId", problemID)
                .getResultList();
    }
}
