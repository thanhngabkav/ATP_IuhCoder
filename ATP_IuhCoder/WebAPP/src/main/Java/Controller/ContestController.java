package Controller;

import Models.Contest;
import Models.ProblemRating;
import Models.ProblemSet;
import Models.WebAppException;
import Service.IContestLoader;
import Service.IProblemRatingLoader;
import Service.IProblemSetLoader;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ContestController {
    @Autowired
    IContestLoader iContestLoader;

    @Autowired
    Environment environment;
    @RequestMapping(method = RequestMethod.GET)
    public String HomePage(Model model){
        return "contest_page";
    }

    /* Attribute Area */
    @ModelAttribute
    public List<Contest> getTopNewestProblem() throws WebAppException {
        int number = Integer.parseInt(environment.getProperty("")); // missing
        return iContestLoader.loadTopContest(number);
    }
}
