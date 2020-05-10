package spel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ButtonArray extends Application{
	private Stage primary;
	private Scene scene;
	private GridPane gridpane;
	//array f�r att l�gga in 9 knappar
	private Button [] buttons;
	private final int antalButtons = 9;
	
	
//launch args startar javafx applicationen genom "void start"
	public static void main(String[] args) {
		launch(args);

	}

	public void start(Stage arg0) throws Exception {
		primary = arg0;
		gridpane = new GridPane();
		//width och height f�r scene 
		scene = new Scene(gridpane, 300, 300);
		
		//for loop som anroper antalbuttons
	buttons = new Button[antalButtons];
		for (int i=0; i < antalButtons; ++i) {
	//eftersom r�kneordningen brukar alltid b�rja p� 0 s� plusade jag till en etta f�r att det ska g� fr�n 1-9
			buttons[i] = new Button("Button " + (i + 1));
		//Storlek f�r knapparna	
		    buttons[i].setPrefSize(100, 100);
		}
		
		int buttonIndex = 0;
		for (int rowIndex = 0; rowIndex < 3; ++rowIndex) {
			for (int kolIndex = 0; kolIndex < 3; ++kolIndex) {
				gridpane.add(buttons[buttonIndex], kolIndex, rowIndex);
				++buttonIndex;
			}
			
			
		}
		
		
		
	
		primary.setTitle("Tictactoe");
		//l�gger in scene inuti stage
		primary.setScene(scene);
		//ser till att staget visas
		primary.show();
		
		
	}

}
