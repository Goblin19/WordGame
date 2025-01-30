import java.util.Random;
public class Numbers {
	private int randomNum;
	
	public static void main(String[] args) {
	}

	public void Number_S(int number){
		this.randomNum = number;
	}
	
	public int Number_G(int number) {
		return this.randomNum;
	}
	
	public void generateNumber() {
		Random Number = new Random();
		int Number_random;
		Number_random = Number.nextInt(101);
		this.randomNum = Number_random;
	}
	
	boolean compareNumber(int guess) {
		if(guess == randomNum) {
			System.out.println("Congradulations, you guessed the number!");
			return true;
		}
		else if(guess > randomNum){
			System.out.println("I'm sorry. That guess was too high.");
			return false;
		}
		else {
			System.out.println("I'm sorry, That guess was too low.");
			return false;
		}
			
	}

}
