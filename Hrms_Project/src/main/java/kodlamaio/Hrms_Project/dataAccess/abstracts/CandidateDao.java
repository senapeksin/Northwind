package kodlamaio.Hrms_Project.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms_Project.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
}