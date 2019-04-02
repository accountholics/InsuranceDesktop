package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
		
		private int contractNumber;
		
		private Date declarationDate;
		
		@OneToMany(cascade = CascadeType.ALL, mappedBy="sinister")
		private Set<Justification> justifications;

		@OneToMany(cascade = CascadeType.ALL, mappedBy="sinister")
		private Set<Item> items;
		
		@OneToOne
		private ExpertReport expertReport;
		
		@OneToOne
		private FinalReport finalReport;
		
		public Sinister() 
		{
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

		public int getContractNumber() {
			return contractNumber;
		}

		public void setContractNumber(int contractNumber) {
			this.contractNumber = contractNumber;
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

		public void setFinalReport(FinalReport finalReport) {
			this.finalReport = finalReport;
		}
		
		


		
		
}