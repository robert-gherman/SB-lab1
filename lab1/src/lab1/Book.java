package lab1;

public class Book {
	private String name;
	private String paragraph;
	private String image;
	private String table;
	public Book(String name) {
		super();
		this.name = name;
	}
	
	public void createNewParagraph(String paragraf) {
		this.paragraph +=	"\n" + paragraf;
			
	}
	public void createNewImage(String img) {
		this.image =	img;
	}
	public void createNewTable(String tbl) {
		this.table = tbl;
	}
	

	@Override
	public String toString() {
		return "Book [name=" + name + ", paragraph=" + paragraph + ", image=" + image + ", table=" + table + "]";
	}

	public void print() {
		System.out.print("Book [name=" + name + ", paragraph=" + paragraph + ", image=" + image + ", table=" + table + "]");
	}

	
	
	
}
