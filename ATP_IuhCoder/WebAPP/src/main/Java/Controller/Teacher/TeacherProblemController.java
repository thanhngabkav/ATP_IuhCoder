package Controller.Teacher;

import Models.CreateProblemForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by lldtien on 8/5/2017.
 */
@Controller
@RequestMapping("/Teacher/Problem")
public class TeacherProblemController {
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        Object target = webDataBinder.getTarget();
        if (target == null) return;
        if(target instanceof CreateProblemForm)
            webDataBinder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public ModelAndView home(){
//
//    }

    @RequestMapping(value = "/addProblem", method = RequestMethod.GET)
    public ModelAndView upProblem(){
        return new ModelAndView("teacher_create_problem_page","ProblemUploadForm", new CreateProblemForm());
    }

    @RequestMapping(value = "/addProblem", method = RequestMethod.POST)
    public String upProblemPost(HttpServletRequest request, @ModelAttribute("ProblemUploadForm") CreateProblemForm createProblemForm, BindingResult result, Model model){
        return doUpload(request, createProblemForm);
    }

    private String doUpload(HttpServletRequest request, CreateProblemForm form) {
        String upLoadRootPath = request.getServletContext().getRealPath("upload");
        File uploadRootDir = new File(upLoadRootPath);
        if(!uploadRootDir.exists())
            uploadRootDir.mkdirs();
        CommonsMultipartFile input = form.getInput();
        CommonsMultipartFile output = form.getOutput();
        if(input == null) /*quang exeption*/ ;
        if(output == null) /*quang exeption*/ ;
        Upload(input);
        Upload(output);
        return "home_page";
    }

    private void Upload(CommonsMultipartFile file) {
        String fileClientName = file.getOriginalFilename();
        if(!FileClientNameEmpty(fileClientName)){
            try {
                File severFile = new File(file.getOriginalFilename());
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(severFile));
                stream.write(file.getBytes());
                stream.close();

            }catch (Exception e){

            }
        }
    }

    private boolean FileClientNameEmpty(String filename) {
        return filename == null || filename.length() <= 0;
    }
}
