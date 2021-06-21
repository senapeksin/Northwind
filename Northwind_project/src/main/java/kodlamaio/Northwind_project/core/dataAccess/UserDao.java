package kodlamaio.Northwind_project.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Northwind_project.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	//kullanıcı bilgilerine mail ile ulaşalım.
	User findByEmail(String email);
}
