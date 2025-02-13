import java.util.Scanner;
public class Hosts extends Person {
	String F_name;
	String L_name;
	
	Hosts(String f_Name, String l_Name){
			super(f_Name, l_Name);
	}

	public void Host_Phrase(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the phrase for the players to guess:");
		String inputString = scanner.nextLine();
		Phrases.gamePhrase = inputString;
		Phrases phrases_different = new Phrases();
		phrases_different.setPlayPhrase();
	}
	
	
	
}