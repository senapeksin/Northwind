package kodlamaio.Hrms_Project.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms_Project.entities.concretes.Employer;



public interface EmployerDao extends JpaRepository<Employer,Integer>{

	
}
