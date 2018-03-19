package unit13;

import java.util.Arrays;
import java.util.Timer;

public class CountHundred {
	public int[] array;
	public CountHundred(int[] ray){
		array = ray;
		Arrays.sort(array);
	}
	
	public int linearSearch(int[] ray, int toFind){
		int count = 0;
		for (int spot = 0; spot < ray.length; spot++){
			if(ray[spot]==toFind){
				count += 1;
			}
		}
		return count;
	}
	
	public int binarySearch(int[] ray, int toFind){
		int count = 0;
		while (Arrays.binarySearch(ray, toFind) > -1){
			count += 1;
			array[Arrays.binarySearch(ray, toFind)] = -1;
		}
		return count;
	}
	
	public String toString(){
		String output = "";
		for(int i = 1; i <= 100; i++){
			output += i + ": " + binarySearch(array, i) + "\n";
		}
		return output;
	}
}
