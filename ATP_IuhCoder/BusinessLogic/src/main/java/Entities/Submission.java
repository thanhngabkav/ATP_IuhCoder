package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name="Submission.GetAll",query="Select s from Submission s"),
        @NamedQuery(name="Submission.GetByID",query="Select s from Submission s where s.submissionId=:id"),
        @NamedQuery(name="Submission.GetByProblemID",query="Select s from Submission s where s.problemId=:problemID"),
        @NamedQuery(name="Submission.GetByStudent_ContestID",query="Select s from Submission s where s.studentId=:studentID "
                + "and s.contestId=:contestID"),
        @NamedQuery(name="Submission.GetByStudentID", query="Select s from Submission s where s.studentId=:studentID"),
        @NamedQuery(name="Submission.GetByStudentID_ProblemID", query="Select s from Submission s where s.studentId=:studentID "
                + "and s.problemId=:problemID"),
        @NamedQuery(name="Submission.GetByContestID",query="Select s from Submission s where s.contestId=:contestID")
})
public class Submission implements Serializable {
    private String submissionId;
    private String contestId;
    private int contestSubmitTime;
    private int numCorrectOutput;
    private String problemId;
    private int problemSubmitTime;
    private Timestamp sendTime;
    private String sourceCode;
    private String status;
    private String studentId;
    private String submissionResultSubmissionId;
    private Contest contestByContestId;
    private Problem problemByProblemId;
    private Student studentByStudentId;
    private SubmissionResult submissionResultBySubmissionResultSubmissionId;

    @Id
    @Column(name = "SubmissionId")
    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    @Basic
    @Column(name = "ContestId")
    public String getContestId() {
        return contestId;
    }

    public void setContestId(String contestId) {
        this.contestId = contestId;
    }

    @Basic
    @Column(name = "ContestSubmitTime")
    public int getContestSubmitTime() {
        return contestSubmitTime;
    }

    public void setContestSubmitTime(int contestSubmitTime) {
        this.contestSubmitTime = contestSubmitTime;
    }

    @Basic
    @Column(name = "NumCorrectOutput")
    public int getNumCorrectOutput() {
        return numCorrectOutput;
    }

    public void setNumCorrectOutput(int numCorrectOutput) {
        this.numCorrectOutput = numCorrectOutput;
    }

    @Basic
    @Column(name = "ProblemId")
    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }

    @Basic
    @Column(name = "ProblemSubmitTime")
    public int getProblemSubmitTime() {
        return problemSubmitTime;
    }

    public void setProblemSubmitTime(int problemSubmitTime) {
        this.problemSubmitTime = problemSubmitTime;
    }

    @Basic
    @Column(name = "SendTime")
    public Timestamp getSendTime() {
        return sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    @Basic
    @Column(name = "SourceCode")
    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
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
    @Column(name = "StudentId")
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "SubmissionResult_SubmissionId")
    public String getSubmissionResultSubmissionId() {
        return submissionResultSubmissionId;
    }

    public void setSubmissionResultSubmissionId(String submissionResultSubmissionId) {
        this.submissionResultSubmissionId = submissionResultSubmissionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Submission that = (Submission) o;

        if (contestSubmitTime != that.contestSubmitTime) return false;
        if (numCorrectOutput != that.numCorrectOutput) return false;
        if (problemSubmitTime != that.problemSubmitTime) return false;
        if (submissionId != null ? !submissionId.equals(that.submissionId) : that.submissionId != null) return false;
        if (contestId != null ? !contestId.equals(that.contestId) : that.contestId != null) return false;
        if (problemId != null ? !problemId.equals(that.problemId) : that.problemId != null) return false;
        if (sendTime != null ? !sendTime.equals(that.sendTime) : that.sendTime != null) return false;
        if (sourceCode != null ? !sourceCode.equals(that.sourceCode) : that.sourceCode != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
        if (submissionResultSubmissionId != null ? !submissionResultSubmissionId.equals(that.submissionResultSubmissionId) : that.submissionResultSubmissionId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = submissionId != null ? submissionId.hashCode() : 0;
        result = 31 * result + (contestId != null ? contestId.hashCode() : 0);
        result = 31 * result + contestSubmitTime;
        result = 31 * result + numCorrectOutput;
        result = 31 * result + (problemId != null ? problemId.hashCode() : 0);
        result = 31 * result + problemSubmitTime;
        result = 31 * result + (sendTime != null ? sendTime.hashCode() : 0);
        result = 31 * result + (sourceCode != null ? sourceCode.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        result = 31 * result + (submissionResultSubmissionId != null ? submissionResultSubmissionId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ContestId", referencedColumnName = "ContestId",insertable = false,updatable = false)
    public Contest getContestByContestId() {
        return contestByContestId;
    }

    public void setContestByContestId(Contest contestByContestId) {
        this.contestByContestId = contestByContestId;
    }

    @ManyToOne
    @JoinColumn(name = "ProblemId", referencedColumnName = "ProblemID", nullable = false,insertable = false,updatable = false)
    public Problem getProblemByProblemId() {
        return problemByProblemId;
    }

    public void setProblemByProblemId(Problem problemByProblemId) {
        this.problemByProblemId = problemByProblemId;
    }

    @ManyToOne
    @JoinColumn(name = "StudentId", referencedColumnName = "StudentId", nullable = false,insertable = false,updatable = false)
    public Student getStudentByStudentId() {
        return studentByStudentId;
    }

    public void setStudentByStudentId(Student studentByStudentId) {
        this.studentByStudentId = studentByStudentId;
    }

    @ManyToOne
    @JoinColumn(name = "SubmissionResult_SubmissionId", referencedColumnName = "SubmissionId",insertable = false,updatable = false)
    public SubmissionResult getSubmissionResultBySubmissionResultSubmissionId() {
        return submissionResultBySubmissionResultSubmissionId;
    }

    public void setSubmissionResultBySubmissionResultSubmissionId(SubmissionResult submissionResultBySubmissionResultSubmissionId) {
        this.submissionResultBySubmissionResultSubmissionId = submissionResultBySubmissionResultSubmissionId;
    }
}
