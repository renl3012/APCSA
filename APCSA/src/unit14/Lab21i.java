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
		file.nextLine();
		String line = file.nextLine();
		Maze m = new Maze(size, line);
		System.out.println(m);
		
		while(file.hasNextLine()){
			size = file.nextInt();
			file.nextLine();
			line = file.nextLine();
			m = new Maze(size, line);
			System.out.println(m);
			//m.printMatrix();
		}
	}
}