package kodlamaio.Hrms_Project.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms_Project.business.abstracts.CandidateService;
import kodlamaio.Hrms_Project.core.utilities.results.DataResult;
import kodlamaio.Hrms_Project.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms_Project.dataAccess.abstracts.CandidateDao;
import kodlamaio.Hrms_Project.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

 private CandidateDao candidateDao;
	
	  @Autowired
	    public CandidateManager(CandidateDao candidateDao) {
	      	        this.candidateDao = candidateDao;
	      }
	
	@Override
	public DataResult<List<Candidate>> getAll() {
		
		//return new SuccessDataResult<>(candidateDao.findAll());
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"Data listelendi.");
	}

}
