package circledrawer;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class CircleDrawer extends JPanel implements MouseListener, MouseMotionListener{

	private static boolean drawShapes = false;
	private static Color circleColor = Color.BLUE;
	private static int circleSize = 25;
	private static int penSize = 1;
	private static Color penColor = Color.BLUE;

	protected int lastX=0, lastY=0;
	
	public CircleDrawer(){
		addMouseListener(this);
	    addMouseMotionListener(this);
	}
	public void record(int x, int y){
		lastX = x;
		lastY = y;
	}
	public static boolean getDrawShapesStatus(){
		return drawShapes;
	}
	public static void setShapeStatus(boolean b){
		drawShapes = b;
	}
	public static Color getCircleColor(){
		return circleColor;
	}
	public static int getCircleSize(){
		return circleSize;
	}
	public static void setCircleColor(Color c){
		circleColor = c;
	}
	
	public static void setCircleSize(int r){
		circleSize =r;
	}
	public static void setPenSize(int s){
		penSize = s;
	}
	public static void setPenColor(Color c){
		penColor = c;
	}
	public static int getPenSize(){
		return penSize;
	}
	public static Color getPenColor(){
		return penColor;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		record(x,y);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		record(x,y);
		//VIP
		if(drawShapes){
			Graphics g = getGraphics();
			g.setColor(circleColor);
			g.fillOval(e.getX()-circleSize, e.getY()-circleSize, circleSize*2, circleSize*2);
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	    requestFocus(); // Plan ahead for typing
	    record(e.getX(), e.getY());
	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		Graphics g = getGraphics();
		//g.setColor(getPenColor());  //using g2d instead so we can set the line thickness
		Graphics2D g2d = (Graphics2D) g;  //cast the Graphics object to Graphics2D for that purpose
		g2d.setColor(getPenColor());
		g2d.setStroke(new BasicStroke(getPenSize())); //used to set the thickness
		g2d.drawLine(lastX, lastY, x, y);
		//g.drawLine(lastX, lastY, x, y);  //using g2d instead so we can control the line thickness
		record(x,y);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
		


	

}

