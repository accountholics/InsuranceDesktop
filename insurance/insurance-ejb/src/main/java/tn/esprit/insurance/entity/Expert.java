package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="t_expert")
    public class Expert implements Serializable 
    {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int expertCode;
	
	private String expLastname;
	
	private String expFirstName;
	
	private long expPhone;
	
	private Disponible disponible;
	
	public Disponible getDisponible() {
		return disponible;
	}

	public void setDisponible(Disponible disponible) {
		this.disponible = disponible;
	}

	public Set<Sinister> getSinisters() {
		return sinisters;
	}

	public void setSinisters(Set<Sinister> sinisters) {
		this.sinisters = sinisters;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy="expert") 
	private Set<ExpertReport> reports;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="expert")
	private Set<Sinister> sinisters;
	
	public Expert() 
	{
	}

	public int getExpertCode() {
		return expertCode;
	}

	public void setExpertCode(int expertCode) {
		this.expertCode = expertCode;
	}

	public String getExpLastname() {
		return expLastname;
	}

	public void setExpLastname(String expLastname) {
		this.expLastname = expLastname;
	}

	public String getExpFirstName() {
		return expFirstName;
	}

	public void setExpFirstName(String expFirstName) {
		this.expFirstName = expFirstName;
	}

	public long getExpPhone() {
		return expPhone;
	}

	public void setExpPhone(long expPhone) {
		this.expPhone = expPhone;
	}

	public Set<ExpertReport> getReports() {
		return reports;
	}

	public void setReports(Set<ExpertReport> reports) {
		this.reports = reports;
	}




	
	
}
