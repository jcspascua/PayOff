package user;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.*;

public class Window extends Application {
	@Override
	public void start(Stage primaryStage) {
		//create pane
		GridPane gPane = new GridPane();
		BorderPane bPane = new BorderPane();
		
		bPane.setCenter(gPane);
		
		//set alignment of gPane
		BorderPane.setAlignment(gPane,Pos.CENTER);
		
		//set alignment of gPane
		bPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5)); // top right bottom left
		
		//Create scene and add to stage
		Scene scene = new Scene(bPane, 300, 200);
		primaryStage.setTitle("New Window!");
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
	
}// close clase
