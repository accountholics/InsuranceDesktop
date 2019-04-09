package tn.esprit.insurance.service.implementation;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import tn.esprit.insurance.entity.Feeds;
import tn.esprit.insurance.service.interfaces.IStatistiquesRemote;

@Stateless
public class StatistiquesService implements IStatistiquesRemote {

	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;

	public StatistiquesService() {
		super();
	}

	@Override
	public List<Feeds> findAllFeeds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Feeds> findStats(Date d1, Date d2) {
		TypedQuery<Feeds> query = 
		em.createQuery("select f from Feeds f where f.dateSent between :date1 and :date2", Feeds.class); 
		query.setParameter("date1", d1); 
		query.setParameter("date2", d2); 		
		return query.getResultList();
	}
   
}
