package tn.esprit.insurance.service.interfaces;

import java.util.List;
import javax.ejb.Remote;
import tn.esprit.insurance.entity.Item;
import tn.esprit.insurance.entity.Sinister;

@Remote
public interface IItemRemote {
	public int addItem(Item item);
	public void removeItem(int id);
	public void updateItem(Item itemNewValues);
	public Item findItemById(int id);
	public List<Item> findAllItems();
	public List<Item> findAllItemsBySinister(Sinister s);

}
