package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "premium")
public class Premium implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PREMIUM_ID")
	private Long id; 
	
	@Column(name = "label")
	private String label;
	
	@Column(name = "value")
	private float value;
	
	@Column(name = "Payment_due_value")
	private Date payment_due_value;
	
	@Column(name = "payment_due_date")
	private Date payment_Due_Date;
	
	@OneToOne
	private Contract contract;
	
	public Premium() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public Date getPayment_due_value() {
		return payment_due_value;
	}

	public void setPayment_due_value(Date payment_due_value) {
		this.payment_due_value = payment_due_value;
	}

	public Date getPayment_Due_Date() {
		return payment_Due_Date;
	}

	public void setPayment_Due_Date(Date payment_Due_Date) {
		this.payment_Due_Date = payment_Due_Date;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
	
	 
}