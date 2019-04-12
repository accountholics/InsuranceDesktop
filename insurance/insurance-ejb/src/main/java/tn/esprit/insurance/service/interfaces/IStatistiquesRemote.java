package tn.esprit.insurance.service.interfaces;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import tn.esprit.insurance.entity.Feeds;

@Remote
public interface IStatistiquesRemote {
	
	public List<Feeds> findAllFeeds();
	public List<Feeds> findStats(Date d1,Date d2);
	public Long findStatistique();
}
