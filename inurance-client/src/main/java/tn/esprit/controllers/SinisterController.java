package tn.esprit.controllers;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import tn.esprit.insurance.entity.Sinister;
import tn.esprit.insurance.service.interfaces.ISinisterRemote;

public class SinisterController {

    @FXML
    private TextField cont;

    @FXML
    private TextArea desc;

    @FXML
    private Button addButton;

    @FXML
    void addSinister(ActionEvent event) throws NamingException {
		String jndiName = "insurance-ear/insurance-ejb/SinisterService!tn.esprit.insurance.service.interfaces.ISinisterRemote";
		Context context = new InitialContext();
		ISinisterRemote proxy = (ISinisterRemote) context.lookup(jndiName);
		Sinister s = new Sinister();
		s.setContractNumber(Integer.parseInt(cont.getText()));
		s.setSinisterDescription(desc.getText());
		System.out.println(proxy.addSinister(s));
    }

}
