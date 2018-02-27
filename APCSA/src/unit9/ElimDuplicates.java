package unit9;

public class ElimDuplicates {
	static int[] newList = new int[10];
	
	public ElimDuplicates(int[] list){
		eliminateDuplicates(list);
		toString();
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		int position = 0;
		for (int a = 0; a < list.length; a++){
			for (int b = position + 1; b < newList.length; b++){
				if (newList[b] == list[a]){
				}
				else{
					newList[position] = list[a];
				}
			}
			position++;
		}
		return newList;
	}
	
	public String toString(){
		String output = "The distinct numbers are: ";
		for (int b = 0; b< newList.length; b++){
			output += newList[b];
			output += " ";
		}
		return output;
	}
}
