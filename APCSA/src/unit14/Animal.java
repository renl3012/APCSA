package unit14;

public abstract class Animal {
	
	public int food = 0;
	
	
	public int eat(int foodWeight){
		food += foodWeight;
		return food;
	}
	
	public abstract String noise();
}
