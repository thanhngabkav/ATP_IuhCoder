package Models;


import java.io.Serializable;

/**
 * Created by lldtien on 7/10/2017.
 */
public class CoderRating implements Serializable {
    public String Name;
    public String NumberSolvedProblem;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoderRating that = (CoderRating) o;

        if (Name != null ? !Name.equals(that.Name) : that.Name != null) return false;
        return NumberSolvedProblem != null ? NumberSolvedProblem.equals(that.NumberSolvedProblem) : that.NumberSolvedProblem == null;
    }

    @Override
    public int hashCode() {
        int result = Name != null ? Name.hashCode() : 0;
        result = 31 * result + (NumberSolvedProblem != null ? NumberSolvedProblem.hashCode() : 0);
        return result;
    }
}
