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
		if ((r >= 0 && r < atMat.length) && (c >= 0 && c < atMat.length)){
			if (atMat[r][c] == '@'){
				track = 0;
				atMat[r][c] = '0';
				if (r+1 >= 0 && r+1 < atMat.length){
					if (atMat[r+1][c] == '@'){
						atCount += 1;
						track += 1;
						System.out.println(atCount);
						countAts(r+1, c);
					}
				}
				
				if (r-1 >= 0 && r-1 < atMat.length){
					if (atMat[r-1][c] == '@'){
						atCount += 1;
						track += 1;
						System.out.println(atCount);
						countAts(r-1,c);
					}
				}
				
				if (c+1 >= 0 && c+1 < atMat.length){
					if (atMat[r][c+1] == '@'){
						atCount += 1;
						track += 1;
						System.out.println(atCount);
						countAts(r,c+1);
					}
				}
				
				if (c-1 >= 0 && c-1 < atMat.length){
					if (atMat[r][c-1] == '@'){
						atCount += 1;
						track += 1;
						System.out.println(atCount);
						countAts(r,c-1);
					}
				}
				
				if (track == 0){
					System.out.println(getAtCount());
					for (int i = 0; i < atMat.length; i++) {
					    for (int j = 0; j < atMat[i].length; j++) {
					        System.out.print(atMat[i][j] + " ");
					    }
					    System.out.println();
					}
					return atCount;
				}
			}
		}
		return 0;
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