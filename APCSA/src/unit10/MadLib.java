package unit10;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		


	}

	public MadLib(String fileName)
	{
		//load stuff
		nouns = new ArrayList();
		loadNouns();
		
		verbs = new ArrayList();
		loadVerbs();
		
		adjectives = new ArrayList();
		loadAdjectives();
		
		try{
			Scanner file = new Scanner(new File(fileName));
			
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\unit10\\nouns.dat"));
			while(file.hasNextLine()){
				nouns.add(file.nextLine());
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
	
			Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\unit10\\verbs.dat"));
			while(file.hasNextLine()){
				verbs.add(file.nextLine());
			}
	
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\unit10\\adjectives.dat"));
			while(file.hasNextLine()){
				adjectives.add(file.nextLine());
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public String getRandomVerb()
	{
		String word = "";
		int r = (int)(Math.random()*verbs.size());
		word = verbs.get(r);
		return word;
	}
	
	public String getRandomNoun()
	{
		
		String word = "";
		int r = (int)(Math.random()*nouns.size());
		word = nouns.get(r);
		return word;
	}
	
	public String getRandomAdjective()
	{
		
		String word = "";
		int r = (int)(Math.random()*adjectives.size());
		word = adjectives.get(r);
		return word;
	}		

	public String toString()
	{
		
		String output = "";
		return output + "\n\n\n";
	}
}