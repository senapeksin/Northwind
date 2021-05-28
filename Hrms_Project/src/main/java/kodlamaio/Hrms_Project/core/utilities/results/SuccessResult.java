package kodlamaio.Hrms_Project.core.utilities.results;

import kodlamaio.Hrms_Project.core.utilities.results.Result;

public class SuccessResult extends Result{
	public SuccessResult() {  
		super(true);
	}
	public SuccessResult(String message) {  
		super(true,message);
	}
}
