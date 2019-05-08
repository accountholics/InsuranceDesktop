package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import java.util.Set;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@XmlRootElement
@Table(name="t_user")
public class User implements Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;

	@Column(name = "cin")
	private String cin;
	
	@Column(name = "phone_number")
	private long phone_number;

	@Column(name = "date_driver_license")
	private Date date_driver_license;

	@Column(name = "expertise_domain")
	private String expertise_domain;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;
 
	@Enumerated(EnumType.STRING)
	@Column(name = "role")
	private RoleType role ;

	@Column(name = "password")
	private String password;

	@Column(name = "email")
	private String email;

	@Column(name = "adress")
	private String adress;

	@Column(name = "state")
	private String state;

	@OneToMany(mappedBy="client")
	private Set<Contract> contracts;
	
	//added by wafa for scoring
	private int age;
	private int nbchildren;
	private float salary;
	private float ratioEndettement;
	private String situationLogement;
	private String etatPatrimonial;
	private int dureeDernierEmploi;
	
	

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



	public Set<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(Set<Contract> contracts) {
		this.contracts = contracts;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
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

	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}

	public int getId() {
		return this.id;
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

	public String getFirst_name() {
		return this.first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return this.last_name;
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

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}



}
