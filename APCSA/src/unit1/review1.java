package unit1;

import java.awt.*;

import javax.swing.JFrame;

	class review1 extends Canvas{
		public void review1(){
			setSize(800,600);
			setBackground(Color.WHITE);
			setVisible(true);
		}
		public void paint (Graphics window){
			window.setColor(Color.BLUE);
			window.drawRect(100, 100, 7, 6);
			window.drawString("Width: 7, Height: 6", 100, 120);
			window.drawRect(100, 300, 11, 10);
			window.drawString("Width: 11, Height: 10", 100, 330);
		}

	public static void main(String[] args) {
		review1 Rectangle = new review1();
		JFrame frame = new JFrame();
		frame.add(Rectangle);
		frame.setSize(1000,700);
		frame.setVisible(true);
	}

}
