
public class imageProxy implements Picture,Element {
	String url;
	String Dimeansion;
	Image realImage;
	public imageProxy(String url) {
		super();
		this.url = url;
	}
	public Image loadImage() {
		
		if(realImage == null) {
			realImage = new Image(url);
			
		}
		return realImage;
	}
	@Override
	public void print() {
		loadImage().print();
		
	}
	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Element get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}	
