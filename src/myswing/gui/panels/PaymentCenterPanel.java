package myswing.gui.panels;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Hashtable;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

import myswing.gui.buttons.PayButton;

public class PaymentCenterPanel extends JPanel{
	
	PaymentTypePanel paymentTypePanel;
	JLabel paymentTypeTitle = new JLabel("Please select the Payment Type");
	JLabel ratingTitle = new JLabel("Please give us rating!");
	JSlider ratingSlider = new JSlider(1,5,3);
	MainPanel mainPanel;
	CardLayout cards;
	
	public PaymentCenterPanel(MainPanel mainPanel, CardLayout cards) {
		
		this.mainPanel = mainPanel;
		this.cards = cards;
		
		PayButton payButton = new PayButton(mainPanel, cards);
		
		this.setBackground(Color.yellow);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		paymentTypePanel = new PaymentTypePanel();
		
		paymentTypeTitle.setFont(new Font("Showcard Gothic", Font.PLAIN, 18));
		paymentTypeTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
		paymentTypeTitle.setForeground(Color.red);
		
		ratingTitle.setFont(new Font("Showcard Gothic", Font.PLAIN, 18));
		ratingTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
		ratingTitle.setForeground(Color.red);
		
		ratingSlider.setPaintTicks(true);
		ratingSlider.setPaintTrack(true);
		ratingSlider.setMajorTickSpacing(1);
		ratingSlider.setOrientation(SwingConstants.HORIZONTAL);
		ratingSlider.setPaintLabels(true);
		ratingSlider.setMinorTickSpacing(1);
		ratingSlider.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		ratingSlider.setPreferredSize(new Dimension(100, 60));
		ratingSlider.setBackground(Color.yellow);
		ratingSlider.setForeground(Color.red);
		
//		Hashtable<Integer, JLabel> labelTable = new Hashtable<>();
//		labelTable.put(1, new JLabel("😞"));
//		labelTable.put(2, new JLabel("😐"));
//		labelTable.put(3, new JLabel("🙂"));
//		labelTable.put(4, new JLabel("😊"));
//		labelTable.put(5, new JLabel("🤩"));
		
//		ratingSlider.setLabelTable(labelTable);
		
		this.add(paymentTypeTitle);
		this.add(Box.createRigidArea(new Dimension(0, 10))); 
		this.add(paymentTypePanel);
		this.add(Box.createRigidArea(new Dimension(0, 10))); 
		this.add(payButton);
		this.add(Box.createRigidArea(new Dimension(0, 10)));
		this.add(ratingTitle);
		this.add(Box.createRigidArea(new Dimension(0, 15)));
		this.add(ratingSlider);
		
		
	}

}
