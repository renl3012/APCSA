package unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		
		Scanner file = new Scanner(new File(System.getProperty("user.dir") + "//src//unit14//lab21i.dat"));
		int size = file.nextInt();
		String line = file.nextLine();
		Maze m = new Maze(size, line);
	}
}