package unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);
	}
	
	public void setGrades(String gradeList)
	{
		Scanner s = new Scanner(gradeList);
		int size = s.nextInt();
		grades = new double[size];

		gradeList = gradeList.substring(4, gradeList.length());
		Scanner s2 = new Scanner(gradeList);

// this part needs some fixing
		int spot = 0;
		for (int i = 0; i < size; i++){
			if (s2.hasNextInt()){
				grades[spot] = s2.nextInt();
				spot++;
				System.out.println(grades[i]);
			}
			if (s2.hasNextDouble()){
				grades[spot] = s2.nextDouble();
				spot++;
				System.out.println(grades[i]);
			}
		}

		s.close();
		s2.close();
	}
	
	public void setGrade(int spot, double grade)
	{
		grades[spot] = grade;


	}
	
	public double getSum()
	{
		double sum=0.0;

		for (int i = 0; i < grades.length; i++){
			sum += grades[i];
		}

		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;

		for (int i = 0; i < grades.length; i++){
			if (grades[i] < low){
				low = grades[i];
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;

		for (int i = 0; i < grades.length; i++){
			if (grades[i] > high){
				high = grades[i];
			}
		}

		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output="";

		for (int i = 0; i < grades.length; i++){
			output += grades[i] + "\n";
			if (grades[i] >= 90.0){
				output += "A\n";
			}
			else if (grades[i] >= 80.0){
				output += "B\n";
			}
			else if (grades[i] >= 70.0){
				output += "C\n";
			}
			else if (grades[i] >= 60.0){
				output += "D\n";
			}else{
				output += "F\n";
			}
		}

		return output;
	}	
}