package application;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javafx.animation.AnimationTimer;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class GameControler {

	@FXML
	private Pane gamePane;
	@FXML
	private Label gameTime;
	@FXML
	private Label gameScore;
	@FXML
	private Button Gameplay;
	private Label gameLevel;
	@FXML
	public Circle snake = new Circle(200,200,30, Color.RED);
	
	private int Score = 0;
	private int lvl =  1; 
	private Stage stage;
	private Scene scene;
	private static final int RADIUS = 30; // Circle size
	private Timer timer;
	public Random random = new Random();

	public void switchToScene2(ActionEvent event) throws Exception {

		Pane root = (Pane) FXMLLoader.load(getClass().getResource("Scene2.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		startGame();
	}

	public void startGame() {
		
		
		startRandomSnakeMovement();
		System.out.println("staring Game");

	}

	public void snakeclicked() {
		Score++;
		gameScore.setText(String.valueOf(Score));
		
//		snake.setCenterX(snake.getCenterY()+10);
//		snake.setCenterY(snake.getCenterX()+10);

	}
	public void bunnyclicked() {
		Score--;
		gameScore.setText(String.valueOf(Score));
		
//		snake.setCenterX(snake.getCenterY()+10);
//		snake.setCenterY(snake.getCenterX()+10);

	}
	public void carrotclicked() {
		Score = Score + 2;
		gameScore.setText(String.valueOf(Score));
		
//		snake.setCenterX(snake.getCenterY()+10);
//		snake.setCenterY(snake.getCenterX()+10);
	}
	
		

	public void startRandomSnakeMovement() {
		
		startTimer();
		
			}

	   public void startTimer() {
	        Timer timer = new Timer();
	        Random random = new Random();
	        TimerTask task = new TimerTask() {
	            @Override
	            public void run() {
	                // Randomly choose one of the two positions (200, 200) or (300, 200)
	            	System.out.print ("time passed ");
	            	System.out.println("snake y posititon= " + snake.getCenterY());
	                int randomPos = random.nextInt(2);
	                System.out.println(randomPos);
	                
	                    if (randomPos == 0) {
	                    	
	                    	try {
	                    	snake.toFront();
	                        snake.setCenterY(200);  // Move to (200, 200) ---- issue code 
	                        snake.setVisible(true);
	                        System.out.println(snake.isDisable());
	                        
	                       
	                    	}catch (NullPointerException e) {
	                    		System.out.print("circle x Null");
	                    		
	                    	}
	                       
	                    } else if (randomPos == 1) {
	                    	
	                    try {
	                        snake.setCenterY(400);  // Move to (400, 200) ---- issue code
	                         System.out.println(snake.isDisable());
	                         snake.setVisible(true);
	                    }catch (NullPointerException e) {
                    		System.out.print("circle  y Null");
                    	}
	                		 
	                    }
	                		
	            }
	          
	        };

	        // Schedule the task to run every second (1000ms)
	        timer.scheduleAtFixedRate(task, 0, 1000);  // Every second
	    }
	   
	   
	   
	   
}

	          
	    

