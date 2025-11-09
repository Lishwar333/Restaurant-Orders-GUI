package myswing.gui.panels;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	
	HomePanel homePanel;
	OrderPanel orderPanel;
	ErrorPanel errorPanel;
	PaymentPanel paymentPanel;
	
	
	public MainPanel(CardLayout cards) {
		
		homePanel = new HomePanel(this, cards);
		orderPanel = new OrderPanel(this, cards);
		errorPanel = new ErrorPanel();
		paymentPanel = new PaymentPanel(this, cards);
		
		this.setLayout(cards);
		this.setBackground(Color.yellow);
		this.add(homePanel, "Home");
		this.add(orderPanel, "Orders");
		this.add(errorPanel, "Error");
		this.add(paymentPanel, "Payment");
		
		
	}

}
