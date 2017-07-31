package Entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name="Output.GetByOutput_ProblemID",query="select o from Output o where o.outputId=:outputID "
                + "and o.problemId=:problemID"),
        @NamedQuery(name="Output.GetByProblemID",query="select o from Output o where o.problemId=:problemID")
})
@IdClass(OutputPK.class)
public class Output implements Serializable {
    private int outputId;
    private String problemId;
    private String outputData;
    private Problem problemByProblemId;

    @Id
    @Column(name = "OutputId")
    public int getOutputId() {
        return outputId;
    }

    public void setOutputId(int outputId) {
        this.outputId = outputId;
    }

    @Id
    @Column(name = "ProblemId")
    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }

    @Basic
    @Column(name = "OutputData",columnDefinition="TEXT")
    public String getOutputData() {
        return outputData;
    }

    public void setOutputData(String outputData) {
        this.outputData = outputData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Output output = (Output) o;

        if (outputId != output.outputId) return false;
        if (problemId != null ? !problemId.equals(output.problemId) : output.problemId != null) return false;
        if (outputData != null ? !outputData.equals(output.outputData) : output.outputData != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = outputId;
        result = 31 * result + (problemId != null ? problemId.hashCode() : 0);
        result = 31 * result + (outputData != null ? outputData.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ProblemId", referencedColumnName = "ProblemID", nullable = false,insertable = false,updatable = false)
    public Problem getProblemByProblemId() {
        return problemByProblemId;
    }

    public void setProblemByProblemId(Problem problemByProblemId) {
        this.problemByProblemId = problemByProblemId;
    }
}
