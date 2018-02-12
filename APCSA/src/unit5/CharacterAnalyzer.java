package unit5;

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = ' ';

	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);
		isUpper();
		isLower();
		isNumber();
		toString();

	}

	public void setChar(char c)
	{
		theChar = c;

	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if (theChar >= 65 && theChar < 97){
			return true;
		}

		return false;
	}

	public boolean isLower( )
	{
		if (theChar >= 97){
			return true;
		}

		return false;
	}
	
	public boolean isNumber( )
	{
		if (theChar >= 0 && theChar < 65){
			return true;
		}
		return false;
	}	

	public int getASCII( )
	{
		int ascii = (int)theChar;
		return ascii;
	}

	public String toString()
	{
		if (isLower() == true){
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	 
		}
		
		if (isUpper() == true){
			return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
		}

		else{
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}

	}
}