
public class Person {
	private static String last_name;
	private static String first_name;
	
	public static void main(String[] args) {
		
	}
	
	public void First_Name_S(String name) {
		this.setFirst_name(name);
	}
	
	public void Last_Name_S(String name) {
		this.setLast_name(" " + name);
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
		if (L_Name == "") {
			this.setLast_name(L_Name);
		}
		else {
			this.setLast_name(" " + L_Name);
		}
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		Person.first_name = first_name;
	}

	public String getLast_name() {
		return Person.last_name;
	}

	public void setLast_name(String last_name) {
		Person.last_name = last_name;
	}
	
	public String toString() {
		String Line = (Person.first_name + Person.last_name);
		return Line;
	}
}
