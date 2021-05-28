package kodlamaio.Northwind_project.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Northwind_project.business.abstracts.ProductService;
import kodlamaio.Northwind_project.core.utilities.results.DataResult;
import kodlamaio.Northwind_project.core.utilities.results.Result;
import kodlamaio.Northwind_project.core.utilities.results.SuccessDataResult;
import kodlamaio.Northwind_project.core.utilities.results.SuccessResult;
import kodlamaio.Northwind_project.dataAccess.abstracts.ProductDao;
import kodlamaio.Northwind_project.entities.concretes.Product;




@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	//bean = class demek 
	
	@Autowired // @Autowired = Spring; arka planda karşılık gelebilecek projede, ProductDao'nun instance ' ı olabilecek bir tane sınıfı üretiyor 
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public DataResult<List<Product>> getAll() {
	 
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data listelendi.");
	}
	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi.");
	}

}

