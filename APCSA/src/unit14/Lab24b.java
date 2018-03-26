package unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File (System.getProperty("user.dir") + "\\src\\unit14\\lab24b.dat"));
		int size = file.nextInt();
		file.nextLine();
		
		FancyWord2 f;
		for(int i = 0; i<size; i++)
		{
			String word = file.next();
			f = new FancyWord2(word);
			System.out.println(f);

	   }
	}
}