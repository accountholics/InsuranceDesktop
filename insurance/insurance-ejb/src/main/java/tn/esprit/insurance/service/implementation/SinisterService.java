package tn.esprit.insurance.service.implementation;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tn.esprit.insurance.entity.Sinister;
import tn.esprit.insurance.service.interfaces.ISinisterLocal;
import tn.esprit.insurance.service.interfaces.ISinisterRemote;

@Stateless
public class SinisterService implements ISinisterLocal, ISinisterRemote {

	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;
	
	public int addSinister(Sinister sinister) {
		System.out.println("In addUser : ");
		em.persist(sinister);
		System.out.println("Out of addUser" + sinister.getSinisterId());
		return sinister.getSinisterId();
	}

	@Override
	public void removeSinister(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateSinister(Sinister sinisterNewValues) {
		// TODO Auto-generated method stub

	}

	@Override
	public Sinister findSinisterById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sinister> findAllSinisters() {
		// TODO Auto-generated method stub
		return null;
	}

}
