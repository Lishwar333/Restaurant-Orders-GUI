package myswing.gui.buttons;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.border.Border;

import myswing.gui.panels.MainPanel;

public class PayButton extends JButton implements ActionListener{
	
	JWindow progressWindow = new JWindow();
	JLabel payLabel = new JLabel("Payment in process...");
	
	JProgressBar paymentProgressBar = new JProgressBar();
	
	private Timer progressTimer;
    private int progress = 0;
    MainPanel mainPanel;
    CardLayout cards;

	
	
	public PayButton(MainPanel mainPanel, CardLayout cards) {
		
		this.mainPanel = mainPanel;
		this.cards = cards;
		
		this.setText("Pay");
		this.setFocusable(false);
		this.setBackground(Color.red);
		this.setForeground(Color.yellow);
		this.setFont(new Font("Showcard Gothic", Font.PLAIN, 15));
		this.setPreferredSize(new Dimension(200, 40));
		this.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.addActionListener(this);
		
		progressWindow.setSize(200, 100);
		progressWindow.getContentPane().setBackground(Color.yellow);
		progressWindow.setLocationRelativeTo(null);
		
		JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.yellow);
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBorder(BorderFactory.createLineBorder(Color.red));
		
		payLabel.setForeground(Color.red);
		payLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 15));
		payLabel.setAlignmentX(JLabel.CENTER);
		
		paymentProgressBar.setValue(0);
        paymentProgressBar.setForeground(Color.yellow);
        paymentProgressBar.setBackground(Color.red);
        paymentProgressBar.setStringPainted(true);
        paymentProgressBar.setAlignmentX(Component.CENTER_ALIGNMENT);
		
        contentPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        contentPanel.add(payLabel);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        contentPanel.add(paymentProgressBar);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        

        progressWindow.add(contentPanel);

		
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		 if (e.getSource() == this) {
	            System.out.println("Pay Button clicked");
	            startPaymentProgress();
	        }
		
	}
	
	 private void startPaymentProgress() {
	        progress = 0;
	        paymentProgressBar.setValue(0);
	        payLabel.setText("Payment in process...");
	        progressWindow.setVisible(true);

	        // Animate progress for ~3 seconds (100 updates every 30 ms = 3 seconds)
	        progressTimer = new Timer(30, new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                progress++;
	                paymentProgressBar.setValue(progress);
	                if (progress >= 100) {
	                    progressTimer.stop();
	                    showPaymentDone();
	                }
	            }
	        });
	        progressTimer.start();
	    }
	 
	 private void showPaymentDone() {
	        payLabel.setText("Payment Done!");
	        // Wait 2 seconds before closing the window
	        Timer closeTimer = new Timer(2000, ee -> {
	            progressWindow.dispose();
	            cards.show(mainPanel, "ThankYou");

	            // After 5 seconds on ThankYou panel, go back to Home
	            Timer returnTimer = new Timer(5000, e2 -> {
	                cards.show(mainPanel, "Home");
	            });
	            returnTimer.setRepeats(false);
	            returnTimer.start();
	        });
	        closeTimer.setRepeats(false);
	        closeTimer.start();
	    }

}
