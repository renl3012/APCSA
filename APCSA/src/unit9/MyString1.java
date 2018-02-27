package unit9;
import java.lang.StringBuilder;

/*public MyString1(char[] chars); 
public char charAt(int index); 
public int length(); 
public MyString1 substring(int begin, int end); 
public MyString1 toLowerCase(); 
public boolean equals(MyString1 s); 
public static MyString1 valueOf(int i);
*/

public class MyString1 {
	String myString = "";
	static char[] myChars;

	public MyString1(char[] chars){
		myChars = chars;
		toString();
	}
	
	public char charAt(int index){
		return myChars[index];
	}
	
	public int length(){
		return myChars.length;
	}
	
	public MyString1 substring(int begin, int end){
		char[] temp = new char[end-begin];
		
		for (int i = begin; i < end; i++){
			temp[i-begin] = myChars[i];
		}
		
		MyString1 tryString = new MyString1(temp);
		return tryString;
	}
	
	public MyString1 toLowerCase(){
		char[] temp = new char[myChars.length];
		
		for (int z = 0; z < temp.length; z++){
			if (myChars[z] >= 65 && myChars[z] <= 90){
				temp[z] = (char)(32 + myChars[z]);
			}
		}
		MyString1 tryString = new MyString1(temp);
		return tryString;
	}
	
	public boolean equals(MyString1 s){
		int check = 0;
		for (int d = 0; d <= s.length(); d++){
			if (myChars[d] == s.charAt(d)){
				check += 1;
			}
			else{
				return false;
			}
		}
		if (check == myChars.length){
			return true;
		}
		return false;
	}
	
	public static MyString1 valueOf(int i){
		int digit = 0;
		int place = 0;
		int length = (int)(Math.log10(i)+1);
		char[] temp = new char[length];
		while (i > 0){
			digit = i % 10;
			temp[place] = (char)(digit + 48);
			i = i/10;
			place++;
		}
		MyString1 newString = new MyString1(temp);
		return newString;
	}
	
	public String toString(){
		String output = "";
		for(char c: myChars){
			output += c;
		}
		return output;
	}
}
