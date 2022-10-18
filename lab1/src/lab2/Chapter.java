package lab2;

import java.util.List;

public class Chapter {
	private String name;
	private final List<SubChapter> subchapters;
	private int indexChapter = -1;
	public Chapter(String name) {
		
		super();
		this.subchapters = null;
		this.name = name;
		
	}
	public int createSubChapter(String title) {
		indexChapter++;
		SubChapter subchapter = new SubChapter(title);
		subchapters.add(subchapter);
		return indexChapter;
	}
	public SubChapter getSubChapter(int index) {
		SubChapter chpt = subchapters.get(index);
		return chpt;
	}
}
