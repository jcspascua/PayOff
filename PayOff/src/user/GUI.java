package user;
import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.*;

public class GUI extends Application {
	@Override
	public void start(Stage primaryStage) {
		//create pane
		GridPane gPane = new GridPane();
		BorderPane bPane = new BorderPane();
		
		//create labels
		Label lbFirstName = new Label("First Name");
		Label lbLastName = new Label("Last Name");
		
		//create textfields
		TextField tfFirstName = new TextField();
		TextField tfLastName = new TextField();
		
		//create button
		Button btNext = new Button("Next");
		btNext.setStyle("-fx-border-color: #3472d8; -fx-background-color: #3472d8; -fx-text-fill: white");

		
		//add labels and fields to pane
		gPane.add(lbFirstName, 0, 0);
		gPane.add(lbLastName, 0, 1);
		gPane.add(tfFirstName, 1, 0);
		gPane.add(tfLastName, 1, 1);
		
		//add button and gPane to bPane
		bPane.setBottom(btNext);
		bPane.setCenter(gPane);
		
		//set alignment of gPane
		BorderPane.setAlignment(gPane,Pos.CENTER);
		
		//set alignment of gPane
		BorderPane.setAlignment(btNext,Pos.CENTER);
		bPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5)); // top right bottom left
		
		//Create scene and add to stage
		Scene scene = new Scene(bPane, 300, 200);
		primaryStage.setTitle("Welcome to Pay Off!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	// Define a custom pane to hold a label in the center of the pane
	
	class CustomPane extends StackPane {
		public CustomPane(String title) {
			getChildren().add(new Label(title)); 
			setStyle("-fx-border-color: red"); 
			setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		}
	}

}
