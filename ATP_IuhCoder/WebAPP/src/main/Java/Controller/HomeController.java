package Controller;

import Models.CoderRating;
import Models.HomeService;
import Models.ProblemRating;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by lldtien on 7/9/2017.
 */
@Controller
public class HomeController {

//    @Autowired
//    ICoderRatingLoader iCoderRatingLoader;
//    @Autowired
//    INewsLoader iNewsLoader;
//    @Autowired
//    IProblemRatingLoader iProblemRatingLoader;


    HomeService homeService = new HomeService();

    @RequestMapping("/home")
    public String HomePage(Model model){
        return "home_page";
    }

    @RequestMapping("/a")
    public ModelAndView newsSubView(Model moddel){
        return new ModelAndView("../subViews/news");
    }

    @RequestMapping("/b")
    public ModelAndView problemSubView(Model model){
        return new ModelAndView("../subViews/problem");
    }
    @RequestMapping("/v")
    public ModelAndView rateSubView(Model model){
        return new ModelAndView("../subViews/rate");
    }

    @ModelAttribute("topnews")
    public List<Models.News> getTop10News(){
        return homeService.getNewsList();
        //return iNewsLoader.loadNext10News(page);
    }
//    @ModelAttribute("coming-news")
//    public News getInComingNews(){
//        return iNewsLoader.loadInComingNews();
//    }

    @ModelAttribute("topcoder")
    public List<CoderRating> getTopCoder(){
        return homeService.getCoderRatingList();
        //return iCoderRatingLoader.loadTop5Coder();
    }

    @ModelAttribute("newestproblem")
    public List<ProblemRating> getNewestProblem(){
        return homeService.getProblemRatingList();
        //return iProblemRatingLoader.loadTop5NewestProblem();
    }

}
