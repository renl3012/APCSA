package unit14;

import static java.lang.System.*;

import java.util.Arrays;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		int track;
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		if (((r >= 0 && r < atMat.length) && (c >= 0 && c < atMat.length)) && (atMat[r][c] == '@')){
			atMat[r][c] = '0';
			atCount += 1;
			if (r+1 < atMat.length){
				countAts(r+1,c);
			}
			if (r-1 >= 0){
				countAts(r-1,c);
			}
			if (c+1 < atMat.length){
				countAts(r, c+1);
			}
			if (c-1 >= 0){
				countAts(r, c-1);
			}
		}
		return atCount;
	}

	public void printMatrix(){
		for (int i = 0; i < atMat.length; i++) {
		    for (int j = 0; j < atMat[i].length; j++) {
		        System.out.print(atMat[i][j] + " ");
		    }
		    System.out.println();
		}
	}
	
	public void reset(){
		for (int i = 0; i < atMat.length; i++) {
		    for (int j = 0; j < atMat[i].length; j++) {
		        if(atMat[i][j] == '0'){
		        	atMat[i][j] = '@';
		        }
		    }  
		}
		System.out.println();
		atCount = 0;
	}
	
	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}