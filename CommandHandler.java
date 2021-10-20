
public interface CommandHandler {
	/* 
	 * This method is used to handle user input. It will
	 * handle relevant commands and return true if the command
	 * was handled.
	 */
	public boolean execute(String command);
	
	/* 
	 * This method is used to print information about the commands
	 * that can be handled. It should print a help message that explains
	 * how to use any commands it can handle. 
	 */
	public void printHelp();
}
