package kodlamaio.Northwind_project.core.utilities.results;



public class DataResult<T> extends Result{
	
private T data; 
	
	public DataResult(T data,boolean success, String message) {
		super(success, message);  // super() = base sınıfın constructor'larını çalıştırır.
		this.data = data;
	}
	public DataResult(T data,boolean success) {
		super(success);  
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
}
