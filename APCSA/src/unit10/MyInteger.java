package unit10;

public class MyInteger {

	static int value;
	
	public MyInteger(int val){
		value = val;
	}
	
	public int getInt(){
		return value;
	}

	public boolean isEven(){
		if (value%2 == 0){
			return true;
		}
		return false;
	}
	
	public boolean isOdd(){
		if (value%2 != 0){
			return true;
		}
		return false;
	}
	
	public boolean isPrime(){
		for (int i = 2; i < value; i++){
			if (value%i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int val){
		if (val%2 == 0){
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(int val){
		if (val%2 != 0){
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(int val){
		for (int i = 2; i < val; i++){
			if (val%i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger myInt){
		if (value%2 == 0){
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(MyInteger myInt){
		if (value%2 != 0){
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(MyInteger myInt){
		for (int i = 2; i < value; i++){
			if (value%i == 0){
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(int val){
		if (val == value){
			return true;
		}
		return false;
	}
	
	public boolean equals(MyInteger myInt){
		if (myInt.getInt() == value){
			return true;
		}
		return false;
	}
	
	public static int parseInt(char[] numList){
		int digit;
		int place = 1;
		int total = 0;
		for (int i = numList.length-1; i >= 0; i--){
			digit = (int)numList[i]-48;
			total += place * digit;
			place = place * 10;
		}
		return total;
	}
	
	public static int parseInt(String str){
		int digit;
		int place = 1;
		int total = 0;
		for (int i = str.length()-1; i >= 0; i--){
			digit = (int)(str.charAt(i)-48);
			total += place * digit;
			place = place * 10;
		}
		return total;
	}
	
	public static void main(String[] args) {
		char[] myChars = {'1', '2', '3'};
		
		MyInteger m = new MyInteger(23456);
		System.out.println(m.getInt());
		System.out.println(m.isEven());
		System.out.println(m.isOdd());
		System.out.println(m.isPrime());
		System.out.println(m.equals(1234));
		
		System.out.println(MyInteger.isEven(24));
		System.out.println(MyInteger.isOdd(24));
		System.out.println(MyInteger.isPrime(17));
		
		System.out.println(MyInteger.parseInt(myChars));
		System.out.println(MyInteger.parseInt("98765"));
	}

}
