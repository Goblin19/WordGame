import java.util.Scanner;
public class Turn {
	String Guess_player;
	boolean Result_game = false;
	
	public boolean takeTurn(Players object, Hosts object1){
		//initializing the game
		Numbers Guessing_game = new Numbers();
		Scanner Player_input = new Scanner(System.in);
		System.out.println(object1.F_name + " " + object1.L_name + " says \"" + object.getFirst_name() + object.getLast_name() + ", what number did I pick between 0 and 100?\"");
		int Guess_player = Player_input.nextInt();
		boolean Result_game = Guessing_game.compareNumber(Guess_player);
		
		//Change the money associated with the player
		if (Result_game == false) {
			int Money = object.Money_getter();
			int Money_new = Money - 200;
			object.Money_setter(Money_new);
			System.out.println("You Lose $200.00");
			System.out.println(object.toString());
			return Result_game;
		}
		else {
			int Money = object.Money_getter();
			int Money_new = Money + 1000;
			object.Money_setter(Money_new);
			System.out.println("You Win $1,000.00");
			System.out.println(object.toString());
			return Result_game;
			
		}	
		
		
	}

}
