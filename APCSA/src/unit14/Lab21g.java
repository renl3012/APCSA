package unit14;

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter a = new AtCounter();
		a.countAts(0, 0);
		System.out.println(a.getAtCount());
		a.printMatrix();
		a.reset();
		
		//AtCounter a2 = new AtCounter();
		a.countAts(2, 5);
		System.out.println(a.getAtCount());
		a.printMatrix();
		a.reset();
		
		//AtCounter a3 = new AtCounter();
		a.countAts(5, 0);
		System.out.println(a.getAtCount());
		a.printMatrix();
		a.reset();
		
		//AtCounter a4 = new AtCounter();
		a.countAts(9, 9);
		System.out.println(a.getAtCount());
		a.printMatrix();
		a.reset();
		
		//AtCounter a5 = new AtCounter();
		a.countAts(3, 9);
		System.out.println(a.getAtCount());
		a.printMatrix();
		a.reset();
	}
}