package unit14;

import java.lang.Math;

public class EvenOnes {

	public static void main(String[] args) {
		int[][] grid = new int[6][6];
		
		for (int a = 0; a <= 5; a++){
			for (int b = 0; b <= 5; b++){
				grid[a][b] = (int) (Math.random()*2);
			}
		}
		
		//Prints matrix
		for (int i = 0; i <= 5; i++) {
		    for (int j = 0; j <= 5; j++) {
		        System.out.print(grid[i][j] + " ");
		    }
		    System.out.println();
		}
		
		int oneCount = 0;
		for (int c = 0; c <= 5; c++){
			oneCount = 0;
			for (int d = 0; d <= 5; d++){
				if (grid[c][d] == 1){
					oneCount +=1;
				}
			}
			System.out.print("Row "+ c + ": ");
			if(oneCount%2 == 0){
				System.out.print("even");
			}else{
				System.out.print("odd");
			}
			System.out.println("");
			
		}
		System.out.println("");
		
		int columnCount = 0;
		for (int c = 0; c <= 5; c++){
			columnCount = 0;
			for (int d = 0; d <= 5; d++){
				if (grid[d][c] == 1){
					columnCount +=1;
				}
			}
			System.out.print("Column "+ c + ": ");
			if(columnCount%2 == 0){
				System.out.print("even");
			}else{
				System.out.print("odd");
			}
			System.out.println("");
			
		}
	}

}
