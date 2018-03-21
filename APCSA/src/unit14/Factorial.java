package unit14;

public class Factorial {

	private static int number;
	
	public Factorial (int num){
		number = num;
	}
	
	public static int solve(int num){
		int total = 1;
		for (int i = number; i >= 1; i--){
			total = total*i;
		}
		return total;
	}
	
	public String toString(){
		String output = number + "! = " + solve(number);
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f = new Factorial(10);
		System.out.println(f);
	}

}
