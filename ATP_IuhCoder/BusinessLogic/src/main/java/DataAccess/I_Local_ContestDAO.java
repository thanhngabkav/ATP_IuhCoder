package DataAccess;

import Entities.Contest;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Local
public interface I_Local_ContestDAO {

    /**
     *
     * @param contest
     * @throws ATP_ExceptionHandler
     */
    void CreateContest(Contest contest) throws ATP_ExceptionHandler;

    /**
     *
     * @param contest
     * @throws ATP_ExceptionHandler
     */
    void DeleteContest(Contest contest) throws ATP_ExceptionHandler;

    /**
     *
     * @param contest
     * @throws ATP_ExceptionHandler
     */
    void EditContest(Contest contest) throws ATP_ExceptionHandler;

    /**
     *
     * @return
     * @throws ATP_ExceptionHandler
     */
    List<Contest> GetAllContest() throws ATP_ExceptionHandler;

    /**
     *
     * @param contestID
     * @return
     * @throws ATP_ExceptionHandler
     */
    Contest GetContestByID(String contestID) throws ATP_ExceptionHandler;
}
