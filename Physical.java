import java.util.Random;
import javax.swing.JOptionPane;

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
			JOptionPane.showMessageDialog( null , object.getFirst_name() +", no, that letter is not in the phrase. You could have won an " + getRandomPrize());
		}
		else {
			JOptionPane.showMessageDialog( null , object.getFirst_name() + ", yes, that letter is in the phrase! You won an " + getRandomPrize() + "!");
			
		}
		return 0;
	}

}
