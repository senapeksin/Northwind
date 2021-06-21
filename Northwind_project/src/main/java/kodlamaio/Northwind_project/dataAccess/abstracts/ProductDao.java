package kodlamaio.Northwind_project.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.Northwind_project.entities.concretes.Product;
import kodlamaio.Northwind_project.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product,Integer>{
	 Product getByProductName(String productName);
	 
	 Product getByProductNameAndCategory_CategoryId(String productName,int categoryId);
	 
	 List<Product> getByProductNameOrCategory_CategoryId(String productName,int categoryId);
	 
	 List<Product> getByCategory_CategoryIdIn(List<Integer> categories);
	 
	 List<Product> getByProductNameContains(String productName);  // productName içeriyorsa

	 List<Product> getByProductNameStartsWith(String productName);  //bu isimle başlayanları
	
	 @Query("From Product where productName=:productName and category.categoryId =:categoryId")     //Query yazarken veritabanı tablosu olarak değil, entity olarak yazıyoruz.
	 List<Product> getByNameAndCategory(String productName, int categoryId);

	 // : 'den sonrası parametremizi veriyoruz.
	 
	 //select * from products where product_name= bisey and categoryId=bisey
	 
	 
	
	 
	 /* DTO KODLARI
	  * DATA TRANSFER OBJECT (DTO)
	  * Veri tablosundan veriyi aldınız ve ilgili modelle maplediniz. 
	  * İlgili modelin veri tablosundan aldığı bilgiyle maplenebilmesi için veri tablosu kolonlarıyla, modelin propertyleri isim ve tip olarak eşleşmeli.
	  * 
	  * İşte veri tabanından mapplenen modelleri uygulama içerisinde kullanacağınız modelle aktardığınızda bu modeller dto olarak adlandırılır.
	  * 
	  * Sql ' de Join Yapmak
	  * select p.productId,p.productName , c.categoryName  from Category c inner join Product p  
	  * on c.CategoryId = p.categoryId
	  */
	 
	 
	 //Tüm alanları değil de sadece bazı alanları getirmek istediğimiz için From değil, Select diyeceğiz.
	 //on koşuluna yazmamıza gerek yok . Çünkü Product ve Category entities lerinde join columnlarının ne olduğunu belirtmiştik.
	 
	 
	 //Entity'den istediğim alanları yani  Product ve Catogory tablolarının join'i sonucunda oluşacak kod
	 
	 @Query("Select new kodlamaio.Northwind_project.entities.dtos.ProductWithCategoryDto(p.id,p.productName, c.categoryName) From Category c Inner Join c.products p")
	 List<ProductWithCategoryDto> getProductWithCategoryDetails();
	 
	 
	 
	
}
