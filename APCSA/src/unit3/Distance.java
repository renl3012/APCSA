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
		keyboard.useDelimiter(",|\\s+");
		System.out.print("Enter X1:: ");
		x1 = Integer.parseInt(keyboard.nextLine());
		System.out.print("Enter Y1:: ");
		y1 = Integer.parseInt(keyboard.nextLine());
		System.out.print("Enter X2:: ");
		x2 = Integer.parseInt(keyboard.nextLine());
		System.out.print("Enter Y2:: ");
		y2 = Integer.parseInt(keyboard.nextLine());
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		xTwo = y2;
		System.out.println(xTwo);
		calcDistance();
		print();
	}

	public void calcDistance()
	{
		double dxOne = (double)xOne;
		double dyOne = (double)yOne;
		double dxTwo = (double)xTwo;
		double dyTwo = (double)yTwo;
		
		double diffX = dxTwo - dxOne;
		double diffY = dyTwo - dyOne;
		
		distance = sqrt(Math.pow(Math.abs(diffX), 2)+ Math.pow(Math.abs(diffY), 2));
	}

	public void print( )
	{
		System.out.print("distance == ");
		System.out.printf("%.3f\n", distance);
		System.out.println();
	}
}