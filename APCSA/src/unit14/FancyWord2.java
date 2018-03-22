package unit14;

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord2
{
	private char[][] mat;

	public FancyWord2()
	{
		
	}

   public FancyWord2(String s)
	{
	   int top = s.length()-1;
	   int bot = 0;
	   
	   mat = new char[s.length()][s.length()];
	   
	   for (int i = 0; i < mat.length; i++) {
		    for (int j = 0; j < mat[i].length; j++) {
		        mat[i][j] = ' ';
		    }
	   }
	   
	   for(int h = 0; h < mat.length; h++){
		   mat[0][h] = s.charAt(h);
	   }
	   
	   for(int h = 0; h < mat.length; h++){
		   mat[s.length()-1][h] = s.charAt(h);
	   }
	   
	   int row = 1;
	   while(top - bot > 1){
		   top--;
		   bot++;
		   mat[row][bot] = s.charAt(bot);
		   mat[row][top] = s.charAt(top);
		   row++;
		   }

	   if (s.length()%2 == 0){
		   mat[row][bot] = s.charAt(bot);
		   mat[row][top] = s.charAt(top);
		   row++;
	   }
	   
	   while (top < mat.length-2 && bot > 0){
		   top++;
		   bot--;
		   mat[row][bot] = s.charAt(bot);
		   mat[row][top] = s.charAt(top);
		   row++;
	   }

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


		return output+"\n\n";
	}
}