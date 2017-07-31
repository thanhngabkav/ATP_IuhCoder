package Controller.Student;

import Models.*;
import Service.IContestLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by lldtien on 7/17/2017.
 */
/**
 * Missing environment property
 * Not Complete
 */
@Controller
@RequestMapping("/Contest")
@PropertySource("classpath:app.properties")
public class ContestController {
//    @Autowired
    IContestLoader iContestLoader;

    @Autowired
    Environment environment;
    @RequestMapping(method = RequestMethod.GET)
    public String HomePage(Model model){
        return "contest_page";
    }

    /* Attribute Area *//*
    @ModelAttribute("contests")
    public List<Contest> getTopNewestProblem() throws WebAppException {
        int number = Integer.parseInt(environment.getProperty("")); // missing
        return iContestLoader.loadTopContest(number);
    }*/

    /*Data to test View*/
    HomeService homeService = new HomeService();
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
