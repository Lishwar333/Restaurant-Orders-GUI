package myswing.gui.buttons;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class OrderButton extends JButton{
	
	
	
	public OrderButton(ActionListener listener) {
		
		
		//this.setSize(90, 30);
		this.setText("Order now!");
		this.setFocusable(false);
		this.setPreferredSize(new Dimension(200, 50));
		this.setBackground(Color.red);
		this.setForeground(Color.yellow);
		this.setFont(new Font("Showcard Gothic", Font.PLAIN, 15));
		this.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		this.addActionListener(listener);
	
	}
		
		
	}

