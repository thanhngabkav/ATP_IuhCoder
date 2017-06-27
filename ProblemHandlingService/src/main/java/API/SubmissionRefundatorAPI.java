package API;

import javax.jws.WebMethod;
import javax.jws.WebService;

import CodeHandling.SubmissionRefundator;
import Entities.MarkingData;
import Entities.SubmissionResult;

@WebService
public class SubmissionRefundatorAPI {
	
	@WebMethod
	public SubmissionResult getSubmissonResult(MarkingData markingData){
		SubmissionRefundator refundator = new SubmissionRefundator(markingData);
		return refundator.execute();
	}
	@WebMethod
	public String HelloWorld(){
		return "Hello World";
	}
}
