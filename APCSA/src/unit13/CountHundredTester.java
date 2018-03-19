package unit13;

import java.util.Arrays;
import java.lang.Math;


public class CountHundredTester {
	
	public static void main(String[] args){
		int[] check = new int[100];
		
		for(int i = 0; i <= 99; i++){
			check[i] = 1 + (int)(Math.random()*100);
		}
		
		CountHundred c = new CountHundred(check);
		System.out.println(Arrays.toString(check));
		System.out.println(c);
	}
}
