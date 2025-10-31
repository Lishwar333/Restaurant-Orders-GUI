package myswing.gui.panels;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import myswing.gui.constants.JConstants;
import myswing.gui.constants.JImages;

public class AdvPanel extends JPanel {
	
	JLabel label = new JLabel();
	JImages img = new JImages();
	
	JConstants jConstants = new JConstants();
	ImageIcon logo = scaleImage(img.getLAUNDRYLOGO(), 400, 180);
	
	public AdvPanel() {
		
		label.setText(jConstants.getADV_CONTENT());
		label.setOpaque(true);
		label.setIcon(logo);
		label.setBackground(Color.white);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		
		
		this.setBackground(Color.white);
		this.add(label);
	}
	
	private ImageIcon scaleImage(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

}
