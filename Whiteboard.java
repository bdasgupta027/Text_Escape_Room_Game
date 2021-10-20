
public class Whiteboard extends Item implements CommandHandler {
	private String numbers;
	
	private boolean isErased;
	public Whiteboard(String name, String description, String t) {
		super(name, description);
		numbers = t;
		isErased = false;
	}
	@Override
	public boolean execute(String command) {
		if(command.equals("write on " + getName())) {
			write();
			System.out.println("Nothing happens.");
			return true;
		}else if (command.equals("erase " + getName())){
			if (isErased) {
				System.out.println("The " + getName() + " has already been erased");
			}else {
				
				erase();
				System.out.println("You start erasing the board and all the numbers on the board disappear except for 4 of them.");
				
			}
			return true;
		}
		return false;
	}
	
	public void setNumbers(String n) {
		numbers = n;
	}
	@Override
	public void use() {
		System.out.println("This is what the board reads: \n" + numbers);
	}
	@Override
	public void printHelp() {
		System.out.println("You can either erase or draw on the " + getName());
	}
	
	public void write() {
		System.out.println("You scribble on the whiteboard.");
	}
	
	public void erase() {
		isErased = true;
		setNumbers("   5        \n"
				+ "6   8    9   ");
		use();
		
		
	}
	
	
}
