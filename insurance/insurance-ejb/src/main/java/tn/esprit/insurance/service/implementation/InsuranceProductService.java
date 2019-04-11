package tn.esprit.insurance.service.implementation;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import tn.esprit.insurance.entity.InsuranceProduct;
import tn.esprit.insurance.service.interfaces.InsuranceProductServiceRemote;

@Stateless
public class InsuranceProductService implements InsuranceProductServiceRemote {

	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;
	
	@Override
	public void ajouterproduit(InsuranceProduct product) {
		em.persist(product);
	}

	@Override
	public String getInsuranceProductNameById(int InsuranceProductId) {	
	return em.find(InsuranceProduct.class, InsuranceProductId).getName();	
	}

	@Override
	public void deleteInsuranceProductById(int InsuranceProductId) {
		em.remove(em.find(InsuranceProduct.class, InsuranceProductId));
	}

	@Override
	public long getNombreProduitJPQL() {
		TypedQuery<Long> query = 
				em.createQuery("select count(p) from InsuranceProduct p", Long.class);
		return query.getSingleResult();	}

	@Override
	public List<String> getAllNoLifeProduitNamesJPQL() {
		List<InsuranceProduct> InsuranceProducts = em.createQuery("select p from InsuranceProduct p", InsuranceProduct.class).getResultList();
		List<String> pnames = new ArrayList<>();
		for(InsuranceProduct p : InsuranceProducts){
			pnames.add(p.getName());
		}
		
		return pnames;
	}

	@Override
	public void deleteAllInsuranceProductJPQL() {
		int modified = em.createQuery("delete from InsuranceProduct").executeUpdate();
		if(modified > 1){
			System.out.println("successfully deleted");
		}else{
			System.out.println("failed to delete");
		}
	}

	@Override
	public List<InsuranceProduct> getAllProduct() {
		List<InsuranceProduct> emp = em.createQuery("select c from InsuranceProduct c", InsuranceProduct.class).getResultList();
		System.out.println(emp.size());
		return emp;	
		}

	public void updateProduct(InsuranceProduct product) {
		InsuranceProduct p = em.find(InsuranceProduct.class, product.getId());
		p.setName(product.getName());
		p.setMeasuring_cost(product.getMeasuring_cost());
		p.setRatio_pure_premium(product.getRatio_pure_premium());
		p.setRisk_measure(product.getRisk_measure());
		p.setSecurity_measure(product.getSecurity_measure());		
	}

	@Override
	public List<InsuranceProduct> getAllProductByName(String aaa) {
		String sql = "select * from InsuranceProduct i where i.name like '"+aaa+"%'";
		List<InsuranceProduct> emp = em.createQuery(sql, InsuranceProduct.class).getResultList();
		return emp;	
	}

}
