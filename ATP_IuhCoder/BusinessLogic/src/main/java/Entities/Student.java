package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name="Student.GetByID",query="Select s from Student s where s.studentId=:studentID"),
        @NamedQuery(name="Student.GetAll",query="Select s from Student s"),
        @NamedQuery(name="Student.GetByUserName",query="Select s from Student s where s.userName=:userName")
})
public class Student implements Serializable {
    private String studentId;
    private String password;
    private String studentName;
    private String userName;
    private long rating;
    private Collection<StudentContestDetail> studentContestDetailsByStudentId;
    private Collection<Submission> submissionsByStudentId;

    @Id
    @Column(name = "StudentId")
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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
    @Column(name = "StudentName")
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Basic
    @Column(name = "UserName")
    public String getUserName() {
        return userName;
    }

    @Basic
    @Column(name = "Rating")
    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentId != null ? !studentId.equals(student.studentId) : student.studentId != null) return false;
        if (password != null ? !password.equals(student.password) : student.password != null) return false;
        if (studentName != null ? !studentName.equals(student.studentName) : student.studentName != null) return false;
        if (userName != null ? !userName.equals(student.userName) : student.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId != null ? studentId.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "studentByStudentId")
    public Collection<StudentContestDetail> getStudentContestDetailsByStudentId() {
        return studentContestDetailsByStudentId;
    }

    public void setStudentContestDetailsByStudentId(Collection<StudentContestDetail> studentContestDetailsByStudentId) {
        this.studentContestDetailsByStudentId = studentContestDetailsByStudentId;
    }

    @OneToMany(mappedBy = "studentByStudentId")
    public Collection<Submission> getSubmissionsByStudentId() {
        return submissionsByStudentId;
    }

    public void setSubmissionsByStudentId(Collection<Submission> submissionsByStudentId) {
        this.submissionsByStudentId = submissionsByStudentId;
    }
}
