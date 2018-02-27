package unit8;

import java.util.Scanner;

public class Grade2Runner {

	public static void main(String[] args) {
		//add test cases	
		
		Grades2 myGradebook = new Grades2(5, "100 90 85 72.5 95.6");
		myGradebook.setGrades(3, "50.0 100.0 80.0");
		myGradebook.setGrades(3, "93.4 -90.0 90.0");
		myGradebook.setGrades(9, "1 2 3 4 5 6 7 8 9");
		
	}

}
