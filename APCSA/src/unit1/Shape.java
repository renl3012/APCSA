package unit1;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);
      
      //draw whatever you want
      window.setColor(Color.PINK);
      window.fillOval(xPos, yPos, width, height);

      //second shape
      window.setColor(Color.GREEN);
      window.fillRect(xPos-150, yPos-50, width, height/4);
      window.setColor(Color.BLUE);
      window.fillRect(xPos-150, yPos-80, width, height/4);
      window.setColor(Color.BLACK);
      window.fillOval(xPos-150, yPos-150, width/3, height*2);
      
      //third shape
      window.setColor(Color.ORANGE);
      window.drawArc(400, 300, 100, 100, 0, 90);
      window.drawArc(400, 350, 100, 100, 0, 90);
      window.drawArc(400, 400, 100, 100, 0, 90);
      window.drawLine(500, 300, 450, 475);
      window.setColor(Color.CYAN);
      window.fillRect(500, 300, 10, 150);
   }

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}