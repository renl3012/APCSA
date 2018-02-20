package unit7;

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;
		playGame();

	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		double r = Math.random();
		int trueNum = (int)(r*upperBound);
		int tries = 0;
		int percent = 0;
		int guess = 0;
		
		do{
			out.println("Enter a number between 1 and " + upperBound + " ");
			guess = keyboard.nextInt();
			
			if (guess > upperBound || guess < 1){
				out.print("Number out of range!");
			}

			else if (guess == trueNum){
				toString();
			}
			tries += 1;
			}while(guess != trueNum);
		
		percent = 100/tries;
		
		out.println("It took " + tries + " guesses to guess " + trueNum);
		out.println("You guessed wrong " + percent + " percent of the time");
	}

	public String toString()
	{
		String output="";
		return output;
	}
}