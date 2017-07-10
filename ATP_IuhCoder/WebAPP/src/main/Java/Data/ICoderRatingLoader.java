package Data;

import Models.CoderRating;

import java.util.List;

/**
 * Created by lldtien on 7/10/2017.
 */
public interface ICoderRatingLoader {
    List<CoderRating> loadTop5Coder();
}
