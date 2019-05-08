package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "t_contract")

public class Contract implements Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "insured_value")
	private float insured_value;

	@Column(name = "date_debut")
	private Date date_debut;

	@Column(name = "duration")
	private int duration;

	@Column(name = "date_fin")
	private Date date_fin;

	@Column(name = "prime")
	private float prime;

	@Column(name = "final_prime")
	private float final_prime;

	@Enumerated(EnumType.STRING)
	@Column(name = "spliting")
	private SplittingType spliting;

	@Enumerated(EnumType.STRING)
	@Column(name = "state")
	private StateType state;

	@ManyToOne
	private InsuranceProduct product_insurance;
	@ManyToOne
	private User client;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="contract")
	private Set<Sinister> sinisters;

	/* automobile */

	@Column(name = "ageAuto")
	private int ageAuto;

	@Enumerated(EnumType.STRING)
	@Column(name = "rangeAuto")
	private CarRange rangeAuto;

	/* agricultural */
	@Column(name = "fire")
	private boolean fireAgri;

	@Column(name = "explosion")
	private boolean explosionAgri;

	@Column(name = "steals")
	private boolean stealsAgri;

	/* habitation : dwelling */
	@Column(name = "area")
	private float areaDwe;

	@Column(name = "nbrePices")
	private int nbrePicesDwe;

	@Column(name = "hStanding")
	private boolean Hstanding;

	@Column(name = "steal")
	private boolean stealsDwe;

	@Column(name = "furniture")
	private boolean furnitureDwe;

	
	/* microcredit */
	
	@Enumerated(EnumType.STRING)
	@Column(name = "CauseMicro")
	private causeMicroC causeMicro;
	
	

	public float getFinal_prime() 
	{
		return final_prime;
	}

	public void setFinal_prime(float final_prime) {
		this.final_prime = final_prime;
	}

	public Contract(int id, float insured_value, Date date_debut, int duration, Date date_fin, SplittingType spliting,
			StateType state, User client, InsuranceProduct product_insurance, float prime) {
		super();
		this.id = id;
		this.insured_value = insured_value;
		this.date_debut = date_debut;
		this.duration = duration;
		this.date_fin = date_fin;
		this.spliting = spliting;
		this.state = StateType.demand;
		this.client = client;
		this.product_insurance = product_insurance;
		this.prime = prime;
	}

	public float getPrime() {
		return prime;
	}

	public void setPrime(float prime) {
		this.prime = prime;
	}

	public float getInsured_value() {
		return insured_value;
	}

	public void setInsured_value(float insured_value) {
		this.insured_value = insured_value;
	}

	public InsuranceProduct getProduct_insurance() {
		return product_insurance;
	}

	public void setProduct_insurance(InsuranceProduct product_insurance) {
		this.product_insurance = product_insurance;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	private static final long serialVersionUID = 1L;

	public Contract() {
		super();
		this.client = new User();
		this.product_insurance = new InsuranceProduct();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate_debut() {
		return this.date_debut;
	}

	public void setDate_debut(Date localDate) {
		this.date_debut = localDate;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getDate_fin() {
		return this.date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public SplittingType getSpliting() {
		return spliting;
	}

	public void setSpliting(SplittingType spliting) {
		this.spliting = spliting;
	}

	public StateType getState() {
		return state;
	}

	public void setState(StateType state) {
		this.state = state;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public int getAgeAuto() {
		return ageAuto;
	}

	public void setAgeAuto(int ageAuto) {
		this.ageAuto = ageAuto;
	}



	public CarRange getRangeAuto() {
		return rangeAuto;
	}

	public void setRangeAuto(CarRange rangeAuto) {
		this.rangeAuto = rangeAuto;
	}

	public boolean isFireAgri() {
		return fireAgri;
	}

	public void setFireAgri(boolean fireAgri) {
		this.fireAgri = fireAgri;
	}

	public boolean isExplosionAgri() {
		return explosionAgri;
	}

	public void setExplosionAgri(boolean explosionAgri) {
		this.explosionAgri = explosionAgri;
	}

	public boolean isStealsAgri() {
		return stealsAgri;
	}

	public void setStealsAgri(boolean stealsAgri) {
		this.stealsAgri = stealsAgri;
	}

	public float getAreaDwe() {
		return areaDwe;
	}

	public void setAreaDwe(float areaDwe) {
		this.areaDwe = areaDwe;
	}

	public int getNbrePicesDwe() {
		return nbrePicesDwe;
	}

	public void setNbrePicesDwe(int nbrePicesDwe) {
		this.nbrePicesDwe = nbrePicesDwe;
	}

	public boolean isHstanding() {
		return Hstanding;
	}

	public void setHstanding(boolean hstanding) {
		Hstanding = hstanding;
	}

	public boolean isStealsDwe() {
		return stealsDwe;
	}

	public void setStealsDwe(boolean stealsDwe) {
		this.stealsDwe = stealsDwe;
	}

	public boolean isFurnitureDwe() {
		return furnitureDwe;
	}

	public void setFurnitureDwe(boolean furnitureDwe) {
		this.furnitureDwe = furnitureDwe;
	}

	public causeMicroC getCauseMicro() {
		return causeMicro;
	}

	public void setCauseMicro(causeMicroC causeMicro) {
		this.causeMicro = causeMicro;
	}
	
	public Set<Sinister> getSinisters() {
		return sinisters;
	}

	public void setSinisters(Set<Sinister> sinisters) {
		this.sinisters = sinisters;
	}


}
