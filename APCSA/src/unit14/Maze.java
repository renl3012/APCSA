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
		printMatrix();
	}

	public boolean hasExitPath(int r, int c)
	{
		if (((r >= 0 && r < maze.length) && (c >= 0 && c < maze.length)) && (maze[r][c] == 1)){
			maze[r][c] = 3;
			if(c == maze.length-1){
				return true;
			}else{
				if (r+1 < maze.length && maze[r+1][c] == 1){
					//System.out.println("down" + c);
					//printMatrix();
					if (hasExitPath(r+1,c) == true){
						return true;
					}
				}
				if (r-1 >= 0 && maze[r-1][c] == 1){
					//System.out.println("up" + c);
					//printMatrix();
					if (hasExitPath(r-1,c) == true){
						return true;
					}
				}
				if (c+1 < maze.length && maze[r][c+1] == 1){
					//System.out.println("right" + c);
					//printMatrix();
					if (hasExitPath(r, c+1) == true){
						return true;
					}
				}
				if (c-1 >= 0 && maze[r][c-1] == 1){
					//System.out.println("left" + c);
					//printMatrix();
					if (hasExitPath(r, c-1) == true){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public void printMatrix(){
		for (int i = 0; i < maze.length; i++) {
		    for (int j = 0; j < maze[i].length; j++) {
		        System.out.print(maze[i][j] + " ");
		    }
		    System.out.println();
		}
	}
	public String toString()
	{
		String output="";

		if (hasExitPath(0,0) == true){
			output = "exit found\n";
			return output;
		}

		output = "exit not found\n";
		return output;
	}
}