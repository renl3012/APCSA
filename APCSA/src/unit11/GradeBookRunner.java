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
		
		String[] names = new String[numStudents];
		String[] allGrades = new String[numStudents];
		
		Class test = new Class(className,numStudents);

		String studentName = "";
		String gradesList = "";
		int spot = 0;
		
		for (int i = 1; i <= numStudents; i++){
			out.println("Enter the name of student " + i);
			Scanner keyboard2 = new Scanner(System.in);
			studentName = keyboard2.nextLine();
			names[spot] = studentName;
			out.println("Enter the grades for " + studentName);
			out.println("Use the format x - grades (2 - 100 100): ");
			Scanner keyboard3 = new Scanner(System.in);
			gradesList = keyboard3.nextLine();
			allGrades[spot] = gradesList;
			System.out.println();
			test.addStudent(i-1,new Student(studentName,gradesList));
			
			spot++;
		}

		out.println();
		out.println(className);
		for (int j = 1; j <= numStudents; j++){
			out.println(names[j-1] + " = " + allGrades[j-1] + "\t" + test.getStudentAverage(j-1));
		}
		out.println();
		out.println("Failure List = " + test.getFailureList(70));	
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());
		out.println("Class Average = " + test.getClassAverage());
	
		keyboard.close();
	}
}