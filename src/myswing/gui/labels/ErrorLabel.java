package myswing.gui.labels;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;

public class ErrorLabel extends JLabel{
	
	public ErrorLabel() {
		
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setForeground(Color.red);
		this.setAlignmentX(Component.CENTER_ALIGNMENT);
	}

}
