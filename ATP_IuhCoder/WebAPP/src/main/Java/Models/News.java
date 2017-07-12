package Models;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lldtien on 7/10/2017.
 */
public class News {
    public String Title;
    public String Content;

    public News() {
    }

    public News(String title, String content) {
        this.Title = title;
        this.Content = content;
    }

    public String getTitle() {
        return Title;
    }

    public String getContent() {
        return Content;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public void setContent(String content) {
        this.Content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News news = (News) o;

        if (!Title.equals(news.Title)) return false;
        return Content.equals(news.Content);
    }

    @Override
    public int hashCode() {
        int result = Title.hashCode();
        result = 31 * result + Content.hashCode();
        return result;
    }
}
