package myswing.gui.frames;

import java.awt.Color;


import javax.swing.ImageIcon;
import javax.swing.JFrame;

import myswing.gui.labels.HomeLabel;
import myswing.gui.panels.MainPanel;

public class MainFrame extends JFrame {
	
	ImageIcon img;
	MainPanel panel;
	
	public MainFrame(){
		
		panel = new MainPanel();
		
		
		img = new ImageIcon("C:\\Users\\jayak\\eclipse-workspace\\Restaurant-Orders-GUI\\src\\myswing\\gui\\myresource\\los_pollos_logo.jpg");
		
		
		this.setTitle("Los Pollos Hermanos Orders");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(580, 520);
		this.setIconImage(img.getImage());
		this.getContentPane().setBackground(Color.YELLOW);
		this.setLocationRelativeTo(null);
		this.add(panel);
		this.setResizable(false);
		//this.pack();
		
		
		
		
		this.setVisible(true);
	}

}
