//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot(){
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      head();
      upperBody();
      lowerBody();
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);

      window.setColor(Color.GREEN);
      window.fillOval(350, 125, 50, 50);
      window.fillOval(450, 125, 50, 50);
		
      window.setColor(Color.BLACK);
      window.fillOval(400, 150, 75, 25);
      
      window.setColor(Color.RED);
      window.drawArc(400, 175 , 150, 25, 0, 180);
   }

   public void upperBody( Graphics window )
   {
	   window.setColor(Color.YELLOW);
	   window.drawRect(350, 450, 100, 75);
	   
	   window.setColor(Color.BLUE);
	   window.fillRect(350, 450, 100, 75);
	   
	   window.setColor(Color.BLACK);
	   window.drawLine(350, 450, ,y2);
   }

   public void lowerBody( Graphics window )
   {

		//add more code here

   }
}