package kodlamaio.Hrms_Project.core.utilities.results;

import kodlamaio.Hrms_Project.core.utilities.results.Result;

public class ErrorResult  extends Result{

	public ErrorResult() {  
		super(false);
	}
	public ErrorResult(String message) {  
		super(false,message);
	}

}
