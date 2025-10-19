package myswing.gui.buttons;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BackButton extends JButton{
	
	public BackButton(ActionListener actionListener) {
		
		this.setText("Back");
		this.setFocusable(false);
		this.setBackground(Color.red);
		this.setForeground(Color.yellow);
		this.setFont(new Font("Showcard Gothic", Font.PLAIN, 15));
		this.setPreferredSize(new Dimension(200, 50));
		this.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.addActionListener(actionListener);
	}

}
