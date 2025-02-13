import java.util.Scanner;
public class GamePlay {
	static boolean Guess = false;
	static String Play_again = "y";
	static int Plays = -1;
	static int Players = 0;
	static int Player_number = 1;

	public static void main(String[] args) {
		//Initializing main variables & first name
		Players[] currentPlayers = new Players[3];
		Hosts Host = new Hosts("Bob", "Barker");
		Scanner scanner = new Scanner(System.in);
		
		//Assigning Players loop
		while (Players != 3) {
			System.out.println("Player #" + Player_number + ", What is your name? ");
			String First_name = scanner.nextLine();
			
			//Last name check
			System.out.println("Do you want to enter a last name? Leave blank if not");
			String Last_name = scanner.nextLine();
			currentPlayers[Players] = new Players(First_name, Last_name);
			Player_number++;
			Players++;
		}
		
		Host.Host_Phrase();
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
				if (Plays >= 1) {
					Host.Host_Phrase();
				}
				Players = 0;
				Guess = false;
				while( Guess == false) {
					if (Players == 3) {
						Players = 0;
					}
					Guess = Turn.takeTurn(currentPlayers[Players], Host);
					Players++;
					
				}
		}
		}
		
	}
}