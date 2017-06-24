package Entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by THANH NGA on 6/19/2017.
 */
public class AcceptOutputPK implements Serializable {
    private int inputIndex;
    private String submissionId;

    @Column(name = "InputIndex")
    @Id
    public int getInputIndex() {
        return inputIndex;
    }

    public void setInputIndex(int inputIndex) {
        this.inputIndex = inputIndex;
    }

    @Column(name = "SubmissionId")
    @Id
    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcceptOutputPK that = (AcceptOutputPK) o;

        if (inputIndex != that.inputIndex) return false;
        if (submissionId != null ? !submissionId.equals(that.submissionId) : that.submissionId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = inputIndex;
        result = 31 * result + (submissionId != null ? submissionId.hashCode() : 0);
        return result;
    }
}
