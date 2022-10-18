package lab2;

import java.util.Arrays;
import java.util.List;

public class SubChapter {
	private String name;
	private final List<Image> imgs;
	private final List<Table> tables;
	private final List<Paragraph> paragraphs;
	
	public SubChapter(String name) {
		super();
		this.name = name;
		this.tables = null;
		this.imgs = null;
		this.paragraphs = null;
		
	}

	public void createNewParagraph(String title) {
		Paragraph paragh = new Paragraph(title);
		paragraphs.add(paragh);
	}
	public void createNewImage(String title) {
		Image img = new Image(title);
		imgs.add(img);
	}
	public void createNewTable(String title) {
		Table tbl = new Table(title);
		tables.add(tbl);
	}
	public void print() {
		System.out.print(name);
//		for(int i = 0 ;i<= paragraphs.size();i++) {
//			System.out.print(paragraphs[i].text);
//		}
		System.out.println(Arrays.toString(paragraphs.toArray()));
		System.out.println(Arrays.toString(imgs.toArray()));
		System.out.println(Arrays.toString(tables.toArray()));
	
		
		
	}
	
}
