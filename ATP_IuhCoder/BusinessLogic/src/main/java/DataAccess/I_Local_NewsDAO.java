package DataAccess;

import Entities.News;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.Local;
import java.util.*;
@Local
public interface I_Local_NewsDAO {
    /**
     *
     * @param news
     * @throws ATP_ExceptionHandler
     */

    void createNews(News news) throws ATP_ExceptionHandler;

    /**
     *
     * @param news
     * @throws ATP_ExceptionHandler
     */
    void deleteNews(News news) throws ATP_ExceptionHandler;

    /**
     *
     * @param news
     * @throws ATP_ExceptionHandler
     */
    void editNews(News news) throws ATP_ExceptionHandler;

    /**
     *
     * @param newsId
     * @return
     */
    News getNewsById(int newsId);

    /**
     *
     * @return
     */
    List<News> getAllNews();

    /**
     *
     * @param top
     * @return
     */
    List<News> getTopNews(int top);
}
