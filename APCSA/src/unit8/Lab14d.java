package unit8;
import java.util.Scanner;

public class Lab14d
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many grades? ");
		int number = keyboard.nextInt();
		double keepTrack;
		
		double[] grades = new double[number];
		//add test cases
		
		for (int i = 0; i < number; i++){
			System.out.print("Enter grade " + i + ": ");
			keepTrack = keyboard.nextDouble();
			grades[i] = keepTrack;
		}
		
		Grades myGradebook = new Grades(number,grades);
	}
}