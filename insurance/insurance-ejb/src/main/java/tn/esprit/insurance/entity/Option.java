package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Option
 *
 */
@Entity
@Table(name="t_option")
public class Option implements Serializable {

	   
	@Id
    @Column(name = "id")
	private int id;
	
    @Column(name = "option_name")
	private String option_name;
    
    
    @Column(name = "id_produit")
    private int id_produit;
    
	private static final long serialVersionUID = 1L;

	public Option() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNom_option() {
		return this.option_name;
	}

	public void setNom_option(String nom_option) {
		this.option_name = nom_option;
	}   
	public int getId_produit() {
		return this.id_produit;
	}

	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}
   
}
