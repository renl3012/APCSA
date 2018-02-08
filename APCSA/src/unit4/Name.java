package unit4;

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
	}

	public Name(String s)
	{
		name = ""

	}

   public void setName(String s)
   {
	   setName(s);
	   getFirst();
	   getLast();

   }

	public String getFirst()
	{
		String firstName = name.substring(0,name.indexOf(' ')+1);
		return firstName;
	}

	public String getLast()
	{
		int limit = name.indexOf(' ');
		String lastName = name.substring(name.indexOf(' ')+1);
		return lastName;
	}

 	public String toString()
 	{
 		String fullName = getFirst() + " " + getLast();
 		return fullName;
	}
}