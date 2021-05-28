package kodlamaio.Hrms_Project.business.abstracts;

import java.util.List;

import kodlamaio.Hrms_Project.core.utilities.results.DataResult;
import kodlamaio.Hrms_Project.entities.concretes.Candidate;



public interface CandidateService   {

	DataResult<List<Candidate>> getAll();

}