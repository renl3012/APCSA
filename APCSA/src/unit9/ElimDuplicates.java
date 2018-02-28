package unit9;

public class ElimDuplicates {
	static int[] newList;
	
	public ElimDuplicates(int[] list){
		newList = new int[list.length];
		eliminateDuplicates(list);
		toString();
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		int count = 1;
		newList[0] = list[0];
		for (int a = 1; a < list.length; a++){
			for (int b = 0; b < count; b++){
				if (newList[b] == list[a]) break;
				if (b == count - 1) {
					newList[count] = list[a];
					count++;
					break;
				}
			}
		}
		int[] store = newList.clone();
		newList = new int[count];
		for (int i = 0; i < count; i++) {
			newList[i] = store[i];
		}
		return newList;
	}
	
	public String toString(){
		String output = "The distinct numbers are: ";
		for (int b = 0; b < newList.length; b++){
			output += newList[b];
			output += " ";
		}
		return output;
	}
}
