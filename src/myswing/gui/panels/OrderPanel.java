package myswing.gui.panels;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import myswing.gui.buttons.BackButton;
import myswing.gui.buttons.OrderButton;
import myswing.gui.constants.JConstants;
import myswing.gui.labels.ErrorLabel;
import myswing.gui.labels.TitleLabel;


public class OrderPanel extends JPanel{
	
	
	ErrorLabel errorLabel;
	
	TitleLabel homeLabel;
	JConstants jConstants;
	OrderImgPanel orderImgPanel;
	TitleLabel orderTitleLabel = new TitleLabel();
	CardLayout cards;
	MainPanel mainPanel;
	OrderButtonPanel orderButtonPanel;
	String MY_NAME_TF;

	public OrderPanel(MainPanel mainPanel, CardLayout cards, JConstants jConstants){
		
		this.cards = cards;
		this.mainPanel = mainPanel;
		this.jConstants = jConstants;
		
		orderTitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		errorLabel = new ErrorLabel();
		orderImgPanel = new OrderImgPanel(mainPanel, cards, this.jConstants);
		orderButtonPanel = new OrderButtonPanel(mainPanel, cards, this, this.jConstants);
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBackground(Color.yellow);
		
		this.add(orderTitleLabel);
		this.add(orderImgPanel);
		this.add(Box.createRigidArea(new Dimension(0, 5))); 
		this.add(orderButtonPanel);
		
	}
	
	public String getMY_NAME_TF() {
		return MY_NAME_TF;
	}

	public void setMY_NAME_TF(String mY_NAME_TF) {
		this.MY_NAME_TF = mY_NAME_TF;
		orderTitleLabel.setText(jConstants.getORDERS_PAGE_HEADING() + " "+ MY_NAME_TF);
	    orderTitleLabel.revalidate();
	    orderTitleLabel.repaint();
	}


}
