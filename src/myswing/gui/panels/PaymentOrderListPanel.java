package myswing.gui.panels;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import myswing.gui.constants.JConstants;

public class PaymentOrderListPanel extends JPanel {
	
	Map<String, Boolean> orderList = new HashMap<>();
	JConstants jConstants;
	
	public PaymentOrderListPanel( JConstants jConstants) {
		
		this.jConstants = jConstants;
		
		
	}
	
	public void setUp() {
		
		this.orderList = jConstants.getOrderList();
		System.out.println("Inside resetPaymentOrderListPanel() "+ orderList.keySet());
		resetPaymentOrderListPanel();
	}

	
	public void resetPaymentOrderListPanel() { // Rebuilding everytime the info changes.
		
		this.removeAll();
		//this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBackground(Color.yellow);
		this.setPreferredSize(new Dimension(130, 200));
		this.setBorder(BorderFactory.createLineBorder(Color.red));

		
		JLabel labelTitle = new JLabel("Your Orders!");
		labelTitle.setFont(new Font("Showcard Gothic", Font.PLAIN, 17));
		labelTitle.setForeground(Color.red);
		//labelTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(labelTitle);
		
		for(String s : orderList.keySet()) {
			
			JLabel label = new JLabel("• "+ s);
			label.setOpaque(false);
			label.setForeground(Color.red);
			label.setFont(new Font("Showcard Gothic", Font.PLAIN, 15));
			//label.setAlignmentX(Component.CENTER_ALIGNMENT);
			this.add(label);
		
		}
		
		this.revalidate();
		this.repaint();
	}

}
