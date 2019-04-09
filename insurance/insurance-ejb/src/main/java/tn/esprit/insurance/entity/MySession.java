package tn.esprit.insurance.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class MySession {
	
	private int id;


	private long cin;


	private String first_name;

	private String last_name;

	private role_type role;

	private String email;

	private String adress;

	private String state;
	
	private boolean seniority ;

	public MySession() {
		super();
		
	}

	public MySession(int id, long cin, String first_name, String last_name, role_type role, String email, String adress,
			String state, boolean seniority) {
		super();
		this.id = id;
		this.cin = cin;
		this.first_name = first_name;
		this.last_name = last_name;
		this.role = role;
		this.email = email;
		this.adress = adress;
		this.state = state;
		this.seniority = seniority;
	}

	public MySession(long cin, String first_name, String last_name, role_type role, String email, String adress,
			String state, boolean seniority) {
		super();
		this.cin = cin;
		this.first_name = first_name;
		this.last_name = last_name;
		this.role = role;
		this.email = email;
		this.adress = adress;
		this.state = state;
		this.seniority = seniority;
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
	

	
	

}
