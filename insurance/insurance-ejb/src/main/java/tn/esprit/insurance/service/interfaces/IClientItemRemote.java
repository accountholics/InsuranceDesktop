package tn.esprit.insurance.service.interfaces;

import java.util.List;
import tn.esprit.insurance.entity.ClientItem;
import tn.esprit.insurance.entity.Sinister;

public interface IClientItemRemote {
	public int addClientItem(ClientItem item);
	public void removeClientItem(int id);
	public void updateClientItem(ClientItem itemNewValues);
	public ClientItem findClientItemById(int id);
	public List<ClientItem> findAllClientItems();
	public List<ClientItem> findAllClientItemsBySinister(Sinister s);

}
