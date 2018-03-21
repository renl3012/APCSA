package unit14;

import java.util.Scanner;

public class LargestTester {

	public static void main(String[] args) {
		int[] ray = {534, 3, 12, 40, 9, 1400, 24, 180};
		Largest l = new Largest (ray);
		//System.out.println(l.findLargest(0, 1));
		
		int[] userList = new int[8];
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i <= 7; i++){
			System.out.println("Enter item " + i + ":");
			userList[i] = keyboard.nextInt();
		}
		
		Largest large = new Largest(userList);
		System.out.println(large.findLargest(0, 1));
	}

}
