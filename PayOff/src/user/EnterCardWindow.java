package user;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EnterCardWindow extends Window {
	@Override
	public void start (Stage primaryStage) {
		BorderPane bPane = new BorderPane();
		GridPane gPane = new GridPane();
		
		//create Bank info button
		Button btEnter = new Button("Enter");
		
		//Bank name
		Label lbBank = new Label("Bank name");
		TextField tfBank = new TextField();
		
		//Balance
		Label lbBalance = new Label("Bank balance");
		TextField tfBalance = new TextField();

		//APR
		Label lbAPR = new Label("APR");
		TextField tfAPR = new TextField();

		//Description
		Label lbDescription = new Label("Bank description");
		TextField tfDescription = new TextField();
		
		//add to gPane
		gPane.addColumn(0, lbBank, lbBalance, lbAPR, lbDescription);
		gPane.addColumn(2, tfBank, tfBalance, tfAPR, tfDescription);		
		
		//add to bPane
		bPane.setCenter(gPane);
		bPane.setBottom(btEnter);
		
		Scene scene = new Scene(bPane);
		primaryStage.setTitle("Enter Card Window!");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
