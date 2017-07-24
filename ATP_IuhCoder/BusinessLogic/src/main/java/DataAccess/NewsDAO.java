package DataAccess;

import Entities.News;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless(name = "NewsDAOEJB")
@LocalBean
public class NewsDAO implements I_Local_NewsDAO{

    @PersistenceContext(unitName = "Entities")
    private EntityManager em;

    @Override
    public void createNews(News news) throws ATP_ExceptionHandler {
       try{
            em.getTransaction().begin();
            em.persist(news);
            em.getTransaction().commit();
       }catch (Exception e){
            throw new ATP_ExceptionHandler(e.getMessage(),22,"NewsDAO","Can not create new News");
       }
    }
    @Override
    public void deleteNews(News news) throws ATP_ExceptionHandler {
        try{
            em.getTransaction().begin();
            em.remove(em.merge(news));
            em.getTransaction().commit();
        }catch (Exception e){
            throw new ATP_ExceptionHandler(e.getMessage(),33,"NewsDAO","Can not delete News");
        }
    }

    @Override
    public void editNews(News news) throws ATP_ExceptionHandler {
        try{
            em.getTransaction().begin();
            em.merge(news);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new ATP_ExceptionHandler(e.getMessage(),44,"NewsDAO","Can not edit News");
        }
    }

    @Override
    public News getNewsById(int newsId) {
        return em.createNamedQuery("News.FindById",News.class)
                .setParameter("newsId",newsId)
                .getSingleResult();
    }

    @Override
    public List<News> getAllNews() {
        return em.createNamedQuery("News.GetAll",News.class).getResultList();
    }

    @Override
    public List<News> getTopNews(int top) {
        return em.createNamedQuery("News.GetAll",News.class)
                .setMaxResults(top)
                .getResultList();
    }
}
