package myswing.gui.panels;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import myswing.gui.buttons.BackButton;
import myswing.gui.buttons.ToPaymentButton;
import myswing.gui.constants.JConstants;

public class OrderButtonPanel extends JPanel {
	
	BackButton backButton;
	ToPaymentButton toPaymentButton;
	MainPanel mainPanel;
	CardLayout cards;
	JConstants jConstants;
	
	public OrderButtonPanel(MainPanel mainPanel, CardLayout cards, OrderPanel orderPanel, JConstants jConstants) {
		
		this.setBackground(Color.yellow);
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.setPreferredSize(new Dimension(450, 50));
		
		this.mainPanel = mainPanel;
		this.cards = cards;
				
		backButton = new BackButton(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(JOptionPane.showConfirmDialog(orderPanel, "Are you sure going back??", "Confirmation", JOptionPane.YES_NO_OPTION)==0) {
					
					backBtnfn();
				}
				
			}
			
		});
		
		this.add(backButton);
		
		toPaymentButton = new ToPaymentButton(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				OrderButtonPanel.this.jConstants = jConstants;
				
				if(jConstants.getOrderList()==null || jConstants.getOrderList().isEmpty()) {
					
					JOptionPane.showMessageDialog(mainPanel.orderPanel, "Please select an order to continue!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				else if(JOptionPane.showConfirmDialog(orderPanel, "Ready for payment??", "Confirmation", JOptionPane.YES_NO_OPTION)==0) {
					
					toPaymentfn();
				}
				
				
			}
			
		});
		
		this.add(backButton);
		this.add(Box.createRigidArea(new Dimension(10, 0))); // 20px horizontal
		this.add(toPaymentButton);
		
		
	}
	
	public void backBtnfn() {
		
		cards.show(mainPanel, "Home");
		
	}
	
	public void toPaymentfn() {
		
		
		cards.show(mainPanel, "Payment");
		
	}

}
