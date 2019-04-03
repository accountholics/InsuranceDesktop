package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Claims
 *
 */
@Entity
@Table(name="Claims")
public class Claims implements Serializable {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Claim")
	private String text;
	
	@Column(name = "Claim_Type")
	private String type;
	
	@Column(name = "Priority")
	private int priority;
	
	@Column(name = "Claims_Date")
	private Date dateRec;
	
	@Column(name = "Solving_Date")
	private Date DateReso;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "Status")
	private ClaimState state;


	@ManyToOne(cascade = CascadeType.ALL)
	User customer; 
	
	public Claims() {
		super();
	}
	
	public ClaimState getState() {
		return state;
	}
	
	public void setState(ClaimState state) {
		this.state = state;
	}
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}   
	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}   
	public Date getDateRec() {
		return this.dateRec;
	}

	public void setDateRec(Date dateRec) {
		this.dateRec = dateRec;
	}   
	public Date getDateReso() {
		return this.DateReso;
	}

	public void setDateReso(Date DateReso) {
		this.DateReso = DateReso;
	}   
   
}
