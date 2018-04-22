package reports;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;

public class Report extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		TextArea ta = new TextArea();
		pane.getChildren().add(ta);
		
		//create a scene and add to stage
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("This is a report");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
