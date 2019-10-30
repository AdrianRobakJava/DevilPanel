package Cwiczenia_mod_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class diabPan extends JPanel{
	
	private Dimension dim = new Dimension(700, 700);
	private smallPanel pan;
	private int count=0;
	private ImageIcon img = new ImageIcon("c:/DoJava/devil.gif");
	private JLabel lab;
	private devilPanel dpan;
	private Object [] tab = new Object [49];
	private static int position = 24;
	
	public diabPan() {
		
		this.setBackground(Color.white);
		this.setPreferredSize(dim);
		this.setLayout(new GridLayout(7,7));
		
		for(int i=0; i<49; i++) {
			if(i == 24) {
				//this.add(dpan = new devilPanel());
				tab [i] = this.add(dpan = new devilPanel(dim.width/7, dim.height/7));
			}else {
				//pan = new smallPanel(dim.width/7, dim.height/7);
				tab[i] = this.add(pan = new smallPanel(dim.width/7, dim.height/7));
				//this.add(pan);
			}
		}
	
		this.addKeyListener(new keyLis());
		this.setFocusable(true);
	}
	
	private class keyLis implements KeyListener {
		
		 private int x =100;
		 private int y =100;
		
		public void keyPressed(KeyEvent ev) {
			
			int key = ev.getKeyCode();
			System.out.println("Wciśnięto: " + key);
			if(key == ev.VK_UP) {
				removeAll();
				position -= 7;
				if (position < 0 ){
					position = position + 49;
				}
				for (int i = 0; i < 49; i ++) {
					if (i == position){
						tab[i] = add( dpan = new devilPanel(dim.width/7, dim.height/7) );	
					}
					else {
						tab [i] = add( pan = new smallPanel(dim.width/7, dim.height/7) );
						
					}
				}
				revalidate();
				repaint();
				System.out.println("Up");
			}else if(key == ev.VK_DOWN) {
				removeAll();
				position += 7;
				if(position > 49) {
					position = position -49;
				}
				for(int i=0; i<49; i++) {
					if(i == position) {
						tab [i] = add(dpan = new devilPanel(dim.width/7, dim.height/7));
					}else {
						tab[i] = add(pan = new smallPanel(dim.width/7, dim.height/7));
					}
				}
				revalidate();
				repaint();
				System.out.println("Down");
			}else if(key == ev.VK_RIGHT) {
				removeAll();
				position +=1;
				if(position > 48) {
					position = 0;
				}
				for(int i=0; i<49; i++) {
					if(i == position) {
						tab [i] = add(dpan = new devilPanel(dim.width/7, dim.height/7));
					}else {
						tab[i] = add(pan = new smallPanel(dim.width/7, dim.height/7));
					}
				}
				revalidate();
				repaint();
				System.out.println("Right");
			}else if(key == ev.VK_LEFT){ 
				removeAll();
				position -=1;
				if(position < 0) {
					position = 48;
				}
				for(int i=0; i<49; i++) {
					if(i == position) {
						tab [i] = add(dpan = new devilPanel(dim.width/7, dim.height/7));
					}else {
						tab[i] = add(pan = new smallPanel(dim.width/7, dim.height/7));
					}
				}
				revalidate();
				repaint();
				System.out.println("Left");
			}else {
				System.out.println(key);
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {}
		@Override
		public void keyTyped(KeyEvent e) {}
	}

}
