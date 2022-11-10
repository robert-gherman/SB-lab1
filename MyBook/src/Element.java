import java.util.ArrayList;
import java.util.List;

public interface Element {

	List<Section> s = new ArrayList<Section>();
	List<TableOfContents> tt = new ArrayList<TableOfContents>();
	List<Paragraph> p = new ArrayList<Paragraph>();
	List<Image> i = new ArrayList<Image>();
	List<Table> t = new ArrayList<Table>();
	List<imageProxy> ip = new ArrayList<imageProxy>();

	public void print();

	public void add(Element e);

	public void remove(Element e);

	public Element get(int i);

}
