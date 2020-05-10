package spel;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ButtonArray extends Application implements EventHandler<ActionEvent>{
	private Stage primary;
	private Scene scene;
	private GridPane gridpane;
	//array för att lägga in 9 knappar
	private TicTacToe [] buttons;
	private final int antalButtons = 9;
	
	
//launch args startar javafx applicationen genom "void start"
	public static void main(String[] args) {
		launch(args);

	}

	public void start(Stage arg0) throws Exception {
		primary = arg0;
		gridpane = new GridPane();
		//width och height för scene 
		scene = new Scene(gridpane, 300, 300);
		
		//for loop som anroper antalbuttons
	buttons = new TicTacToe[antalButtons];
		for (int i=0; i < antalButtons; ++i) {
	//eftersom räkneordningen brukar alltid börja på 0 så plusade jag till en etta för att det ska gå från 1-9
			buttons[i] = new TicTacToe();
		//Storlek för knapparna	
		    buttons[i].setPrefSize(100, 100);
		    buttons[i].setOnAction(this);
		}
		
		
		//for loop som sprider ut knapparna i 3x3 rader. 3 i varje row(rowindex) och i varje kolumn(kolIndex)
		int buttonIndex = 0;
		for (int rowIndex = 0; rowIndex < 3; ++rowIndex) {
			for (int kolIndex = 0; kolIndex < 3; ++kolIndex) {
				gridpane.add(buttons[buttonIndex], kolIndex, rowIndex);
				++buttonIndex;
			}
			
			
		}
		
		
		
	
		primary.setTitle("Tictactoe");
		//lägger in scene inuti stage
		primary.setScene(scene);
		//ser till att staget visas
		primary.show();
		
		
	}

	// kollar vilken knapp som har tryckts
	public void handle(ActionEvent event) {
		for (int i=0; i<antalButtons; ++i) {
			if (buttons[i]==event.getSource()) {
				try {
					buttons[i].changeState();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
	}

}
