
import javax.swing.JOptionPane;

public class Turn {
	boolean Result_game = false;
	
	public boolean takeTurn(Players object, Hosts object1){
		//initializing the game
		Phrases Phrase = new Phrases();
		String Guess = JOptionPane.showInputDialog(object1.getFirst_name() + " " + object1.getLast_name() + " says \"" + object.getFirst_name() + object.getLast_name() + ", enter your guess for a letter in my phrase.\"");
		boolean Result_game = Phrase.findLetters(Guess, object);
		return Result_game;
		
	}

}
