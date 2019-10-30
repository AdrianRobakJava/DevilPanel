package Cwiczenia_mod_2;

import java.awt.*;
import javax.swing.*;

public class devilPanel extends JPanel{
	
	public devilPanel(int x, int y) {
		
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(x, y));
		this.setLayout(new BorderLayout());
		ImageIcon img = new ImageIcon("c:/DoJava/devil.gif");
		JLabel label = new JLabel(img);
		this.add(label);
		
	}

}
