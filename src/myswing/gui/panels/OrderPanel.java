package myswing.gui.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import myswing.gui.buttons.BackButton;
import myswing.gui.buttons.OrderButton;
import myswing.gui.constants.JConstants;
import myswing.gui.labels.ErrorLabel;
import myswing.gui.labels.HomeLabel;

public class OrderPanel extends JPanel{
	
	
	OrderButton btn;
	ErrorLabel errorLabel;
	BackButton backButton;
	HomeLabel homeLabel;
	JConstants jConstants = new JConstants();
	OrderImgPanel orderImgPanel;
	
	public OrderPanel(HomeLabel homeLabel){
		
		this.homeLabel = homeLabel;
		
		btn = new OrderButton(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				OrderBtnfn();
				
			}
			
		});
		
		backButton = new BackButton(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				BackBtnfn();
			}
			
		});
		
		errorLabel = new ErrorLabel();
		orderImgPanel = new OrderImgPanel();
		
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBackground(Color.yellow);
		this.add(btn);
		this.setBorder(new EmptyBorder(20, 0, 0, 0)); 
		//this.add(Box.createRigidArea(new Dimension(0, 60))); // small gap
		//this.add(errorLabel);
		
	}
	
	public void OrderBtnfn() {
		
		//errorFn(); // in care of maintenance
		homeLabel.setText(jConstants.getORDERS_PAGE_HEADING());
		this.removeAll();
		this.add(orderImgPanel);
		this.add(backButton);
		this.revalidate();
		this.repaint(); // Removes the order button and adds the back button
		
	}
	
	public void BackBtnfn() {
		//this.remove(backButton);
		//this.remove(errorLabel);
		this.removeAll();
		this.add(btn);
		homeLabel.setText(jConstants.getHOME_WELCOME_LABEL());
		this.revalidate();
		this.repaint();
		
	}
	
	public void errorFn() {
		
		errorLabel.setText("Sorry, maintenance break. Try again Later");
		errorLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 22));
		this.removeAll();
		this.add(errorLabel);
		this.add(backButton);
		this.revalidate();
		this.repaint();
		
		
	}
	
	
	

}
