package myswing.gui.panels;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.JPanel;

import myswing.gui.constants.JConstants;
import myswing.gui.labels.TitleLabel;

public class PaymentPanel extends JPanel{
	
	TitleLabel paymentTitle = new TitleLabel();
	JConstants jConstants;
	PaymentOrderListPanel paymentOrderListPanel;
	Map<String, Boolean> orderList = new HashMap<>();
	
	

	public PaymentPanel(MainPanel mainPanel, CardLayout cards, JConstants jConstants) {
		
		PaymentCenterPanel paymentCenterPanel = new PaymentCenterPanel(mainPanel, cards);
		
		this.setBackground(Color.yellow);
		this.setLayout(new BorderLayout());
		this.jConstants = jConstants;
		
		paymentTitle.setText(jConstants.getPAYMENT_TITLE());
		paymentTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 20, 0));
		
		paymentOrderListPanel = new PaymentOrderListPanel(jConstants);
		
		
		this.add(paymentTitle, BorderLayout.NORTH);
		this.add(paymentOrderListPanel, BorderLayout.WEST);
		this.add(paymentCenterPanel, BorderLayout.CENTER);
		
		
	}
	
	public Map<String, Boolean> getOrderList() {
		return orderList;
	}

	public void setOrderList(Map<String, Boolean> orderList) {
		this.orderList = orderList;
	}

}