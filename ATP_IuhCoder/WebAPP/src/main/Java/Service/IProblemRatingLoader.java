package Service;

import Models.ProblemRating;
import Models.WebAppException;

import java.util.List;

/**
 * Created by lldtien on 7/10/2017.
 */
public interface IProblemRatingLoader {
    /**
     * Get top problem in range, order by problem's rating
     * @param range
     * @return
     */
    List<ProblemRating> loadTopNewestProblem(int range) throws WebAppException;
}
