package unit7;
import static java.lang.System.*;
import java.lang.Math;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;
		setNum(num);
	}

	public void setNum(int num)
	{
		for (int a = 1; a <= number; a++){
			for (int b = 1; b <= number; b++){
				for (int c = 1; c <= number; c += 2){
					if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
						if (a%2 != 0 && b%2 == 0 && a < b||  a%2 == 0 && b%2 != 0 && a < b){
							if (a >= 2 && b >= 2 && c >= 2){
								if (greatestCommonFactor(a,b,c) <= 1){
									System.out.println(a+" "+b+" "+c);
								}
							}
						}
					}
				}
			}
		}
		
		
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		
		for (int i = c; i >= 2; i--){
			if (a%i == 0 && b%i == 0 && c%i == 0){
				return i;
			}
		}
		

		return 1;
	}

	public String toString()
	{
		String output= "";
		return output+"\n";
	}
}