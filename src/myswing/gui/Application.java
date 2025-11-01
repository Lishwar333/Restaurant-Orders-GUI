package myswing.gui;
import javax.swing.SwingUtilities;

import myswing.gui.constants.JImages;
import myswing.gui.frames.MainFrame;

public class Application {

	public static void main(String[] args) {
		
		//Application
		
		JImages jimg = new JImages();
		
	SwingUtilities.invokeLater(() -> new MainFrame());
		
	System.out.println("Application running...");
	

	}
	
}
