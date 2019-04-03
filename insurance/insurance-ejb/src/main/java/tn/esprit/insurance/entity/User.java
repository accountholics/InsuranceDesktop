package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.lang.Enum;
import java.lang.String;
import java.sql.Date;
import java.util.Collection;
import java.util.List;
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
	private String email;

	@Column(name = "adress")
	private String adress;

	@Column(name = "state")
	private String state;
	


	@OneToMany(mappedBy="client", fetch = FetchType.EAGER)
	private Set<Contract> contracts;
	
	
	@OneToMany(mappedBy="user", fetch = FetchType.EAGER)
	private List<ContractDemand> contractDemands;
	
	

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

	public List<ContractDemand> getDemandsContract() {
		return contractDemands;
	}

	public void setDemandsContract(List<ContractDemand> demandsContract) {
		this.contractDemands = demandsContract;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getAdress() {
		return adress;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", cin=" + cin + ", first_name=" + first_name + ", last_name=" + last_name + ", role="
				+ role + ", password=" + password + ", email=" + email + ", adress=" + adress + ", state=" + state
				+ "]";
	}

	public User(int id, long cin, String first_name, String last_name, RoleType role, String password, String email,
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
