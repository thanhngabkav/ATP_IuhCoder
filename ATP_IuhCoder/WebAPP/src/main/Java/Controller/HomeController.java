package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lldtien on 7/9/2017.
 */
@Controller
public class HomeController {

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
}
