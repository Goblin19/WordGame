import java.util.Scanner;
public class GamePlay {
	static boolean Guess = false;
	static String Play_again = "y";
	static int Plays = -1;

	public static void main(String[] args) {
		//Initializing main variables & first name
		Hosts Host = new Hosts("Bob", "Barker");
		Host.randomizeNum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name? ");
		String First_name = scanner.nextLine();
		
		//Last name check
		System.out.println("Do you want to enter a last name? Leave blank if not");
		String Last_name = scanner.nextLine();
		
		//Initializing some functions
		Players players_new = new Players(First_name, Last_name);
		Host.Hosts_Host("Bob", "Barker");
		Numbers number_guess = new Numbers();
		Turn Turn = new Turn();
		
		//Gameplay
		while (Play_again.equals("y")) {
			Plays++;
			if (Plays >= 1) {
				System.out.println("Play another game? (y or n)");
				String Play_again_scanner = scanner.nextLine();
				Play_again = Play_again_scanner;
			}
			if (Play_again.equals("y")) {
				Guess = false;
				Host.randomizeNum();
				while( Guess == false) {
					Guess = Turn.takeTurn(players_new, Host);
				}
		}
		}
		
	}
}