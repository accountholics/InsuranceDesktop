package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="t_sinister")
public class Sinister implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int sinisterId;
		
		private String sinisterDescription;
		
		@ManyToOne
		private Contract contract;
		
		private Date declarationDate;
		
		private Date responseDate;
		
		private SinisterState sinisterState;
		
		private String observation;
		
		private float totalcost;
		
		private String product;
		


		@OneToMany(cascade = CascadeType.ALL, mappedBy="sinister")
		private Set<Justification> justifications;

		@OneToMany(cascade = CascadeType.ALL, mappedBy="sinister")
		private Set<Item> items;
		
		@OneToOne
		private ExpertReport expertReport;
		
		@OneToOne
		private Expert expert;
		
		@OneToOne
		private FinalReport finalReport;
		
		@OneToOne
		private Assessment assessment;		
		
		public Sinister() 
		{
		}
		
		
		public Date getResponseDate() {
			return responseDate;
		}

		public void setResponseDate(Date responseDate) {
			this.responseDate = responseDate;
		}

		public String getObservation() {
			return observation;
		}

		public void setObservation(String observation) {
			this.observation = observation;
		}
		
		public Assessment getAssessment() {
			return assessment;
		}

		public void setAssessment(Assessment assessment) {
			this.assessment = assessment;
		}

		public int getSinisterId() {
			return sinisterId;
		}

		public void setSinisterId(int sinisterId) {
			this.sinisterId = sinisterId;
		}

		public String getSinisterDescription() {
			return sinisterDescription;
		}

		public void setSinisterDescription(String sinisterDescription) {
			this.sinisterDescription = sinisterDescription;
		}

		public Contract getContract() {
			return contract;
		}

		public void setContract(Contract contract) {
			this.contract = contract;
		}

		public Date getDeclarationDate() {
			return declarationDate;
		}

		public void setDeclarationDate(Date declarationDate) {
			this.declarationDate = declarationDate;
		}

		public Set<Justification> getJustifications() {
			return justifications;
		}

		public void setJustifications(Set<Justification> justifications) {
			this.justifications = justifications;
		}

		public Set<Item> getItems() {
			return items;
		}

		public void setItems(Set<Item> items) {
			this.items = items;
		}

		public ExpertReport getExpertReport() {
			return expertReport;
		}

		public void setExpertReport(ExpertReport expertReport) {
			this.expertReport = expertReport;
		}

		public FinalReport getFinalReport() {
			return finalReport;
		}

		public Expert getExpert() {
			return expert;
		}


		public void setExpert(Expert expert) {
			this.expert = expert;
		}


		public void setFinalReport(FinalReport finalReport) {
			this.finalReport = finalReport;
		}

		public SinisterState getSinisterState() {
			return sinisterState;
		}

		public void setSinisterState(SinisterState sinisterState) {
			this.sinisterState = sinisterState;
		}
		public float getTotalcost() {
			return totalcost;
		}


		public void setTotalcost(float totalcost) {
			this.totalcost = totalcost;
		}


		public String getProduct() {
			return product;
		}


		public void setProduct(String product) {
			this.product = product;
		}
		
		


		
		
}