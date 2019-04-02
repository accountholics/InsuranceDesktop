package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Contract
 *
 */
@Entity
@Table(name="t_contract")
public class Contract implements Serializable {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "seniority")
	private boolean seniority;

	@Column(name = "date_debut")
	private Date date_debut;

	@Column(name = "duration")
	private int duration;

	@Column(name = "date_fin")
	private Date date_fin;

	@Enumerated(EnumType.STRING)
	@Column(name = "spliting")
	private SplittingType spliting;

	@ManyToOne
	private User client;

	@ManyToOne
	private InsuranceProduct product_insurance ;
	public InsuranceProduct getProduct_insurance() {
		return product_insurance;
	}

	public void setProduct_insurance(InsuranceProduct product_insurance) {
		this.product_insurance = product_insurance;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	private static final long serialVersionUID = 1L;

	public Contract() {
		super();
	}

	public boolean isSeniority() {
		return seniority;
	}

	public void setSeniority(boolean seniority) {
		this.seniority = seniority;
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

}
