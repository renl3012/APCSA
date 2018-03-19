package unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		int keeper = number;
		while (keeper > 0){
			keeper = keeper/10;
			count += 1;
		}
		
		return count;
	}
	
	@SuppressWarnings("null")
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		
		int digit = 0;
		int keeper = number;
		
		for (int i = 0; i < getNumDigits(number); i++){
			digit = keeper%10;
			sorted[i] = digit;
			keeper = keeper/10;
		}

		Arrays.sort(sorted);
		return sorted;
	}
}
