package Controller.Teacher;

import Models.CreateContestForm;
import Models.CreateProblemForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lldtien on 8/10/2017.
 */
@Controller
@RequestMapping(value = "/Teacher/Contest")
public class TeacherContestController {


    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        Object target = webDataBinder.getTarget();
        if (target == null) return;
        if(target instanceof CreateProblemForm)
            webDataBinder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
    }

    @RequestMapping(value = "/addContest", method = RequestMethod.GET)
    public ModelAndView createContest(){
        return new ModelAndView("teacher_create_contest_page","CreateContestForm", new CreateContestForm());
    }


}
