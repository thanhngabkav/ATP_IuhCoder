package Models;


import java.io.Serializable;

/**
 * Created by lldtien on 7/10/2017.
 */
public class ProblemRating  implements Serializable{
    public String ProblemID;
    public String ProblemName;

    public ProblemRating(String problemID, String problemName) {
        ProblemID = problemID;
        ProblemName = problemName;
    }

    public ProblemRating() {
    }

    public String getProblemID() {
        return ProblemID;
    }

    public String getProblemName() {
        return ProblemName;
    }

    public void setProblemID(String problemID) {
        ProblemID = problemID;
    }

    public void setProblemName(String problemName) {
        ProblemName = problemName;
    }
}

