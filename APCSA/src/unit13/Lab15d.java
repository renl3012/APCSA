package unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		String sentence;
		int times;
		int done = 0;
		
		Scanner file = new Scanner(new File(System.getProperty("user.dir")+ "\\src\\unit13\\lab15d.dat"));
		
		times = file.nextInt();
		file.nextLine();
		sentence = file.nextLine();
		
		FancyWords f = new FancyWords(sentence);
		System.out.println(f);
		done += 1;
		
		while (done < times){
			sentence = file.nextLine();
			f = new FancyWords(sentence);
			System.out.println(f);
			done++;
		}
		
		file.close();
	}
}