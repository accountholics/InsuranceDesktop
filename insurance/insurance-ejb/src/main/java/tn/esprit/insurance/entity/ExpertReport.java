package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ExpertReport
 *
 */
@Entity
@Table(name ="t_expertreport")
public class ExpertReport implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int expertReportId;
	
	private Date depositDate;
	
	private String topic;
	
	@ManyToOne
	private Expert expert;
	
	@OneToOne
	private Sinister sinister;
	

	public ExpertReport() {
		super();
	}

	public int getExpertReportId() {
		return expertReportId;
	}

	public void setExpertReportId(int expertReportId) {
		this.expertReportId = expertReportId;
	}

	public Date getDepositDate() {
		return depositDate;
	}

	public void setDepositDate(Date depositDate) {
		this.depositDate = depositDate;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Expert getExpert() {
		return expert;
	}

	public void setExpert(Expert expert) {
		this.expert = expert;
	}

	public Sinister getSinister() {
		return sinister;
	}

	public void setSinister(Sinister sinister) {
		this.sinister = sinister;
	}
		
}
