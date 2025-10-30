package myswing.gui.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import myswing.gui.buttons.OrderButton;
import myswing.gui.labels.HomeLabel;

public class MainPanel extends JPanel{
	
	HomeLabel homeLabel;
	
	OrderPanel btnPanel; 
	AdvertisementMainPanel AdPanel;
	
	
	public MainPanel() {
		
		homeLabel = new HomeLabel();
		AdPanel = new AdvertisementMainPanel();
		btnPanel = new OrderPanel(homeLabel);
				
		this.setBackground(Color.yellow);
		this.setLayout(new BorderLayout(10,10));
		this.add(homeLabel, BorderLayout.NORTH);
		this.add(btnPanel, BorderLayout.CENTER);
		this.add(AdPanel, BorderLayout.SOUTH); 
		//this.add(errorLabel, BorderLayout.SOUTH);
		
	}
	
	

}
	