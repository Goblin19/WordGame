import java.util.Scanner;
import java.util.Random;
public class Turn {
	String Guess_player;
	boolean Result_game = false;
	
	public boolean takeTurn(Players object, Hosts object1){
		//initializing the game
		Numbers Guessing_game = new Numbers();
		Random Numbers_generated = new Random();
		Scanner Player_input = new Scanner(System.in);
		System.out.println(object1.getFirst_name() + " " + object1.getLast_name() + " says \"" + object.getFirst_name() + object.getLast_name() + ", what number did I pick between 0 and 100?\"");
		int Guess_player = Player_input.nextInt();
		boolean Result_game = Guessing_game.compareNumber(Guess_player);
		int New_number = Numbers_generated.nextInt(0,2);
		if (New_number == 0) {
			Money Cash = new Money();
			int Money_change = Cash.displayWinnings(object, Result_game);
			int Money_new = object.Money_getter() + Money_change;
			object.Money_setter(Money_new);
			System.out.println(object.toString());
		}
		else {
			Physical Prize = new Physical();
			int Money_change = Prize.displayWinnings(object, Result_game);
			int Money_new = object.Money_getter() + Money_change;
			object.Money_setter(Money_new);
			System.out.println(object.toString());
			
		}
		return Result_game;
		
	}

}
