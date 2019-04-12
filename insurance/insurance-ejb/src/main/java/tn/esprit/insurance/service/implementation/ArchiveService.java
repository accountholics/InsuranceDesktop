package tn.esprit.insurance.service.implementation;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.insurance.entity.Archive;
import tn.esprit.insurance.entity.Feeds;
import tn.esprit.insurance.service.interfaces.IArchiveService;

@Stateless
public class ArchiveService implements IArchiveService {

	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;
	
	@Override
	public void addArchive(Feeds feed) {
		// TODO Auto-generated method stub
		Archive ar = new Archive();
		
        long millis=System.currentTimeMillis();  
        java.sql.Date dateNow=new java.sql.Date(millis);
        
		//String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
//		Date d = null;
//		try {
//			d = new SimpleDateFormat("yyyy-MM-dd").parse(dateNow);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ar.setTitle(feed.getTitle());
		ar.setFeedback(feed.getFeedback());
		ar.setType(feed.getType());
		ar.setDateSent(feed.getDateSent());
		ar.setDateSolving(dateNow);
		ar.setCustomer_id(feed.getId());
		em.persist(ar);
	}

	@Override
	public void removeArchive(int id) {
		// TODO Auto-generated method stub
		em.remove(em.find(Feeds.class, id));
		
	}

	@Override
	public void updateArchive(Feeds newArch) {
		// TODO Auto-generated method stub
//		Feeds emp = em.find(Feeds.class, newArch.getId());
////		FeedsState etat = null;
////		emp.setState(etat.solved);
		
	}

	@Override
	public Feeds findArchiveById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Archive> findAllArchive() {
		List<Archive> emp = em.createQuery("Select a from Archive a", Archive.class).getResultList();
		return emp;
	}

}
