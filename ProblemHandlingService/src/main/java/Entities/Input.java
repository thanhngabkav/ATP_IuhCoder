package Entities;

import java.io.Serializable;
import java.lang.String;

/**
 * Entity implementation class for Entity: Input
 *
 */
public class Input implements Serializable {

	   
	private int InputId;
	private String ProblemId;
	private String InputData;
	private static final long serialVersionUID = 1L;
	
	public Input() {
		super();
	}   
	public int getInputId() {
		return this.InputId;
	}

	public void setInputId(int InputId) {
		this.InputId = InputId;
	}   
	public String getProblemId() {
		return this.ProblemId;
	}

	public void setProblemId(String ProblemId) {
		this.ProblemId = ProblemId;
	}   
	public String getInputData() {
		return this.InputData;
	}

	public void setInputData(String InputData) {
		this.InputData = InputData;
	}
   
}
