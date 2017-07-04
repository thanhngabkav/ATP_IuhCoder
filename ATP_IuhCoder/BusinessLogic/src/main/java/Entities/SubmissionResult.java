package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name="SubmissionResult.GetByID",query="Select s from SubmissionResult s where s.submissionId=:id")
})
public class SubmissionResult implements Serializable {
    private String submissionId;
    private int runtime;
    private Collection<AcceptOutput> acceptOutputsBySubmissionId;
    private Collection<NotAcceptOutput> notAcceptOutputsBySubmissionId;
    private Collection<Submission> submissionsBySubmissionId;

    @Id
    @Column(name = "SubmissionId")
    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    @Basic
    @Column(name = "runtime")
    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubmissionResult that = (SubmissionResult) o;

        if (runtime != that.runtime) return false;
        if (submissionId != null ? !submissionId.equals(that.submissionId) : that.submissionId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = submissionId != null ? submissionId.hashCode() : 0;
        result = 31 * result + runtime;
        return result;
    }

    @OneToMany(mappedBy = "submissionResultBySubmissionId")
    public Collection<AcceptOutput> getAcceptOutputsBySubmissionId() {
        return acceptOutputsBySubmissionId;
    }

    public void setAcceptOutputsBySubmissionId(Collection<AcceptOutput> acceptOutputsBySubmissionId) {
        this.acceptOutputsBySubmissionId = acceptOutputsBySubmissionId;
    }

    @OneToMany(mappedBy = "submissionResultBySubmissionId")
    public Collection<NotAcceptOutput> getNotAcceptOutputsBySubmissionId() {
        return notAcceptOutputsBySubmissionId;
    }

    public void setNotAcceptOutputsBySubmissionId(Collection<NotAcceptOutput> notAcceptOutputsBySubmissionId) {
        this.notAcceptOutputsBySubmissionId = notAcceptOutputsBySubmissionId;
    }

    @OneToMany(mappedBy = "submissionResultBySubmissionResultSubmissionId")
    public Collection<Submission> getSubmissionsBySubmissionId() {
        return submissionsBySubmissionId;
    }

    public void setSubmissionsBySubmissionId(Collection<Submission> submissionsBySubmissionId) {
        this.submissionsBySubmissionId = submissionsBySubmissionId;
    }
}
