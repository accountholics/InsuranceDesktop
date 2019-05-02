package tn.esprit.insurance.service.interfaces;

import javax.ejb.Remote;

import tn.esprit.insurance.entity.Sinister;
import tn.esprit.insurance.entity.User;

@Remote
public interface Iuser {
	public User finduserbyid(int id);
}
