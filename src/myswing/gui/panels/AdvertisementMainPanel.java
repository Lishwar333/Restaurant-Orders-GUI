package myswing.gui.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import myswing.gui.constants.JConstants;
import myswing.gui.constants.JImages;
import myswing.gui.frames.AdvFrame;

public class AdvertisementMainPanel extends JPanel implements ActionListener {

    JLayeredPane adJLPane;
    JImages jimg = new JImages();
    JConstants jConstants = new JConstants();

    ImageIcon laundryFront = scaleImage(jimg.getLAUNDRYFRONT(), 130, 80);
    ImageIcon laundryLogo = scaleImage(jimg.getLAUNDRYLOGO(), 130, 80);
    ImageIcon laundryInterior = scaleImage(jimg.getLAUNDRYINTERIOR(), 130, 80);

    JLabel labelLaundryFront = new JLabel(laundryFront);
    JLabel labelLaundryLogo = new JLabel(laundryLogo);
    JLabel labelLaundryInterior = new JLabel(laundryInterior);
    JLabel adTextLabel = new JLabel();
    
    JButton knowMoreBtn = new JButton();
    JButton closeBtn = new JButton();
    
    JPanel mainPanel;

    public AdvertisementMainPanel(JPanel mainPanel) {
    	
    	this.mainPanel = mainPanel;

        // === Set panel basics ===
        this.setLayout(null);
        this.setOpaque(true);
        this.setBackground(Color.RED);
        this.setPreferredSize(new Dimension(600, 250)); // 🔹 smaller height

        // === Title text ===
        adTextLabel.setText(jConstants.getAD_MAIN_PANEL_TITLE());
        adTextLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        adTextLabel.setForeground(new Color(255, 235, 59)); // bright yellow
        adTextLabel.setHorizontalAlignment(JLabel.CENTER);
        adTextLabel.setBounds(0, 5, 600, 35);   // taller label (two text lines)
        this.add(adTextLabel);

        // === Layered pane setup ===
        adJLPane = new JLayeredPane();
        adJLPane.setLayout(null);
        adJLPane.setBounds(0, 25, 600, 130);    // start below label
        adJLPane.setOpaque(false);

        int w = 130, h = 80;

        // === Image positions (tighter spacing) ===
        labelLaundryFront.setBounds(90, 40, w, h);
        labelLaundryLogo.setBounds(210, 60, w, h);
        labelLaundryInterior.setBounds(330, 40, w, h);

        adJLPane.add(labelLaundryFront, Integer.valueOf(0));
        adJLPane.add(labelLaundryLogo, Integer.valueOf(1));
        adJLPane.add(labelLaundryInterior, Integer.valueOf(0));
        
        knowMoreBtn.setText("Know More!");
        //knowMoreBtn.setHorizontalAlignment(SwingConstants.LEFT);
        knowMoreBtn.setForeground(Color.red);
        knowMoreBtn.setBackground(Color.yellow);
        knowMoreBtn.setFont(new Font("Showcard Gothic", Font.PLAIN, 10));
        knowMoreBtn.setFocusable(false);
        knowMoreBtn.setBounds(160, 180, 120, 30);
        knowMoreBtn.addActionListener(this);
        
        closeBtn.setText("Close");
        closeBtn.setBackground(Color.yellow);
        closeBtn.setForeground(Color.red);
        closeBtn.setFont(new Font("Showcard Gothic", Font.PLAIN, 10));
        closeBtn.setFocusable(false);
        closeBtn.setBounds(285, 180, 120, 30);
        closeBtn.addActionListener(this);
        
        
        this.add(adJLPane);
        this.add(knowMoreBtn);
        this.add(closeBtn);
        
    }

    private ImageIcon scaleImage(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == knowMoreBtn) {
			
			new AdvFrame();
			
		} else if(e.getSource() == closeBtn) {
			
			mainPanel.remove(this);
			mainPanel.revalidate();
			mainPanel.repaint();
		}
		
	}
}
