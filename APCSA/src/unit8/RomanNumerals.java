package unit8;

import static java.lang.System.*;
import java.util.Scanner;

public class RomanNumerals
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumerals(String str)
	{
		roman = str;
		setRoman(str);
	}

	public RomanNumerals(Integer orig)
	{

		number = orig;
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		roman = "";
		for (int a = 0; a <= 12; a++){
			while(NUMBERS[a] <= num){
				roman += LETTERS[a];
				num -= NUMBERS[a];
			}
		}
	}

	public void setRoman(String rom)
	{
		number = 0;
		int largest = 0;
		for (int i = rom.length() - 1; i >= 0; i--){
			String string = rom.substring(i, i+1);
			for (int j = 0; j <= 12; j++) {
				if (LETTERS[j].equals(string)) {
					if (NUMBERS[j] >= largest) {
						number+=NUMBERS[j];
						largest = NUMBERS[j];
					} else {
						number-=NUMBERS[j];
					}
					break;
				}
			}
		}
		
	}

	public Integer getNumber()
	{
		return number;
	}

	public String toString()
	{
		return roman + "\n";
	}
}