package tn.esprit.insurance.service.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.insurance.entity.User;

@Local
public interface IUserServiceLocal {

	public int addUser(User user) ; 
	public User findUserById(int id);
	public void removeUser(int id);
	public void updateUser(User userNewValues);
	public List<User> findAllUsers();
	public String UserName(int id );
	public User getUserByEmailAndPassword(String email, String password) ;

}
