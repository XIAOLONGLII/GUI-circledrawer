package circledrawer;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class EastJP extends JPanel implements ActionListener{

	
	JButton jbCyan = new JButton("cyan circle color");
	JButton jbGreen = new JButton("green circle color");
	JButton jbYellowPen = new JButton("yellow pen color");
	JButton jbRedPen = new JButton("red pen color");
	
	public EastJP(){
		setLayout(new GridLayout(4,1));
		setBackground(Color.YELLOW);
		jbCyan.addActionListener(this);
		jbGreen.addActionListener(this);
		jbYellowPen.addActionListener(this);
		jbRedPen.addActionListener(this);
		add(jbCyan);
		add(jbGreen);
		add(jbYellowPen);
		add(jbRedPen);
	}

	@Override
	public void actionPerformed(ActionEvent e) {/*
		if(e.getActionCommand().trim().equalsIgnoreCase("cyan circle color")){
			CircleDrawer.setCircleColor(Color.CYAN);
		}else if(e.getActionCommand().trim().equalsIgnoreCase("green circle color")){
			CircleDrawer.setCircleColor(Color.GREEN);
		}*/
		String lowActComm = e.getActionCommand().trim(); 
		switch(lowActComm){
		case  "cyan circle color":
			CircleDrawer.setCircleColor(Color.CYAN);
			break;
		case  "green circle color":
			CircleDrawer.setCircleColor(Color.GREEN);
			break;
		case  "yellow pen color":
			CircleDrawer.setPenColor(Color.YELLOW);
			break;
		case "red pen color":
			CircleDrawer.setPenColor(Color.RED);
			break;
		
		
		}
		
		
	}
}
