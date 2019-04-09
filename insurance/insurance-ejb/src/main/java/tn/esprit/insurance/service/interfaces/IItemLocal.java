package tn.esprit.insurance.service.interfaces;

import java.util.List;
import javax.ejb.Local;
import tn.esprit.insurance.entity.Item;
import tn.esprit.insurance.entity.Sinister;

@Local
public interface IItemLocal {
	public int addItem(Item item);
	public void removeItem(int id);
	public void updateItem(Item itemNewValues);
	public Item findItemById(int id);
	public List<Item> findAllItems();
	public List<Item> findAllItemsBySinister(Sinister s);
}
