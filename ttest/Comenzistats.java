package ttest;



public class Comenzistats implements Visitor {

	
	int pretTotalPaste;
	int pretTotalPizza;
	int pretTotalSalate;
	int pretTotalComenzi;
	@Override
	public void visitComanda(Comanda c) {
		pretTotalComenzi = pretTotalComenzi + c.pret;

	}



	@Override
	public void visitPaste(Paste b) {
		pretTotalPaste = pretTotalPaste + b.pret;

	}



	@Override
	public void visitPizza(Pizza b) {
		pretTotalPizza = pretTotalPizza + b.pret;

	}

	@Override
	public void visitSalate(Salate b) {
		pretTotalSalate = pretTotalSalate + b.pret;

	}

	public void printStatistics() {
		
		System.out.println("Comenzi:");
		System.out.println("Pretul total comenzi: " + pretTotalComenzi);
		System.out.println("Pretul total paste: " + pretTotalPaste);
		System.out.println("Pretul total pizza: " + pretTotalPizza);
		System.out.println("Pretul total paste: " + pretTotalSalate);
		
		
		
	}



	@Override
	public void accept() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void visitSection(Section b) {
		// TODO Auto-generated method stub
		
	}

}


