package myswing.gui.panels;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import myswing.gui.buttons.OrderButton;
import myswing.gui.constants.JConstants;
import myswing.gui.labels.ErrorLabel;
import myswing.gui.labels.TitleLabel;
import myswing.gui.textfields.MyNameTextField;

public class HomePanel extends JPanel{
	
	TitleLabel homeTitleLabel;
	OrderPanel orderPanel; 
	AdvertisementMainPanel adPanel;
	OrderButton btn;
	MyNameTextField myNameTF = new MyNameTextField();
	JPanel homeCenterPanel;
	JConstants jConstants = new JConstants();
	ErrorLabel errorLabel = new ErrorLabel();
	MainPanel mainPanel;
	CardLayout cards;
	ErrorPanel errorPanel = new ErrorPanel();
	
	public HomePanel(MainPanel mainPanel, CardLayout cards) {
		
		this.mainPanel = mainPanel;
		this.cards = cards;
		
		homeTitleLabel = new TitleLabel();
		homeTitleLabel.setText(jConstants.getHOME_WELCOME_LABEL());
		adPanel = new AdvertisementMainPanel(this);
		homeCenterPanel = new JPanel();
		
		btn = new OrderButton(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(myNameTF.getText().trim().isEmpty()) {
					
					JOptionPane.showMessageDialog(HomePanel.this, "Please enter the name to continue!", "Error", JOptionPane.ERROR_MESSAGE);
				}else {
					
					cards.show(mainPanel,"Orders");
					//errorFn();
				}

			}
			
		});
		
		homeCenterPanel.setLayout(new BoxLayout(homeCenterPanel, BoxLayout.Y_AXIS));
		homeCenterPanel.setBackground(Color.yellow);
		homeCenterPanel.add(myNameTF);
		homeCenterPanel.add(btn);
		
				
		this.setBackground(Color.yellow);
		this.setLayout(new BorderLayout(10,10));
		this.add(homeTitleLabel, BorderLayout.NORTH);
		this.add(homeCenterPanel, BorderLayout.CENTER);
		this.add(adPanel, BorderLayout.SOUTH); 

		
	}
	
	public void errorFn() {
		
		cards.show(mainPanel,  "Error");
		Timer timer = new Timer(5000, e -> cards.show(mainPanel, "Home"));
		timer.setRepeats(false); // ensures it runs only once
		timer.start();
	
		
	}
	
	

}
	