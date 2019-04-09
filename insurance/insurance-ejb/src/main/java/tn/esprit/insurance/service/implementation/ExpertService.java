package tn.esprit.insurance.service.implementation;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import tn.esprit.insurance.entity.Expert;
import tn.esprit.insurance.service.interfaces.IExpertLocal;
import tn.esprit.insurance.service.interfaces.IExpertRemote;

@Stateless
public class ExpertService implements IExpertLocal, IExpertRemote {

	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;
	
	@Override
	public List<Expert> findAllExperts() {
		System.out.println("In findAllExperts : ");
		List<Expert> experts = em.createQuery("from Expert", Expert.class).getResultList();
		System.out.println("Out of findAllExperts : ");
		return experts;
	}
	
	@Override
	public List<Expert> findExpertByName(String name) {
		System.out.println("In findExpertByName : ");
		TypedQuery<Expert> query = em.createQuery("SELECT u FROM Expert u WHERE u.expLastname = :expLastname",Expert.class);	
		List<Expert> users = query.setParameter("expLastname", name).getResultList();
		System.out.println("Out of findExpertById : ");
		return users;
	}
	
	@Override
	public Expert findExpertById(int id) {
		System.out.println("In findExpertById : ");
		Expert s = em.find(Expert.class, id);
		System.out.println("Out of findExpertById : ");
		return s;
	}
	
	

}
