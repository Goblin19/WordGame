
public class Money implements Award{

	@Override
	public int displayWinnings(Players object, boolean guess) {
		boolean Result_game = guess;
		if (Result_game == false) {
			System.out.println( object.getFirst_name() + object.getLast_name() + " lost $200.");
			return -200;
		}
		else {
			System.out.println( object.getFirst_name() + object.getLast_name() + " won $1000!");
			return 1000;
		}
	}
}