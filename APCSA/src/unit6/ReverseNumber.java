package unit6;

import static java.lang.System.*;

public class ReverseNumber
{
   private int number;

	public ReverseNumber (int num) {
		setReverse(num);
	}
	
	public int setReverse (int num){
		number = num;
		System.out.println(num + " reversed is " + getReverse());
		return number;
	}


	public int getReverse()
	{
		int rev=0;
		
		int num = number;
		
		while (num > 0){
			rev = rev * 10 + num % 10;
			num = num/10;
		}
		
		return rev;
	}

	public String toString(){
		String statement = number + " reversed is " + getReverse();
		return statement;
	}
	
	
}