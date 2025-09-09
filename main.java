import java.util.Scanner;
import java.time.Year;

class main {
	
	
	static Scanner input = new Scanner(System.in);

	public static int getYear(String year) {
		try {
			
			int birthyear = Integer.parseInt(year);
			if(Year.now().getValue() < birthyear) {
				System.out.println("Please enter a valid year");
				return getYear(input.nextLine());
			}
			return birthyear;

		} catch(NumberFormatException BadYear) {
			System.out.println("Please enter a valid year");
			return getYear(input.nextLine());
		}
	}

	public static void main(String args[]) {
		String ASCIIART= "\"Jerry's Adventure\"\n-------------------\n\t-------------\n\t\t-------\n";

		
		System.out.println(ASCIIART);
		
		System.out.println("Enter your name");
		
		String username = input.nextLine();

		System.out.println("Hi, "+username);

		System.out.println("What year where you born?");
		int year = getYear(input.nextLine());
 		year = Year.now().getValue()-year;


		System.out.println("Ahh so you are "+year+" years old?");


	}
}
