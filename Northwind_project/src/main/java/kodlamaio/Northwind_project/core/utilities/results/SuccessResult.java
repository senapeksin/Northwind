package kodlamaio.Northwind_project.core.utilities.results;

import kodlamaio.Northwind_project.core.utilities.results.Result;

public class SuccessResult extends Result{
	public SuccessResult() {  
		super(true);
	}
	public SuccessResult(String message) {  
		super(true,message);
	}
}
