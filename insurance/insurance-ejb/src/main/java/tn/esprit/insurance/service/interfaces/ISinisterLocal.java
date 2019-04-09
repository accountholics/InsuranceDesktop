package tn.esprit.insurance.service.interfaces;

import java.util.List;
import javax.ejb.Local;
import tn.esprit.insurance.entity.Sinister;

@Local
public interface ISinisterLocal {
	public int addSinister(Sinister sinister);
	public void removeSinister(int id);
	public void updateSinister(Sinister sinisterNewValues);
	public Sinister findSinisterById(int id);
	public List<Sinister> findAllSinisters();
}
