package unit8;
import java.util.Scanner;

public class Lab14d
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many grades? ");
		int number = keyboard.nextInt();
		String gradeList;
		
		//add test cases
		
		System.out.print("Enter grades" + ": ");
		gradeList = keyboard.next();
		
		Grades myGradebook = new Grades(number, gradeList);
	}
}