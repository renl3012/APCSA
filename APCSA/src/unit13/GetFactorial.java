package unit13;

public class GetFactorial {
	
	private static int total = 1;
	
	public void solve(int num){
		total = total * num * (num - 1);
		if (num >= 3){
			solve(num-2);
		}
		System.out.println("Total: " + total);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetFactorial g = new GetFactorial();
		g.solve(10);
		System.out.println(total);
	}

}
