package spel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Button1 extends Application{
	private Stage primary;
	private Scene scene;
	private Pane pane;
	private Button jaButton;
	
	

	public static void main(String[] args) {
		

	}

	public void start(Stage arg0) throws Exception {
		primary = arg0;
		pane = new Pane();
		scene = new Scene(pane, 400, 300);
		
		jaButton = new Button("yes");
		jaButton.setPrefSize(200, 100);
		pane.getChildren().add(jaButton);
		
		primary.setTitle("Tictactoe");
		primary.setScene(scene);
		primary.show();
		
		
	}

}
