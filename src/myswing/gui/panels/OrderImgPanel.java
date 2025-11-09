package myswing.gui.panels;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import myswing.gui.checkbox.OrderCheckBox;
import myswing.gui.constants.JConstants;
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
	//JWindow popUpWindow; //commenting due to referencing issue with popups! hence creating new window everytime!
	Timer activeTimer;
	
	private int i;
	Map<String, Boolean> orderMap = new HashMap<>();
	
	OrderCheckBox cb1;
	JConstants jConstants;
	
	public OrderImgPanel(MainPanel mainPanel, CardLayout cards, JConstants jConstants) {
		
		// Load and scale all images to a smaller size (e.g., 100x100)
		//imgBrownies = new ImageIcon(jImages.getBROWNIESIMG());
		
		this.jConstants = jConstants;
		
        imgBrownies = scaleImage(jImages.getBROWNIESIMG(), 100, 100);
        imgFries = scaleImage(jImages.getFRIESIMG(), 100, 100);
        imgFriedChicken = scaleImage(jImages.getFRIEDCHICKENIMG(), 100, 100);
        imgBurger = scaleImage(jImages.getBURGERIMG(), 100, 100);
        imgCookies = scaleImage(jImages.getCOOKIESIMG(), 100, 100);
        imgShakes = scaleImage(jImages.getSHAKESIMG(), 100, 100);
        
        ImageIcon[] orderImgs = new ImageIcon[] {
        		imgBrownies, imgFries, imgFriedChicken, imgBurger, imgCookies, imgShakes
        };
        
        String orderNames[] = new String[] {"Brownies", "French Fries", "Fried Chicken", "Burger", "Cookie", "MilkShake"};
        
             
		this.setBackground(Color.yellow);
		this.setLayout(new GridLayout(2,3,10,10));
		this.setPreferredSize(new Dimension(150,150)); 
		
		for(i=0; i<orderImgs.length; i++) {
			
			cb1 = new OrderCheckBox(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					
					JCheckBox cb = (JCheckBox) e.getItem();
					
					if(cb.isSelected()) {
						
						orderMap.put(cb.getText(), true);
						cb.setBackground(Color.cyan);
						
					}
					else {
						orderMap.remove(cb.getText());
						cb.setBackground(null);
					}
					
					System.out.println("Selected: " + orderMap.keySet());
					OrderImgPanel.this.jConstants.setOrderList(orderMap);
					mainPanel.paymentPanel.paymentOrderListPanel.setUp();					
					
					
				}
				
				
				
			});
			cb1.setIcon(orderImgs[i]);
			cb1.setText(orderNames[i]);
			this.add(cb1);
			
		}

	}
	
	
	 // Helper method to scale image
    private ImageIcon scaleImage(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
    
    

}
