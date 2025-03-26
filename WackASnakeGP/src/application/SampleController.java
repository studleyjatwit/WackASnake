package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.Node;
import javafx.scene.Parent;

	public class SampleController {
		
		private Stage stage;
		private Scene scene;
		private Parent root;
		
		public void switchToScene2(ActionEvent event) throws IOException {
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Scene2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
		
		public void youWin(ActionEvent event) throws IOException {
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("SceneWin.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
		
		public void youLoose(ActionEvent event) throws IOException {
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("SceneLoose.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();		
		}
		

}