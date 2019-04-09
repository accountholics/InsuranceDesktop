package tn.esprit.insurance.service.implementation;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tn.esprit.insurance.entity.Claims;
import tn.esprit.insurance.service.interfaces.IClaimsRemote;

@Stateless
public class ClaimsService implements IClaimsRemote {

	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;
	
	public int addClaim(Claims claim) {
		em.persist(claim);
		return claim.getId();
	}

	@Override
	public void removeClaim(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateClaim(Claims sinisterNewValues) {
		// TODO Auto-generated method stub

	}

	@Override
	public Claims findClaimById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Claims> findAllClaims() {
		// TODO Auto-generated method stub
		return null;
	}



}

