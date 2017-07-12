package Service;

import Models.News;

import java.util.List;

/**
 * Created by lldtien on 7/10/2017.
 */
public interface INewsLoader {
    /**
     * Get news oder by time from .. to
     * @param from
     * @param to
     * @return Lít<News>
     */
    List<News> loadNews(int from, int to);

    /**
     * Get News
     * @return News
     */
    News loadInComingNews();
    int getNewsSize();
}
