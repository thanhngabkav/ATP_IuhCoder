package Models;

import Utilities.ErrorLevel;
import Utilities.ErrorStatus;

/**
 * Created by THANH NGA on 7/11/2017.
 */
public class WebAppException extends Exception{

    private StackTraceElement[] stackTraceElements;
    private ErrorStatus status;
    private String errorClass;
    private String errorContent;
    private ErrorLevel errorLevel;

    public WebAppException(StackTraceElement[] stackTraceElements, ErrorStatus status, String errorClass, String errorContent, ErrorLevel errorLevel) {
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

    public ErrorStatus getStatus() {
        return status;
    }

    public void setStatus(ErrorStatus status) {
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

    public ErrorLevel getErrorLevel() {
        return errorLevel;
    }

    public void setErrorLevel(ErrorLevel errorLevel) {
        this.errorLevel = errorLevel;
    }
}
