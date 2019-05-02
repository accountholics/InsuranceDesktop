package tn.esprit.insurance.service.implementation;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import javax.ejb.Stateless;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tn.esprit.insurance.entity.Contract;
import tn.esprit.insurance.entity.InsuranceProduct;
import tn.esprit.insurance.entity.RoleType;
import tn.esprit.insurance.entity.SplittingType;
import tn.esprit.insurance.entity.StateType;
import tn.esprit.insurance.entity.User;
import java.util.Date;

import tn.esprit.insurance.service.interfaces.IContractsManagment;

@Stateless
public class ContractsManagment implements IContractsManagment, Serializable{

	

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "insurance-ejb")
    EntityManager em;
	
	
	

	@Override
	public void AddDeamandContract(Contract contDemande)
	{
		em.persist(contDemande);		
	}
	
	@Override
	public List<Contract> ListDemand() 
	{
		try 
        {		
			@SuppressWarnings("unchecked")
			List<Contract> list =  em.createQuery("SELECT u FROM Contract u where u.state = 'demand' ")
			.getResultList();
			return list; 
        } 
        catch (javax.persistence.NoResultException exp) 
        {
            System.err.println(exp.getMessage());
            return null;
        }
	}
	


	@Override
	public void  AcceptDemandContract(int id ) 
	{  	    
				Contract contra = em.find(Contract.class, id);
			//	System.out.println("*********************" +id);	
				contra.setState(StateType.accepted);			
			//	System.out.println("****************"+StateType.values() );
				User u = contra.getClient();		    	    
			    u.setRole(RoleType.client);
	}

	@Override
	public void RefuseDemandContract(int idd) 
	{
		
		Contract contra = em.find(Contract.class, idd);
		contra.setState(StateType.refused);
		
	}
	
	

	@Override
	public List<Contract> ConsultListAcceptedContracts() 
	{

		try 
        {		

			List<Contract> list =  em.createQuery("SELECT u FROM Contract u ")
			.getResultList();
			return list; 
        } 
        catch (javax.persistence.NoResultException exp) 
        {
            System.err.println(exp.getMessage());
            return null;
        }
		
	}
	
	
	@Override
	public List<InsuranceProduct> getProductInsurence() 
	{
		try 
        {	
			List<InsuranceProduct> list =  em.createQuery("SELECT u  from InsuranceProduct u ")
			 .getResultList();
			return list; 
        } 
        catch (javax.persistence.NoResultException exp) 
        {
            System.err.println(exp.getMessage());
            return null;
        }		
	}
	
	
	

	@Override
	public List<User> finddByCIN(long cin)
	{
		
			return em.createQuery(
			"SELECT c FROM User c WHERE c.cin =:cin")
			.setParameter("cin", cin)
			.getResultList();
			
   		
	}
	

	@Override
	public void Concelcontract(int id) 
	{
		Contract contra = em.find(Contract.class, id);
		contra.setState(StateType.canceled);
		
	}

	@Override
	public void RenewContract(int id ,Date date_fin ) 
	{
		Contract contra = em.find(Contract.class, id);
		contra.setState(StateType.accepted);
		contra.setDate_fin(date_fin);
		
	}
	

	@Override
	public void sendMailRefusedDemand(String email) 
	{
		// TODO Auto-generated method stub
		
	}
	
	





	@Override
	public void sendMailNews() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public int ReductionFidelity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void riderContract() 
	{
		
		
	}



	@Override
	public Long nbreOfcount(int id) 
	   {
	   javax.persistence.Query query = em.createQuery("SELECT COUNT(u.id) FROM Contract u WHERE u.id =:id");
	   query.setParameter("id", id);
	   return (long) query.getSingleResult();
	   
		}



	@Override
	public int findIdBycin(String cin)
	{
		
			return (int) em.createQuery(
			"SELECT c.id FROM User c WHERE c.cin=:cin")
			.setParameter("cin", cin)
			.getSingleResult();
			
   		
	}
	

	@Override
	public List <Contract> findContractByState(StateType state)
	{
		
	javax.persistence.Query query= em.createQuery("SELECT u from Contract u where u.state=:state");
	query.setParameter("state", state);
	return  query.getResultList();
	
		
			
   		
	}

	


	
	




}
