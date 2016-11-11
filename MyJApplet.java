package circledrawer;

import java.awt.BorderLayout;

import javax.swing.JApplet;

public class MyJApplet extends JApplet{
	
	public void init(){
		setSize(500, 500);
		WestJP jpw = new WestJP();
		add(jpw, BorderLayout.WEST);
		
		EastJP jpe = new EastJP();
		add(jpe, BorderLayout.EAST);
		
		NorthJP jpn = new NorthJP();
		add(jpn, BorderLayout.NORTH);
		
		//CircleDrawer jpc = new CircleDrawer();
		TypingAndDrawing jpc = new TypingAndDrawing();
		add(jpc, BorderLayout.CENTER);
	}
}
