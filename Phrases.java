import java.util.Random;

public class Phrases {
	static String gamePhrase;
	static String playingPhrase;
	boolean Guess_player = false;
	
	public void setPlayPhrase() {
		playingPhrase = gamePhrase;
		for ( int i = 0;  i < gamePhrase.length(); i++) {
			String currentCharacter = playingPhrase.substring(i, i+1);
			if (currentCharacter.equals(" ")) {
				playingPhrase = playingPhrase.replaceFirst(playingPhrase.substring(i,i+1), " ");
			}
			else {
				playingPhrase = playingPhrase.replaceFirst(playingPhrase.substring(i, i+1), "_");
			}
		}
		System.out.println("The phrase to guess is: " + playingPhrase);
	}
	
	
	public boolean findLetters(String A, Players object) {
		//String PlayingPhrase = getPlayingPhrase();
		Random Numbers_generated = new Random();
		int New_number = Numbers_generated.nextInt(0,2);
		
		//Checking whether the exception needs to be thrown
		try {
			checkStringLength(A);
		} catch (MultipleLettersException e) {
			e.printStackTrace();
		}
		
		//Checking whether or not the letter is in the Phrase
		if (gamePhrase.contains(A)) {
			Guess_player = true;
			//Set new String
			for(int i = 0; i < gamePhrase.length(); i++) {
				String currentCharacter = gamePhrase.substring(i, i+1);
				//System.out.println(currentCharacter);
				if ( currentCharacter.equals(A)) {
					//System.out.println(i);
					char character =  A.charAt(0);
					//System.out.println(character);
					char[] CurrentPlayingPhrase = playingPhrase.toCharArray();
					//System.out.println(CurrentPlayingPhrase);
					//CurrentPlayingPhrase.toString();
					CurrentPlayingPhrase[i] = character;
					String NewPhrase = new String(CurrentPlayingPhrase);
					//System.out.println(NewPhrase);
					playingPhrase = NewPhrase;
				}
			}
		}
		else {
			Guess_player = false;
		}
		
		//Awards for Guessing letters
		if (New_number == 0) {
			Money Cash = new Money();
			int Money_change = Cash.displayWinnings(object, Guess_player);
			int Money_new = object.Money_getter() + Money_change;
			object.Money_setter(Money_new);
			System.out.println(object.toString());
		}
		else {
			Physical Prize = new Physical();
			int Money_change = Prize.displayWinnings(object, Guess_player);
			int Money_new = object.Money_getter() + Money_change;
			object.Money_setter(Money_new);
			System.out.println(object.toString());
			
			
		}
		
		System.out.println("The phrase to guess is: " + playingPhrase);	
		//The Awards section	
		if (playingPhrase.matches(gamePhrase)) {
			System.out.println("You have solved the puzzle and won the game!");
			return true;
		}
		else {
			return false;
		}
	}
		
		
	
	static void checkStringLength(String Guess) throws MultipleLettersException {
		if (Guess.length() > 1) {
			throw new MultipleLettersException();
		}
	}
}


