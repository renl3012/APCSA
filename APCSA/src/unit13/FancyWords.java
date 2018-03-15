package unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;
	private String[] fancy;
	private String fragment = "";

	public FancyWords(String sentence)
	{
		System.out.println(sentence);
		
		Scanner s = new Scanner(sentence);
		int count = 0;
		while (s.hasNext()){
			count++;
			s.next();
		}	
		wordRay = new String[count];
		wordRay = sentence.split(" ");
		
		s.close();
		
		setWords(sentence);
	}

	public void setWords(String sentence)
	{
		String longest = "a";
		for (int i = wordRay.length-1; i >= 0; i--){
			if (wordRay[i].length() >= longest.length()){
				longest = wordRay[i];
			}
		}

		fancy = new String[longest.length()];
		for (int h = 0; h < longest.length(); h++){
			for (int i = wordRay.length-1; i >= 0; i--){//each word from right to left
				fragment += wordRay[i].substring(wordRay[i].length()-1, wordRay[i].length()); //picks letter
				wordRay[i] = wordRay[i].substring(0, wordRay[i].length()-1);
			}
			fancy[h] = fragment;
			fragment = "";
		}
		
	}

	public String toString()
	{
		String output="";
		//int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < fancy.length; i++){
			output += fancy[i] + "\n";
		}
		
		return output+"\n\n";
	}
}