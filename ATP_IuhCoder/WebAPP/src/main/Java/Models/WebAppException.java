package Models;

/**
 * Created by THANH NGA on 7/11/2017.
 */
public class WebAppException extends Exception{

    private StackTraceElement[] stackTraceElements;
    private String status;
    private String errorClass;
    private String errorContent;
    private String errorLevel;

    public WebAppException(StackTraceElement[] stackTraceElements, String status, String errorClass, String errorContent, String errorLevel) {
        this.stackTraceElements = stackTraceElements;
        this.status = status;
        this.errorClass = errorClass;
        this.errorContent = errorContent;
        this.errorLevel = errorLevel;
    }

    public StackTraceElement[] getStackTraceElements() {
        return stackTraceElements;
    }

    public void setStackTraceElements(StackTraceElement[] stackTraceElements) {
        this.stackTraceElements = stackTraceElements;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorClass() {
        return errorClass;
    }

    public void setErrorClass(String errorClass) {
        this.errorClass = errorClass;
    }

    public String getErrorContent() {
        return errorContent;
    }

    public void setErrorContent(String errorContent) {
        this.errorContent = errorContent;
    }

    public String getErrorLevel() {
        return errorLevel;
    }

    public void setErrorLevel(String errorLevel) {
        this.errorLevel = errorLevel;
    }
}
