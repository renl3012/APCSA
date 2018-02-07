package unit3;

import java.util.Scanner;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a:: ");
		quadA = keyboard.nextInt();
		System.out.print("Enter b:: ");
		quadB = keyboard.nextInt();
		System.out.print("Enter c:: ");
		quadC = keyboard.nextInt();
		a = quadA;
		b = quadB;
		c = quadC;
		calcRoots();
		print();
 	}

	public void calcRoots( )
	{
		rootOne = (-b+sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		rootTwo = (-b-sqrt(Math.pow(b,2)-4*a*c))/(2*a);
	}

	public void print( )
	{
		String rootOnePrint = "";
		rootOnePrint += "rootone:: ";
		rootOnePrint += String.format("%.2f", rootOne);
		String rootTwoPrint = "";
		rootTwoPrint += ("roottwo:: ");
		rootTwoPrint += String.format("%.2f", rootTwo);
		
		System.out.println(rootOnePrint);
		System.out.println(rootTwoPrint);
		System.out.println();
	}
}