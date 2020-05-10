package spel;

import javafx.scene.control.Button;

public class TicTacToe extends Button{

	private int v�rde;
	
	// en konstruktor f�r tictactoe button
	public TicTacToe() {
		
		this.setState(0);
	}
	
	
	// i setState metoden s� kollar den state som en parameter. 
	public void setState(int state) {
		// om state �r 0 (vilket den �r) kommer den att skriva ut tomma rutor
		if (state == 0) {
			this.setText("");
			this.v�rde = 0;
	//d� kommer man kunna s�tta in X samt O
		} else if (state == 1) {
				this.setText("X");
				this.v�rde = 1;
			} else if (state == -1) {
				this.setText("O");
				this.v�rde = -1;
		    }
}
// metod f�r att anv�ndaren ska kunna ta om sitt val genom att klicka p� knappen igen
	//tex om rutan �r X kryssad s� kommer man kunna trycka p� den och byta den till O
	public int getV�rde() {
		return v�rde;
		
	}
	
	public void changeState() throws Exception {
	if (this.v�rde == -1)
		this.setState(0);
	else if (this.v�rde == 0)
		this.setState(1);
	else if (this.v�rde == 1)
		this.setState(-1);
		
}
}
