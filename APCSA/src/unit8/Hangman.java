package unit8;
import java.lang.Math;
import java.util.Scanner;
import java.lang.Object;

//Randomly choose word

//Check if input letter is found in word and fill in

//If letter was already typed, print message

//If wrong letter, add to counter and print message

//The word is ____. You missed _ times.

//Do you want to guess another word? y or n

public class Hangman {
	
	static String[] words = {"awesome","yogurt","world","treehouse"};
	
	static String currentWord = "";
	static String hiddenWord = "";
	static String guessLetter = "";
	static char guessChar = ' ';
	
	static int fails = 0;
	static boolean playAgain = true;
	
	public static void main(String[] args) {
	final StringBuffer newBuffer;
		
		Scanner keyboard = new Scanner(System.in);
		while (playAgain != false){
			chooseWord();
			hideWord();
			while (hiddenWord.indexOf('*') >= 0){
				System.out.print("(Guess) Enter a letter in word ");
				System.out.print(letterFound(guessLetter));
				guessLetter = keyboard.next();
				letterFound(guessLetter);
			}
			
			if (hiddenWord.equals(currentWord)){
				System.out.println("The word is " + currentWord + ". You missed " + fails + " time(s).");
				checkContinue();
			}
		}		
	}
	
	public static void chooseWord(){
		int choose = (int)(Math.random()*4);
		currentWord = words[choose];
	}
	
	public static void hideWord(){
		hiddenWord = "";
		for (int i = 0; i <= currentWord.length()-1; i++){
			hiddenWord += "*";
		}
	}

	public static StringBuffer letterFound(String let){		
		StringBuffer buffer = new StringBuffer(hiddenWord);
		for (int j = 0; j <= currentWord.length()-1; j++){
			if (currentWord.substring(j, j+1).equals(let)){
				guessChar = currentWord.charAt(j);
				buffer.setCharAt(j, guessChar);
			}
		}
		
		if (currentWord.indexOf(guessChar)<0){
			System.out.println(guessLetter + " is not in the word");
			fails += 1;
		}
		
		for (int h = 0; h <= currentWord.length()-1; h++){
			if (hiddenWord.substring(h,h+1).equals(guessLetter)){
				System.out.println(guessLetter + " is already in the word");
			}
		}
		return buffer;
	}
	
	public static void checkContinue(){
		Scanner keyboard2 = new Scanner(System.in);
		System.out.println("Do you want to guess another word? Enter y or n: ");
		String yesOrNo = keyboard2.next();
		if (yesOrNo == "y"){
			playAgain = true;
		}
		
		if (yesOrNo == "n"){
			playAgain = false;
		}
	}
}
