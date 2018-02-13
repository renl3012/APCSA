package unit6;

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;

	public LoopStats()
	{
		start = 0;
		stop = 0;

	}

	public LoopStats(int beg, int end)
	{
		setNums(beg, end);

	}

	public void setNums(int beg, int end)
	{
		start = beg;
		stop = end;
		System.out.println(toString());
		getTotal();
		System.out.println(getTotal());
		getEvenCount();
		System.out.println(getEvenCount());
		getOddCount();
		System.out.println(getOddCount());
	}

	public int getEvenCount()
	{
		int evenCount=0;
		for (int a = start; a <= stop; a++){
			if (a%2 == 0){
				evenCount += 1;
			}
		}

		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;
		for (int b = start; b <= stop; b++){
			if (b%2 != 0){
				oddCount += 1;
			}
		}

		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
		for (int c = start; c<=stop; c++){
			total += c;
		}

		return total;
	}
	
	public String toString()
	{
		return start + " " + stop;
	}
}