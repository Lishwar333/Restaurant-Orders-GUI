package myswing.gui.panels;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import myswing.gui.buttons.BackButton;
import myswing.gui.buttons.OrderButton;
import myswing.gui.constants.JConstants;
import myswing.gui.labels.ErrorLabel;
import myswing.gui.labels.TitleLabel;


public class OrderPanel extends JPanel{
	
	
	OrderButton btn;
	ErrorLabel errorLabel;
	BackButton backButton;
	TitleLabel homeLabel;
	JConstants jConstants = new JConstants();
	OrderImgPanel orderImgPanel;
	TitleLabel orderTitleLabel = new TitleLabel();
	CardLayout cards;
	MainPanel mainPanel;
	
	
	public OrderPanel(MainPanel mainPanel, CardLayout cards){
		
		this.cards = cards;
		this.mainPanel = mainPanel;
		
		orderTitleLabel.setText(jConstants.getHOME_WELCOME_LABEL());
		orderTitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		backButton = new BackButton(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(JOptionPane.showConfirmDialog(OrderPanel.this, "Are you sure going back??", "Confirmation", JOptionPane.YES_NO_OPTION)==0) {
					
					BackBtnfn();
				}
				
			}
			
		});
		
		errorLabel = new ErrorLabel();
		orderImgPanel = new OrderImgPanel();
		
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBackground(Color.yellow);
		
		this.add(orderTitleLabel);
		this.add(orderImgPanel);
		this.add(backButton);
		
		
	}
	
	
	public void BackBtnfn() {
		
		cards.show(mainPanel, "Home");
		
	}
	
	

}
