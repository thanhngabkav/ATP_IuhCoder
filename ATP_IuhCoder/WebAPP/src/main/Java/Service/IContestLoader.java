package Service;

import Models.Contest;

import java.util.List;

/**
 * Created by lldtien on 7/17/2017.
 */
public interface IContestLoader {
    List<Contest> loadTopContest(int number);
}
