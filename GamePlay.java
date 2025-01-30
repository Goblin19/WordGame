import java.util.Scanner;
public class GamePlay {
	static boolean Guess = false;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name? ");
		String First_name = scanner.nextLine();
		
		System.out.println("Do you want to enter a last name? ");
		String Answer = scanner.nextLine();
		String Answer_less = Answer.substring(0,1);
		String Answer_upper = Answer_less.toUpperCase();
		boolean Answer_tf = Answer_to_question(Answer_upper);
		
		if ( Answer_tf == true) {
			System.out.println("What is your last name? ");
			String Last_name = scanner.nextLine();
			Person player = new Person(First_name, Last_name);
		}
		else {
			Person player = new Person(First_name);
		}
		
		Numbers NumberGenerated = new Numbers();
		
		while( Guess != true){
			System.out.println(First_name +" what is your guess?");
			int Guess_int = scanner.nextInt();
			boolean Guess = Numbers.compareNumber(Guess_int);
		}
		
	}	
		public static boolean Answer_to_question(String answer) {
			if (answer.equals("Y")) {
				return true;
			}
			else {
				return false;
			}
		}

}
