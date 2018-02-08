package unit2;

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
		print();
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		//add code to convert fahrenheit to celsius
		celsius = (fahrenheit - 32)*5/9;
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.printf("%.2f", fahrenheit);
		System.out.print(" degrees Fahrenheit == ");
		System.out.printf("%.2f", getCelsius());
		System.out.println(" degrees Celsius");
	}
}