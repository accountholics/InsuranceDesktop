package tn.esprit.insurance.service.interfaces;

import java.sql.Date;
import java.util.List;

import javax.ejb.Remote;

import tn.esprit.insurance.entity.ContractDemand;
import tn.esprit.insurance.entity.SplittingType;

@Remote
public interface IContractsManagment {

	public List<ContractDemand>  ListDemand();
	public void AcceptDemandContract(int id ) ; //+ ajout ds la table user  ki nacceptyh 
	public void RefuseDemandContract();
	public void sendMailRefusedDemand(String email);
	
	public void CreateDemandContract();
	public void ConsultListContracts();
	 
	public void sendMailNews() ;  // kif amine y ajouti produit nabaath news lel cliouneet
	
	public int ReductionFidelity();  // trajaali tableau mtaa eli andhom 3 ans succ nafs l prime
									//sig me andhomsh des sinistres 
	public void riderContract() ;    // avenant : modifier le contrat 

}
