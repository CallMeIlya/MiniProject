import java.util.Scanner;
import java.time.Year;

class main {
	
	
	static Scanner input = new Scanner(System.in);
	
	//waits until user presses a key
	public static void waitUntil() {
		System.out.println("Press enter to continue");
		input.nextLine();
	}
	
	//checks validity of year
	public static int getYear(String year) {
		try {
			
			int birthyear = Integer.parseInt(year);
			if(Year.now().getValue() < birthyear) {
				System.out.println("Please enter a valid year");
				return getYear(input.nextLine());
			}
			return birthyear;

		} catch(NumberFormatException BadNumber) {
			System.out.println("Please enter a valid year");
			return getYear(input.nextLine());
		}
	}
	//checks validity of dialogue option.
	public static int getDialogue(String num, int options) {
		try {
			int option = Integer.parseInt(num);
			if(option > options) {
				System.out.println("Please enter a valid option");
				return getDialogue(input.nextLine(), options);
			} else {
				return option;
			}
		} catch(NumberFormatException BadNumber) {
			System.out.println("Please enter a valid option");
			return getDialogue(input.nextLine(), options);
		}
	}

	public static void main(String args[]) {
		String ASCIIART= "\"Jerry's Adventure\"\n-------------------\n\t-------------\n\t\t-------\n";

		
		System.out.println(ASCIIART);
		
		System.out.println("You find yourself within a dreamlike state. Everything as far as the eye can see is pitch black. An empty void with the exception of you and what looks like a desk with a monitor and keyboard. On the computer there is a black screen with a bright-green text in the top left that reads");

		System.out.println("Enter your name");
		
		String username = input.nextLine();
		
		System.out.println("Having nothing else todo aside from abliging, you enter your name and after a moment of pause another piece of text appears on the screen."); 
		System.out.println("What year where you born?");
		int year = getYear(input.nextLine());
 		year = Year.now().getValue()-year;
		
		System.out.println("The screen turns completely black. You feel like you're being watched by it.");
		
		waitUntil();

		System.out.println("After a moment of waiting, you see the shade of the whole screen change. You thought you saw something moving behind the glass.");
		
		waitUntil();

		System.out.println("(1) inspect the glass? (2) continue waiting?");
		if(getDialogue(input.nextLine(), 2) == 1) {
			System.out.println("You approach the glass but before you even get a chance to inspect it, what looks like three wild pokemon jump out of the screen shattering it and spreading the glass everywhere. With only 1 pokeball you get to catch only a single one.");
				
		} else {
			System.out.println("From a distance you begin to hear a growling coming from the computer as three wild pokemon jump out of the screen shattering it and spreading glass everywhere.");
		}
		waitUntil();
	}
}
