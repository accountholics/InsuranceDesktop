/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPopup;
import com.jfoenix.controls.JFXRippler;
import com.jfoenix.controls.JFXToolbar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

/**
 *
 * @author danml
 */
public class dashboardMaterialController implements Initializable {

	 	@FXML
	    private AnchorPane holderPane;
	    @FXML
	    private JFXButton btnHome;
	    @FXML
	    private JFXButton btnPricing;
	    @FXML
	    private JFXButton btnContacts;
	    @FXML
	    private JFXButton btnWidgets;
	    @FXML
	    private JFXButton btnProfile;
	    @FXML
	    private JFXButton btnAlerts;

    AnchorPane Mcontracts,alerts,MContract,profiles,widgets,controls;
    @FXML
    private JFXButton btnControls;


    @FXML
    void homeclicked(ActionEvent event) {
        setNode(widgets);
    }

    
    //Set selected node to a content holder
    private void setNode(Node node) 
    {
        holderPane.getChildren().clear();
        holderPane.getChildren().add((Node) node);

        FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        createPages();

    }


    //Load all fxml files to a cahce for swapping
    private void createPages() {
        try {
        	 Mcontracts = FXMLLoader.load(getClass().getClassLoader().getResource("dashboard/ManageContractsDB.fxml"));      
             alerts = FXMLLoader.load(getClass().getClassLoader().getResource("dashboard/Alerts.fxml"));
             profiles = FXMLLoader.load(getClass().getClassLoader().getResource("dashboard/Profiles.fxml"));
             widgets = FXMLLoader.load(getClass().getClassLoader().getResource("dashboard/Widgets.fxml"));
             controls = FXMLLoader.load(getClass().getClassLoader().getResource("dashboard/Controls.fxml"));
            setNode(controls);
        } catch (IOException ex) {
            Logger.getLogger(dashboardMaterialController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void ContractManagment(ActionEvent event) 
    {
        setNode(Mcontracts);
    }

    @FXML
    private void switchContacts(ActionEvent event) {
        setNode(Mcontracts);
    }

    @FXML
    private void switchWidget(ActionEvent event) {
        setNode(widgets);
    }

    @FXML
    private void switchProfile(ActionEvent event) {
        setNode(profiles);
    }

    @FXML
    private void switchAlert(ActionEvent event) {
        setNode(alerts);
    }

    @FXML
    private void switchControls(ActionEvent event) {
        setNode(controls);
    }

}
