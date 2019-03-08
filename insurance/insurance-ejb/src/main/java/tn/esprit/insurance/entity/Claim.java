package tn.esprit.insurance.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "claim")
public class Claim implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column(name="claimId")
	private int claim_id;
	
	@Column(name="description",nullable = false) 
	private String description;
	
	//@Column(name="Type_Subject",nullable = false) 
	@Enumerated(EnumType.STRING)
	private type_subject type_subject;
	
	public enum type_subject{application,refunds,report,rescission}
	
	@ManyToOne
	User User;

	public int getClaim_id() {
		return claim_id;
	}

	public void setClaim_id(int claim_id) {
		this.claim_id = claim_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public type_subject getType_subject() {
		return type_subject;
	}

	public void setType_subject(type_subject type_subject) {
		this.type_subject = type_subject;
	}

	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}
	
	
	
}