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
import javafx.scene.image.ImageView;
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
	//public ImageView snake;
	
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
//	private static final int RADIUS = 30; // Circle size
	
	//private Timer timer;
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
//		
//		snake.setLayoutX(150);
//		snake.setLayoutY(150);
		System.out.println("staring Game");
		
	}

	public void snakeclicked() {
		Score++;
		
		startRandomMovement();
		gameScore.setText(String.valueOf(Score));
		
//		snake.setCenterX(snake.getCenterY()+10);
//		snake.setCenterY(snake.getCenterX()+10);

	}
	public void bunnyclicked() {
		Score--;
		startRandomBunnyMovement();
		gameScore.setText(String.valueOf(Score));
		
//		snake.setCenterX(snake.getCenterY()+10);
//		snake.setCenterY(snake.getCenterX()+10);

	}
	public void carrotclicked() {
		Score = Score + 2;
		startRandomCarrotMovement();
		gameScore.setText(String.valueOf(Score));
		
//		snake.setCenterX(snake.getCenterY()+10);
//		snake.setCenterY(snake.getCenterX()+10);
	}
	
		

	public void startRandomMovement() {
		System.out.println("Starting Movements");
		
        Random random = new Random();
	
        int randomPos = random.nextInt(2);
		
		if (randomPos == 0) {
			 setCirclePosition( 100, 100 );
		}
		if (randomPos == 1) {
			 setCirclePosition( 200, 100 );
			
		}
		else if (randomPos == 2) {
			 setCirclePosition( 100, 400 );
			
		}
		else if (randomPos == 3) {
			 setCirclePosition( 400, 100 );
			
		}
		
		
			}
	
	 public void  setCirclePosition( int x, int y ) {
			snake.setCenterX(x);
			snake.setCenterY(y);
			
		}
	public void startRandomBunnyMovement() {
		System.out.println("Starting bunny  Movements");
		
		
		
		
//		startTimer();
		
		
			}
	public void startRandomCarrotMovement() {
		System.out.println("Starting carrot  Movements");
		
		
		
		
//		startTimer();
		
		
			}
	
//Could have a bunch of circles and Then Show and HIde depending on random POsition value. 
	

//	   public void startTimer() {
//		   
//		   
//		   
//
//		   System.out.println("Timer starting");
//	
//	  
//	   // working on fixing random popup 
//		   //Multiple curcles with positions stable and changing visibility pers second not location 
//	   
//	   
//	        Timer timer = new Timer();
//	        Random random = new Random();
//	        TimerTask task = new TimerTask() {
//	            @Override
//	            public void run() {
//	            
//	                // Randomly choose one of the two positions (200, 200) or (400, 200)
//	            	System.out.print ("time passed ");
//	            	System.out.println("snake y posititon= "+ snake.getCenterY());
//	                int randomPos = random.nextInt(2);
//	                
//	                System.out.println(randomPos);
//	                
////	                Platform.runLater(() ->{
//	             
//	                	
//	                	if (randomPos == 0) {
//	                    	
//	                    	snake.setCenterY(200);
//	       
//	                    	
//	                    	System.out.println(" random = 0");
//	             
//	                       
//	                    } else if (randomPos == 1) {
//	                    	snake.setCenterY(400);
//	                    	
//	                    	System.out.println(" random = 1");
//	             
//                    	
//	                		 
//	                    }
//	              
////	                });
//	               
//	
//	               
//	            }
//	            
//	          
//	        };
//
//	        // Schedule the task to run every second (1000ms)
//	        timer.scheduleAtFixedRate(task, 0, 1000);  // Every second
//	   }
//	   
	   
	   
	   
}

