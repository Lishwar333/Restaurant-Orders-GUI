package myswing.gui.labels;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import myswing.gui.constants.JImages;
import myswing.gui.panels.MainPanel;

public class TitleLabel extends JLabel {
	
	ImageIcon img;
	JImages jImage = new JImages();

	
	public TitleLabel() {
		
		img = new ImageIcon(jImage.getPOLOS_HERMANOS_LOGO());
				 
        Image image = img.getImage();
        Image scaled = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH); // width=100, height=100
        img = new ImageIcon(scaled);
        
		
		this.setIcon(img);
		this.setForeground(Color.red);
		//this.setPreferredSize(new Dimension(400, 100));
		this.setFont(new Font("Showcard Gothic", Font.PLAIN, 18));
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.BOTTOM);
		//this.setText("Nooooo");
		
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setAlignmentX(JLabel.CENTER);
		this.setVerticalAlignment(JLabel.CENTER);
	}

}
