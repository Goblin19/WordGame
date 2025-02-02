
public class Players extends Person {

	private static int Money = 1000;

	public void Money_setter(int money) {
		Players.Money = money;
	}
	

	public int Money_getter() {
		return Players.Money;
	}
	
	public String toString(){
		if (Players.Money >= 0 ) {
			String Money_string = Integer.toString(Players.Money);
			String Money_line = (this.getFirst_name() + this.getLast_name() + ": $" + Money_string);
			return Money_line;
		}
		else {
			String Money_string = Integer.toString(Players.Money);
			String Money_string_minus = Money_string.substring(0,1);
			String Money_string_rest = Money_string.substring(1);
			String Money_line = (this.getFirst_name() + this.getLast_name() + ": " + Money_string_minus + "$" + Money_string_rest);
			return Money_line;
		}
		
	}

	Players(String F_Name, String L_Name) {
		super(F_Name, L_Name);
		
	}
}
