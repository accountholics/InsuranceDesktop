package tn.esprit.insurance.service.implementation;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import tn.esprit.insurance.entity.ClientItem;
import tn.esprit.insurance.entity.Sinister;
import tn.esprit.insurance.entity.User;
import tn.esprit.insurance.service.interfaces.IClientItemRemote;

@Stateless
@LocalBean
public class ClientItemService implements IClientItemRemote {
	
	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;

	@Override
	public int addClientItem(ClientItem item) {
		em.persist(item);
		return item.getItemId();
	}

	@Override
	public void removeClientItem(int id) {
		em.remove(em.find(ClientItem.class, id));

	}

	@Override
	public void updateClientItem(ClientItem itemNewValues) {
		ClientItem i = em.find(ClientItem.class, itemNewValues.getItemId());
		i.setPrice(itemNewValues.getPrice());
		i.setDescription(itemNewValues.getDescription());	
		i.setNumber(itemNewValues.getNumber());
		i.setName(itemNewValues.getName());
		i.setTotal(itemNewValues.getTotal());

	}

	@Override
	public ClientItem findClientItemById(int id) {
		ClientItem i = em.find(ClientItem.class, id);
		return i;
	}

	@Override
	public List<ClientItem> findAllClientItems() {
		List<ClientItem> items = em.createQuery("from ClientItem", ClientItem.class).getResultList();
		return items;
	}

	@Override
	public List<ClientItem> findAllClientItemsBySinister(Sinister s) {
		TypedQuery<ClientItem> query = em.createQuery("SELECT u FROM ClientItem u WHERE u.sinister = :sinister",ClientItem.class);			
		List<ClientItem> items = query.setParameter("sinister", s).getResultList();
		return items;
	}
	


}
