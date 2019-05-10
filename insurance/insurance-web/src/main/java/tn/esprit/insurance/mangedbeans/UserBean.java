package tn.esprit.insurance.mangedbeans;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Set;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import tn.esprit.insurance.entity.Contract;
import tn.esprit.insurance.entity.RoleType;
import tn.esprit.insurance.entity.User;
import tn.esprit.insurance.service.implementation.Userservice;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String cin;
	private long phone_number;
	private Date date_driver_license;
	private String expertise_domain;
	private String first_name;
	private String last_name;
	private RoleType role ;
	private String password;
	private String email;
	private String adress;
	private String state;
	private Set<Contract> contracts;
	
	private int age;
	private int nbchildren;
	private float salary;
	private float ratioEndettement;
	private String situationLogement;
	private String etatPatrimonial;
	private int dureeDernierEmploi;	
	private int score;
	
	@EJB
	Userservice us;

	public UserBean() {
	}
	
	private List<User> users;
	
	public List<User> getUsers() {
		users = us.getAllUsers();
//		for (User u : users)
//			us.insuredScoring(u);
		return users;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public Date getDate_driver_license() {
		return date_driver_license;
	}

	public void setDate_driver_license(Date date_driver_license) {
		this.date_driver_license = date_driver_license;
	}

	public String getExpertise_domain() {
		return expertise_domain;
	}

	public void setExpertise_domain(String expertise_domain) {
		this.expertise_domain = expertise_domain;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public RoleType getRole() {
		return role;
	}

	public void setRole(RoleType role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Set<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(Set<Contract> contracts) {
		this.contracts = contracts;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNbchildren() {
		return nbchildren;
	}

	public void setNbchildren(int nbchildren) {
		this.nbchildren = nbchildren;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getRatioEndettement() {
		return ratioEndettement;
	}

	public void setRatioEndettement(float ratioEndettement) {
		this.ratioEndettement = ratioEndettement;
	}

	public String getSituationLogement() {
		return situationLogement;
	}

	public void setSituationLogement(String situationLogement) {
		this.situationLogement = situationLogement;
	}

	public String getEtatPatrimonial() {
		return etatPatrimonial;
	}

	public void setEtatPatrimonial(String etatPatrimonial) {
		this.etatPatrimonial = etatPatrimonial;
	}

	public int getDureeDernierEmploi() {
		return dureeDernierEmploi;
	}

	public void setDureeDernierEmploi(int dureeDernierEmploi) {
		this.dureeDernierEmploi = dureeDernierEmploi;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Userservice getUs() {
		return us;
	}

	public void setUs(Userservice us) {
		this.us = us;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	
	
	
}
