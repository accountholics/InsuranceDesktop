package tn.esprit.insurance.service.implementation;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import tn.esprit.insurance.entity.Item;
import tn.esprit.insurance.entity.Sinister;
import tn.esprit.insurance.service.interfaces.IItemLocal;
import tn.esprit.insurance.service.interfaces.IItemRemote;

@Stateless
public class ItemService implements IItemLocal, IItemRemote {
	
	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;

	@Override
	public int addItem(Item item) {
		System.out.println("In addItem : ");
		em.persist(item);
		System.out.println("Out of addItem" + item.getItemId());
		return item.getItemId();
	}

	@Override
	public void removeItem(int id) {
		System.out.println("In removeItem : ");
		em.remove(em.find(Item.class, id));
		System.out.println("Out of removeItem : ");

	}

	@Override
	public void updateItem(Item itemNewValues) {
		System.out.println("In updateItem : ");
		Item i = em.find(Item.class, itemNewValues.getItemId());
		i.setPrice(itemNewValues.getPrice());
		i.setDescription(itemNewValues.getDescription());	
		i.setNumber(itemNewValues.getNumber());
		i.setName(itemNewValues.getName());
		i.setTotal(itemNewValues.getTotal());
		System.out.println("Out of updateItem : ");

	}

	@Override
	public Item findItemById(int id) {
		System.out.println("In findItemById : ");
		Item i = em.find(Item.class, id);
		System.out.println("Out of findItemById : ");
		return i;
	}

	@Override
	public List<Item> findAllItems() {
		System.out.println("In findAllItems : ");
		List<Item> items = em.createQuery("from Item", Item.class).getResultList();
		System.out.println("Out of findAllItems : ");
		return items;
	}
	
	@Override
	public List<Item> findAllItemsBySinister(Sinister s) {
		System.out.println("ItemsBySinister ");
		TypedQuery<Item> query = em.createQuery("SELECT u FROM Item u WHERE u.sinister = :sinister",Item.class);			
		List<Item> items = query.setParameter("sinister", s).getResultList();
		System.out.println("ItemsBySinister done ");
		return items;
	}

}
