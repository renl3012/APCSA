package unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{
		

	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		Scanner s = new Scanner(line);
		for (int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				maze[i][j] = s.nextInt();
			}
		}
		
		for (int i = 0; i < maze.length; i++) {
		    for (int j = 0; j < maze[i].length; j++) {
		        System.out.print(maze[i][j] + " ");
		    }
		    System.out.println();
		}

	}

	public boolean hasExitPath(int r, int c)
	{
		
		return false;
	}

	public String toString()
	{
		String output="";

		



		return output;
	}
}