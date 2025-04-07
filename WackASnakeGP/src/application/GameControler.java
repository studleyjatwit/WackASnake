package application;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Random;

import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
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
	private ImageView snake;
	@FXML
	private ImageView bunny;
	
	//private Circle snake = new Circle(200,200,30, Color.RED);
	private static final int WIDTH = 500;  // Screen width
	private static final int HEIGHT = 400; // Screen height
	public int MAX_X = 500;
	public int MAX_Y = 400;
	
	//timer things 
    private static int remainingTime;
    private Timer timer;
    private int score = 0;
    private int timeLeft = 60;
    
    
    
    
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
	
//	public void GameTimer() {
//		  timer = new Timer(1000, new ActionListener()) {
//			  
//	            public void actionPerformed(ActionEvent e) {
//	                if (timeLeft > 0) {
//	                    timeLeft--;
//	                    gameTime.setText("timeLeft ");
//	                } else {
//	                    timer.stop();
//	                    
//	                }
//	            }
//	        };
//	
//	}


//		public void WIN(String fxmlFile, Stage stage) {
//	        try {
//	            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
//	            Scene scene = new Scene(root);
//	            stage.setScene(scene);
//	            stage.show();
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
	
//	}

	public void startGame() {
//		
//		snake.setLayoutX(150);
//		snake.setLayoutY(150);
		System.out.println("staring Game");
		
		
	}

	public void snakeclicked() throws Exception {
		Score++;
		if (Score >=5 ) {
	
	
			
		}
	
		startRandomMovement(snake);
		gameScore.setText( "Score: " + String.valueOf(Score));
		
//		snake.setCenterX(snake.getCenterY()+10);
//		snake.setCenterY(snake.getCenterX()+10);

	}
	public void bunnyclicked() {
		Score--;
		startRandomBunnyMovement(bunny);
		gameScore.setText(String.valueOf(Score));
		
//		snake.setCenterX(snake.getCenterY()+10);
//		snake.setCenterY(snake.getCenterX()+10);

	}
//	public void carrotclicked() {
//		Score = Score + 2;
//		startRandomCarrotMovement();
//		gameScore.setText(String.valueOf(Score));
//		
////		snake.setCenterX(snake.getCenterY()+10);
////		snake.setCenterY(snake.getCenterX()+10);
//	}
//	
		

	public void startRandomMovement(ImageView type) {
		System.out.println("Starting Movements");
		
		
        Random random = new Random();
	
        int randomPos = random.nextInt(4);
		
		if (randomPos == 0) {
			 setPosition( 151, 121 );
			 
		}
		if (randomPos == 1) {
			 setPosition( 394, 242 );
			
		}
		else if (randomPos == 2) {
			 setPosition( 394, 121 );
			
		}
		else if (randomPos == 3) {
			 setPosition( 151, 121 );
			
		}
		else if (randomPos == 4) {
			 setPosition( 275, 171 );
			
		}
		else 
			setPosition( 100, 100 );
		
			}
	
	 public void  setPosition( int x, int y ) {
			snake.setLayoutX(x);
			snake.setLayoutY(y);
			
		}
	 public void  setBunnyPosition( int x, int y ) {
			bunny.setLayoutX(x);
			bunny.setLayoutY(y);
			
		}
	public void startRandomBunnyMovement(ImageView type) {
		System.out.println("Starting bunny  Movements");
        Random random = new Random();
    	
        int randomPos = random.nextInt(4);
		
		if (randomPos == 0) {
			 setPosition( 100, 100 );
			 
		}
		if (randomPos == 1) {
			 setPosition( 200, 100 );
			
		}
		else if (randomPos == 2) {
			 setPosition( 100, 400 );
			
		}
		else if (randomPos == 3) {
			 setPosition( 400, 100 );
			
		}
	}
}

		
////		startTimer();
//	
////			}
//
//	
//Could have a bunch of circles and Then Show and HIde depending on random POsition value. 
//	   public void startTimer() {
//	
//		   System.out.println("Timer starting");
//	
//
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
//	            	System.out.println("snake y posititon= "+ snake.getLayoutY());
//	                int randomPos = random.nextInt(4);
//	                
//	                System.out.println(randomPos);
//	                
////	                Platform.runLater(() ->{
//	             
//	                	
//	                	if (randomPos == 0) {
//	                    	
//	                    	snake.setLayoutY(200);
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
//	   
//	   
//	   
//}

