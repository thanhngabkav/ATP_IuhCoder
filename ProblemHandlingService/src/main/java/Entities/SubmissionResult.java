package Entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;


/**
 * Entity implementation class for Entity: SubmissionResult
 *
 */
public class SubmissionResult implements Serializable {

	private String SubmissionId;
	private int runtime;
	private static final long serialVersionUID = 1L;

	private List<AcceptOutput> AcceptOutputs;
	
	private List<NotAcceptOutput> NotAcceptOutputs;
	
	public SubmissionResult() {
		super();
	}

	public String getSubmissionId() {
		return this.SubmissionId;
	}

	public void setSubmissionId(String SubmissionId) {
		this.SubmissionId = SubmissionId;
	}

	public int getRuntime() {
		return this.runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

}
