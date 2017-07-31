package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by lldtien on 7/10/2017.
 */
public class HomeService {
    private List<CoderRating> coderRatingList;
    private List<News> newsList;
    private List<ProblemRating> problemRatingList;
    private List<Submission> submissions;

    public HomeService() {
        coderRatingList = createcoderRating();
        newsList = createnewsList();
        problemRatingList = createproblemRatingList();
        submissions = createSubmissionList();
    }

    private List<CoderRating> createcoderRating() {
        List<CoderRating> coderRatings = new ArrayList<CoderRating>();
        coderRatings.add(new CoderRating("Tien","69"));
        return coderRatings;
    }

    private List<News> createnewsList() {
        List<News> newsList = new ArrayList<News>();
        newsList.add(new News("title", "noi dung"));
        newsList.add(new News("title", "noi dung"));
        return newsList;
    }

    private List<ProblemRating> createproblemRatingList() {
        List<ProblemRating> problemRatings = new ArrayList<ProblemRating>();
        problemRatings.add(new ProblemRating("DKM01","Chi Co The"));
        problemRatings.add(new ProblemRating("DKM02","Chua Duoc Co"));
        problemRatings.add(new ProblemRating("DKM03","Nhieu Nhat La"));
        problemRatings.add(new ProblemRating("DKM04","5 Thanwgf Cao Nhaatst"));
        problemRatings.add(new ProblemRating("DKM05","Ma Thoi"));
        return problemRatings;
    }
    private List<Submission> createSubmissionList(){
        List<Submission> l = new ArrayList<Submission>();
        String name = "Problem Name ";
        Random rd = new Random();
        for(int i = 0 ; i < 100; ++i){
            int memory = rd.nextInt(3000 - 1000 + 1) + 1000;
            int day = rd.nextInt(30 +  1);
            int month = rd.nextInt(12) + 1;
            int year = rd.nextInt(2020 - 2000 + 1) + 2000;
            String sTime = day + "/" + month + "/" + year;
            l.add(new Submission(i + "",sTime,name + i, " ", (day + i) + "", memory+"" ));
        }
        return l;
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

    public List<Submission> getSubmissions() {
        return submissions;
    }

    public List<Submission> getSubmissions(Integer page, Integer numPerPage) {
        if(page == null) page = 1;
        List<Submission> l = new ArrayList<Submission>();
        for(Integer i = (page - 1)*numPerPage; i < (page - 1)*numPerPage + numPerPage ; ++i){
            l.add(submissions.get(i));
        }
        return l;
    }

    public int getSubmissionSize(){
        return submissions.size();
    }
}

