package unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File(System.getProperty("user.dir") + "\\src\\unit14\\lab24d.dat"));
		int games = file.nextInt();
		file.nextLine();
		
		String game;
		
		TicTacToe t;
		for (int i = 1; i <= games; i++){
			game = file.nextLine();
			t = new TicTacToe(game);
			System.out.println(t);
		}

	}
}


