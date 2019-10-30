package Cwiczenia_mod_2;

import java.awt.*;
import javax.swing.*;

public class diabMain {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Diabelek");
		frame.setLocation(500, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new diabPan();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}

}
