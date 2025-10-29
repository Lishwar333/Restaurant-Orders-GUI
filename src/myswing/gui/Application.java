package myswing.gui;
import javax.swing.SwingUtilities;

import myswing.gui.frames.MainFrame;

public class Application {

	public static void main(String[] args) {
		
		//Application
		
	SwingUtilities.invokeLater(() -> new MainFrame());
		
		
	}

}
