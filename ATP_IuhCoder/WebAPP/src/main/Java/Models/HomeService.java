package Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lldtien on 7/10/2017.
 */
public class HomeService {
    private List<CoderRating> coderRatingList;
    private List<News> newsList;
    private List<ProblemRating> problemRatingList;

    public HomeService() {
        coderRatingList = createcoderRating();
        newsList = createnewsList();
        problemRatingList = createproblemRatingList();
    }

    private List<CoderRating> createcoderRating() {
        List<CoderRating> coderRatings = new ArrayList<CoderRating>();
        coderRatings.add(new CoderRating("Tien","69"));
        return coderRatings;
    }

    private List<News> createnewsList() {
        List<Models.News> newsList = new ArrayList<News>();
        newsList.add(new News("title", "noi dung"));
        newsList.add(new News("title", "noi dung"));
        return newsList;
    }

    private List<ProblemRating> createproblemRatingList() {
        List<ProblemRating> problemRatings = new ArrayList<ProblemRating>();
        problemRatings.add(new ProblemRating("DKM01","Dieu Khong Muon"));
        return problemRatings;
    }

    public List<CoderRating> getCoderRatingList() {
        return coderRatingList;
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public List<ProblemRating> getProblemRatingList() {
        return problemRatingList;
    }
}

