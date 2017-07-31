package Controller.Student;

import Models.*;
import Service.ISubmissionLoader;
import Utilities.PaginationTagLib;
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
 * Missing about
 */
@Controller
@RequestMapping("/Submission")
@PropertySource("classpath:app.properties")
public class SubmissionController {
    ISubmissionLoader iSubmissionLoader;

    /*Data to Test View*/
    HomeService homeService = new HomeService();

    @Autowired
    Environment environment;
    @RequestMapping(method = RequestMethod.GET)
    public String HomePage(Model model, Integer pages){
        List<Submission> l = homeService.getSubmissions(pages, PaginationTagLib.NUM_PER_PAGE);
        if(pages == null) pages = 1;
        model.addAttribute("count", homeService.getSubmissionSize());
        model.addAttribute("pages", pages);
        model.addAttribute("submissions",l);
        return "submission_page";
    }

//    /* Attribute Area */
//    @ModelAttribute
//    public List<Submission> getTopNewestProblem() throws WebAppException {
//        int number = Integer.parseInt(environment.getProperty("")); // missing
//        return iSubmissionLoader.loadTopSubmission(number);
//    }



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
