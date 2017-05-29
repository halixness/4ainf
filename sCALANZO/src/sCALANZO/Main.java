package sCALANZO;

import java.awt.*;
import java.awt.event.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;

import javax.swing.*;

import java.net.*;


public class Main extends JFrame implements ActionListener, KeyListener, WindowListener {
	
	// Constructors
	public Main() {
		
		this.addWindowListener(this);
		
		// Window Dimensions
		this.setSize(600, 700);
		this.setLocation(200, 200);
		this.setBackground(Color.lightGray);
		this.setTitle("GitLog - Calanzone Diego");
		this.setLayout(null);
		
		/*
		 * 	Setting Image
		 */
		
		ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("github.png"));
	    JLabel label = new JLabel(imageIcon);
	    
	    label.setLocation(0, 0);
	    label.setSize(600,550);
	    this.add(label);
		
		this.setResizable(false);
		this.setVisible(true);
		
	}

	//////////////////////////////////////

	public void actionPerformed(ActionEvent e) {
		
		JButton bottone;
		bottone = (JButton) e.getSource();
		
		
		
	}
	
	// ******* Gestione JTextField *************
		public void keyTyped(KeyEvent e) {}
		public void keyPressed(KeyEvent e) {}
		public void keyReleased(KeyEvent e) {}


		// ********* Gestione JFrame *******************
		public void windowOpened(WindowEvent e) {}
		public void windowClosed(WindowEvent e) {}
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		public void windowIconified(WindowEvent e) {}
		public void windowDeiconified(WindowEvent e) {}
		public void windowActivated(WindowEvent e) {}
		public void windowDeactivated(WindowEvent e) {}

		
		public static void main(String[] args){
			
			Main mainGUI = new Main();
			
		}
}

