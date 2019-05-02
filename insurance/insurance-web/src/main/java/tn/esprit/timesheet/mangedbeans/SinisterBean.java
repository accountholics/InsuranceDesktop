//package tn.esprit.timesheet.mangedbeans;
//
//import java.io.Serializable;
//import java.sql.Date;
//import java.util.List;
//import javax.ejb.EJB;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
//import tn.esprit.insurance.entity.SinisterState;
//import tn.esprit.insurance.service.implementation.SinisterService;
//
//
//@ManagedBean(name = "Bean")
//@SessionScoped
//public class SinisterBean implements Serializable {
//	private static final long serialVersionUID = 1L;
//	private String sinisterDescription;
//	private Date declarationDate;	
//	private Date responseDate;
//	private SinisterState sinisterState;
//	private String observation;
//	private float totalcost;
//	private String product;
//	
//	@EJB
//	SinisterService ss;
//	
//	public void addEmploye() {
//		ss.addSinister(new Sinister(nom, prenom, email, password, isActif, role)); 
//	}
//	
//	private List<Employe> employes;
//	
//	public List<Employe> getEmployes() {
//		employes = employeService.getAllEmployes();
//		return employes;
//	}
//	
//	public void removeEmploye(int employeId)
//	{
//		employeService.deleteEmployeById(employeId);
//	}
//	
//	private Integer employeIdToBeUpdated;
//	
//	public void displayEmploye(Employe empl)
//	{
//		this.setPrenom(empl.getPrenom());
//		this.setNom(empl.getNom());
//		this.setIsActif(empl.getIsActif());
//		this.setEmail(empl.getEmail());
//		this.setRole(empl.getRole());
//		this.setEmail(empl.getEmail());
//		this.setPassword(empl.getPassword());
//		this.setEmployeIdToBeUpdated(empl.getId());
//	}
//	
//	public void updateEmploye()
//	{ 
//		employeService.updateEmploye(new Employe(employeIdToBeUpdated, nom, prenom,email, password, isActif, role)); 
//	}
//
//
//	
//}