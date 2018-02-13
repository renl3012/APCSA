package unit5;
import java.util.Scanner;

public class CheckSSN {

	public static void main(String[] args) {
		System.out.println("Enter your Social Security Number: ");
		Scanner keyboard = new Scanner(System.in);
		String n = keyboard.nextLine();
		
		if (n.length() == 11 && n.charAt(3) == '-' && n.charAt(6) == '-'){
			
			if (n.compareTo("999-99-9999") < 0){
				System.out.println("That is a valid SSN.");
			}
			else {
				System.out.println("That is not a valid SSN.");
			}
		}
	}

}
