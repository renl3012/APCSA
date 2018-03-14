package unit12;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File(System.getProperty("user.dir")+ "\\src\\unit12\\lab18e.dat"));

		int size = file.nextInt();
		WordE[] bank = new WordE[size];
		file.nextLine();
		int spot = 0;
		while (file.hasNextLine()){
			for (int i = 0; i < size; i++){
				bank[spot] = new WordE(file.nextLine());
				spot++;
			}
		}

		Arrays.sort(bank);

		for (int i = 0; i < bank.length; i++){
			System.out.println(bank[i]);
		}

	}
}