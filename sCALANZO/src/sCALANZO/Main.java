package sCALANZO;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import javax.swing.*;

import java.net.*;


public class Main extends JFrame implements ActionListener, KeyListener, WindowListener {
	
	JTextArea logContent;
	JButton openLog;
	
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

		/*
		 * 	Open File Button
		 */
	    
	    openLog = new JButton("Open Log File");
	    
	    openLog.setLocation(420, 500);
	    openLog.setSize(150,150);
	    openLog.addActionListener(this);
	    
	    this.add(openLog);
		
	    /*
		 * 	Log file content
		 */
	    
	    logContent = new JTextArea();
	    
	    JScrollPane sp = new JScrollPane(logContent);  
	    sp.setLocation(20, 500);
	    sp.setSize(380,150);
	    
	    this.add(sp);
	    
		this.setResizable(false);
		this.setVisible(true);
		
	}

	//////////////////////////////////////

	public void actionPerformed(ActionEvent e) {
		
		JButton bottone;
		bottone = (JButton) e.getSource();
		
		if(bottone == openLog){
			
			String logText = new String();
			
			/*
			 *	Creating Log file 
			 */
			
			try {
				
				String boxContent = new String();
				
				// Running command
				
				Process p = Runtime.getRuntime().exec("git log");
			    InputStream i = p.getInputStream();
			    InputStreamReader isr = new InputStreamReader(i);
			    BufferedReader br = new BufferedReader(isr);

			    File f = new File("output.txt");
			    FileWriter fw = new FileWriter(f);            // for appending use (f,true)
			    BufferedWriter bw = new BufferedWriter(fw);
			 
			    while((br.readLine())!=null){
			    
			    	boxContent += br.readLine() + "\n";
			    	bw.write(br.readLine());
			    
			    }
			    
			    logContent.setText(boxContent);
			    
			    bw.close();
			    fw.close();
			    	
			} catch (IOException e1) {
			
				JOptionPane.showMessageDialog(null, e1);
				
			}
			
		}
		
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

