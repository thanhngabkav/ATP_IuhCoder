package Models;

import java.io.Serializable;

/**
 * Created by lldtien on 7/17/2017.
 */
public class ProblemSet implements Serializable{
    private String problemID;
    private String problemName;
    private String problemType;
    private String numberProblemSolved;

    public ProblemSet() {
    }

    public ProblemSet(String problemID, String problemName, String problemType, String numberProblemSolved) {
        this.problemID = problemID;
        this.problemName = problemName;
        this.problemType = problemType;
        this.numberProblemSolved = numberProblemSolved;
    }

    public void setProblemID(String problemID) {
        this.problemID = problemID;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    public void setNumberProblemSolved(String numberProblemSolved) {
        this.numberProblemSolved = numberProblemSolved;
    }

    public String getProblemID() {
        return problemID;
    }

    public String getProblemName() {
        return problemName;
    }

    public String getProblemType() {
        return problemType;
    }

    public String getNumberProblemSolved() {
        return numberProblemSolved;
    }
}
