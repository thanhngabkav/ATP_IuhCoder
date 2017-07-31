package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name="Contest.GetAll",query="Select c from Contest c"),
        @NamedQuery(name="Contest.GetByID",query="Select c from Contest c where c.contestId=:contestID")
})
public class Contest implements Serializable {
    private String contestId;
    private String contestName;
    private Date createdTime;
    private String status;
    private String teacherId;
    private int totalCorrectSubmission;
    private int totalSubmission;
    private Teacher teacherByTeacherId;
    private Collection<Problem> problemsByContestId;
    private Collection<StudentContestDetail> studentContestDetailsByContestId;
    private Collection<Submission> submissionsByContestId;

    @Id
    @Column(name = "ContestId")
    public String getContestId() {
        return contestId;
    }

    public void setContestId(String contestId) {
        this.contestId = contestId;
    }

    @Basic
    @Column(name = "ContestName")
    public String getContestName() {
        return contestName;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    @Basic
    @Column(name = "CreatedTime")
    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Basic
    @Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "TeacherId")
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Basic
    @Column(name = "TotalCorrectSubmission")
    public int getTotalCorrectSubmission() {
        return totalCorrectSubmission;
    }

    public void setTotalCorrectSubmission(int totalCorrectSubmission) {
        this.totalCorrectSubmission = totalCorrectSubmission;
    }

    @Basic
    @Column(name = "TotalSubmission")
    public int getTotalSubmission() {
        return totalSubmission;
    }

    public void setTotalSubmission(int totalSubmission) {
        this.totalSubmission = totalSubmission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contest contest = (Contest) o;

        if (totalCorrectSubmission != contest.totalCorrectSubmission) return false;
        if (totalSubmission != contest.totalSubmission) return false;
        if (contestId != null ? !contestId.equals(contest.contestId) : contest.contestId != null) return false;
        if (contestName != null ? !contestName.equals(contest.contestName) : contest.contestName != null) return false;
        if (createdTime != null ? !createdTime.equals(contest.createdTime) : contest.createdTime != null) return false;
        if (status != null ? !status.equals(contest.status) : contest.status != null) return false;
        if (teacherId != null ? !teacherId.equals(contest.teacherId) : contest.teacherId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contestId != null ? contestId.hashCode() : 0;
        result = 31 * result + (contestName != null ? contestName.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (teacherId != null ? teacherId.hashCode() : 0);
        result = 31 * result + totalCorrectSubmission;
        result = 31 * result + totalSubmission;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "TeacherId", referencedColumnName = "TeacherId", nullable = false,insertable = false,updatable = false)
    public Teacher getTeacherByTeacherId() {
        return teacherByTeacherId;
    }

    public void setTeacherByTeacherId(Teacher teacherByTeacherId) {
        this.teacherByTeacherId = teacherByTeacherId;
    }

    @OneToMany(mappedBy = "contestByContestId")
    public Collection<Problem> getProblemsByContestId() {
        return problemsByContestId;
    }

    public void setProblemsByContestId(Collection<Problem> problemsByContestId) {
        this.problemsByContestId = problemsByContestId;
    }

    @OneToMany(mappedBy = "contestByContestId")
    public Collection<StudentContestDetail> getStudentContestDetailsByContestId() {
        return studentContestDetailsByContestId;
    }

    public void setStudentContestDetailsByContestId(Collection<StudentContestDetail> studentContestDetailsByContestId) {
        this.studentContestDetailsByContestId = studentContestDetailsByContestId;
    }

    @OneToMany(mappedBy = "contestByContestId")
    public Collection<Submission> getSubmissionsByContestId() {
        return submissionsByContestId;
    }

    public void setSubmissionsByContestId(Collection<Submission> submissionsByContestId) {
        this.submissionsByContestId = submissionsByContestId;
    }
}
