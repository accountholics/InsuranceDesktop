package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sinister implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int sinisterId;
		
		String sinisterDescription;
		
		int contractNumber;
		
		Date declarationDate;

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

		
		
}