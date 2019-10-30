package Cwiczenia_mod_2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class smallPanel extends JPanel{
	
	private int y = 0;
	
	
	public smallPanel(int x, int y) {
		
		
		this.setBackground(Color.yellow);
		this.setPreferredSize(new Dimension(x, y));
		this.setLayout(new BorderLayout());
		this.setBorder(BorderFactory.createTitledBorder("Panel"));
		
		
		
	}

}
