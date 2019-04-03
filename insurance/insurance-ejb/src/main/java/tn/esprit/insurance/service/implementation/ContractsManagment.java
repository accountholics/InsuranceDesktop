package tn.esprit.insurance.service.implementation;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.New;
import javax.mail.Address;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.insurance.entity.Contract;
import tn.esprit.insurance.entity.ContractDemand;
import tn.esprit.insurance.entity.SplittingType;
import tn.esprit.insurance.entity.User;
import tn.esprit.insurance.service.interfaces.IContractsManagment;

@Stateless
public class ContractsManagment implements IContractsManagment, Serializable{

	
	@PersistenceContext(unitName = "insurance-ejb")
    EntityManager em;
	
	@Override
	public List<ContractDemand> ListDemand() {
		try 
        {		
			List<ContractDemand> list = em.createQuery("from ContractDemand", ContractDemand.class).getResultList(); 
			return list; 
        } 
        catch (javax.persistence.NoResultException exp) 
        {
            return null;
        }
	}

	@Override
	public void  AcceptDemandContract(int id ) 
	{
				
		        ContractDemand  contractD  = (ContractDemand) em.createQuery (
                "SELECT u FROM ContractDemand u WHERE u.id = :id" )
                .setParameter("id", id)
                .getSingleResult();
		
				User u = contractD.getUser();
				
			    Contract NewContract = new Contract() ;
			    
			    NewContract.setDate_debut(contractD.getDate_debut());
			    NewContract.setDate_fin(contractD.getDate_fin());
			    NewContract.setDuration(contractD.getDuration());
			    NewContract.setSpliting(contractD.getSpliting());
			    NewContract.setClient(contractD.getClient());
			    NewContract.setProduct_insurance(contractD.getProduct_insurance());
			    NewContract.setSeniority(true); 
			    em.persist(NewContract);
			    
	}

	@Override
	public void RefuseDemandContract() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMailRefusedDemand(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CreateDemandContract() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ConsultListContracts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMailNews() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int ReductionFidelity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void riderContract() {
		// TODO Auto-generated method stub
		
	}

}
