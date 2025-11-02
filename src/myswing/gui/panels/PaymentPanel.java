package myswing.gui.panels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import myswing.gui.constants.JConstants;
import myswing.gui.labels.TitleLabel;

public class PaymentPanel extends JPanel{
	
	TitleLabel paymentTitle = new TitleLabel();
	JConstants jConstants = new JConstants();
	
	public PaymentPanel() {
		
		this.setBackground(Color.yellow);
		this.setLayout(new BorderLayout());
		
		paymentTitle.setText(jConstants.getPAYMENT_TITLE());
		
		this.add(paymentTitle);
		
		
	}

}
