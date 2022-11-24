package ttest;

public class Client {

	String nume;

	public Client(String name) {
		super();
		nume = name;
	}
	

	public String print() {
		return this.nume;
	}

	@Override
	public String toString() {
		return "Client [name=" + nume + "]";
	}

	
}
