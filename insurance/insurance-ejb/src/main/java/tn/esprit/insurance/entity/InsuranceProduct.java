package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_insuranceproduct")
public class InsuranceProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "product_name")
	private String name;


	@OneToMany(fetch = FetchType.EAGER, mappedBy = "product_insurance")
	private Set<Contract> contracts;

	@Column(name = "security_measure")
	private int security_measure;

	@Column(name = "measuring_cost")
	private int measuring_cost;

	@Column(name = "risk_measure")
	private int risk_measure;

	@Column(name = "ratio_pure_premium")
	private float ratio_pure_premium;

	public int getSecurity_measure() {
		return security_measure;
	}

	public void setSecurity_measure(int security_measure) {
		this.security_measure = security_measure;
	}

	public int getMeasuring_cost() {
		return measuring_cost;
	}

	public void setMeasuring_cost(int measuring_cost) {
		this.measuring_cost = measuring_cost;
	}

	public int getRisk_measure() {
		return risk_measure;
	}

	public void setRisk_measure(int risk_measure) {
		this.risk_measure = risk_measure;
	}

	public float getRatio_pure_premium() {
		return ratio_pure_premium;
	}

	public void setRatio_pure_premium(float ratio_pure_premium) {
		this.ratio_pure_premium = ratio_pure_premium;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public InsuranceProduct() {
		super();
	}

	public int getId() {
		return this.id;
	}
	public float CommercialPrime(int InsuredValue)
	{
		float a,b,c,d,e;
		
		b=(float)(1+(float)(security_measure/100));
		c=(float)(1-(float)(risk_measure/100));
		d=(float)(1-(float)(measuring_cost/100));
		e=(float)ratio_pure_premium*b/(c*d);
		a=InsuredValue*e;
		
		return a;
	}

}
