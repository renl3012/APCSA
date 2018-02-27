package unit9;
import java.util.Scanner;

public class ElimDupTester {

	static int[] numbers = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2}; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		System.out.println("Enter ten numbers: ");
		Scanner keyboard = new Scanner(System.in);
		String numList = keyboard.nextLine();
*/		
		
		ElimDuplicates test = new ElimDuplicates(numbers);
		System.out.println(test);
	}

}
