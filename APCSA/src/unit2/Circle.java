package unit2;

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
		calculateArea();
		print();
	}

	public void calculateArea( )
	{
		area = 3.14159 * java.lang.Math.pow(radius, 2);
	}

	public void print( )
	{
		System.out.println("The area is:: " + area);
	}
}