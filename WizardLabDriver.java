/**
 * Name: Bhaswati Das Gupta
 * Date: 3/6/2021
 * Period: 3
 * Time: 5 hours
 * Reflection: This lab was pretty long and confusing. It was especially confusing since
 * its length made it hard to debug. I was struggling for a while with creating a WandOfKeySummoning 
 * since my matchesItem function was incorrect. I was finally able to see that I had forgotten to call
 * getName() on the item and was therefore comparing it to an object directly. Overall, the errors helped me
 * understand the entire lab and its process better. 
 *
 */
public class WizardLabDriver {

	public static void main(String[] args) {
		String intro = "Welcome to the Wizard Laboratory!\n" +
			 	 "You have just broken into your magic professor's laboratory\n" +
			 	 "(without his knowledge!) in the early hours of the morning.\n" +
			 	 "Unfortunately, the door magically seals itself behind you\n" +
			 	 "and you estimate that you have a couple of hours to explore\n" +
			 	 "and escape before he wakes up.  Get what you need and get out!";
		WizardsLab lab = new WizardsLab("This is a wizards lab.", intro, 15);
		new EscapeApp(lab).runGame();
	}

}
