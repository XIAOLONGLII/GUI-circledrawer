package circledrawer;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NorthJP extends JPanel implements ActionListener{
	
	
	private int counter = 0;
	Color [] colors ={Color.YELLOW, Color.GREEN, Color.RED, Color.CYAN, Color.ORANGE,Color.PINK, Color.BLUE};
	

private Color jpColor = Color.BLUE;
private JLabel jl = new JLabel("I am a label");
JButton jb = new JButton("I am a button");

public NorthJP(){
	jl.setText("I can be colored");
	jb.setText("click me");
	jb.addActionListener(this);
	add(jl);
	add(jb);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//setBackground(jpColor);
		
		 	//change the color each time that panel was clicked
		    jpColor=colors[counter % colors.length];
			counter++;
			setBackground(jpColor);
		 
	
	
}

public void setJPColor(Color c){
	jpColor = c;
	
}

public void setHeading(String s){
	jl.setText(s);
}
public void setButtonText(String s){
	jb.setText(s);
}

}
