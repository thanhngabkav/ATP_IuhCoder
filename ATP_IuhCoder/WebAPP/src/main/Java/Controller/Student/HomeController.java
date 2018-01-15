package Controller.Student;

import Models.CoderRating;
import Models.HomeService;
import Models.ProblemRating;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by lldtien on 7/9/2017.
 */
@Controller
@RequestMapping("/Home")
public class HomeController {

//    @Autowired
//    ICoderRatingLoader iCoderRatingLoader;
//    @Autowired
//    INewsLoader iNewsLoader;
//    @Autowired
//    IProblemRatingLoader iProblemRatingLoader;


    HomeService homeService = new HomeService();


    @RequestMapping(method = RequestMethod.GET)
    public String HomePage(Model model) {
        return "student_home_page";
    }


    /* Attribute Area */
    @ModelAttribute("topnews")
    public List<Models.News> getTop10News() {
        return homeService.getNewsList();
        //return iNewsLoader.loadNext10News(page);
    }

    @ModelAttribute("topcoder")
    public List<CoderRating> getTopCoder() {
        return homeService.getCoderRatingList();
        //return iCoderRatingLoader.loadTop5Coder();
    }

    @ModelAttribute("newestproblem")
    public List<ProblemRating> getNewestProblem() {
        return homeService.getProblemRatingList();
        //return iProblemRatingLoader.loadTop5NewestProblem();
    }

}
