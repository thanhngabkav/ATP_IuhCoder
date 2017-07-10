package Data;

import Models.ProblemRating;

import java.util.List;

/**
 * Created by lldtien on 7/10/2017.
 */
public interface IProblemRatingLoader {
    List<ProblemRating> loadTop5NewestProblem();
}
