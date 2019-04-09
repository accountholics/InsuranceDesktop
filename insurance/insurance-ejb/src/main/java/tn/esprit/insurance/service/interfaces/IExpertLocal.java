package tn.esprit.insurance.service.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.insurance.entity.Expert;

@Local
public interface IExpertLocal {
	public List<Expert> findAllExperts();
	public List<Expert> findExpertByName(String name);
	public Expert findExpertById(int id);
}
