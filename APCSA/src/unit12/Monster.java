package unit12;

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster(){

	}


	//write an initialization constructor with an int parameter ht
	public Monster(int ht){
		myHeight = ht;
	}


	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt){
		myHeight = ht;
		myWeight = wt;
	}



	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age){
		myHeight = ht;
		myWeight = wt;
		myAge = age;
	}


	//modifiers - write set methods for height, weight, and age
	public void setHeight(int ht){
		myHeight = ht;
	}
	
	public void setWeight(int wt){
		myWeight = wt;
	}
	
	public void setAge(int age){
		myAge = age;
	}
	
	//accessors - write get methods for height, weight, and age
	public int getHeight(int ht){
		return myHeight;
	}
	
	public int getWeight(int wt){
		return myWeight;
	}
	
	public int getAge(int age){
		return myAge;
	}
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster();
	}

	public boolean equals( Object obj )
	{
		if(this.compareTo(obj) == 0){
			return true;
		}
		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if (rhs)




		return -1;
	}

	//write a toString() method
	
	
}