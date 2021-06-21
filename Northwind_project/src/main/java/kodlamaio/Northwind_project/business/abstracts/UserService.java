package kodlamaio.Northwind_project.business.abstracts;

import kodlamaio.Northwind_project.core.entities.User;
import kodlamaio.Northwind_project.core.utilities.results.DataResult;
import kodlamaio.Northwind_project.core.utilities.results.Result;


public interface UserService {
	
	Result add(User user);
	
	DataResult<User> findByEmail(String email);
}
 