package Service;

import Models.News;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by THANH NGA on 7/11/2017.
 */

/**
 * Uncompleted
 */
@Service
public class NewsLoader implements INewsLoader{
    public List<News> loadNews(int from, int to) {
        return null;
    }

    public News loadInComingNews() {
        return null;
    }

    public int getNewsSize() {
        return 0;
    }
}
