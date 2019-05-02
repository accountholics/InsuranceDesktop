package tn.esprit.insurance.service.interfaces;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import tn.esprit.insurance.entity.Contract;
import tn.esprit.insurance.entity.InsuranceProduct;
import tn.esprit.insurance.entity.SplittingType;
import tn.esprit.insurance.entity.StateType;
import tn.esprit.insurance.entity.User;

@Remote
public interface IContractsManagment {

	public List<Contract>  ListDemand();
	public void AcceptDemandContract(int id ) ; //+ ajout ds la table user  ki nacceptyh 
	public void RefuseDemandContract(int id );
	public void sendMailRefusedDemand(String email);
	
	public void AddDeamandContract(Contract contDemande);
	public List<Contract> ConsultListAcceptedContracts();
	public void sendMailNews() ;  // kif amine y ajouti produit nabaath news lel cliouneet
	
	public int ReductionFidelity();  // trajaali tableau mtaa eli andhom 3 ans succ nafs l prime
									//sig me andhomsh des sinistres 
	public void riderContract() ;    // avenant : modifier le contrat 
	
	public Long nbreOfcount(int id) ;
	
	public List<InsuranceProduct> getProductInsurence() ;
	
	//public List<SplittingType> getSpliting() ;
	
	public List<User> finddByCIN(long  cin) ;
	
	public int findIdBycin(String cin);
	
	public void Concelcontract(int id );
	
	public void RenewContract (int id,Date date_fin ) ;
	
	public List <Contract> findContractByState(StateType state);
	


}
