package Service;

import Models.CoderRating;
import Models.WebAppException;

import java.util.List;

/**
 * Created by lldtien on 7/10/2017.
 */
public interface ICoderRatingLoader {
    /**
     * Get top coder in range order by Rating
     * @param number
     * @return
     */
    List<CoderRating> loadTopCoder(int number) throws WebAppException;
}
