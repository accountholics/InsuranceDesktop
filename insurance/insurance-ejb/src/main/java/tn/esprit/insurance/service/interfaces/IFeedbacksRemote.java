package tn.esprit.insurance.service.interfaces;

import java.util.List;

import javax.ejb.Remote;
import tn.esprit.insurance.entity.Feeds;

@Remote
public interface IFeedbacksRemote{
	public void addFeeds(Feeds feed);
	public void removeFeeds(int id);
	public void updateFeeds(Feeds newFeed);
	public Feeds findFeedsById(int id);
	public List<Feeds> findAllFeeds();
	public List<Feeds> getAllFeedsByName(String ff);
	public List<Feeds> getAllFeedsByState(String state);
}
