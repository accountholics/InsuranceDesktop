package tn.esprit.insurance.service.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.insurance.entity.Expert;
import tn.esprit.insurance.entity.Sinister;

@Remote
public interface ISinisterRemote {
	public int addSinister(Sinister sinister);
	public void removeSinister(int id);
	public void updateSinister(Sinister sinisterNewValues);
	public Sinister findSinisterById(int id);
	public List<Sinister> findAllSinisters();
	public List<Sinister> findAllSinisterNotifications();
	public List<Sinister> findAllSinistersDone();
	public List<Sinister> findAllSinistersInProgress();
	public List<Sinister> findAllSinisterByExpert(Expert expert);
	public List<Sinister> getAllSinistersInProgressByProductName(String ff);
}
