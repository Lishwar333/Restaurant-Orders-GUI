package myswing.gui.panels;

import java.awt.BorderLayout;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import myswing.gui.labels.HomeLabel;

public class MainPanel extends JPanel{
	
	HomeLabel homeLabel;
	OrderPanel btnPanel; 
	AdvertisementMainPanel adPanel;
	
	public MainPanel() {
		
		homeLabel = new HomeLabel();
		adPanel = new AdvertisementMainPanel(this);
		btnPanel = new OrderPanel(homeLabel);
				
		this.setBackground(Color.yellow);
		this.setLayout(new BorderLayout(10,10));
		this.add(homeLabel, BorderLayout.NORTH);
		this.add(btnPanel, BorderLayout.CENTER);
		this.add(adPanel, BorderLayout.SOUTH); 
		
		//this.add(errorLabel, BorderLayout.SOUTH);
		
		//Timer timer = new Timer(5000, e -> {this.remove(adPanel);
		//									this.revalidate();
		//									this.repaint(); });
		//timer.start();
		
		
	}
	
	

}
	