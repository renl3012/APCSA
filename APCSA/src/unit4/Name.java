package unit4;
import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
		name = "";

	}

	public Name(String s)
	{
		setName(s);
		getFirst();
		getLast();
	}

   public void setName(String s)
   {
	   name = s;

   }

	public String getFirst()
	{
		String firstName = name.substring(0,name.indexOf(' '));
		return firstName;
	}

	public String getLast()
	{
		String lastName = name.substring(name.indexOf(' ')+1);
		return lastName;
	}

 	public String toString()
 	{
 		String fullName = getFirst() + " " + getLast();
 		return fullName;
	}
}