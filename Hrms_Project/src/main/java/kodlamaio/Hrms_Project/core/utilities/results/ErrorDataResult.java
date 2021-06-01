package kodlamaio.Hrms_Project.core.utilities.results;

import kodlamaio.Hrms_Project.core.utilities.results.DataResult;

public class ErrorDataResult<T> extends DataResult<T>{

	public ErrorDataResult(T data, String message) {
		super(data, false,message);
	}
    
	public ErrorDataResult(T data) {
		super(data,false);
	}
	
	public ErrorDataResult(String message) {  //datasız
		super(null,false,message);
	}
	public ErrorDataResult() {  		 	//datasız
		super(null,false);
	}
	
}

