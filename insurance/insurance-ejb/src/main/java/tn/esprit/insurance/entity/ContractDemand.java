package tn.esprit.insurance.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_contractdemand")
public class ContractDemand {
	
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "state_demand")
	private boolean state_demand;


	@Column(name = "date_debut")
	private Date date_debut;

	@Column(name = "duration")
	private int duration;

	@Column(name = "date_fin")
	private Date date_fin;

	@Enumerated(EnumType.STRING)
	@Column(name = "spliting")
	private SplittingType  spliting;

	@ManyToOne
	private User user;

	@ManyToOne
	private InsuranceProduct Product_insurance;

	public InsuranceProduct getProduct_insurance() {
		return Product_insurance;
	}

	public void setProduct_insurance(InsuranceProduct Product_insurance) {
		this.Product_insurance = Product_insurance;
	}

	public User getClient() {
		return user;
	}

	public void setClient(User client) {
		this.user = client;
	}

	public ContractDemand() {
	
	}

	public SplittingType getSpliting() {
		return spliting;
	}

	public void setSpliting(SplittingType spliting) {
		this.spliting = spliting;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate_debut() {
		return this.date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getDate_fin() {
		return this.date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public boolean isState_demand() {
		return state_demand;
	}

	public void setState_demand(boolean state_demand) {
		this.state_demand = state_demand;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ContractDemand(int id, boolean state_demand, Date date_debut, int duration, Date date_fin,
			SplittingType spliting, User user, InsuranceProduct Product_insurance) {
	
		this.id = id;
		this.state_demand = state_demand;
		this.date_debut = date_debut;
		this.duration = duration;
		this.date_fin = date_fin;
		this.spliting = spliting;
		this.user = user;
		this.Product_insurance = Product_insurance;
	}



	
	

}
