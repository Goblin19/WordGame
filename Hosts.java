
public class Hosts extends Person {
	String F_name;
	String L_name;
	
	Hosts(String f_Name, String l_Name){
			super(f_Name, l_Name);
	}
	
	void Hosts_Host(String F_name, String L_name){
		this.F_name = F_name;
		this.L_name = L_name;
	}

	public void randomizeNum() {
		Numbers number_generated = new Numbers();
		number_generated.generateNumber();
	}
	
	
	
}