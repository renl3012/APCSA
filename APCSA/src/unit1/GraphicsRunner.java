package unit1;

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 1000;

	public GraphicsRunner()
	{
		super("Graphics Runner");
		
		setSize(WIDTH,HEIGHT);

		//getContentPane().add(new SmileyFace());
		
		//getContentPane().add(new BigHouse());		
		
		//getContentPane().add(new Robot());
		
		getContentPane().add(new ShapePanel());
		
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}