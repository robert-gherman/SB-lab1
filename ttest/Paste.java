package ttest;

public class Paste implements Element {
	String nume;
	int pret;
	public Paste(String nume, int pret) {
		super();
		this.nume = nume;
		this.pret = pret;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub

	}

	@Override
	public Element get(int i) {
		return null;
		// TODO Auto-generated method stub

	}

	@Override
	public void accept(Visitor v) {
		v.visitPaste(this);
		
	}


	@Override
	public void accept(Comenzistats stats) {
		// TODO Auto-generated method stub
		
	}
	
}
