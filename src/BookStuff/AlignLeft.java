package BookStuff;

public class AlignLeft implements AlignStrategy {

	@Override
	public String render(String text) {
		return text + "###" + "###";

	}

}
