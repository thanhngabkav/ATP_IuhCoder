package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Problem.GetAll",query = "Select p from Problem p"),
        @NamedQuery(name = "Problem.GetByContestID",query = "Select p from Problem p where p.contestId=:contestID"),
        @NamedQuery(name = "Problem.GetByID", query = "select p from Problem p where p.problemId=:problemID")
})
public class Problem implements Serializable {
    private String problemId;
    private String contestId;
    private int memoryLimit;
    private int numCorrectSubmission;
    private int numSubmission;
    private String problemName;
    private double timeLimit;
    private Collection<Input> inputsByProblemId;
    private Collection<Output> outputsByProblemId;
    private Contest contestByContestId;
    private Collection<Submission> submissionsByProblemId;

    @Id
    @Column(name = "ProblemID")
    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
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
    @Column(name = "MemoryLimit")
    public int getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(int memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    @Basic
    @Column(name = "NumCorrectSubmission")
    public int getNumCorrectSubmission() {
        return numCorrectSubmission;
    }

    public void setNumCorrectSubmission(int numCorrectSubmission) {
        this.numCorrectSubmission = numCorrectSubmission;
    }

    @Basic
    @Column(name = "NumSubmission")
    public int getNumSubmission() {
        return numSubmission;
    }

    public void setNumSubmission(int numSubmission) {
        this.numSubmission = numSubmission;
    }

    @Basic
    @Column(name = "ProblemName")
    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    @Basic
    @Column(name = "TimeLimit")
    public double getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(double timeLimit) {
        this.timeLimit = timeLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Problem problem = (Problem) o;

        if (memoryLimit != problem.memoryLimit) return false;
        if (numCorrectSubmission != problem.numCorrectSubmission) return false;
        if (numSubmission != problem.numSubmission) return false;
        if (Double.compare(problem.timeLimit, timeLimit) != 0) return false;
        if (problemId != null ? !problemId.equals(problem.problemId) : problem.problemId != null) return false;
        if (contestId != null ? !contestId.equals(problem.contestId) : problem.contestId != null) return false;
        if (problemName != null ? !problemName.equals(problem.problemName) : problem.problemName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = problemId != null ? problemId.hashCode() : 0;
        result = 31 * result + (contestId != null ? contestId.hashCode() : 0);
        result = 31 * result + memoryLimit;
        result = 31 * result + numCorrectSubmission;
        result = 31 * result + numSubmission;
        result = 31 * result + (problemName != null ? problemName.hashCode() : 0);
        temp = Double.doubleToLongBits(timeLimit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @OneToMany(mappedBy = "problemByProblemId")
    public Collection<Input> getInputsByProblemId() {
        return inputsByProblemId;
    }

    public void setInputsByProblemId(Collection<Input> inputsByProblemId) {
        this.inputsByProblemId = inputsByProblemId;
    }

    @OneToMany(mappedBy = "problemByProblemId")
    public Collection<Output> getOutputsByProblemId() {
        return outputsByProblemId;
    }

    public void setOutputsByProblemId(Collection<Output> outputsByProblemId) {
        this.outputsByProblemId = outputsByProblemId;
    }

    @ManyToOne
    @JoinColumn(name = "ContestID", referencedColumnName = "ContestId",insertable = false,updatable = false)
    public Contest getContestByContestId() {
        return contestByContestId;
    }

    public void setContestByContestId(Contest contestByContestId) {
        this.contestByContestId = contestByContestId;
    }

    @OneToMany(mappedBy = "problemByProblemId")
    public Collection<Submission> getSubmissionsByProblemId() {
        return submissionsByProblemId;
    }

    public void setSubmissionsByProblemId(Collection<Submission> submissionsByProblemId) {
        this.submissionsByProblemId = submissionsByProblemId;
    }
}
