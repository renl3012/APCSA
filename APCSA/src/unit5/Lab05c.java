package unit5;


import static java.lang.System.*;
import java.util.Scanner;

public class Lab05c
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner(System.in);
		out.println("Enter a word: ");
		String w = input.nextLine();
		
		StringOddOrEven test = new StringOddOrEven();
		System.out.println(test);
	}
}