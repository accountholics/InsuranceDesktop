package tn.esprit.insurance.service.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.insurance.entity.InsuranceProduct;

@Remote
public interface InsuranceProductServiceRemote {
	public void ajouterproduit(InsuranceProduct product);
	public String getInsuranceProductNameById(int InsuranceProductId);
	public void deleteInsuranceProductById(int InsuranceProductId);
	public long getNombreProduitJPQL();
	public List<String> getAllNoLifeProduitNamesJPQL();
	public void deleteAllInsuranceProductJPQL();
	public List<InsuranceProduct> getAllProduct();
	public void updateProduct(InsuranceProduct product); 

}
