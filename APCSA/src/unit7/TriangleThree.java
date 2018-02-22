package unit7;

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
		size = count;
		letter = let;
		setTriangle(size, letter);
	}

	public void setTriangle(int sz, String let)
	{
		for (int i = 1; i <= sz; i++){
			String line = "";
			for (int a = 1; a <= sz - i; a++){
				line = line + " ";
			}
			for (int b = sz-i; b < sz; b++){
				line += let;
			}
			
		out.println(line);
		}
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		return output+"\n";
	}
}