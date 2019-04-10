

import javax.naming.Context;
import javax.naming.InitialContext;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tn.esprit.insurance.service.implementation.ContractsManagment;
import tn.esprit.insurance.service.interfaces.IContractsManagment;

public class Main extends Application  {

	@Override
	public void start(Stage primaryStage) {

		try {
			Parent root = FXMLLoader.load(getClass().getResource("views/LoginMaterial.fxml"));
			primaryStage.setTitle("My Application");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		
	     	} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}