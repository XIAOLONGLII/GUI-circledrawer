package circledrawer;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TypingAndDrawing extends CircleDrawer implements KeyListener{
	
	 private FontMetrics fm;
	 private static int fontSize = 20;
	 Font font = new Font("Serif", Font.BOLD, fontSize );//default font size	
	 private static Color fontColor = Color.BLUE;
	
	public TypingAndDrawing() {
		super();   
		setLayout(null);
	    setFont(font);
	    fm = getFontMetrics(font);
		addKeyListener(this);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("inside keyTyped");
		String s = String.valueOf(e.getKeyChar());

		System.out.println("String is "+s);
		Graphics g = getGraphics();
		g.setColor(fontColor);  //remember to create and call getFontColor
		g.drawString(s, lastX, lastY);
		record(lastX + fm.stringWidth(s), lastY);//to write one char to the right of the previouse
		System.out.println("last coords " + lastX + ", "+lastY);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
