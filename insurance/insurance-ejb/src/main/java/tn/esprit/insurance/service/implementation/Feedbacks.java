package tn.esprit.insurance.service.implementation;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tn.esprit.insurance.entity.Feeds;
import tn.esprit.insurance.entity.FeedsState;
import tn.esprit.insurance.service.interfaces.IFeedbacksRemote;

@Stateless
public class Feedbacks implements IFeedbacksRemote {

	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;
	
	public void addFeeds(Feeds feed) {
		em.persist(feed);
	}

	@Override
	public void removeFeeds(int id) {
		// TODO Auto-generated method stub
		em.remove(em.find(Feeds.class, id));

	}

	@Override
	public void updateFeeds(Feeds feed) {
		// TODO Auto-generated method stub
		Feeds emp = em.find(Feeds.class, feed.getId());
		FeedsState etat = null;
		emp.setState(etat.solved);
	}

	@Override
	public Feeds findFeedsById(int id) {
		// TODO Auto-generated method stub
		Feeds f = em.find(Feeds.class, id);
		return f;
	}

	@Override
	public List<Feeds> findAllFeeds() {
		// TODO Auto-generated method stub
		List<Feeds> emp = em.createQuery("Select f from Feeds f", Feeds.class).getResultList();
		return emp;
	}
	
	@Override
	public List<Feeds> getAllFeedsByName(String ff) {
		String sql = "select f from Feeds f where f.title like '"+ff+"%'";
		List<Feeds> emp = em.createQuery(sql, Feeds.class).getResultList();
		return emp;	
	}
	
	@Override
	public List<Feeds> getAllFeedsByState(String state) {
		String sql = "select f from Feeds f where f.state like '"+state+"%'";
		List<Feeds> emp = em.createQuery(sql, Feeds.class).getResultList();
		return emp;	
	}
}


