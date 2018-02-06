package Unit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval(210, 100, 400, 400);

		//add more code here
      window.setColor(Color.BLACK);
      window.fillOval(310, 200, 50, 50);
      window.fillOval(450, 200, 50, 50);
      window.drawArc(310, 300, 200, 100, 0, -180);
      

   }
}