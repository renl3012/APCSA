package unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{



	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter X1:: ");
		x1 = keyboard.nextInt();
		System.out.print("Enter Y1:: ");
		y1 = keyboard.nextInt();
		System.out.print("Enter X2:: ");
		x2 = keyboard.nextInt();
		System.out.print("Enter Y2:: ");
		y2 = keyboard.nextInt();
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		xTwo = y2;
		calcDistance();
		print();
	}

	public void calcDistance()
	{
		double dxOne = (double)xOne;
		double dyOne = (double)yOne;
		double dxTwo = (double)xTwo;
		double dyTwo = (double)yTwo;
		
		double diffX = dxOne - dxTwo;
		double diffY = dyOne - dyTwo;
		
		distance = sqrt(Math.pow(diffX, 2)+ Math.pow(diffY, 2));
	}

	public void print( )
	{
		System.out.print("distance == ");
		System.out.printf("%.3f\n", distance);
		System.out.println();
	}
}