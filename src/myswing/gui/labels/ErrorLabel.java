package myswing.gui.labels;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import myswing.gui.constants.JImages;

public class ErrorLabel extends JLabel{
	
	
	JImages jImage = new JImages();
	ImageIcon imgIcon = new ImageIcon(jImage.getPOLOS_HERMANOS_LOGO());
	
	public ErrorLabel() {
		
		ImageIcon logo = new ImageIcon ((imgIcon.getImage()).getScaledInstance(250, 250, Image.SCALE_SMOOTH));
		
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setForeground(Color.red);
		this.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.setText("Sorry, maintenance break. Try again Later");
		this.setIcon(logo);
		this.setFont(new Font("Showcard Gothic", Font.PLAIN, 22));
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.BOTTOM);
	}

}
