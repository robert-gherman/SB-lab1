package ttest;

public interface Visitor {
	public void visitSalate(Salate salate);
	public void visitPizza(Pizza pizza);
	public void visitPaste(Paste paste);
	public void accept();
	public void visitComanda(Comanda c);
	void visitSection(Section b);
	
}
