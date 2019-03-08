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

@Entity
    public class Expert implements Serializable 
    {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int Expert_Code;
	String Exp_Lastname;
	String Exp_FirstName;
	long Exp_Phone;
	
	@OneToMany(cascade = CascadeType.ALL) 
	private Set<Sinister> Sinisters;
	
//	@OneToOne
//	private Expert_Report  expert_report ;

	public Expert() 
	{
	}

	public int getExpert_code() {
		return Expert_Code;
	}

	public void setExpert_code(int code) {
		this.Expert_Code = code;
	}

	public String getExpertLastname() {
		return Exp_Lastname;
	}

	public void setExpertLastname(String LName) {
		this.Exp_Lastname = LName;
	}

	public String getExpertFirstname() {
		return Exp_FirstName;
	}

	public void setExpertFirstname(String FName) {
		this.Exp_FirstName = FName
				;
	}
	

	public long getExp_phone() {
		return Exp_Phone;
	}

	public void setExpertPhone(long phone) {
		this.Exp_Phone = phone;
			
	}
	
	
}
