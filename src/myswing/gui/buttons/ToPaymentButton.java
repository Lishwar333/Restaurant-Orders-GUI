package myswing.gui.buttons;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ToPaymentButton extends JButton{
	
	public ToPaymentButton(ActionListener actionListerner) {
		
		this.setText("To Payment");
		this.setBackground(Color.red);
		this.setForeground(Color.yellow);
		this.setFocusable(false);
		this.setPreferredSize(new Dimension(200, 40));
		this.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.setFont(new Font("Showcard Gothic", Font.PLAIN, 15));
		this.addActionListener(actionListerner);
		
	}

}
