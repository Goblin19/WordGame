import java.util.Scanner;
public class Turn {
	String Guess_player;
	boolean Result_game = false;
	
	public boolean takeTurn(Players object, Hosts object1){
		//initializing the game
		Phrases Phrase = new Phrases();
		Scanner Player_input = new Scanner(System.in);
		System.out.println(object1.getFirst_name() + " " + object1.getLast_name() + " says \"" + object.getFirst_name() + object.getLast_name() + ", enter your guess for a letter in my phrase.\"");
		String Guess_player = Player_input.nextLine();
		boolean Result_game = Phrase.findLetters(Guess_player, object);
		return Result_game;
		
	}

}
