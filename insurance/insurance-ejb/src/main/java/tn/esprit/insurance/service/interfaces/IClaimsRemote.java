package tn.esprit.insurance.service.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.insurance.entity.Claims;

@Remote
public interface IClaimsRemote {
	public int addClaim(Claims claim);
	public void removeClaim(int id);
	public void updateClaim(Claims sinisterNewValues);
	public Claims findClaimById(int id);
	public List<Claims> findAllClaims();
}
