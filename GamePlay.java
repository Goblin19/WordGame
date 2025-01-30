import java.util.Scanner;
public class GamePlay {
	static boolean Guess = false;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name? ");
		String First_name = scanner.nextLine();
		
		System.out.println("Do you want to enter a last name? Leave blank if not");
		String Last_name = scanner.nextLine();
		
		Person new_player = new Person(First_name, Last_name);
		//System.out.println(new_player.getFirst_name());
		Numbers number_guess = new Numbers();
		number_guess.generateNumber();
		
		while( Guess == false) {
			System.out.println(new_player.getFirst_name() + new_player.getLast_name() + ", what number did I pick between 0 and 100? ");
			int Guess_number = scanner.nextInt();
			Guess = number_guess.compareNumber(Guess_number);
		}
		
	}
}
