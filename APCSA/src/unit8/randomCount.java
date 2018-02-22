package unit8;

import java.lang.Math;

public class randomCount {
	
	
	public static void main(String[] args) {
		int[] generate = new int[10];
		double r;
		int digit;
		for (int i = 1; i <= 100; i++){
			r = Math.random();
			digit = (int)(r*10);
			
			generate[digit] += 1;
		}

		for (int a = 0; a <= 9; a++){
			System.out.print("The number of " + a + "\'s is: ");
			System.out.print(generate[a] + "\n");
		}
	}

}
