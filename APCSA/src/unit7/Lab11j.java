package unit7;

import static java.lang.System.*;
import java.util.Scanner;

public class Lab11j
{
   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(System.in);
	   System.out.println("Enter an integer: ");
	   int input = keyboard.nextInt();
	   Triples myTriples = new Triples(input);

   }
}