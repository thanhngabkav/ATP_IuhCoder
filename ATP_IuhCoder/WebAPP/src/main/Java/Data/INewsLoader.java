package Data;

import Models.News;

import java.util.List;

/**
 * Created by lldtien on 7/10/2017.
 */
public interface INewsLoader {
    List<News> loadNext10News(int page);
    News loadInComingNews();
    int getNewsSize();
}
