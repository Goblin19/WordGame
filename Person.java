
public class Person {
	private String Last_name;
	private String First_name;
	
	public static void main(String[] args) {
		
	}
	
	public void First_Name_S(String name) {
		this.First_name = name;
	}
	
	public void Last_Name_S(String name) {
		this.Last_name = name;
	}

	public String First_Name_G(String name) {
		return this.First_name;
	}
	
	public String Last_Name_G(String name) {
		return this.Last_name;
	}
	
	Person(String F_Name){
		this.First_name = F_Name;
		this.Last_name = "";
	}

	
	Person(String F_Name, String L_Name){
		this.First_name = F_Name;
		this.Last_name = L_Name;
	}

}
