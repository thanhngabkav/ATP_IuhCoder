package Entities;

import java.io.Serializable;
import java.lang.String;

/**
 * Entity implementation class for Entity: NotAcceptOutput
 *
 */
public class NotAcceptOutput implements Serializable {

	   
	private int SubmissionId;
	private int InputIndex;
	private String StudentOutput;
	private String TeacherOutput;
	private String ErrorMessage;
	private static final long serialVersionUID = 1L;
	
	private SubmissionResult SubmissionResult;
	public NotAcceptOutput() {
		super();
	}   
	public int getSubmissionId() {
		return this.SubmissionId;
	}

	public void setSubmissionId(int SubmissionId) {
		this.SubmissionId = SubmissionId;
	}   
	public int getInputIndex() {
		return this.InputIndex;
	}

	public void setInputIndex(int InputIndex) {
		this.InputIndex = InputIndex;
	}   
	public String getStudentOutput() {
		return this.StudentOutput;
	}

	public void setStudentOutput(String StudentOutput) {
		this.StudentOutput = StudentOutput;
	}   
	public String getTeacherOutput() {
		return this.TeacherOutput;
	}

	public void setTeacherOutput(String TeacherOutput) {
		this.TeacherOutput = TeacherOutput;
	}   
	public String getErrorMessage() {
		return this.ErrorMessage;
	}

	public void setErrorMessage(String ErrorMessage) {
		this.ErrorMessage = ErrorMessage;
	}
   
}
