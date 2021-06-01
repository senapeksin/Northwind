package kodlamaio.Hrms_Project.business.abstracts;

import java.util.List;

import kodlamaio.Hrms_Project.core.utilities.results.*;
import kodlamaio.Hrms_Project.entities.concretes.Employer;


public interface EmployerService   {

	DataResult<List<Employer>> getAll();
//	Result add(Employer employer);
}