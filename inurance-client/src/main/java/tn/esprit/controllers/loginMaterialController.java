package tn.esprit.controllers;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class loginMaterialController {

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    void loginClick(ActionEvent event) {
    		// System.out.println("login clicked");
    		
    			
    			try {
    				Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("dashboard/dashboardMaterial.fxml"));
    				Stage stage = new Stage();

    				stage.setTitle("Dashboard Gestion Assurances");
    				stage.setScene(new Scene(root));
    				stage.show();
    				( ((Node) event.getSource())).getScene().getWindow().hide();
    			} 
    			catch (Exception e) 
    			{
    				e.printStackTrace();
    			}
    	

    }

}
