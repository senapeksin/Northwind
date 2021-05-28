package kodlamaio.Northwind_project.business.abstracts;

import java.util.List;

import kodlamaio.Northwind_project.core.utilities.results.DataResult;
import kodlamaio.Northwind_project.core.utilities.results.Result;
import kodlamaio.Northwind_project.entities.concretes.Product;



public interface  ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
}
