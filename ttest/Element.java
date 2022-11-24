package ttest;

import java.util.ArrayList;
import java.util.List;


public interface Element {

	List<Section> s = new ArrayList<Section>();
	List<Pizza> p = new ArrayList<Pizza>();
	List<Paste> i = new ArrayList<Paste>();
	List<Salate> t = new ArrayList<Salate>();

	public void print();

	public void add(Element e);

	public void remove(Element e);

	public Element get(int i);

	public void accept(Comenzistats stats);

	void accept(Visitor v);

}
