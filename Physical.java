import java.net.URL;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Physical implements Award{
	String Awards[] = {"Car", "Television", "Xbox", "Fridge", "Boat"};
	Sound sound = new Sound();
	Prizes Prize = new Prizes();
	
	String getRandomPrize(){
		Random random = new Random();
		int randomNumber = random.nextInt(5);
		return Awards[randomNumber];
		
	}
	
	@Override
	public int displayWinnings(Players object, boolean guess) {
		//Assigning the Variables needed
		boolean Result_game = guess;
		String prizeSelected = getRandomPrize();
		int indexFound = findIndex(prizeSelected);
		URL prizeID = Prizes.getPrize(indexFound);
		ImageIcon prizeImage = new ImageIcon(prizeID);
		
		
		//Returning the result of the game and displaying prizes
		if (Result_game == false) {
			
			
			GUI.currentText = (object.getFirst_name() +", no, that letter is not in the phrase. You could have won an " + prizeSelected + ".");
			sound.soundEffect(0);
			JOptionPane.showMessageDialog(null, "You could have won an "+ prizeSelected + ".", "Prize", JOptionPane.ERROR_MESSAGE, prizeImage);
			if (GUI.checkBox.isSelected() == true) {
				GUI.textAdded = GUI.textAdded + "\n" + GUI.currentText;
				GUI.textArea.setText(GUI.textAdded);
			}
			else {
				GUI.textArea.setText(GUI.currentText);
			}
		}
		else {
			GUI.currentText = (object.getFirst_name() + ", yes, that letter is in the phrase! You won an " + prizeSelected + "!");
			sound.soundEffect(1);
			JOptionPane.showMessageDialog(null, "You won an "+ prizeSelected + "!", "Prize", JOptionPane.ERROR_MESSAGE, prizeImage);
			if (GUI.checkBox.isSelected() == true) {
				GUI.textAdded = GUI.textAdded + "\n" + GUI.currentText;
				GUI.textArea.setText(GUI.textAdded);
			}
			else {
				GUI.textArea.setText(GUI.currentText);
			}
			
		}
		return 0;
	}


	//Finds the index for the proper object in the prize String
	public int findIndex(String s) {
		if (s.equals("Car")) {
			return 0;
		}
		if(s.equals("Television")){
			return 1;
		}
		if (s.equals("Xbox")) {
			return 2;
		}
		if (s.equals("Fridge")) {
			return 3;
		}
		else {
			return 4;
		}
			
	}
	
	/*
	public void runAnimation(){
		AnimationFrame animation = new AnimationFrame();
		stopAnimation(animation);
		
	}
	
	public int stopAnimation(AnimationFrame object) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		object.dispose();
		return 0;
	}
	*/
}