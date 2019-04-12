package tn.esprit.insurance.entity;

import java.io.Serializable;
//import java.sql.Date;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Archive
 *
 */
@Entity

public class Archive implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Title")
	private String title;
	
	@Column(name = "Feedback")
	private String feedback;

	@Enumerated(EnumType.STRING)
	private FeedsType type;

	@Column(name = "Sent_Date")
	private Date dateSent;
	
	@Column(name = "Solving_Date")
	private Date dateSolving;
	
	@Column(name = "customer_id")
	private int customer_id;

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public FeedsType getType() {
		return type;
	}

	public void setType(FeedsType type) {
		this.type = type;
	}

	public Date getDateSolving() {
		return dateSolving;
	}

	public void setDateSolving(Date dateSolving) {
		this.dateSolving = dateSolving;
	}

	public Date getDateSent() {
		return dateSent;
	}

	public void setDateSent(Date dateSent) {
		this.dateSent = dateSent;
	}
	
	public Archive() {
		super();
	}
   
}
