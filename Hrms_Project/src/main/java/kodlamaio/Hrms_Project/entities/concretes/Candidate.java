package kodlamaio.Hrms_Project.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import kodlamaio.Hrms_Project.entities.concretes.Candidate;
import kodlamaio.Hrms_Project.entities.concretes.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidates")
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "id")
public class Candidate extends User{
	
	
	    @Column(name = "first_name")
	    private String firstName;
	    
	    @Column(name = "last_name")
	    private String lastName;
	    
		@Column(name = "identification_number")
		private String identificationNumber;
		
	    @Column(name = "birth_date")
	    private Date birthDate;
	    
	    @Column(name = "birth_year")
	    private Date birthYear;
	    
	    @Column(name = "identity_id")
	    private String identityId;
	    
	}

