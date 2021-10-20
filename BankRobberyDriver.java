/**
 * Name: Bhaswati Das Gupta
 * Date: 3/6/2021
 * Period: 3
 * Time: 9 hours
 * Reflection: I took several tries to figure out what I was doing in this lab. While I figured out some of it, I still have some broken
 * parts in my lab. I went into office hours a couple times to get help but there's one thing that I still can't solve. 
 * After a certain number of commands, everything stops working and I can't figure out why. Overall, I thoroughly understand
 * the purpose of abstract classes and inheritance but can't understand why my entire lab isn't working. I'll try going into office hours
 * again to figure out what went wrong. 
 *
 */
public class BankRobberyDriver {
	public static void main(String[] args) {
		String intro = "After a long day of work, you get home and plop yourself on the couch. \n" + 
					"You unlock your phone to spend the next couple of hours watching TikToks\n" +
					"when you get a notification on your phone: an email from Uvuvwevwevwe \n" + 
					"Onyetenyevwe Ugwemubwem Ossas, the Prince of Nigeria. Prince Uvuvwevwevwe\n" +
					"Onyetenyevwe Ugwemubwem Ossas says that his late father deposited $4.2 \n" +
					"million in a Bank  West Africa for safe keeping. The Prince wanted to transfer\n" + 
					"the fund into your bank account for investment purposes. However, in order to \n" + 
					"do this you  would have to transfer all your savings out of your bank account as \n" + 
					"these were the rules for transferring money in Nigeria. Although you knew better, \n" +
					"the email seemed so compelling and realistic that you want to go for it. \n" + 
					"Unfortunately, you fell for the scam and are now broke. The most logical option \n" +
					"right now is to rob a bank so you end up being a millionaire despite being fooled\n" +
					"by the Prince. You decide to go on reddit to search up things about bank security\n" + 
					"when you find a subreddit talking about priceless diamonds being stored in a \n" + 
					"technologically-sophisticated safe at the Bank of Cupertino. However, in order to\n" +  
					"rob the bank and get access to these diamonds, you must find a way to get past this \n" + 
					"multi-layered safe before the security guards catch you. \n";
		Bank vault = new Bank("You are in the vault.", intro, 15);
		new EscapeApp(vault).runGame();
	}
}
