import java.util.Random;
public class Numbers {
	private static int randomNum;
	
	public static void main(String[] args) {
	}

	public void Number_S(int number){
		Numbers.randomNum = number;
	}
	
	public int Number_G(int number) {
		return Numbers.randomNum;
	}
	
	public void generateNumber() {
		Random Number = new Random();
		int Number_random = Number.nextInt(101);
		Numbers.randomNum = Number_random;
	}
	
	boolean compareNumber(int guess) {
		if(guess == Numbers.randomNum) {
			System.out.println("Congradulations, you guessed the number!");
			return true;
		}
		else if(guess > Numbers.randomNum){
			System.out.println("I'm sorry. That guess was too high.");
			return false;
		}
		else {
			System.out.println("I'm sorry, That guess was too low.");
			return false;
		}
			
	}

}
