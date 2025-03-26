package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage StageOne) {
		try {
			
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("Scene1.fxml"));
			Scene scene = new Scene(root);
			
//			root.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			StageOne.setScene(scene);

			StageOne.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void playing(Stage StageTwo) {
		try {

			
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("Scene2.fxml"));
			Scene scene = new Scene(root);
			
			root.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			StageTwo.setScene(scene);

			StageTwo.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

		


	
	public static void main(String[] args) {
		launch(args);
	}
}


