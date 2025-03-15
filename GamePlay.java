public class GamePlay {
	static boolean Guess = false;
	static String Play_again = "y";
	static int Plays = -1;
	static int Players = 0;
	static int Player_number = 1;

	public static void main(String[] args) {
		GUI Gui = new GUI();
		Gui.Gui();

		/*
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
		*/
	}
	
}