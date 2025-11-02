package myswing.gui.checkbox;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;

public class OrderCheckBox extends JCheckBox{
	
	public OrderCheckBox(ItemListener itemListener) {
		
		this.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		this.setBackground(Color.yellow);
		this.setForeground(Color.red);
		this.setHorizontalAlignment(JCheckBox.CENTER);
		this.setHorizontalTextPosition(JCheckBox.CENTER);
		this.setVerticalTextPosition(JCheckBox.BOTTOM);
		this.addItemListener(itemListener);
	}

}
