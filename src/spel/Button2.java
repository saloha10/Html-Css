package spel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Button2 extends Application{
	private Stage primary;
	private Scene scene;
	private GridPane gridpane;
	private Button jaButton;
	private Button noButton;
	
	
//launch args startar javafx applicationen genom "void start"
	public static void main(String[] args) {
		launch(args);

	}

	public void start(Stage arg0) throws Exception {
		primary = arg0;
		gridpane = new GridPane();
		//width och height för scene 
		scene = new Scene(gridpane, 400, 300);
		
		//skapar en knapp med O/X skrivet
		jaButton = new Button("O");
		noButton = new Button("X");
		//storleken av knapparna 
		jaButton.setPrefSize(200, 100);
		noButton.setPrefSize(200, 100);
		//eftersom gridpane används så behövs det inte att lägga in dem i children
		gridpane.add(jaButton, 0, 0);
		gridpane.add(noButton, 0, 1);
		
		
		
		primary.setTitle("Tictactoe");
		//lägger in scene inuti stage
		primary.setScene(scene);
		//ser till att staget visas
		primary.show();
		
		
	}

}
