package unit2;

import java.util.Scanner;

public class RunwayLength {
	float acceleration;
	float velocity;
	public RunwayLength(){
		
	}
	public RunwayLength(float acc, float vel){
		
	}
	public void setInfo(){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter speed: ");
		velocity = keyboard.nextFloat();
		System.out.print("Enter acceleration: ");
		acceleration = keyboard.nextFloat();
		calculateRunway();
		print();
	}
	public double calculateRunway(){
		double runway = Math.pow(velocity, 2)/(2*acceleration);
		return runway;
	}
	public void print(){
		System.out.print("The minimum runway length for this airplane is: ");
		System.out.printf("%.3f", calculateRunway());
	}
}
