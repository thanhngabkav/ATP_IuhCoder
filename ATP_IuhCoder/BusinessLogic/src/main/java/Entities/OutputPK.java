package Entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by THANH NGA on 6/19/2017.
 */
public class OutputPK implements Serializable {
    private int outputId;
    private String problemId;

    @Column(name = "OutputId")
    @Id
    public int getOutputId() {
        return outputId;
    }

    public void setOutputId(int outputId) {
        this.outputId = outputId;
    }

    @Column(name = "ProblemId")
    @Id
    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OutputPK outputPK = (OutputPK) o;

        if (outputId != outputPK.outputId) return false;
        if (problemId != null ? !problemId.equals(outputPK.problemId) : outputPK.problemId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = outputId;
        result = 31 * result + (problemId != null ? problemId.hashCode() : 0);
        return result;
    }
}
