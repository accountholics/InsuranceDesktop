package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="contract")
public class Contract implements Serializable {

		@Id
		@GeneratedValue( strategy = GenerationType.IDENTITY )
		@Column
		int contractNumber;
		@Column
		Date creationDate;
		@Column
		Date beginningDate;
		@Column
		Date endDate;
		@Column
		int duration;
		
		@ManyToOne
		Client client;

		@ManyToOne
		Agent agent;
		
		public Contract() {}

		public int getContractNumber() {
			return contractNumber;
		}

		public void setContractNumber(int contractNumber) {
			this.contractNumber = contractNumber;
		}

		public Date getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}

		public Date getBeginningDate() {
			return beginningDate;
		}

		public void setBeginningDate(Date beginningDate) {
			this.beginningDate = beginningDate;
		}

		public Date getEndDate() {
			return endDate;
		}

		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		public Client getClient() {
			return client;
		}

		public void setClient(Client client) {
			this.client = client;
		}

		public Agent getAgent() {
			return agent;
		}

		public void setAgent(Agent agent) {
			this.agent = agent;
		}
		

}