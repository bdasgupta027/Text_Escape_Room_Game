
public class TextItem extends Item{
	private String text;
	
	public TextItem(String name, String description, String t) {
		super(name, description);
		text = t;
	}
	
	public void use() {
		System.out.println(text);
	}
	
	
	
}
