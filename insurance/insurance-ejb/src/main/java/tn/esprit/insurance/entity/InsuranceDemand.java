package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: InsuranceDemand
 *
 */
@Entity
@Table(name = "t_insuranceDemand")
public class InsuranceDemand implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Demand_ID")
	private int id;
	
	@Column(name="Demand_Date") 
	private Date Demanddate;
	
	@ManyToOne
	Client client;
	
	public Date getDemanddate() {
		return Demanddate;
	}
	public void setDemanddate(Date demanddate) {
		Demanddate = demanddate;
	}
	
	
	
   
}
