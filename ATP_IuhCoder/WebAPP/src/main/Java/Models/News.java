package Models;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lldtien on 7/10/2017.
 */
public class News {
    private String Title;
    private String Content;

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
}