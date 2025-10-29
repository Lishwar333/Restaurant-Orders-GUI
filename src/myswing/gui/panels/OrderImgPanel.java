package myswing.gui.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

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
	JLabel popUpLabel;
	JWindow popUpWindow; //commenting due to referencing issue with popups! hence creating new window everytime!
	Timer activeTimer;
	int i;
	
	public OrderImgPanel() {
		
		// Load and scale all images to a smaller size (e.g., 100x100)
		//imgBrownies = new ImageIcon(jImages.getBROWNIESIMG());
		
		
		
        imgBrownies = scaleImage(jImages.getBROWNIESIMG(), 100, 100);
        imgFries = scaleImage(jImages.getFRIESIMG(), 100, 100);
        imgFriedChicken = scaleImage(jImages.getFRIEDCHICKENIMG(), 100, 100);
        imgBurger = scaleImage(jImages.getBURGERIMG(), 100, 100);
        imgCookies = scaleImage(jImages.getCOOKIESIMG(), 100, 100);
        imgShakes = scaleImage(jImages.getSHAKESIMG(), 100, 100);
        
        ImageIcon[] orderImgs = new ImageIcon[] {
        		imgBrownies, imgFries, imgFriedChicken, imgBurger, imgCookies, imgShakes
        };
        
             
		this.setBackground(Color.yellow);
		this.setLayout(new GridLayout(2,3,10,10));
		this.setPreferredSize(new Dimension(150,150)); 
		
		for(i=0; i<orderImgs.length; i++) {
			
			JLabel	tempLabel = new JLabel(orderImgs[i]);
			tempLabel.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					
					showOrderPopup(tempLabel,"Item is added");
					
				}
				
			});
			this.add(tempLabel);
			
		}

		
	}
	
	public void showOrderPopup(JLabel tempLabel, String text) {
		
		if (activeTimer != null && activeTimer.isRunning()) {
	        activeTimer.stop();
	    }
	    if (popUpWindow != null && popUpWindow.isVisible()) {
	        popUpWindow.dispose();
	    }
		
	
		popUpWindow = new JWindow();
		popUpWindow.setLayout(new BorderLayout());
		popUpWindow.getContentPane().setBackground(Color.yellow);
		
		popUpLabel = new JLabel();
		popUpLabel.setText(text);
		popUpLabel.setForeground(Color.red);
		popUpLabel.setHorizontalAlignment(JLabel.CENTER);
		popUpLabel.setVerticalAlignment(JLabel.CENTER);

		
		popUpWindow.add(popUpLabel);
		popUpWindow.pack();  //
		
		Point loc = tempLabel.getLocationOnScreen();
		
		popUpWindow.setLocation(
			    loc.x + (tempLabel.getWidth() - popUpWindow.getWidth()) / 2,
			    loc.y + tempLabel.getHeight() + 10
			);

		popUpWindow.setVisible(true);

	    
		activeTimer = new Timer(1500, e -> popUpWindow.dispose());
		activeTimer.setRepeats(false);
		activeTimer.start();
	    };
	
	
	 // Helper method to scale image
    private ImageIcon scaleImage(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

}
