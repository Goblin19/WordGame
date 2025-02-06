import java.util.Random;

public class Physical implements Award{
	String Awards[] = {"Car", "Television", "Xbox", "Fridge", "Boat"};
	
	String getRandomPrize(){
		Random random = new Random();
		int randomNumber = random.nextInt(5);
		return Awards[randomNumber];
		
	}
	
	@Override
	public int displayWinnings(Players object, boolean guess) {
		boolean Result_game = guess;
		if (Result_game == false) {
			System.out.println( object.getFirst_name() + object.getLast_name() + " lost you could have won an " + getRandomPrize());
		}
		else {
			System.out.println( object.getFirst_name() + object.getLast_name() + " won " + getRandomPrize());
			
		}
		return 0;
	}

}
