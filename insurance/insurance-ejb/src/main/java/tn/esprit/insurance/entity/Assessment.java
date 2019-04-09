package tn.esprit.insurance.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Assessment
 *
 */
@Entity
@Table(name ="t_assessment")
public class Assessment implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int assessmentId;
	
	private float value;
	
	@OneToOne
	private Sinister sinister;
	
	@OneToOne
	private Receipt receipt;
	
	public Assessment() {
		super();
	}

	public int getAssessmentId() {
		return assessmentId;
	}

	public void setAssessmentId(int assessmentId) {
		this.assessmentId = assessmentId;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public Sinister getSinister() {
		return sinister;
	}

	public void setSinister(Sinister sinister) {
		this.sinister = sinister;
	}

	public Receipt getReceipt() {
		return receipt;
	}

	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}
	
   
}
