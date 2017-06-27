package Entities;

import java.io.Serializable;
import java.lang.String;


public class Output implements Serializable {

	   
	private int OutputId;
	private String ProblemId;
	private String OutputData;
	private static final long serialVersionUID = 1L;
	
	public Output() {
		super();
	}   
	public int getOutputId() {
		return this.OutputId;
	}

	public void setOutputId(int OutputId) {
		this.OutputId = OutputId;
	}   
	public String getProblemId() {
		return this.ProblemId;
	}

	public void setProblemId(String ProblemId) {
		this.ProblemId = ProblemId;
	}   
	public String getOutputData() {
		return this.OutputData;
	}

	public void setOutputData(String OutputData) {
		this.OutputData = OutputData;
	}
   
}
