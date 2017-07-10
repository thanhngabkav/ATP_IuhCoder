package Models;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lldtien on 7/10/2017.
 */
public class CoderRating {
    private String Name;
    private String NumberSolvedProblem;

    public CoderRating() {
    }

    public CoderRating(String name, String numberSolvedProblem) {
        Name = name;
        NumberSolvedProblem = numberSolvedProblem;
    }

    public String getName() {
        return Name;
    }

    public String getNumberSolvedProblem() {
        return NumberSolvedProblem;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setNumberSolvedProblem(String numberSolvedProblem) {
        NumberSolvedProblem = numberSolvedProblem;
    }
}
