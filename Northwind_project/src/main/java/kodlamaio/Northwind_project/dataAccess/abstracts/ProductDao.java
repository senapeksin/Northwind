package kodlamaio.Northwind_project.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Northwind_project.entities.concretes.Product;



public interface ProductDao extends JpaRepository<Product,Integer>{

}
