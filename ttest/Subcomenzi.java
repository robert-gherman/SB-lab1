package ttest;

import java.util.ArrayList;
import java.util.List;

public class Subcomenzi extends Section {
	
	private static int pret;
	
	List<Pizza> a = new ArrayList<Pizza>();
	List<Paste> i = new ArrayList<Paste>();
	List<Salate> s  = new ArrayList<Salate>();
	public Subcomenzi(int pret) {
		super(pret);
		// TODO Auto-generated constructor stub
	}
	public void addContent(Element e) {
		this.e.add(e);
	}
}
