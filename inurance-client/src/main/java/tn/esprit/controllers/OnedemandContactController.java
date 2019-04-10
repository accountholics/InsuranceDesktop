package tn.esprit.controllers;



import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Label;
import tn.esprit.insurance.entity.Contract;
import tn.esprit.insurance.entity.ContractDemand;
import tn.esprit.insurance.service.interfaces.IContractsManagment;

public class OnedemandContactController {
	@FXML
	private Label splittingType;
	@FXML
	private Label username;

	@FXML
	private Label email;

	@FXML
	private Label address;

	@FXML
	private JFXButton btnRefuse;

	@FXML
	private JFXButton btnAccept;

	public static OnedemandContactController thisController;
	public int id;
	@FXML
	void initialize() {
		
		
		thisController = this;
		System.out.println("one demande loaded");
	}

	public void setUsername(String username) {
		this.username.setText(username);
	}

	public void setSplittingType(String split) {
		this.splittingType.setText(split);
	}

	public void setAddress(String address) {
		this.address.setText(address);
	}

	public void setEmail(String email) {
		this.email.setText(email);
	}


	@FXML
	public void AcceptDemand(ActionEvent event) 
	{
		String jndiName = "/insurance-ear/insurance-ejb/ContractsManagment!tn.esprit.insurance.service.interfaces.IContractsManagment";
		Context context;
		
		try 
		{
			context = new InitialContext();
			IContractsManagment proxy = (IContractsManagment) context.lookup(jndiName);
		    proxy.AcceptDemandContract(id);
		    
		    
		}
		catch (NamingException e) 
		{
			
		}
		
		
	}

	
	@FXML
	public void RefuseDemand(ActionEvent event) {
		System.out.println("refuser : " + id);
		
		String jndiName = "/insurance-ear/insurance-ejb/ContractsManagment!tn.esprit.insurance.service.interfaces.IContractsManagment";
		Context context;
		
		try 
		{
			context = new InitialContext();
			IContractsManagment proxy = (IContractsManagment) context.lookup(jndiName);
		    proxy.RefuseDemandContract(id);
		    
		}
		catch (NamingException e) 
		{
			
		}
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
}
