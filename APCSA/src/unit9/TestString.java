package unit9;

public class TestString {

	public static void main(String[] args) {
		char[] word = {'h','e','l','l','o'};
		MyString1 test = new MyString1(word);
		System.out.println(test.charAt(2));
		System.out.println(test.length());
		System.out.println(test.toLowerCase());
	}

}
