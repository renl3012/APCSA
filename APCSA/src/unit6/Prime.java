package unit6;

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
		number = 0;

	}

	public Prime(int num)
	{
		setPrime(num);
	}

	public void setPrime(int num)
	{
		number = num;
		isPrime();
		System.out.println(toString());
	}

	public boolean isPrime()
	{
		for (int a = 2; a <= Math.sqrt(number); a++){
			if (number % a == 0){
				return false;
			}
		}
		return true;
	}

	public String toString()
	{
		String output="";
		output += number;
		if (isPrime() == true){
			output += " is prime.";
		}
		else{
			output += " is not prime.";
		}
		return output;
	}
}