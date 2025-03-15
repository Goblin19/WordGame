public class Hosts extends Person {
	String F_name;
	String L_name;
	
	Hosts(String f_Name, String l_Name){
			super(f_Name, l_Name);
	}

	public void Host_Phrase(String Phrase){
		Phrases phrases = new Phrases();
		Phrases.gamePhrase = Phrase;
		phrases.setPlayPhrase();
	}
	
	
	
}