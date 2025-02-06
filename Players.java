
public class Players extends Person {
	//String F_name;
	//String L_name;
	int Player_number;
	private int Money = 1000;
	
	//public static void main(String[] args) {
		
	//}
	
	Players(String F_Name, String L_Name) {
		super(F_Name, L_Name);
		//this.Player_number = Player_number;
	}
	


	public void Money_setter(int money) {
		this.Money = money;
	}
	

	public int Money_getter() {
		return this.Money;
	}
	
	public String toString(){
		if (this.Money >= 0 ) {
			String Money_string = Integer.toString(this.Money);
			String Money_line = (this.getFirst_name() + this.getLast_name() + ": $" + Money_string);
			return Money_line;
		}
		else {
			String Money_string = Integer.toString(this.Money);
			String Money_string_minus = Money_string.substring(0,1);
			String Money_string_rest = Money_string.substring(1);
			String Money_line = (this.getFirst_name() + this.getLast_name() + ": " + Money_string_minus + "$" + Money_string_rest);
			return Money_line;
		}
		
	}

}
