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
@Table(name = "t_quotation")
public class Quotation implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Number_Quotation")
	private int nbQuotation;
	
	@Column(name="Creation_Date") 
	private Date creationDate;
	
	@Column(name="Beginning_Date") 
	private Date beginningDate;
	
	@Column(name="Duration") 
	private int duration;
	
	@Column(name="End_Date") 
	private Date endDate;
	
	@Column(name="Renewal_Type") 
	private String RenewalType;	
	
	@Column(name="Code_Product") 
	private int codeProduct;	 

	@ManyToOne
	Client client;

	public int getNbQuotation() {
		return nbQuotation;
	}

	public void setNbQuotation(int nbQuotation) {
		this.nbQuotation = nbQuotation;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getBeginningDate() {
		return beginningDate;
	}

	public void setBeginningDate(Date beginningDate) {
		this.beginningDate = beginningDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getRenewalType() {
		return RenewalType;
	}

	public void setRenewalType(String renewalType) {
		RenewalType = renewalType;
	}

	public int getCodeProduct() {
		return codeProduct;
	}

	public void setCodeProduct(int codeProduct) {
		this.codeProduct = codeProduct;
	}
	
   
}

