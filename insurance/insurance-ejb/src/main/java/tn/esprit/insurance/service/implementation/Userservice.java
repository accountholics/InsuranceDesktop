package tn.esprit.insurance.service.implementation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.insurance.entity.Sinister;
import tn.esprit.insurance.entity.User;
import tn.esprit.insurance.service.interfaces.Iuser;

@Stateless
public class Userservice  implements Iuser{
	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;
	@Override 
	public User finduserbyid(int id)
	{
		User u = em.find(User.class, id);
		return u;
	
	}

}
