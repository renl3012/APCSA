package unit14;

public abstract class Dog extends Animal{
		
	public Dog(){
		String name = "Spot";
		String noise = "bark";
		System.out.println(super.eat(10));
	}
	
	public Dog(String n){
		String name = n;
		System.out.println(name + " says " + this.noise("woof") + ".");
	}
	
	public String noise(String s){
		return s;
	}
}
