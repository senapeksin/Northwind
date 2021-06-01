package kodlamaio.Northwind_project.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Northwind_project.business.abstracts.ProductService;
import kodlamaio.Northwind_project.core.utilities.results.DataResult;
import kodlamaio.Northwind_project.core.utilities.results.Result;
import kodlamaio.Northwind_project.entities.concretes.Product;


@RestController 		         // Controller olduğunu söyledik.	
@RequestMapping("api/products")  
public class ProductsController {
	//dış dünyanın sistemimizle iletişim kurduğu yer : Controller'dır..
	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")	 // @GetMapping = veri istediğimiz anlamına gelir.
	public DataResult<List<Product>> getALl(){
		return this.productService.getAll();
	}
	
	@PostMapping("/add")    // @PostMapping =ekleme olduğu için data istemiyoruz bir bir sey ekliyoruz. 
	public Result add(@RequestBody Product product) {   //post işlemlerinde eğer parametre alıyorsa bunlara @RequestBody diyoruz. Hem istek yapıyor hem datayı da veriyor.
		//@RequestBody'daki data dediğimiz şey aslında bizim Product'ımız
		return this.productService.add(product);
	}
}