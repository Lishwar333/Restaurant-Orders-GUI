package myswing.gui.panels;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PaymentTypePanel extends JPanel {
	
	JRadioButton cashRadioButton = new JRadioButton("Cash");
	JRadioButton CardRadioButton = new JRadioButton("Card");
	JRadioButton UPIRadioButton = new JRadioButton("UPI");
	
	ButtonGroup typeButtonGroup = new ButtonGroup();
	
	
	public PaymentTypePanel() {
		
		this.setBackground(Color.yellow);
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.setPreferredSize(new Dimension(200, 100));
		this.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.setBorder(BorderFactory.createLineBorder(Color.red));
		
		
		typeButtonGroup.add(CardRadioButton);
		typeButtonGroup.add(UPIRadioButton);
		typeButtonGroup.add(cashRadioButton);
		
		cashRadioButton.setHorizontalTextPosition(JRadioButton.CENTER);
		cashRadioButton.setVerticalTextPosition(JRadioButton.BOTTOM);
		cashRadioButton.setFont(new Font("Showcard Gothic", Font.PLAIN, 15));
		cashRadioButton.setBackground(Color.yellow);
		cashRadioButton.setForeground(Color.red);
		
		CardRadioButton.setHorizontalTextPosition(JRadioButton.CENTER);
		CardRadioButton.setVerticalTextPosition(JRadioButton.BOTTOM);
		CardRadioButton.setFont(new Font("Showcard Gothic", Font.PLAIN, 15));
		CardRadioButton.setBackground(Color.yellow);
		CardRadioButton.setForeground(Color.red);
		
		UPIRadioButton.setHorizontalTextPosition(JRadioButton.CENTER);
		UPIRadioButton.setVerticalTextPosition(JRadioButton.BOTTOM);
		UPIRadioButton.setFont(new Font("Showcard Gothic", Font.PLAIN, 15));
		UPIRadioButton.setBackground(Color.yellow);
		UPIRadioButton.setForeground(Color.red);
		
		
		typeButtonGroup.setSelected(CardRadioButton.getModel(), true);
		
		this.add(CardRadioButton);
		this.add(Box.createRigidArea(new Dimension(40, 0))); 
		this.add(UPIRadioButton);
		this.add(Box.createRigidArea(new Dimension(40, 0))); 
		this.add(cashRadioButton);
		
		
	}

}
