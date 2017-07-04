package Entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by THANH NGA on 6/19/2017.
 */
public class InputPK implements Serializable {
    private int inputId;
    private String problemId;

    @Column(name = "InputId")
    @Id
    public int getInputId() {
        return inputId;
    }

    public void setInputId(int inputId) {
        this.inputId = inputId;
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

        InputPK inputPK = (InputPK) o;

        if (inputId != inputPK.inputId) return false;
        if (problemId != null ? !problemId.equals(inputPK.problemId) : inputPK.problemId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = inputId;
        result = 31 * result + (problemId != null ? problemId.hashCode() : 0);
        return result;
    }
}
