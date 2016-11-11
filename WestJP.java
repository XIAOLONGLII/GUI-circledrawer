package circledrawer;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class WestJP extends JPanel implements ActionListener{
	
	JButton jbSizeLg = new JButton(" circle size Large");
	JButton jbSizeSm = new JButton(" circle size Small");
	JButton jbShapesOn = new JButton("shapes on");
	JButton jbShapesOff = new JButton("shapes off");
	JButton jbThickPen = new JButton("thick pen");
	JButton jbThinPen = new JButton("fine pen");
	
	public WestJP(){
		setLayout(new GridLayout(6,1));
		setBackground(Color.ORANGE);
		jbSizeLg.addActionListener(this);
		jbSizeSm.addActionListener(this);
		jbShapesOn.addActionListener(this);
		jbShapesOff.addActionListener(this);
		jbThickPen.addActionListener(this);
		jbThinPen.addActionListener(this);
		
		add(jbSizeLg);
		add(jbSizeSm);
		add(jbShapesOn);
		add(jbShapesOff);
		add(jbThickPen);
		add(jbThinPen);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*if(e.getActionCommand().trim().equalsIgnoreCase("circle size large")){
			CircleDrawer.setCircleSize(50);
		}
		if(e.getActionCommand().trim().equalsIgnoreCase("circle size small")){
			CircleDrawer.setCircleSize(10);
		}
		*/
		String lowActComm = e.getActionCommand().trim().toLowerCase();
		
		switch(lowActComm){
		case "circle size large":
				CircleDrawer.setCircleSize(50);
				break;
		case "circle size small":
			CircleDrawer.setCircleSize(10);
			break;
		case "shapes on":
			CircleDrawer.setShapeStatus(true);
			break;
		case "shapes off":
			CircleDrawer.setShapeStatus(false);
			break;
		case "thick pen":
			CircleDrawer.setPenSize(9);
			break;
		case "fine pen":
			CircleDrawer.setPenSize(1);
			break;
		}
		
		
		
		
	}
	
}
