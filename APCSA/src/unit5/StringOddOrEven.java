package unit5;

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		word = "";
	}

	public StringOddOrEven(String s)
	{
		setString(s);
		isEven();
		toString();
	}

	public void setString(String s)
	{
		word = s;

	}

 	public boolean isEven()
 	{
 		if (word.length() % 2 == 0){
 			return true;
 		}
 		
		return false;
	}
 	

 	public String toString()
 	{
 		String output= "";
 		
 		if (isEven())
 			output += word + " is even";
 		else{
 			output += word + " is odd";
 		}
 		
 		return output;
	}
}