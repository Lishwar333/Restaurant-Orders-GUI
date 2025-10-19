package myswing.gui.labels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import myswing.gui.constants.JConstants;

public class HomeLabel extends JLabel {
	
	ImageIcon img;
	JConstants jConstants = new JConstants();
	
	public HomeLabel() {
		
		img = new ImageIcon("C:\\\\Users\\\\jayak\\\\eclipse-workspace\\\\Restaurant-Orders-GUI\\\\src\\\\myswing\\\\gui\\\\myresource\\\\los_pollos_logo.jpg");
				 
        Image image = img.getImage();
        Image scaled = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH); // width=100, height=100
        img = new ImageIcon(scaled);
        
		
		this.setText(jConstants.getHOME_WELCOME_LABEL());
		this.setIcon(img);
		this.setForeground(Color.red);
		//this.setPreferredSize(new Dimension(400, 100));
		this.setFont(new Font("Showcard Gothic", Font.PLAIN, 22));
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.BOTTOM);
		//this.setText("Nooooo");
		
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setVerticalAlignment(JLabel.CENTER);
	}

}
