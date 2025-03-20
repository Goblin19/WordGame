import javax.swing.JOptionPane;

public class Money implements Award{

	@Override
	public int displayWinnings(Players object, boolean guess) {
		boolean Result_game = guess;
		if (Result_game == false) {
			GUI.currentText = (object.getFirst_name() + ", no, that letter is not in the phrase. You lost $200.");
			if (GUI.checkBox.isSelected() == true) {
				GUI.textAdded = GUI.textAdded + "\n" + GUI.currentText;
				GUI.textArea.setText(GUI.textAdded);
			}
			else {
				GUI.textArea.setText(GUI.currentText);
			}
			return -200;
		}
		else {
			GUI.currentText = (object.getFirst_name() + ", yes, that letter is in the Phrase! You won $1000.0!");
			if (GUI.checkBox.isSelected() == true) {
				GUI.textAdded = GUI.textAdded + "\n" + GUI.currentText;
				GUI.textArea.setText(GUI.textAdded);
			}
			else {
				GUI.textArea.setText(GUI.currentText);
			}
			return 1000;
		}
	}
}