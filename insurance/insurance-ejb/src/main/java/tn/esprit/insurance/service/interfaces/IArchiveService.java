package tn.esprit.insurance.service.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.insurance.entity.Archive;
import tn.esprit.insurance.entity.Feeds;

@Remote
public interface IArchiveService {
	public void addArchive(Feeds feed);
	public void removeArchive(int id);
	public void updateArchive(Feeds newArch);
	public Feeds findArchiveById(int id);
	public List<Archive> findAllArchive();
}
