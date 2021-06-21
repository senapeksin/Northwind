package kodlamaio.Northwind_project.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.Northwind_project.business.abstracts.UserService;
import kodlamaio.Northwind_project.core.dataAccess.UserDao;
import kodlamaio.Northwind_project.core.entities.User;
import kodlamaio.Northwind_project.core.utilities.results.DataResult;
import kodlamaio.Northwind_project.core.utilities.results.Result;
import kodlamaio.Northwind_project.core.utilities.results.SuccessDataResult;
import kodlamaio.Northwind_project.core.utilities.results.SuccessResult;

public class UserManager implements UserService {

	private UserDao userDao;  //UserDao türündeki userDaou'yu enjekte ediyor olacağım.
	
	@Autowired
	public UserManager(UserDao userDao) {  //UserDao'dan parametre alan bir injection yap. @Autowired diyerek userDao 'yu  implemente eden nesne referansını bize verecek.
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı Bulundu");
	}
	
}
