package unit6;
import java.lang.Math;
import java.util.Random;

public class LicensePlate {
	public static void main(String[] args) {
		int c;
		int place;
		char digit;
		String license = "";
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String integers = "0123456789";
		Random r = new Random();
		for (c = 0; c < 3; c++){
			place = r.nextInt(26);
			digit = alphabet.charAt(place);
			license += (char)digit;
		}
		for (c = 3; c < 7; c++){
			place = r.nextInt(10);
			digit = integers.charAt(place);
			license += (char)digit;
		}
		System.out.println(license);

	}

}
