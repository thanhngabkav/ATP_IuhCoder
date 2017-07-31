package Entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by THANH NGA on 6/19/2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name="Input.GetByInput_ProblemID", query="Select i from Input i where i.inputId=:inputID "
                + "and i.problemId=:problemID"),
        @NamedQuery(name="Input.GetByProblemID", query="Select i from Input i where i.problemId=:problemId")

})
@IdClass(InputPK.class)
public class Input implements Serializable {
    private int inputId;
    private String problemId;
    private String inputData;
    private Problem problemByProblemId;

    @Id
    @Column(name = "InputId")
    public int getInputId() {
        return inputId;
    }

    public void setInputId(int inputId) {
        this.inputId = inputId;
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
    @Column(name = "InputData",columnDefinition="TEXT")
    public String getInputData() {
        return inputData;
    }

    public void setInputData(String inputData) {
        this.inputData = inputData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Input input = (Input) o;

        if (inputId != input.inputId) return false;
        if (problemId != null ? !problemId.equals(input.problemId) : input.problemId != null) return false;
        if (inputData != null ? !inputData.equals(input.inputData) : input.inputData != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = inputId;
        result = 31 * result + (problemId != null ? problemId.hashCode() : 0);
        result = 31 * result + (inputData != null ? inputData.hashCode() : 0);
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
