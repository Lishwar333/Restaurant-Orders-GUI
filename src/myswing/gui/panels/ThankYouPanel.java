package myswing.gui.panels;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import myswing.gui.constants.JConstants;
import myswing.gui.labels.TitleLabel;

public class ThankYouPanel extends JPanel{
	
	TitleLabel thankYouTitleLabel = new TitleLabel();
	JConstants jConstants = new JConstants();
	
	public ThankYouPanel(MainPanel mainPanel, CardLayout cards) {
		
		
		this.setBackground(Color.yellow);
		this.setLayout(new BorderLayout());
		
		thankYouTitleLabel.setText(jConstants.getTHANK_YOU_PAGE_TITLE());
		
		this.add(thankYouTitleLabel);
		
		
		
	}

}
