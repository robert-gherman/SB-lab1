package lab2;

import java.util.List;

public class Book {
	private String title;
	private Author auth;
	private final List<Chapter> chapters;
	private int indexChapter = -1;
	public Book(String name) {
		super();
		this.chapters = null;
		this.title = name;
	}
	public void addAuthor(Author auth) {
		this.auth = auth;
	}
	public int createChapter(String title) {
		indexChapter++;
		Chapter chpter = new Chapter(title);
		chapters.add(chpter);
		return indexChapter;
	}
	public Chapter getChapter(int index) {
		Chapter chpt = chapters.get(index);
		return chpt;
	}
}
