package spel;

import javafx.scene.control.Button;

public class TicTacToe extends Button{

	private int värde;
	
	// en konstruktor för tictactoe button
	public TicTacToe() {
		
		this.setState(0);
	}
	
	public void setState(int state) {
		if (state == 0) {
			this.setText("-");
			this.value = 0;
			{ else if (state == 1) {
				this.setText("X");
				this.value = 1;
			} else if (state == -1) {
				this.setText("O")
				
			}
		}
		
	}
	
	

}
