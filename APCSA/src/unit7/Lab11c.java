package unit7;

import static java.lang.System.*;

import java.util.Scanner;

public class Lab11c
{
   public static void main( String args[] )
   {
	   Scanner keyboard = new Scanner(System.in);
	   out.println("Enter an integer: ");
	   int number = keyboard.nextInt();
	   out.println("Enter a letter: ");
	   String alpha = keyboard.next();
	   
	   TriangleThree myTriangle = new TriangleThree(number, alpha);
	}
}