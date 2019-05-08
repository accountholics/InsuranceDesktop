package tn.esprit.insurance.mangedbeans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import tn.esprit.insurance.entity.Sinister;
import tn.esprit.insurance.entity.SinisterState;
import tn.esprit.insurance.service.implementation.SinisterService;
import tn.esprit.insurance.service.interfaces.ISinisterLocal;


@ManagedBean
@SessionScoped
public class SinisterBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String sinisterDescription;
	private Date declarationDate;	
	private Date responseDate;
	private SinisterState sinisterState;
	private String observation;
	private float totalcost;
	private String product;
	
	@EJB
	SinisterService ss;
	
//	@PostConstruct                   
//    public void init() {
//		sinisters = ss.findAllSinisters();
//    }
	
	public SinisterBean() {
	}

//	public void addSinister() {
//		ss.addSinister(new Sinister(sinisterDescription, new Date()));
//	}
	
	private List<Sinister> sinisters;
	
	public List<Sinister> getSinisters() {
		sinisters = ss.findAllSinisters();
		return sinisters;
	}
	

	public String getSinisterDescription() {
		return sinisterDescription;
	}

	public void setSinisterDescription(String sinisterDescription) {
		this.sinisterDescription = sinisterDescription;
	}

	public Date getDeclarationDate() {
		return declarationDate;
	}

	public void setDeclarationDate(Date declarationDate) {
		this.declarationDate = declarationDate;
	}

	public Date getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}

	public SinisterState getSinisterState() {
		return sinisterState;
	}

	public void setSinisterState(SinisterState sinisterState) {
		this.sinisterState = sinisterState;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public float getTotalcost() {
		return totalcost;
	}

	public void setTotalcost(float totalcost) {
		this.totalcost = totalcost;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public SinisterService getSs() {
		return ss;
	}

	public void setSs(SinisterService ss) {
		this.ss = ss;
	}

	public void setSinisters(List<Sinister> sinisters) {
		this.sinisters = sinisters;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	




	
}