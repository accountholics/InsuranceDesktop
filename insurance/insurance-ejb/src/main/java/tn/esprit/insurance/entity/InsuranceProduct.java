package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: product_insurance
 *
 */
@Entity
@Table(name="t_insuranceproduct")
public class InsuranceProduct implements Serializable {

	   
	@Id
    @Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	

	private static final long serialVersionUID = 1L;

	@OneToMany(fetch= FetchType.EAGER, mappedBy="product_insurance")
	private List<Contract> contracts;
	
	
	public List<Contract> getContracts() {
		return contracts;
	}
	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}
	public InsuranceProduct() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   

   
}
