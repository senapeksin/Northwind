package kodlamaio.Hrms_Project.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.Hrms_Project.entities.concretes.JobTitle;

public interface JobTitleServices {
	List<JobTitle> getAll();
	//Result add(JobTitle jobTitle);
	
}
