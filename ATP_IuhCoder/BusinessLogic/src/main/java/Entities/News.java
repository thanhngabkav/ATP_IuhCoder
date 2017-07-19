package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Date;

/**
 * Created by THANH NGA on 7/18/2017.
 */
@Entity
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
}
