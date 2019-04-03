package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Contract_option
 *
 */
@Entity
@Table(name="t_contractoption")
public class ContractOption implements Serializable {

	   
	@Id
    @Column(name = "id")
	private int id;
	
    @Column(name = "id_contract")
	private int id_contract;
    
    @Column(name = "id_option")
	private int id_option;
    
    @Column(name = "checked_option")
	private String checked_option;
    
	private static final long serialVersionUID = 1L;

	public ContractOption() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getId_contrat() {
		return this.id_contract;
	}

	public void setId_contrat(int id_contrat) {
		this.id_contract = id_contrat;
	}   
	public int getId_option() {
		return this.id_option;
	}

	public void setId_option(int id_option) {
		this.id_option = id_option;
	}   
	public String getChecked_option() {
		return this.checked_option;
	}

	public void setChecked_option(String checked_option) {
		this.checked_option = checked_option;
	}
   
}
