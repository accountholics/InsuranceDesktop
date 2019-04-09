package tn.esprit.insurance.service.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.insurance.entity.Expert;

@Remote
public interface IExpertRemote {
	public List<Expert> findAllExperts();
	public List<Expert> findExpertByName(String name);
	public Expert findExpertById(int id);
}
