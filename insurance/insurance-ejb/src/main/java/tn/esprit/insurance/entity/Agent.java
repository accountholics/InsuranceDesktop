//package tn.esprit.insurance.entity;
//
//import java.io.Serializable;
//import java.util.Date;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "t_agent")
//public class Agent extends User implements Serializable {
//	
//	private static final long serialVersionUID = 1L;
//	
//	private Date assignment_date;
//	
//	private RoleType role ;
//
////	@OneToMany(cascade = CascadeType.ALL, mappedBy="Agent")
////	private Set<Contract> contracts;
//
//	public Agent(){}
//
//	public RoleType getRole() {
//		return role;
//	}
//
//	public void setRole(RoleType role) {
//		this.role = role;
//	}
//
//	public Date getAssignment_date() {
//		return assignment_date;
//	}
//	public void setAssignment_date(Date assignment_date) {
//		this.assignment_date = assignment_date;
//	}
//
//}