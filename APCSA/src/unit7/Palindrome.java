package unit7;
import java.util.Scanner;

public class Palindrome {
	static int number;
	// Return the reversal of an integer, i.e., reverse(456) returns 654 public static int reverse(int number) 
	public static int getReverse()
	{
		int rev=0;
		
		int num = number;
		
		while (num > 0){
			rev = rev * 10 + num % 10;
			num = num/10;
		}
		
		return rev;
	}

	// Return true if number is a palindrome 
	public static boolean isPalindrome(int number) {
		if (number == getReverse()){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		number = keyboard.nextInt();
		
		System.out.println(isPalindrome(number));
	}

}
