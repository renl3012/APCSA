package Unit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      upperBody(window);
      lowerBody(window);
      //call other methods
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 150);

      window.setColor(Color.GREEN);
      window.fillOval(350, 150, 25, 25);
      window.fillOval(450, 150, 25, 25);
      
      window.setColor(Color.BLACK);
      window.fillOval(400, 175, 50, 25);
    		  
      window.setColor(Color.RED);
      window.drawArc(360, 150, 100, 70, 0, -180);
		//add more code here
				
   }

   public void upperBody( Graphics window )
   {
	   window.setColor(Color.BLUE);
	   window.fillRect(300, 280, 200, 100);
		//add more code here
	   window.setColor(Color.YELLOW);
	   window.drawRect(300, 280, 200, 100);
	   
	   window.setColor(Color.BLACK);
	   window.drawLine(300, 280, 200, 200);
	   window.drawLine(500, 280, 600, 200);
   }

   public void lowerBody( Graphics window )
   {
	   window.setColor(Color.GRAY);
	   window.fillRect(300, 420, 200, 100);
		//add more code here
	   window.setColor(Color.YELLOW);
	   window.drawRect(300, 420, 200, 100);
	   
	   window.setColor(Color.BLACK);
	   window.drawLine(300, 280, 200, 200);
	   window.drawLine(500, 280, 600, 200);
   }
}