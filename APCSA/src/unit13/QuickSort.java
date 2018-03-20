package unit13;

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;
	private Comparable[] ray;


	public static void quickSort(Comparable[] ray){
		passCount = 0;
		quickSort(ray, 0, ray.length-1);
	}
	private static void quickSort(Comparable[] ray, int low, int high)
	{
		if(low < high){
			int split = partition(ray, low, high);
			System.out.println("Pass " + passCount + ": " + Arrays.toString(ray));
			passCount++;
			quickSort(ray, low, split);
			quickSort(ray, split+1, high);
		}

	}

	private static int partition(Comparable[] ray, int low, int high)
	{
		Comparable pivot = ray[low];
		int bot = low - 1;
		int top = high + 1;

		while (bot < top){
			while (ray[--top].compareTo(pivot) > 0);
			while (ray[++bot].compareTo(pivot) < 0);
				if (bot >= top){
					return top;
				}
				Comparable temp = ray[bot];
				ray[bot] = ray[top];
				ray[top] = temp;

		}
		return 0;
	}
}