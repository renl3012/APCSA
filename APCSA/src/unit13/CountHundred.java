package unit13;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Timer;

public class CountHundred {
	public static int[] array;
	public CountHundred(int[] ray){
		array = ray;
		Arrays.sort(array);
	}
	
	public static void linearSearch(int[] ray, int toFind){
		int count = 0;
		long start = System.currentTimeMillis();
		for (int spot = 0; spot < ray.length; spot++){
			if(ray[spot]==toFind){
				count += 1;
			}
		}
		long end = System.currentTimeMillis();
		long time = end-start;
		System.out.println(toFind + ": " + count + " Time: " + time);
	}
	
	public static void binarySearch(int[] ray, int toFind){
		int count = 0;
		long start = System.currentTimeMillis();
		
		while (Arrays.binarySearch(ray, toFind) >= 0){
			count += 1;
			array[Arrays.binarySearch(ray, toFind)] = 0;
			System.out.println(Arrays.toString(array));
		}
		
		long end = System.currentTimeMillis();
		long time = end-start;
		System.out.println(toFind + ": " + count + " Time: " + time);
	}
	
	public static void main(String[] args){
		int[] check = new int[100];
		int[] check2 = new int[100];
		
		for(int i = 0; i <= 99; i++){
			check[i] = 1 + (int)(Math.random()*100);
		}
		CountHundred c = new CountHundred(check);
		System.out.println(Arrays.toString(check));
		
		for(int i = 1; i <= 100; i++){
			binarySearch(array,i);
		}
		
		
		for(int i = 0; i <= 99; i++){
			check2[i] = 1 + (int)(Math.random()*100);
		}
		CountHundred c2 = new CountHundred(check2);
		System.out.println(Arrays.toString(check2));
		for(int i = 1; i <= 100; i++){
			linearSearch(array,i);
		}

	}
	/*public String toString(){
		String output = "";
		
		for(int i = 1; i <= 100; i++){
			
			output += i + ": " + binarySearch(array, i) + "\n";
		}
		return output;
	}*/
}
