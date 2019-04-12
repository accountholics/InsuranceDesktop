package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.lang.Enum;
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
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	private RoleType role;

	@Column(name = "password")
	private String password;

	@Column(name = "email")
	private int email;

	@Column(name = "adress")
	private String adress;

	@Column(name = "state")
	private String state;
	
	@Column(name = "seniority")
	private boolean seniority ;

	@OneToMany(mappedBy="client", fetch = FetchType.EAGER)
	private Set<Contract> contracts;

	public String getAdress() {
		return adress;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", cin=" + cin + ", first_name=" + first_name + ", last_name=" + last_name + ", role="
				+ role + ", password=" + password + ", email=" + email + ", adress=" + adress + ", state=" + state
				+ "]";
	}

	public User(int id, long cin, String first_name, String last_name, RoleType role, String password, int email,
			String adress, String state) {
		super();
		this.id = id;
		this.cin = cin;
		this.first_name = first_name;
		this.last_name = last_name;
		this.role = role;
		this.password = password;
		this.email = email;
		this.adress = adress;
		this.state = state;
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

	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
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

	public long getCin() {
		return this.cin;
	}

	public void setCin(long cin) {
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
		return this.role;
	}

	public void setRole(RoleType role) {
		this.role = role;
	}

}
