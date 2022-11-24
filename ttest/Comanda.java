package ttest;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Comanda extends Section {

	static int pret;
	List<Client> a = new ArrayList<Client>();

	public Comanda(int pret) {
		super(pret);
	}

	public void addClient(Client a) {
		this.a.add(a);

	}

	public void addContent(Element e) {
		this.e.add(e);

	}

	public void print() {

		System.out.println();
		Iterator<Client> it = a.iterator();

		System.out.println("Clients:");

		while (it.hasNext()) {
			System.out.println("Client: " + it.next().print());
		}
		System.out.println();

		Iterator<Element> it2 = this.e.iterator();
		while (it2.hasNext()) {
			it2.next().print();
			}

	}

	
	
	

}


