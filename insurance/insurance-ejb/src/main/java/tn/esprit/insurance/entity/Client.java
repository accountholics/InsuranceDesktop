package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
@Table(name = "t_client")
public class Client implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID") 
	private int id;
	@Column(name="PROFESSION") 
	private String profession;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="client") 
	private List<Quotation> quotations;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="client") 
	private List<InsuranceDemand> InsurDemands;
	
	public List<Quotation> getQuotations() {
		return quotations;
	}
	public void setQuotations(List<Quotation> quotations) {
		this.quotations = quotations;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}   
}


