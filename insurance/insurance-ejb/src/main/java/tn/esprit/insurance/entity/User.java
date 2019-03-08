package tn.esprit.insurance.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;


@Entity
@Table(name="user")
@Inheritance(strategy = InheritanceType.JOINED)

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column(name="User_ID")
	private int id;
	
	@Column(name="first_name",nullable = false) 
	private String firstName;
	
	@Column(name="last_name",nullable = false)
	private String lastName;
	
	@Column(name="email",nullable = false)
	private String email;
	
	@Column(name="phone",nullable = false,unique=true,length=8)
	private int phone;

//	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
//	private Set<Claim> claims;

//	@OneToMany(cascade = CascadeType.ALL, mappedBy="Quotation")
//	private Set<Quotation> quotations;

	public User() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}

}