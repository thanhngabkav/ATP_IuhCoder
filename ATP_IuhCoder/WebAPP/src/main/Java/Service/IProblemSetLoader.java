package Service;

import Models.ProblemSet;

import java.util.List;

/**
 * Created by lldtien on 7/17/2017.
 */
public interface IProblemSetLoader {
    List<ProblemSet> loadTopProblemSet(int number);
}
