package unit8;

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	double[] allGrades;
	int numOfGrades;
	//constructor
	public Grades (int num, String listOfGrades){
		allGrades = new double[num];
		numOfGrades = num;
		
		Scanner chopper = new Scanner(listOfGrades);
		int spot = 0;
		
		while (chopper.hasNextDouble()){
			allGrades[spot++]= chopper.nextDouble();
		}

		setGrades();
	}

	//set method
	public void setGrades(){
		System.out.println();
		for(int b = 0; b < numOfGrades; b++){
			System.out.println("grade " + b + ":: " + allGrades[b]);
		}
		System.out.println();
		System.out.println(toString());
	}


	private double getSum()
	{
		double sum=0.0;
		for (int a = 0; a < allGrades.length; a++){
			sum += allGrades[a];
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		
		average = getSum()/numOfGrades;

		return average;
	}


	//toString method	
	public String toString(){
		String output = "average = " + getAverage();
		
		return output;
	}
}
