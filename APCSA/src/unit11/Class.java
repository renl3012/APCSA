package unit11;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	//private Student[] studentList;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		name="";
		//studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList = new ArrayList<Student>();
		//studentList = new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		//studentList[stuNum] = s;
		studentList.add(s);

	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		/*for (int i = 0; i < studentList.length; i++){
			classAverage += studentList[i].getAverage();
		}*/
		for (int i = 0; i < studentList.size(); i++){
			classAverage += (studentList.get(i)).getAverage();
		}
		//classAverage = classAverage/studentList.length;
		classAverage = classAverage/studentList.size();
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		//return studentList[stuNum].getAverage();
		return (studentList.get(stuNum)).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		/*for (int i = 0; i < studentList.length; i++){
			if (studentList[i].getName().equals(stuName)){
				return studentList[i].getAverage();
			}
		}*/
		
		for (int i = 0; i < studentList.size(); i++){
			if ((studentList.get(i)).getName().equals(stuName)){
				return studentList.get(i).getAverage();
			}
		}

		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		//return studentList[stuNum].getName();
		return studentList.get(stuNum).getName();
	}

	public void sort(){
		//Arrays.sort(studentList);
		Collections.sort(studentList);
	}
	
	public String getStudentWithHighestAverage()
	{
		sort();
		//return studentList[studentList.length-1].getName();
		return studentList.get(studentList.size()-1).getName();
		/*double high = Double.MIN_VALUE;
		String hName ="";

		for (int i = 0; i < studentList.length; i++){
			if (studentList[i].getAverage() > high){
				high = studentList[i].getAverage();
				hName = studentList[i].getName();
			}
		}
		return hName;
		*/
	}

	public String getStudentWithLowestAverage()
	{
		sort();
		//return studentList[0].getName();
		return studentList.get(0).getName();
		
		/*double low = Double.MAX_VALUE;
		String hName ="";		

		for (int i = 0; i < studentList.length; i++){
			if (studentList[i].getAverage() < low){
				low = studentList[i].getAverage();
				hName = studentList[i].getName();
			}
		}
		return hName;*/
		
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";

		/*for (int i = 0 ; i < studentList.length; i++){
			if (studentList[i].getAverage() < failingGrade){
				output += studentList[i].getName() + " ";
			}
		}*/

		for (int i = 0; i < studentList.size(); i++){
			if (studentList.get(i).getAverage() < failingGrade){
				output += studentList.get(i).getName() + " ";
			}
		}
		
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		

		return output;
	}  	
}