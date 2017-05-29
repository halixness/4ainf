package sghirini;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class MainGUI extends JFrame implements WindowListener, ActionListener{
	private JButton b = new JButton("Apri log");
	private JTextPane tx = new JTextPane();
	
	public MainGUI()
	{
		this.addWindowListener(this);
		this.setSize(500, 200);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.lightGray);
		this.setLayout(new GridLayout(2,1));
		b.addActionListener(this);
		
		this.add(tx);
		this.add(b);
		
		this.setVisible(true);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String linea;
		BufferedReader br = null;
		ArrayList<String> record = new ArrayList<String>(3);
		
		if(arg0.getSource() == b)
		{
			try {
				br = new BufferedReader(new FileReader(new File("log.txt")));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
			try {
				while ((linea = br.readLine()) != null)
						record.add(linea);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			tx.setText(record.toString());
		
		}
		
	}
	
	public static void main(String[] args)
	{
		new MainGUI();
	}
}
