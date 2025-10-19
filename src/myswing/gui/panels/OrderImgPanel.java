package myswing.gui.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import myswing.gui.constants.JImages;

/* This panel is within the OrderPanel, which in turn is within the MainPanel*/

public class OrderImgPanel extends JPanel{
	
	ImageIcon imgBrownies;
	ImageIcon imgFries;
	ImageIcon imgFriedChicken;
	ImageIcon imgBurger;
	ImageIcon imgCookies;
	ImageIcon imgShakes;
	
	JImages jImages = new JImages();
	
	public OrderImgPanel() {
		
		// Load and scale all images to a smaller size (e.g., 100x100)
		//imgBrownies = new ImageIcon(jImages.getBROWNIESIMG());
		
        imgBrownies = scaleImage(jImages.getBROWNIESIMG(), 100, 100);
        imgFries = scaleImage(jImages.getFRIESIMG(), 100, 100);
        imgFriedChicken = scaleImage(jImages.getFRIEDCHICKENIMG(), 100, 100);
        imgBurger = scaleImage(jImages.getBURGERIMG(), 100, 100);
        imgCookies = scaleImage(jImages.getCOOKIESIMG(), 100, 100);
        imgShakes = scaleImage(jImages.getSHAKESIMG(), 100, 100);
		
		
		this.setBackground(Color.yellow);
		this.setLayout(new GridLayout(2,3,10,10));
		this.setPreferredSize(new Dimension(150,150));
		
		
		// Add names of the food !!!
		this.add(new JLabel(imgBrownies));
        this.add(new JLabel(imgFries));
        this.add(new JLabel(imgFriedChicken));
        this.add(new JLabel(imgBurger));
        this.add(new JLabel(imgCookies));
        this.add(new JLabel(imgShakes));
		
		
		
	}
	
	 // Helper method to scale image
    private ImageIcon scaleImage(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

}
