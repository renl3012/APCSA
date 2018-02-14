package unit6;

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		LetterRemover myRemover = new LetterRemover("I am Sam I am", 'a');
		myRemover.setRemover("ssssssssxssssesssssesss", 's');
		myRemover.setRemover("abababababa", 'b');
		myRemover.setRemover("abaababababa", 'x');					
	}
}