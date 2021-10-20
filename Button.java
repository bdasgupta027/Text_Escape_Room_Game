
public class Button extends Item implements CommandHandler {
	private boolean isPressed;
	
	public Button (String name, String description) {
		super(name, description);
		isPressed = false;
	}
	
	@Override
	public void use() {
		if (!isPressed) {
			execute("press " + getName());
		}else {
			System.out.println("You've already pressed the " + getName());
		}
		
	}
	
	@Override
	public boolean execute(String command) {
		if (command.equals("press " + getName())) {
			if (!isPressed) {
				isPressed = true;
				System.out.println("You press the " + getName() + " and the laser beams disappear!\nYou see the wall drop and in front of you are the diamonds!");
			}else {
				System.out.println("You've already pressed the " + getName());
			}
			return true;
		}
		return false;
		
	}
	
	public boolean getIsPressed() {
		return isPressed;
	}
	
	@Override
	public void printHelp() {
		System.out.println("You can press the " + getName());
	}

}
