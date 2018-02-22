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
	public Grades (int num, double[] gradeArray){
		allGrades = gradeArray;
		numOfGrades = num;
		setGrades();
	}

	//set method
	public void setGrades(){
		for(int b = 0; b < numOfGrades; b++){
			System.out.println("grade " + b + ":: " + allGrades[b]);
		}
		System.out.println();
		System.out.println("average = " + getAverage());
	}


	private double getSum()
	{
		double sum=0.0;
		System.out.println(allGrades.length);
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

}
