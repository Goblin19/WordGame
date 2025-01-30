
public class Person {
	private String last_name;
	private String first_name;
	
	public static void main(String[] args) {
		
	}
	
	public void First_Name_S(String name) {
		this.setFirst_name(name);
	}
	
	public void Last_Name_S(String name) {
		this.setLast_name(name);
	}

	public String First_Name_G(String name) {
		return this.getFirst_name();
	}
	
	public String Last_Name_G(String name) {
		return this.getLast_name();
	}
	
	Person(String F_Name){
		this.setFirst_name(F_Name);
		this.setLast_name("");
	}

	
	Person(String F_Name, String L_Name){
		this.setFirst_name(F_Name);
		this.setLast_name(L_Name);
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

}
