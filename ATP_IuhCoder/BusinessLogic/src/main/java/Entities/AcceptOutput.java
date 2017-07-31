package Entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name="AcceptOutput.GetAllBySubmission",query="select a from AcceptOutput a where a.submissionId=:submissionID")
})
@IdClass(AcceptOutputPK.class)
public class AcceptOutput implements Serializable {
    private int inputIndex;
    private String submissionId ;
    private String studentOutput;
    private String teacherOutput;
    private SubmissionResult submissionResultBySubmissionId;

    @Id
    @Column(name = "InputIndex")
    public int getInputIndex() {
        return inputIndex;
    }

    public void setInputIndex(int inputIndex) {
        this.inputIndex = inputIndex;
    }

    @Id
    @Column(name = "SubmissionId")
    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    @Basic
    @Column(name = "StudentOutput",columnDefinition="TEXT")
    public String getStudentOutput() {
        return studentOutput;
    }

    public void setStudentOutput(String studentOutput) {
        this.studentOutput = studentOutput;
    }

    @Basic
    @Column(name = "TeacherOutput",columnDefinition="TEXT")
    public String getTeacherOutput() {
        return teacherOutput;
    }

    public void setTeacherOutput(String teacherOutput) {
        this.teacherOutput = teacherOutput;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcceptOutput that = (AcceptOutput) o;

        if (inputIndex != that.inputIndex) return false;
        if (submissionId != null ? !submissionId.equals(that.submissionId) : that.submissionId != null) return false;
        if (studentOutput != null ? !studentOutput.equals(that.studentOutput) : that.studentOutput != null)
            return false;
        if (teacherOutput != null ? !teacherOutput.equals(that.teacherOutput) : that.teacherOutput != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = inputIndex;
        result = 31 * result + (submissionId != null ? submissionId.hashCode() : 0);
        result = 31 * result + (studentOutput != null ? studentOutput.hashCode() : 0);
        result = 31 * result + (teacherOutput != null ? teacherOutput.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "SubmissionId", referencedColumnName = "SubmissionId", nullable = false, updatable = false,insertable = false)
    public SubmissionResult getSubmissionResultBySubmissionId() {
        return submissionResultBySubmissionId;
    }

    public void setSubmissionResultBySubmissionId(SubmissionResult submissionResultBySubmissionId) {
        this.submissionResultBySubmissionId = submissionResultBySubmissionId;
    }
}
