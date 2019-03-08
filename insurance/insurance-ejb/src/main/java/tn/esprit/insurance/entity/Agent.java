package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "agent")
public class Agent extends User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column
	private Date assignment_date;
	
	@Column
	private String role ;

//	@OneToMany(cascade = CascadeType.ALL, mappedBy="Agent")
//	private Set<Contract> contracts;

	public Agent(){}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getAssignment_date() {
		return assignment_date;
	}
	public void setAssignment_date(Date assignment_date) {
		this.assignment_date = assignment_date;
	}

}