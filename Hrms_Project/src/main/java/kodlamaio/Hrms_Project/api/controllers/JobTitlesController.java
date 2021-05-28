package kodlamaio.Hrms_Project.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms_Project.business.abstracts.JobTitleServices;
import kodlamaio.Hrms_Project.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobTitles")
public class JobTitlesController {
	
	
	private JobTitleServices jobTitleServices;
	
	
	@Autowired
	public JobTitlesController(JobTitleServices jobTitleServices) {
		super();
		this.jobTitleServices = jobTitleServices;
	}

	@GetMapping("/getall")  //veri istediğimiz zaman 
	public List<JobTitle> getAll(){
		return this.jobTitleServices.getAll();
		
	}
}
