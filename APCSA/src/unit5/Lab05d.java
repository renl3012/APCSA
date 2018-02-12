package unit5;

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);   //A

		//add more test cases
		out.print("Enter a letter :: ");
		char letter2 = keyboard.next().charAt(0);
		test.setChar(letter2);
		out.println(test);
		
		out.print("Enter a letter :: ");
		char letter3 = keyboard.next().charAt(0);
		test.setChar(letter3);
		out.println(test);
		
		out.print("Enter a letter :: ");
		char letter4 = keyboard.next().charAt(0);
		test.setChar(letter4);
		out.println(test);
		
		out.print("Enter a letter :: ");
		char letter5 = keyboard.next().charAt(0);
		test.setChar(letter5);
		out.println(test);
		
		out.print("Enter a letter :: ");
		char letter6 = keyboard.next().charAt(0);
		test.setChar(letter6);
		out.println(test);
		
		out.print("Enter a letter :: ");
		char letter7 = keyboard.next().charAt(0);
		test.setChar(letter7);
		out.println(test);
		
		out.print("Enter a letter :: ");
		char letter8 = keyboard.next().charAt(0);
		test.setChar(letter8);
		out.println(test);
		
		out.print("Enter a letter :: ");
		char letter9 = keyboard.next().charAt(0);
		test.setChar(letter9);
		out.println(test);
		
	}
}