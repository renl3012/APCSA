package unit13;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;
import java.lang.Math;

class InsertionSort
{
	private ArrayList<String> list = new ArrayList<String>(); ;

	public InsertionSort()
	{

	}

	//modifiers
	public void add( String  word)
	{
		int loc = 0;
		if (list.isEmpty()){
			list.add(word);
		}else{
			if (Collections.binarySearch(list, word) < 0){
				loc = Math.abs(Collections.binarySearch(list, word));
				list.add(loc-1, word);
			}
		}
	}



	public void remove(String word)
	{
		int loc = 0;
		if (Collections.binarySearch(list, word)>=0){
			loc = Collections.binarySearch(list, word);
			if (loc >= 0){
				list.remove(loc);
			}
		}
		loc = 0;

	}

	public void sort(){
		
	}
	public String toString()
	{
		String output = "";
		for (int i = 0; i < list.size(); i++){
			output += list.get(i) + " ";
		}
		return output;
	}
}