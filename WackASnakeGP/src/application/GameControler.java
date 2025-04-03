package application;

import java.util.Random;

import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

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
	@FXML
	private Label gameLevel;
	@FXML
	private Circle snake = new Circle(200,200,30, Color.RED);
	private static final int WIDTH = 500;  // Screen width
	private static final int HEIGHT = 400; // Screen height
	//timer things 
    private static int remainingTime;
    private static Timer timer;
    
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
		System.out.println("staring Game");
		startRandomSnakeMovement();
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
		System.out.println("Starting MOvements");
		startTimer();
		
		
			}
	
//Could have a bunch of circles and Then Show and HIde depending on random POsition value. 

	   public void startTimer() {

		   System.out.println("Timer starting");
	
	  
	   // working on fixing random popup 
		   //Multiple curcles with positions stable and changing visibility pers second not location 
	   
	   
	        Timer timer = new Timer();
	        Random random = new Random();
	        TimerTask task = new TimerTask() {
	            @Override
	            public void run() {
	            
	                // Randomly choose one of the two positions (200, 200) or (400, 200)
	            	System.out.print ("time passed ");
	            	System.out.println("snake y posititon= " + snake.getCenterY());
	                int randomPos = random.nextInt(2);
	                
	                System.out.println(randomPos);
	                
	                Platform.runLater(() ->{
	                	
	                if (randomPos == 0) {
	                    	
	                    	
	                    	snake.setVisible(false);
	                    	snake.applyCss();
	                    	System.out.println(" random = 0");
	             
	                       
	                    } else if (randomPos == 1) {
	                    	snake.setVisible(true);
	                    	System.out.println(" random = 1");
	             
                    	
	                		 
	                    }
	                });
	                		
	            }
	          
	        };

	        // Schedule the task to run every second (1000ms)
	        timer.scheduleAtFixedRate(task, 0, 1000);  // Every second
	    }
	   
	   public void timer() {
		   
	   
	   int remainingTime = 10000; //10 seconds 
       

       timer = new Timer();
       timer.scheduleAtFixedRate(new TimerTask() {
           public void run() {
               if (remainingTime > 0) {
                   System.out.println("Time remaining: " + remainingTime + " seconds");
                   remainingTime--;
               } else {
                   System.out.println("Time's up!");
                   timer.cancel();
               }
           }
       }, 0, 1000); // Schedule the task to run every 1000 milliseconds (1 second)
   }
	   
	   
	   
	   
}



	          
	    

