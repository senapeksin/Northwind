package kodlamaio.Hrms_Project.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms_Project.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer>{
	
}
