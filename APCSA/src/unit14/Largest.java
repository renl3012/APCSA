package unit14;

public class Largest {
	
	private int[] list;
	private int largest;
	
	public Largest (int[] ray){
		list = ray;
	}
	
	public int findLargest(int a, int b){
		if (a == 0 && b == 1){
			if (list[a] >= list[b]){
				largest = list[a];
			}
			if (list[b] > list[a]){
				largest = list[b];
			}
		}
		
		if (list[a] >= list[b] && list[a] >= largest){
			largest = list[a];
		}
		else if (list[b] > list[a] && list[b] >= largest){
			largest = list[b];

		}
		
		if (b <= list.length-2){
			a += 1;
			b += 1;
			findLargest(a, b);
		}
		return largest;
	}
}
