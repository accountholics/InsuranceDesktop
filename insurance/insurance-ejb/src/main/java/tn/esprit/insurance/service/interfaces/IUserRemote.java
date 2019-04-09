package tn.esprit.insurance.service.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.insurance.entity.User;
import tn.esprit.insurance.entity.Utilisateur;

@Remote
public interface IUserRemote {
	public int addUser(User user) ; 
	public User findUserById(int id);
	public void removeUser(int id);
	public void updateUser(User userNewValues);
	public List<User> findAllUsers();
	public String UserName(int id );
	public User getUserByEmailAndPassword(String email, String password) ;
	public void Loginf(String mail , String password);
	public String passencryption(String password); 
	public boolean passTest ( String text); 
	public boolean mailConfirmation (String text );
	public boolean NotNull(String text);
	
	

}
