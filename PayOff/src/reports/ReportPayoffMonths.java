package reports;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ReportPayoffMonths extends Report {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		TextArea ta = new TextArea();
		pane.getChildren().add(ta);
		
		//create a scene and add to stage
		Scene scene = new Scene(pane, 400, 200);
		primaryStage.setTitle("This is the pay off report");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
