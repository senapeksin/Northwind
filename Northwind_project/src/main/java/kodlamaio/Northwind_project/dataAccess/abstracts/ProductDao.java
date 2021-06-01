package kodlamaio.Northwind_project.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.Northwind_project.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
	 Product getByProductName(String productName);
	 
	 Product getByProductNameAndCategoryId(String productName,int categoryId);
	 
	 List<Product> getByProductNameOrCategoryId(String productName,int categoryId);
	 
	 List<Product> getByCategoryIdIn(List<Integer> categories);
	 
	 List<Product> getByProductNameContains(String productName);  // productName içeriyorsa

	 List<Product> getByProductNameStartsWith(String productName);  //bu isimle başlayanları
	 
	 @Query("From Product where productName=:productName and categoryId =:categoryId")     //Query yazarken veritabanı tablosu olarak değil, entity olarak yazıyoruz.
	 List<Product> getByNameAndCategory(String productName, int categoryId);

	 // : 'den sonrası parametremizi veriyoruz.
	 //select * from products where product_name= bisey and categoryId=bisey
	 
	 
}
