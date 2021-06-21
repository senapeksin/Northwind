package kodlamaio.Northwind_project.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Northwind_project.business.abstracts.ProductService;
import kodlamaio.Northwind_project.core.utilities.results.DataResult;
import kodlamaio.Northwind_project.core.utilities.results.Result;
import kodlamaio.Northwind_project.entities.concretes.Product;
import kodlamaio.Northwind_project.entities.dtos.ProductWithCategoryDto;


@RestController 		         // Controller olduğunu söyledik.	
@RequestMapping("/api/products")  
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
	
	@GetMapping("/getByProductName")
	public DataResult<Product>  getByProductName(@RequestParam String productName){ //@RequestParam : Yapılan isteğin parametrelerine bak , parametrelerde productName diye bir sey olacak ordan oku .
		return this.productService.getByProductName(productName);
	}
	
	@GetMapping("/getByProductNameAndCategoryId")
	 public DataResult<Product> getByProductNameAndCategoryId(@RequestParam  String productName, @RequestParam int categoryId){
		 return this.productService.getByProductNameAndCategoryId(productName, categoryId);
	 }
	
	
	@GetMapping("/getByProductNameContains")
	 public  DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
		 return this.productService.getByProductNameContains(productName);
	 }
	
	@GetMapping("/getByProductNameOrCategoryId")
	public  DataResult<List<Product>> getByProductNameOrCategoryId(@RequestParam String productName,@RequestParam  int categoryId){
		return this.productService.getByProductNameOrCategoryId(productName, categoryId);
	}
	 
	@GetMapping("/getByCategoryIdIn")
	 public  DataResult<List<Product>> getByCategoryIdIn(@RequestParam List<Integer> categories){
		 return this.productService.getByCategoryIdIn(categories);
	 }
	
	
	@GetMapping("/getByProductNameStartsWith")
	public  DataResult<List<Product>> getByProductNameStartsWith(@RequestParam  String productName){
		return this.productService.getByProductNameStartsWith(productName);
	}
	
	@GetMapping("/getAllByPage")
	public DataResult<List<Product>> getAll(int pageNo,int pageSize){
	 return this.productService.getAll(pageNo, pageSize);	
	}
	
	@GetMapping("/getAllSorted")
	public DataResult<List<Product>> getAllSorted()
	{
		 return this.productService.getAllSorted();
	}
	
	
	@GetMapping("/getProductWithCategoryDetails")
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails(){
		return this.productService.getProductWithCategoryDetails();
	}
	
	
}





