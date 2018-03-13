package unit11;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		Scanner file = new Scanner(new File(System.getProperty("user.dir")+ "\\src\\unit11\\gradebook.dat"));
		
		String className = file.nextLine();

		int numStudents = file.nextInt();
		
//		String[] names = new String[numStudents];
//		String[] allGrades = new String[numStudents];
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> allGrades = new ArrayList<String>();
		
		Class test = new Class(className, numStudents);

		String studentName = "";
		String gradesList = "";
		int spot = 0;
		
		System.out.println(file.nextLine());
		
		for (int i = 1; i <= numStudents; i++){
			studentName = file.nextLine();
//			System.out.println(studentName);
//			names[spot] = studentName;
			names.add(studentName);
			
			gradesList = file.nextLine();
//			allGrades[spot] = gradesList;
			allGrades.add(gradesList);
			
			test.addStudent(i-1,new Student(studentName,gradesList));
			
			spot++;
		}

		out.println();
		out.println(className);
		for (int j = 1; j <= numStudents; j++){
			//out.print(names[j-1] + " = " + allGrades[j-1] + "\t");
			out.print(names.get(j-1) + " = " + allGrades.get(j-1) + "\t");
			out.printf(String.format("%.2f", test.getStudentAverage(j-1)));
			out.println();
		}
		out.println();
		out.println("Failure List = " + test.getFailureList(70));	
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());
		out.println("Class Average = " + test.getClassAverage());
	
		file.close();
	}
}