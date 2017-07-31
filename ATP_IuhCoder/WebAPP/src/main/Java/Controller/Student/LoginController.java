package Controller.Student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lldtien on 7/25/2017.
 */
@Controller
@RequestMapping("/Login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String login(){
        return "login_page";
    }
}
