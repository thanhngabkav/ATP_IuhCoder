package Entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name="Student_ContestDetail.GetAll",query="Select s from StudentContestDetail s"),
        @NamedQuery(name="GetStudent_ContestDetail.GetByID", query="Select s from StudentContestDetail s where s.contestId=:contestID "
                + "and s.studentId=:studentID" ),
        @NamedQuery(name="GetStudent_ContestDetail.GetByContestID", query="Select s from StudentContestDetail s where s.contestId=:contestID"),
        @NamedQuery(name="GetStudent_ContestDetail.GetByStudentID", query="Select s from StudentContestDetail s where s.studentId=:studentID")
})
@Table(name = "Student_ContestDetail", schema = "dbo", catalog = "ATP")
public class StudentContestDetail implements Serializable {
    private String contestDetailId;
    private String contestId;
    private int rank;
    private String studentId;
    private double totalResult;
    private double totalTime;
    private Contest contestByContestId;
    private Student studentByStudentId;

    @Id
    @Column(name = "ContestDetailID")
    public String getContestDetailId() {
        return contestDetailId;
    }

    public void setContestDetailId(String contestDetailId) {
        this.contestDetailId = contestDetailId;
    }

    @Basic
    @Column(name = "ContestID")
    public String getContestId() {
        return contestId;
    }

    public void setContestId(String contestId) {
        this.contestId = contestId;
    }

    @Basic
    @Column(name = "Rank")
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Basic
    @Column(name = "StudentID")
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "TotalResult")
    public double getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(double totalResult) {
        this.totalResult = totalResult;
    }

    @Basic
    @Column(name = "TotalTime")
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentContestDetail that = (StudentContestDetail) o;

        if (rank != that.rank) return false;
        if (Double.compare(that.totalResult, totalResult) != 0) return false;
        if (Double.compare(that.totalTime, totalTime) != 0) return false;
        if (contestDetailId != null ? !contestDetailId.equals(that.contestDetailId) : that.contestDetailId != null)
            return false;
        if (contestId != null ? !contestId.equals(that.contestId) : that.contestId != null) return false;
        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = contestDetailId != null ? contestDetailId.hashCode() : 0;
        result = 31 * result + (contestId != null ? contestId.hashCode() : 0);
        result = 31 * result + rank;
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        temp = Double.doubleToLongBits(totalResult);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalTime);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ContestID", referencedColumnName = "ContestId", nullable = false,insertable = false,updatable = false)
    public Contest getContestByContestId() {
        return contestByContestId;
    }

    public void setContestByContestId(Contest contestByContestId) {
        this.contestByContestId = contestByContestId;
    }

    @ManyToOne
    @JoinColumn(name = "StudentID", referencedColumnName = "StudentId", nullable = false,insertable = false,updatable = false)
    public Student getStudentByStudentId() {
        return studentByStudentId;
    }

    public void setStudentByStudentId(Student studentByStudentId) {
        this.studentByStudentId = studentByStudentId;
    }
}
