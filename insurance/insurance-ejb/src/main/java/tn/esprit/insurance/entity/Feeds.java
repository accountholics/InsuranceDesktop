package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Feeds
 *
 */
@Entity

public class Feeds implements Serializable {

	
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
	
	@Enumerated(EnumType.STRING)
	private FeedsState state;


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFeedback() {
		return feedback;
	}


	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Date getDateSent() {
		return dateSent;
	}


	public void setDateSent(Date dateSent) {
		this.dateSent = dateSent;
	}

	public FeedsType getType() {
		return type;
	}


	public void setType(FeedsType type) {
		this.type = type;
	}


	public FeedsState getState() {
		return state;
	}


	public void setState(FeedsState state) {
		this.state = state;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	User customer;
	
	
	public Feeds() {
		super();
	}
   
}
