package kodlamaio.Hrms_Project.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms_Project.business.abstracts.JobTitleServices;
import kodlamaio.Hrms_Project.entities.concretes.JobTitle;
import kodlamaio.Hrms_Project.dataAccess.abstracts.JobTitleDao;

@Service
public class JobTitleManager  implements JobTitleServices{

	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	} 
	@Override
	public List<JobTitle> getAll() {
		// TODO Auto-generated method stub
		return this.jobTitleDao.findAll();
	}

}
