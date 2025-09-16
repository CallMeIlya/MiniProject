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
    public static int getInstruction(String num) {
        int options = 8;
        System.out.println("(1) Open the door (2) Go north (3) Go south (4) Go east (5) Go west (6) Take Item (7) Drop Item (8) Use Item");
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
        String ASCIIART = "\"Jerry's Adventure\"\n-------------------\n\t-------------\n\t\t-------\n";


        System.out.println(ASCIIART);

        System.out.println("You find yourself within a dreamlike state. Everything as far as the eye can see is pitch black. An empty void with the exception of you and what looks like a desk with a monitor and keyboard. On the computer there is a black screen with a bright-green text in the top left that reads");

        System.out.println("Enter your name");

        String username = input.nextLine();

        System.out.println("Having nothing else todo, you enter your name and after a moment of pause another piece of text appears on the screen.");
        System.out.println("What year where you born?");
        int year = getYear(input.nextLine());
        year = Year.now().getValue() - year;

        System.out.println("The screen turns completely black. You feel like something alien is watching you through it.");

        waitUntil();

        System.out.println("After a moment of waiting, you see the shade of the whole screen change. You thought you saw something moving behind the glass.");

        waitUntil();

        System.out.println("(1) inspect the glass? (2) continue waiting?");
        if (getDialogue(input.nextLine(), 2) == 1) {
            System.out.println("You approach the glass but before you even get a chance to inspect it, what looks like three wild pokemon jump out of the screen.");
        } else {
            System.out.println("From a distance you begin to hear a growling coming from the computer as a wolf jumps out of the screen.");
        }
        waitUntil();
        System.out.println("Suddenly everything turns black.");
        waitUntil();
        System.out.println("A few seconds later you find yourself laying on what feels like a stone floor.");
        waitUntil();
        System.out.println("As you stand up and look around in an attempt to orient yourself you realize you have completely no idea where you are. You seem to be trapped in a cube made of stone brick. There's a wooden door in front of you. The only source of light being that of a singular torch attatched to the wall next to the wooden door");
        waitUntil();
        System.out.println("On the floor in front of the wooden door you find a compass on the ground.");

        System.out.println("(1) pickup the compass?");
        if (getDialogue(input.nextLine(), 1) == 1) {
            System.out.println("You pickup the compass. You notice a note under the compass which reads 'you're gonna need this if you're to get out alive. Sincerely M.'");
        }
        System.out.println("You quickly stuff the compass into your pocket.");
        System.out.println("With nowhere left to go you decide to open the door.");
        System.out.println("To your surprise the door opens just fine. and in front of you are two more doors. One to the west, one to the east. The eastern door has a label with a skull with bones on it. The western door seems to have no labels but is colored red");
        waitUntil();
        System.out.println("You look at the compass and notice that it is pointing to the east for some reason. Towards the door with skulls");
        waitUntil();
        System.out.println("(1) Open the eastern door with the skull (2) open the western door (3) take item");

    }
}
