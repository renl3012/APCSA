package unit7;
import java.util.Scanner;
import java.lang.Math;

public class journal1 {

	public static void main(String[] args) {
		System.out.println("Enter an integer: ");
		Scanner keyboard = new Scanner(System.in);
		int number = keyboard.nextInt();
		String binary = "";
		
		for (int a = 7; a >= 0; a--){
			if (Math.pow(2, a) <= number){
				binary += "1";
				number = (int) (number - Math.pow(2, a));
			}
			else {
				binary += "0";
			}
			}
		
		System.out.println(binary);
		}
}
