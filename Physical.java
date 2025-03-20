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
			GUI.currentText = (object.getFirst_name() +", no, that letter is not in the phrase. You could have won an " + getRandomPrize());
			if (GUI.checkBox.isSelected() == true) {
				GUI.textAdded = GUI.textAdded + "\n" + GUI.currentText;
				GUI.textArea.setText(GUI.textAdded);
			}
			else {
				GUI.textArea.setText(GUI.currentText);
			}
		}
		else {
			GUI.currentText = (object.getFirst_name() + ", yes, that letter is in the phrase! You won an " + getRandomPrize() + "!");
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

}
