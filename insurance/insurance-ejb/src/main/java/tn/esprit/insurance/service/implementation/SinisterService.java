package tn.esprit.insurance.service.implementation;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import tn.esprit.insurance.entity.Contract;
import tn.esprit.insurance.entity.Expert;
import tn.esprit.insurance.entity.InsuranceProduct;
import tn.esprit.insurance.entity.Sinister;
import tn.esprit.insurance.entity.SinisterState;
import tn.esprit.insurance.service.interfaces.ISinisterRemote;

@Stateless
@LocalBean
public class SinisterService implements ISinisterRemote{

	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;
	
	public int addSinister(Sinister sinister) {
		System.out.println("In addSinister : ");
		em.persist(sinister);
		System.out.println("Out of addSinister" + sinister.getSinisterId());
		return sinister.getSinisterId();
	}

	@Override
	public void removeSinister(int id) {
		System.out.println("In removeSinister : ");
		em.remove(em.find(Sinister.class, id));
		System.out.println("Out of removeSinister : ");

	}

	@Override
	public void updateSinister(Sinister sinisterNewValues) {
		System.out.println("In updateSinister : ");
		Sinister s = em.find(Sinister.class, sinisterNewValues.getSinisterId());
		
		s.setObservation(sinisterNewValues.getObservation());
		s.setSinisterState(sinisterNewValues.getSinisterState());
		s.setFinalReport(sinisterNewValues.getFinalReport());
		s.setAssessment(sinisterNewValues.getAssessment());
		s.setExpertReport(sinisterNewValues.getExpertReport());
		s.setItems(sinisterNewValues.getItems());
		s.setJustifications(sinisterNewValues.getJustifications());
		s.setExpert(sinisterNewValues.getExpert());
		s.setTotalcost(sinisterNewValues.getTotalcost());
		
		System.out.println("Out of updateSinister : ");

	}

	@Override
	public Sinister findSinisterById(int id) {
		System.out.println("In findSinisterById : ");
		Sinister s = em.find(Sinister.class, id);
		System.out.println("Out of findSinisterById : ");
		return s;
	}

	@Override
	public List<Sinister> findAllSinisters() {
		System.out.println("In findAllSinisters : ");
		List<Sinister> sinisters = em.createQuery("from Sinister", Sinister.class).getResultList();
		System.out.println("Out of findAllSinisters : ");
		return sinisters;
	}
	
	@Override
	public List<Sinister> findAccepted() {
		TypedQuery<Sinister> query = em.createQuery("SELECT u FROM Sinister u WHERE u.decision = :d",Sinister.class);			
		List<Sinister> users = query.setParameter("d", "Accepted").getResultList();
		return users;
	}
	
	@Override
	public List<Sinister> findDenied() {
		TypedQuery<Sinister> query = em.createQuery("SELECT u FROM Sinister u WHERE u.decision = :d",Sinister.class);			
		List<Sinister> users = query.setParameter("d", "Denied").getResultList();
		return users;
	}
	
	@Override
	public List<Sinister> findAllSinisterNotifications() {
		System.out.println("SinisterNotifications ");
		TypedQuery<Sinister> query = em.createQuery("SELECT u FROM Sinister u WHERE u.sinisterState = :sinisterstate",Sinister.class);			
		List<Sinister> users = query.setParameter("sinisterstate", SinisterState.notification).getResultList();
		System.out.println("SinisterNotifications done ");
		return users;
	}
	
	@Override
	public List<Sinister> findAllSinistersInProgress() {
		TypedQuery<Sinister> query = em.createQuery("SELECT u FROM Sinister u WHERE u.sinisterState = :sinisterstate",Sinister.class);			
		List<Sinister> users = query.setParameter("sinisterstate", SinisterState.in_progress).getResultList();
		return users;
	}

	@Override
	public List<Sinister> findAllSinistersDone() {
		TypedQuery<Sinister> query = em.createQuery("SELECT u FROM Sinister u WHERE u.sinisterState = :sinisterstate",Sinister.class);			
		List<Sinister> users = query.setParameter("sinisterstate", SinisterState.done).getResultList();
		return users;
	}

	@Override
	public List<Sinister> findAllSinisterByExpert(Expert expert) {
		System.out.println("SinisterByExpert ");
		TypedQuery<Sinister> query = em.createQuery("SELECT u FROM Sinister u WHERE u.expert = :expert and u.sinisterState = :sinisterstate",Sinister.class);			

		query.setParameter("expert", expert);
		query.setParameter("sinisterstate", SinisterState.in_progress);
		System.out.println("SinisterByExpert done ");
		List<Sinister> users = query.getResultList();
		return users;
	}
	
//	public List<Sinister> findAllSinisterByProductName(String productName) {
//		CriteriaBuilder builder = null;
//		CriteriaQuery<Sinister> query = builder.createQuery(Sinister.class);
//		Root<Sinister> fromSinister = query.from(Sinister.class);
//		Join<Sinister, Contract> joinContract = fromSinister.join("contract");
//		Join<Contract, InsuranceProduct> joinProduct = joinContract.join("product_insurance");
//		List<Sinister> users = query.getResultType();
//		
//	}
	@Override
	public List<Sinister> getAllSinistersInProgressByProductName(String ff) {
		String sql = "select f from Sinister f where f.sinisterState = 1 and f.product like '"+ff+"%'";
		List<Sinister> emp = em.createQuery(sql, Sinister.class).getResultList();
		return emp;
	}
}
