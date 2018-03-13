package unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable
{
	private String myName;
	private String gradeString;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		myName = name;
		myGrades = new Grades(gradeList);
		gradeString = gradeList;
	}
	
	public boolean equals(Student s){
		if (this.getAverage() == s.getAverage() && this.getName() == s.getName()){
			return true;
		}
		return false;
	}
	public void setName(String name)
	{
		myName = name;

	}	
	
	public void setGrades(String gradeList)
	{
		myGrades = new Grades(gradeList);
	
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot,grade);

	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		double average = myGrades.getSum()/myGrades.getNumGrades();
		return average;
	}

	public double getAverageMinusLow()
	{
		return (getSum() - myGrades.getLowGrade())/(myGrades.getNumGrades()-1);
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public String toString()
	{
		return "";
	}

	public int compareTo(Object o){
		Student s = (Student)o;
		return (int) (this.getAverage() - s.getAverage());
	}
}