package tn.esprit.insurance.entity;

import java.io.Serializable;
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
	private int id;
	
	@Enumerated(EnumType.STRING)
	private ProductType type;
	private static final long serialVersionUID = 1L;

	@OneToMany(fetch= FetchType.EAGER, mappedBy="product_insurance")
	private Set<Contract> contracts;
	
	public InsuranceProduct() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public ProductType getType() {
		return this.type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}
   
}
