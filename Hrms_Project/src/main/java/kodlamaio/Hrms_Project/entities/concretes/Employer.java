package kodlamaio.Hrms_Project.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import kodlamaio.Hrms_Project.entities.concretes.Employer;
import kodlamaio.Hrms_Project.entities.concretes.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employers")
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "id")
public class Employer extends User{
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "web_address")
	private String webAdress;
}