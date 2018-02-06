package unit2;

public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{
		
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		calculateSlope();
		print();
	}

	public void calculateSlope( )
	{
		double yDiff = yTwo - yOne;
		double xDiff = xTwo - xOne;
		slope = yDiff/xDiff;
	}

	public void print( )
	{
		System.out.print("the slope is ");
		System.out.printf("%.2f\n", slope);
	}
}