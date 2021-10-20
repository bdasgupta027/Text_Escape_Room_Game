
public class Bank extends Room {
	//The maximum number of turns a player can take before failing
	private int maxTurns;
	
	//The number of turns a player has already taken
	private int numTurns;
	
	private Button button = new Button("red_button", "A big red button inside a locked clear case.\nThe button seems to be the only way to turn off the lasers.");

	/**
	 * Bank class constructor
	 */
	public Bank(String description, String info, int max) {
		super(description, info);
		TextItem notes = new TextItem("notes", "Notes you have taken from the subreddit about how to get past the first vault", 
				"The door requires a 4 digit passcode to open. Here are the numbers:\n"
				+ "1) (9 * 2) - (3 * 3) = ______\n"
				+ "2) square root of 36 = _____\n"
				+ "3) 2^3 = ____\n"
				+ "4) 9%2 = ____\n"
				+ "Rearrange these numbers to get the year that Martin Luther King Jr. was assassinated.");
		add(notes);
		Container vault = new PasswordLockedContainer("vault", "the first vault you need to get past", "1968");
		this.numTurns = 0;
		this.maxTurns = max;
		add(vault);
		Whiteboard whiteboard = new Whiteboard("whiteboard", "A whiteboard that contains numbers and a pen near it. "
				+ "The whiteboard reads: \n  789535261084\n"
				+ "636289237982",
				"789535261084\n"
				+ "636289237982");
		vault.add(whiteboard);
		Container vault2 = new PasswordLockedContainer("vault_2", "The second vault you need to get past. There is a 4 digit passcode", "5689");
		vault.add(vault2);
		Glasses sunglasses = new Glasses("sunglasses", "A pair of blue-tinted sunglasses.");
		
		Container glassCase = new PasswordLockedContainer("glass_case", "A case with a red_button inside. The case requires a 5 letter passcode.", "money");
		TextItem scrap_of_paper = new TextItem("scrap_of_paper", "A scrap of paper you find lying on the ground next to the glass_case.\nThe bank manager might have accidentally dropped it while leaving the vault.",
				"Hint for the glass_case: Five letter word that has only one left when two letters are removed.");
		vault2.add(glassCase);
		vault2.add(scrap_of_paper);
		vault2.add(sunglasses);
		glassCase.add(button);
		
	}
	
	@Override
	public void printRoomPrompt() {
		System.out.println("You have taken " + numTurns + " turns. You have " + (maxTurns - numTurns) + " turns left to escape.");
	}

	@Override
	public void onCommandAttempted(String command, boolean handled) {
		if (handled) {
			numTurns++;
		}
	}
	
	
	@Override
	public boolean escaped() {
		return button.getIsPressed();
	}

	@Override
	public void onEscaped() {
		System.out.println("You have escaped in " + numTurns + " turns!");
	}

	@Override
	public void onFailed() {
		System.out.println("Oh no! An alarm goes off and several security guards enter the vault!");
		System.out.println("Game Over");
	}

	@Override
	public boolean failed() {
		return numTurns >= maxTurns;
	}
	
}
