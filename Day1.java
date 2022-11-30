package practise.app;

public class NameApp {

	public String myName() {
		String fname = "Abinandan";
		String lname = "Shetty";
		return fname + " " + lname;
	}

	public static void main(String[] args) {
		NameApp obj = new NameApp();
		System.out.println(obj.myName());

	}

}
