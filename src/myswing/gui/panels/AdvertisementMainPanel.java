package myswing.gui.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import myswing.gui.constants.JConstants;
import myswing.gui.constants.JImages;

public class AdvertisementMainPanel extends JPanel {

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

    public AdvertisementMainPanel() {

        // === Set panel basics ===
        this.setLayout(null);
        this.setOpaque(true);
        this.setBackground(Color.RED);
        this.setPreferredSize(new Dimension(600, 180)); // 🔹 smaller height

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

        this.add(adJLPane);
    }

    private ImageIcon scaleImage(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
}
