package Entities;

import java.io.Serializable;
import java.lang.String;

/**
 * Entity implementation class for Entity: AcceptOutput
 *
 */
public class AcceptOutput implements Serializable {

	private int SubmissionId;
	private int InputIndex;
	private String StudentOutput;
	private String TeacherOutput;
	private static final long serialVersionUID = 1L;
	
	private SubmissionResult SubmissionResult;
	
	public AcceptOutput(int submissionId, int inputIndex, String studentOutput, String teacherOutput,
			Entities.SubmissionResult submissionResult) {
		super();
		SubmissionId = submissionId;
		InputIndex = inputIndex;
		StudentOutput = studentOutput;
		TeacherOutput = teacherOutput;
		SubmissionResult = submissionResult;
	}
	public AcceptOutput() {
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
   
}
