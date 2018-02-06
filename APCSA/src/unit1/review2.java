package unit1;

public class review2 {

	public static void main(String[] args) {
	String greeting = "Hello World!";
		String newGreeting = greeting.replaceAll("o","o1");
		newGreeting = newGreeting.replaceAll("e", "e1");
		newGreeting = newGreeting.replaceAll("o1","e");
		newGreeting = newGreeting.replaceAll("e1", "o");
		System.out.println(newGreeting);
	}
}
