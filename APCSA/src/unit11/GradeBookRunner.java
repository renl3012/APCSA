package unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		
		out.println("What is the name of this class? ");
		String className = keyboard.next();

		out.println("How many students are in this class? ");
		int numStudents = keyboard.nextInt();

		for (int i = 1; i <= numStudents; i++){
			out.println("Enter the name of student " + i);
		}






	}		
}