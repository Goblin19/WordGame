
public class Money implements Award{

	@Override
	public int displayWinnings(Players object, boolean guess) {
		boolean Result_game = guess;
		if (Result_game == false) {
			System.out.println( object.getFirst_name() + ", no, that letter is not in the phrase. You lost $200.");
			return -200;
		}
		else {
			System.out.println( object.getFirst_name() + ", yes, that letter is in the Phrase! You won $1000.0!");
			return 1000;
		}
	}
}