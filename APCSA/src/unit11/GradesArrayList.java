package unit11;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradesArrayList
{
	private ArrayList<Double> grades;
	
	public GradesArrayList()
	{
		setGrades("");
	}
	
	public GradesArrayList(String gradeList)
	{
		setGrades(gradeList);
	}
	
	public void setGrades(String gradeList)
	{
		Scanner s2 = new Scanner(gradeList);
		int size = s2.nextInt();

		gradeList = gradeList.substring(4, gradeList.length());
		Scanner s = new Scanner(gradeList);

		for (int i = 0; i < size; i++){
			if (s.hasNextDouble()){
				grades.add(s.nextDouble());
			}
		}
		s.close();
		s2.close();
	}
	
	public void setGrade(int spot, double grade)
	{
		grades.set(spot, grade);

	}
	
	public double getSum()
	{
		double sum=0.0;

		for (int i = 0; i < grades.size(); i++){
			sum += grades.get(i);
		}

		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;

		for (int i = 0; i < grades.size(); i++){
			if (grades.get(i) < low){
				low = grades.get(i);
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;

		for (int i = 0; i < grades.size(); i++){
			if (grades.get(i) > high){
				high = grades.get(i);
			}
		}

		return high;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public String toString()
	{
		String output="";

		for (int i = 0; i < grades.size(); i++){
			output += grades.get(i) + "\n";
			if (grades.get(i) >= 90.0){
				output += "A\n";
			}
			else if (grades.get(i) >= 80.0){
				output += "B\n";
			}
			else if (grades.get(i) >= 70.0){
				output += "C\n";
			}
			else if (grades.get(i) >= 60.0){
				output += "D\n";
			}else{
				output += "F\n";
			}
		}

		return output;
	}	
}