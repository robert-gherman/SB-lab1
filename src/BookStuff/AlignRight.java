package BookStuff;

public class AlignRight implements AlignStrategy {

	@Override
	public String render(String text) {
		return "###" + "###" + text;

	}

}
