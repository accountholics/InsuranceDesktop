package tn.esprit.insurance.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Item
 *
 */
@Entity
@Table(name ="t_item")
public class Item implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int itemId;
	
	private float price;
	
	private String description;
	
	@OneToOne
	private Sinister sinister;	

	public Item() {
		super();
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Sinister getSinister() {
		return sinister;
	}

	public void setSinister(Sinister sinister) {
		this.sinister = sinister;
	}
   
}
