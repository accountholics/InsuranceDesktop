package tn.esprit.insurance.service.implementation;

import java.util.List;
import java.util.Set;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tn.esprit.insurance.entity.Contract;
import tn.esprit.insurance.entity.Sinister;
import tn.esprit.insurance.entity.User;
import tn.esprit.insurance.service.interfaces.Iuser;

@Stateless
@LocalBean
public class Userservice  implements Iuser{
	
	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;
	
	@Override 
	public User finduserbyid(int id)
	{
		User u = em.find(User.class, id);
		return u;
	
	}
	
	@Override
	public int insuredScoring(User u){
		int score = 0;
		
		//Scoring based on salary
		if ((u.getSalary()>800) && (u.getSalary()<1500))
			score = score + 12;
		if(u.getSalary()>=1500)
			score = score + 20;
		
		//Scoring based on credit ratio
		if(u.getRatioEndettement()<0.1)
			score = score + 20;
		if ((u.getRatioEndettement()>=0.1) && (u.getRatioEndettement()<0.2))
			score = score + 16;
		if ((u.getRatioEndettement()>=0.2) && (u.getRatioEndettement()<0.3))	
			score = score + 8;
		
		//Scoring based on rent
		if(u.getSituationLogement().equals("Owner"))
			score = score + 10;
		
		//Scoring based on marriage and children
		if(u.getEtatPatrimonial().equals("Married"))
		{
			if(u.getNbchildren()==0)
				score = score + 10;
			
			if(u.getNbchildren()==1)
				score = score + 20;
			if(u.getNbchildren()==2)
				score = score + 20;
			
			if(u.getNbchildren()>=3)
				score = score + 16;
		}
		if (!(u.getEtatPatrimonial().equals("Married")))
		{
			if(u.getNbchildren()==0)
				score = score + 8;
			
			if(u.getNbchildren()==1)
				score = score + 5;
			if(u.getNbchildren()==2)
				score = score + 5;
			
			if(u.getNbchildren()>=3)
				score = score + 0;
		}
		
		//Scoring based on work
		if(u.getDureeDernierEmploi()<=4)
			score = score+15;
		if((u.getDureeDernierEmploi()>4) && (u.getDureeDernierEmploi()<10))
			score = score+22;
		if(u.getDureeDernierEmploi()>=10)
			score = score+25;
		
		//scoring based on his will to insure himself
		if(u.getContracts().size()>1)
			score = score +20;
		
		//scoring based on sinisters
		Set<Contract> contracts = u.getContracts();
		for(Contract c : contracts)
			{
				if (c.getSinisters().size()==0)
					score =score + 30;
				if (c.getSinisters().size()==1)
					score = score - 5;
				if (c.getSinisters().size()==2)
					score = score - 10;
				if (c.getSinisters().size()==3)
					score = score - 15;
				if (c.getSinisters().size()==4)
					score = score - 20; 
				else 
					score = score - 40;				
			}
		User s = em.find(User.class, u.getId());
		s.setScore(score);
		return score;
	}

	public List<User> getAllUsers(){
		List<User> users = em.createQuery("from User", User.class).getResultList();
		return users;
	}
}
