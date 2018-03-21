package unit14;

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter a = new AtCounter();
		a.countAts(0, 0);
		
		AtCounter a2 = new AtCounter();
		a2.countAts(2, 5);
		
		AtCounter a3 = new AtCounter();
		a3.countAts(5, 0);
		
		AtCounter a4 = new AtCounter();
		a4.countAts(9, 9);
		
		AtCounter a5 = new AtCounter();
		a5.countAts(3, 9);
	}
}