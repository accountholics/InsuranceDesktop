package tn.esprit.insurance.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FinalReport
 *
 */
@Entity
@Table(name ="t_finalreport")
public class FinalReport implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int finalReportId;
	
	private String summary;
	
	private String  decision;
	

	@OneToOne
	private Sinister sinister;
	
	public FinalReport() {
		super();
	}

	public int getFinalReportId() {
		return finalReportId;
	}

	public void setFinalReportId(int finalReportId) {
		this.finalReportId = finalReportId;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	public Sinister getSinister() {
		return sinister;
	}

	public void setSinister(Sinister sinister) {
		this.sinister = sinister;
	}
	
	
   
}
