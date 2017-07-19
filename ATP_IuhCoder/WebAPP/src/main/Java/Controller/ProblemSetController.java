package Controller;

import Models.*;
import Service.IProblemRatingLoader;
import Service.IProblemSetLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.Problem;
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
 * Not Complete
 * Missing environment property
 * Data still in test for view
 */
@Controller
@RequestMapping("/Problem")
public class ProblemSetController {
//    @Autowired
    IProblemSetLoader iProblemLoader;
    @Autowired
    Environment environment;

    @RequestMapping(method = RequestMethod.GET)
    public String HomePage(Model model){
        return "problemset_page";
    }

//     /* Attribute Area */
//    @ModelAttribute("problemset")
//    public List<ProblemSet> getTopNewestProblem() throws WebAppException {
//        int number = Integer.parseInt(environment.getProperty(""));
//        return iProblemLoader.loadTopProblemSet(number);
//    }

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
