
public class Person {
	private String last_name;
	private String first_name;
	
	public static void main(String[] args) {
		
	}
	
	Person(String F_Name){
		this.first_name = F_Name;
		this.last_name = "";
	}

	
	Person(String F_Name, String L_Name){
		this.first_name = F_Name;
		if (L_Name == "") {
			this.last_name = L_Name;
		}
		else {
			this.last_name = (" " + L_Name);
		}
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return this.last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
}
