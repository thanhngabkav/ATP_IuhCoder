package Controller.Student;


import Models.WebAppException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * This class is use to handle all exception
 * Created by THANH NGA on 6/29/2017.
 */
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     *
     * Controller handle MyDemoException
     * @param ex
     * @param request
     * @return ResponseEntity
     */
    @ExceptionHandler(WebAppException.class)
    protected ResponseEntity<Object> HandleExceptionController(WebAppException ex, WebRequest request){
        String bodyContent = "Error";
        return handleExceptionInternal(ex,bodyContent,new HttpHeaders(), HttpStatus.BAD_REQUEST,request);
    }
}
