package Controller;

import Data.ICoderRatingLoader;
import Data.INewsLoader;
import Data.IProblemRatingLoader;
import Models.CoderRating;
import Models.News;
import Models.ProblemRating;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    ICoderRatingLoader iCoderRatingLoader;
    @Autowired
    INewsLoader iNewsLoader;
    @Autowired
    IProblemRatingLoader iProblemRatingLoader;

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

    @ModelAttribute("top-news")
    public List<Models.News> getTop10News(int page){
        return iNewsLoader.loadNext10News(page);
    }
    @ModelAttribute("coming-news")
    public News getInComingNews(){
        return iNewsLoader.loadInComingNews();
    }

    @ModelAttribute("top-coder")
    public List<CoderRating> getTopCoder(){
        return iCoderRatingLoader.loadTop5Coder();
    }

    @ModelAttribute("newest-problem")
    public List<ProblemRating> getNewestProblem(){
        return iProblemRatingLoader.loadTop5NewestProblem();
    }

}
