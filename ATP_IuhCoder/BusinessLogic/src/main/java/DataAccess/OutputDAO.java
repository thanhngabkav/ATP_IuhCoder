package DataAccess;

import Entities.Output;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Stateless(name = "OutputDAOEJB")
@LocalBean
public class OutputDAO implements I_Local_OutputDAO {
    @PersistenceContext(unitName = "Entities")
    private EntityManager em;

    public OutputDAO() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void CreateOutput(Output output) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.persist(output);
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 33, "OutputDAO", "Create Output Fail!");
        }
    }

    @Override
    public void EditOutput(Output output) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.merge(output);
            em.getTransaction().commit();

        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 43, "OutputDAO", "Edit Output Fail!");
        }
    }

    @Override
    public void DeleteOutput(Output output) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            em.getTransaction().begin();
            em.remove(em.merge(output));
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 58, "OutputDAO", "Delete Output Fail!");
        }
    }

    @Override
    public Output GetOutput(int outputID, String problemID) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("Output.GetByOutput_ProblemID", Output.class)
                    .setParameter("outputID", outputID)
                    .setParameter("problemID", problemID)
                    .getSingleResult();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 71, "OutputDAO", "Get Output By ID Fail!");
        }
    }

    @Override
    public List<Output> GetOutputByProblemID(String problemID) throws ATP_ExceptionHandler {
        // TODO Auto-generated method stub
        try {
            return em.createNamedQuery("Output.GetByProblemID", Output.class)
                    .setParameter("problemID", problemID)
                    .getResultList();
        } catch (Exception e) {
            // TODO: handle exception
            throw new ATP_ExceptionHandler(e.getMessage(), 85, "OutputDAO", "Get Output By ID Fail!");
        }

    }
}
