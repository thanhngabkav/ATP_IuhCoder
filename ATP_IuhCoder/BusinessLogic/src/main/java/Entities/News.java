package Entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by THANH NGA on 7/18/2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "News.GetAll",query = "Select s from News s order by s.createdTime"),
        @NamedQuery(name = "News.FindById", query = "select s from News s where s.id=:newsId")
})
public class News {

    public News() {
    }

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "CreatedTime")
    private Date createdTime;

    @Column(name = "Title")
    private String title;

    @Column(name = "Content")
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News news = (News) o;

        return id == news.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
