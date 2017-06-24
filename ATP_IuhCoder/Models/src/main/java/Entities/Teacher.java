package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name="Teacher.findAll",
                query="SELECT t FROM Teacher t"),
        @NamedQuery(name="Teacher.findByName",
                query="SELECT t FROM Teacher t WHERE t.teacherName = :name"),
        @NamedQuery(name="Teacher.findAllContestCreatedByTeacher",
                query="SELECT c FROM Contest c WHERE c.teacherId = :id"),
        @NamedQuery(name="Teacher.GetByID",query="Select t from Teacher t where t.teacherId=:teacherID")

})
public class Teacher implements Serializable {
    private String teacherId;
    private String password;
    private String teacherName;
    private String userName;
    private Collection<Contest> contestsByTeacherId;

    @Id
    @Column(name = "TeacherId")
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Basic
    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "TeacherName")
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Basic
    @Column(name = "UserName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (teacherId != null ? !teacherId.equals(teacher.teacherId) : teacher.teacherId != null) return false;
        if (password != null ? !password.equals(teacher.password) : teacher.password != null) return false;
        if (teacherName != null ? !teacherName.equals(teacher.teacherName) : teacher.teacherName != null) return false;
        if (userName != null ? !userName.equals(teacher.userName) : teacher.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teacherId != null ? teacherId.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (teacherName != null ? teacherName.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "teacherByTeacherId")
    public Collection<Contest> getContestsByTeacherId() {
        return contestsByTeacherId;
    }

    public void setContestsByTeacherId(Collection<Contest> contestsByTeacherId) {
        this.contestsByTeacherId = contestsByTeacherId;
    }
}
