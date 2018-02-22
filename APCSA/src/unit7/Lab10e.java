package unit7;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response;
		response = "y";

		do{out.println("Guessing Game- how many numbers?");
		GuessingGame game1 = new GuessingGame(keyboard.nextInt());
		out.println("Do you want to play again? ");
		Scanner keyboard2 = new Scanner(System.in);
		response = keyboard2.nextLine();
		}while(response.equals("y"));

	}
}