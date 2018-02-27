package unit8;

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades2
{
	//instance variables
	String allGrades;
	double[] eachGrade;
	int numOfGrades;
	//constructor
	public Grades2 (int num, String everyGrade){
		allGrades = everyGrade;
		numOfGrades = num;
		
		eachGrade = new double[numOfGrades];
		
		separate(allGrades);
		setGrades(numOfGrades, allGrades);
	}
	
	public void separate(String allTheGrades){
		Scanner chopper = new Scanner(allTheGrades);

		chopper.useDelimiter("\\ ");
		int spot = 0;
		
		while(chopper.hasNextDouble()){
			eachGrade[spot++] = chopper.nextDouble();
		}
	}
	//set method
	public void setGrades(int number, String everyGrade){
		eachGrade = new double[number];
		numOfGrades = number;
		allGrades = everyGrade;
		separate(allGrades);
	}


	private double getSum()
	{
		double sum=0.0;
		for (int a = 0; a < eachGrade.length; a++){
			sum += eachGrade[a];
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
