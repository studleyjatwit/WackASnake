package application;
	
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage StageOne) {
		new GameMove();
		
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
		
		
	}

	@SuppressWarnings("serial")
	public class TimerScoreboard extends JFrame {
		
		private int score = 0;
	    private int timeLeft = 60;
	    private JLabel scoreLabel;
	    private JLabel timerLabel;
	    private Timer timer;

	    public TimerScoreboard() {
	        setTitle("Timer and Scoreboard");
	        setSize(300, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new GridLayout(3, 1));
	        scoreLabel = new JLabel("Score: " + score, SwingConstants.CENTER);
	        timerLabel = new JLabel("Time left: " + timeLeft + "s", SwingConstants.CENTER);

	        JButton increaseScoreButton = new JButton("Increase Score");
	        increaseScoreButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                score++;
	                scoreLabel.setText("Score: " + score);
	            }
	        });

	        add(scoreLabel);
	        add(timerLabel);
	        add(increaseScoreButton);
	        timer = new Timer(1000, new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (timeLeft > 0) {
	                    timeLeft--;
	                    timerLabel.setText("Time left: " + timeLeft + "s");
	                } else {
	                    timer.stop();
	                    JOptionPane.showMessageDialog(null, "Time's up! Final Score: " + score);
	                }
	            }
	        });
	       timer.start();
	       
	    }
	    public static void main(String[] args) {
	    	SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                //new TimerScoreboard().setVisible(true);
	    }
	    	
	    });
	    	
	   } 
	}

	
	public static void main(String[] args) {
		
		launch(args);
	}
}


