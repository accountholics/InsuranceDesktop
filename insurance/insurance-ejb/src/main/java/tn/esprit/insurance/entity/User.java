package tn.esprit.insurance.entity ;

import java.io.Serializable;

import java.lang.String;
import java.sql.Date;
import java.util.Set;

import javax.persistence.*;

@Entity

public class User implements Serializable {

	public User(long cin, String first_name, String last_name, String password, String email, String adress,
			String state) {
		
		this.cin = cin;
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
		this.email = email;
		this.adress = adress;
		this.state = state;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "cin")
	private long cin;

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
	private role_type role;

	@Column(name = "password")
	private String password;

	@Column(name = "email")
	private String email;

	@Column(name = "adress")
	private String adress;

	@Column(name = "state")
	private String state;
	
	@Column(name = "seniority")
	private boolean seniority ;

	

	
	@Override
	public String toString() {
		return "User [id=" + id + ", cin=" + cin + ", date_driver_license=" + date_driver_license
				+ ", expertise_domain=" + expertise_domain + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", role=" + role + ", password=" + password + ", email=" + email + ", adress=" + adress + ", state="
				+ state + ", seniority=" + seniority + "]";
	}
	

	


	


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}





	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCin() {
		return cin;
	}

	public void setCin(long cin) {
		this.cin = cin;
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

	public role_type getRole() {
		return role;
	}

	public void setRole(role_type role) {
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

	public boolean isSeniority() {
		return seniority;
	}

	public void setSeniority(boolean seniority) {
		this.seniority = seniority;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	
	
	}
