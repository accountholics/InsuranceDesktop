package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Justification
 *
 */
@Entity
@Table(name ="t_justification")
public class Justification implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int justificationId;
	
	private Date deposit_date;
	
	private String topic;
	
	@ManyToOne
	private Sinister sinister;
	
	public Justification() {
		super();
	}
	
	public int getJustificationId() {
		return justificationId;
	}

	public void setJustificationId(int justificationId) {
		this.justificationId = justificationId;
	}

	public Date getDeposit_date() {
		return deposit_date;
	}

	public void setDeposit_date(Date deposit_date) {
		this.deposit_date = deposit_date;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Sinister getSinister() {
		return sinister;
	}

	public void setSinister(Sinister sinister) {
		this.sinister = sinister;
	}



   
}
