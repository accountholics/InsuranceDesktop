package tn.esprit.controllers;

import java.io.IOException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import tn.esprit.insurance.entity.ContractDemand;
import tn.esprit.insurance.service.interfaces.IContractsManagment;

public class ContactsController {
	@FXML
	private VBox demandContactsContainer;

	@FXML
	void initialize() throws IOException 
	{
		String jndiName = "/insurance-ear/insurance-ejb/ContractsManagment!tn.esprit.insurance.service.interfaces.IContractsManagment";
		Context context;
		
		try {
			context = new InitialContext();
			IContractsManagment proxy = (IContractsManagment) context.lookup(jndiName);
			List<ContractDemand> contracts = proxy.ListDemand();
			
			AnchorPane anc;
			
			for (ContractDemand cnt : contracts) 
			{
				anc = FXMLLoader.load(getClass().getClassLoader().getResource("dashboard/OnedemandContact.fxml"));
				
				OnedemandContactController.thisController.setUsername(cnt.getUser().getFirst_name() + " " + cnt.getUser().getLast_name());
				OnedemandContactController.thisController.setSplittingType(cnt.getSpliting().toString());
				OnedemandContactController.thisController.setAddress(cnt.getUser().getAdress().toString());
				OnedemandContactController.thisController.setEmail(cnt.getUser().getEmail().toString());				
				OnedemandContactController.thisController.setId(cnt.getId());
				
				this.demandContactsContainer.getChildren().add(anc);
						
				
			}
			
		} catch (NamingException e) 
		{
			
		}
	}
	
	
}
