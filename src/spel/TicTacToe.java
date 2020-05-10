package spel;

import javafx.scene.control.Button;

public class TicTacToe extends Button{

	private int värde;
	
	// en konstruktor för tictactoe button
	public TicTacToe() {
		
		this.setState(0);
	}
	
	
	// i setState metoden så kollar den state som en parameter. 
	public void setState(int state) {
		// om state är 0 (vilket den är) kommer den att skriva ut tomma rutor
		if (state == 0) {
			this.setText("");
			this.värde = 0;
	//då kommer man kunna sätta in X samt O
		} else if (state == 1) {
				this.setText("X");
				this.värde = 1;
			} else if (state == -1) {
				this.setText("O");
				this.värde = -1;
		    }
}
// metod för att användaren ska kunna ta om sitt val genom att klicka på knappen igen
	//tex om rutan är X kryssad så kommer man kunna trycka på den och byta den till O
	public int getVärde() {
		return värde;
		
	}
	
	public void changeState() throws Exception {
	if (this.värde == -1)
		this.setState(0);
	else if (this.värde == 0)
		this.setState(1);
	else if (this.värde == 1)
		this.setState(-1);
		
}
}
