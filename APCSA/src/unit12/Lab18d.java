package unit12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		
		Scanner file = new Scanner(new File(System.getProperty("user.dir")+ "\\src\\unit12\\lab18d.dat"));

		int size = file.nextInt();
		Word[] bank = new Word[size];
		file.nextLine();
		int spot = 0;
		while (file.hasNextLine()){
			for (int i = 0; i < size; i++){
				bank[spot] = new Word(file.nextLine());
				spot++;
			}
		}

		Arrays.sort(bank);

		for (int i = 0; i < bank.length; i++){
			System.out.println(bank[i]);
		}

	}
}