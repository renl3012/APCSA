package unit14;

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{


	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		int keeper;
		int r = 0;
		int c = 0;
		for(int i = 0; i <= 8; i++){
			keeper = i;
			c = keeper%3;
			r = keeper/3;
			mat[r][c] = game.charAt(i);
		}
		

	}

	public String getWinner()
	{
		String output = "";
		//horizontal search
		for(int a = 0; a <= 2; a++){
			if (mat[a][0] == mat[a][1] && mat[a][1] == mat[a][2]){
				output = mat[a][0] + " wins horizontally!";
				return output;
			}
		}

		//vertical search
		for(int b = 0; b <= 2; b++){
			if (mat[0][b] == mat[1][b] && mat[1][b] == mat[2][b]){
				output = mat[0][b] + " wins vertically!";
				return output;
			}
		}

		//diagonal search
		if((mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2]) || (mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0])){
			output = mat[1][1] + " wins diagonally!";
			return output;
		}
		
		return "cat\'s game - no winner!";
	}

	public String toString()
	{
		String output="";

		for (int i = 0; i < mat.length; i++) {
		    for (int j = 0; j < mat[i].length; j++) {
		        output += mat[i][j] + " ";
		    }
		    output += "\n";
		}
		output += getWinner() + "\n";

		return output+"\n\n";
	}
}