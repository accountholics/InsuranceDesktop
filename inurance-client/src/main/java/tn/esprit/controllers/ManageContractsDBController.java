package tn.esprit.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jfoenix.controls.JFXButton;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;

public class ManageContractsDBController implements Initializable{
	
    @FXML
    private AnchorPane holderPane;
	@FXML
	private JFXButton btnConsultDemand;
	@FXML
	private JFXButton btnadd;
	@FXML
	private JFXButton btnBack;
	
	
	
    AnchorPane ListDemands , AddContract , back;
    
    public void initialize(URL url, ResourceBundle rb)
    {
       System.out.println("====================================================================");
       createPages();
    }
    
    //Load all fxml files to a cahce for swapping
    private void createPages() {
        try {
        	 ListDemands = FXMLLoader.load(getClass().getClassLoader().getResource("dashboard/Contracts.fxml"));      
            setNode(ListDemands);
        } catch (IOException ex) {
            Logger.getLogger(dashboardMaterialController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void setNode(Node node) 
    {
        holderPaneContracts.getChildren().clear();
        holderPaneContracts.getChildren().add((Node) node);

        FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private AnchorPane holderPaneContracts;

    @FXML
    void listeDemancC() {
    	 setNode(ListDemands);

    }
}
