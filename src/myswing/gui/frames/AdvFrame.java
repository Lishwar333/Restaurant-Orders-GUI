package myswing.gui.frames;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import myswing.gui.constants.JImages;
import myswing.gui.panels.AdvPanel;

public class AdvFrame extends JFrame{
	
	JImages img = new JImages();
	AdvPanel panel = new AdvPanel();
	ImageIcon icon = new ImageIcon(img.getLAUNDRYLOGO());
	
	
	public AdvFrame() {
		
		this.setTitle("Lavandería Brillante Ad");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);// change this
		this.setResizable(false);
		this.setSize(420,420);
		this.setIconImage(icon.getImage());
		this.getContentPane().setBackground(Color.white);
		this.add(panel);
		
		this.setVisible(true);
	}

}
