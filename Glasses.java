
public class Glasses extends Item implements CommandHandler{
	private boolean wearing;
	
	public Glasses(String name, String description) {
		super(name, description);
		wearing = false;
	}
	
	@Override
	public void use() {
		if (!wearing) {
			execute("wear " + getName());
		}else {
			System.out.println("You are already wearing " + getName());
		}
	}
	
	@Override
	public boolean execute(String command) {
		if (command.equals("wear " + getName())){
			if (wearing) {
				System.out.println("You are already wearing the " + getName());
			}else {
				wearing = true;
				System.out.println("You put on the " +  getName() + " and see a laser beam security system between you and the next vault.");

			}
			return true;
		}
		return false;
	}
	
	@Override
	public void printHelp() {
		System.out.println("You can wear the " + getName());
	}
	
	
}
