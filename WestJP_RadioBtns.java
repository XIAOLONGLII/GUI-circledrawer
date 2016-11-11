package circledrawer;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class WestJP_RadioBtns extends JPanel implements ActionListener{
	
	ButtonGroup shapeSizeGroup = new ButtonGroup();
	JRadioButton jrbS1 = new JRadioButton();
	JRadioButton jrbS2 = new JRadioButton();
	JRadioButton jrbS3 = new JRadioButton();
	
	ButtonGroup penSizeGroup = new ButtonGroup();

	JRadioButton jrbP1 = new JRadioButton();
	JRadioButton jrbP2 = new JRadioButton();
	JRadioButton jrbP3 = new JRadioButton();

	
	
	public WestJP_RadioBtns(){
		setSize(200, 100);
		setLayout(new GridLayout(5,1));
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
