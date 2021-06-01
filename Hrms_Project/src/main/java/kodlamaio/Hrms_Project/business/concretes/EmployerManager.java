package kodlamaio.Hrms_Project.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms_Project.business.abstracts.EmployerService;
import kodlamaio.Hrms_Project.core.utilities.results.DataResult;
import kodlamaio.Hrms_Project.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms_Project.dataAccess.abstracts.EmployerDao;
import kodlamaio.Hrms_Project.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

private EmployerDao employerDao;
	
	//bean = class demek 
	
	@Autowired // @Autowired = Spring; arka planda karşılık gelebilecek projede, ProductDao'nun instance ' ı olabilecek bir tane sınıfı üretiyor 
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}


	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data listelendi.");
	}


	
}