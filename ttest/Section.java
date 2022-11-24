package ttest;




import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Section implements Element {

	int pret;

	List<Element> e = new ArrayList<Element>();

	public Section(int  pret) {
		super();
		this.pret = pret;
	}

	@Override
	public void print() {
		System.out.println(this.pret);
		Iterator<Element> it = this.e.iterator();
		while (it.hasNext()) {
			it.next().print();
		}
	}

	@Override
	public void add(Element e) {
		this.e.add(e);

	}

	@Override
	public void remove(Element e) {
		this.e.remove(e);
	}

	@Override
	public Element get(int i) {
		return this.e.get(i);

	}

	@Override
	public void accept(Comenzistats stats) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

//	public void accept(BookStatistics stats) {
//		stats.visitSection(this);
//		Iterator<Element> it = this.e.iterator();
//		while (it.hasNext()) {
//			it.next().accept(stats);
//		}
//		
//	}

}


