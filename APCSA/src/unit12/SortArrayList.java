package unit12;

import java.util.ArrayList;
import java.lang.Number;

public class SortArrayList {

	public static ArrayList<Number> myList = new ArrayList<Number>();
	
	public SortArrayList(ArrayList<Number> list){
		myList = list;
	}
	
	public static void sort (ArrayList<Number> list){
		int placeholder;
		int count;
		myList = list;
		boolean inOrder = false;
		while (inOrder == false){
			count = 0;
			for(int i = 0; i < list.size()-1; i++){
				if ((int)list.get(i) > (int)list.get(i+1)){
					placeholder = (int)list.get(i);
					list.set(i,list.get(i+1));
					list.set(i+1, placeholder);
				}
			}
			for (int i = 0; i < list.size()-1; i++){
				if((int)list.get(i) <= (int)list.get(i+1)){
					count += 1;
				}
			}
			if (count == list.size()-1){
				inOrder = true;
			}
		}
			
	}
	
	public String toString(){
		String output = "";
		for (int i = 0; i < myList.size(); i++){
			output += myList.get(i) + "\n";
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Number> a = new ArrayList<Number>();
		a.add(9);
		a.add(0);
		a.add(57);
		a.add(3);
		a.add(11);
		a.add(4);
		
		SortArrayList s = new SortArrayList(a);
		SortArrayList.sort(a);
		
		System.out.println(s);
	}

}
