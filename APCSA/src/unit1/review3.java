package unit1;
import java.util.Random;

public class review3 {

	public static void main(String[] args) {
		Random dice = new Random();
		System.out.println(Math.abs(dice.nextInt())%6 + 1);
	}
}
