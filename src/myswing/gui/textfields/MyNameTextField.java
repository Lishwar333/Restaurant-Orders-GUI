package myswing.gui.textfields;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

public class MyNameTextField extends JTextField{
	
	public MyNameTextField() {
		
		this.setPreferredSize(new Dimension(260,50));
		this.setBackground(Color.red);
		this.setForeground(Color.yellow);
		this.setFont(new Font("Showcard Gothic", Font.PLAIN, 18));
		this.setCaretColor(Color.yellow);
		this.setMaximumSize(new Dimension(260,30));
		this.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.setHorizontalAlignment(JTextField.CENTER);
		
	}

}
