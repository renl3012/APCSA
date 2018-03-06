package unit10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{

		fileName = "";


	}

	public Histogram(char[] values, String fName)
	{
		letters = new ArrayList();
		for (int i = 0; i <= values.length-1; i++){
			letters.add(values[i]);
		}
		count = new ArrayList();
		fileName = fName;
		try{
			//Scanner file = new Scanner(new File(System.getProperty("user.dir")+ "\\src\\unit10\\" + fName));
		}
		catch(Exception e){
			out.println("Houston we have a problem");
		}
		out.println("search letters = "+letters);
		toString();
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		try{
			Scanner file = new Scanner(new File(System.getProperty("user.dir")+ "\\src\\unit10\\" + fileName));
			String thisLine = "";
			for (int h = 0; h <= letters.size()-1; h++){
				count.add(h, 0);
			}
			while(file.hasNextLine()){
				thisLine = file.nextLine();
				for (int h = 0; h <= letters.size()-1; h++){
					for (int i = 0; i <= thisLine.length()-1; i++){
						if (thisLine.charAt(i) == letters.get(h)){
							count.set(h,count.get(h)+1);
						}
					}
				}
			}
		}
		catch(Exception e){
			out.println("Houston we have a problem with counting!");
		}
	}

	public char mostFrequent()
	{
		int largest = -100;
		int place = 0;
		for (int i = 0; i <= count.size()-1; i++){
			if (count.get(i) > largest){
				largest = count.get(i);
				place = i;
			}
		}
		return letters.get(place);
	}

	public char leastFrequent()
	{
		int smallest = 100;
		int place = 0;
		for (int i = 0; i <= count.size()-1; i++){
			if (count.get(i) < smallest){
				smallest = count.get(i);
				place = i;
			}
		}
		return letters.get(place);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}