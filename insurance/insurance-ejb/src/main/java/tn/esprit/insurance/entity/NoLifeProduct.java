package tn.esprit.insurance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_nolifeinsurance")
public class NoLifeProduct extends InsuranceProduct{
	@Column(name = "security_measure")
	private float security_measure;
	
	@Column(name = "measuring_cost")
	private float measuring_cost;
	
	@Column(name = "risk_measure")
	private float risk_measure;
	
	@Column(name = "ratio_pure_premium")
	private float ratio_pure_premium;

	
	public NoLifeProduct() {
		super();
	}

	public float getSecurity_measure() {
		return security_measure;
	}

	public void setSecurity_measure(float security_measure) {
		this.security_measure = security_measure;
	}

	public float getMeasuring_cost() {
		return measuring_cost;
	}

	public void setMeasuring_cost(float measuring_cost) {
		this.measuring_cost = measuring_cost;
	}

	public float getRisk_measure() {
		return risk_measure;
	}

	public void setRisk_measure(float risk_measure) {
		this.risk_measure = risk_measure;
	}

	public float getRatio_pure_premium() {
		return ratio_pure_premium;
	}

	public void setRatio_pure_premium(float ratio_pure_premium) {
		this.ratio_pure_premium = ratio_pure_premium;
	}
	
	

}
