package myswing.gui.panels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import myswing.gui.labels.ErrorLabel;

public class ErrorPanel extends JPanel{
	
	ErrorLabel errorLabel = new ErrorLabel();
	
	public ErrorPanel() {
		
		this.setLayout(new BorderLayout());
		this.add(errorLabel, BorderLayout.CENTER);
		this.setBackground(Color.yellow);
		this.setOpaque(true);
	}

}
