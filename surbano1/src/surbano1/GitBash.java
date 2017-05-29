package surbano1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.GridLayout;

public class GitBash extends JFrame implements WindowListener, ActionListener{
	private JButton button = new JButton("stampa");
	private JTextPane pannel = new JTextPane();
	
	public GitBash()
	{
		this.setSize(500,500);
		this.setLayout(new GridLayout(2,1));
		
		this.add(button);
		this.add(pannel);
		
		this.addWindowListener(this);
		button.addActionListener(this);

		this.setVisible(true);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
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
	
	public static void main(String[] args)
	{
		GitBash g = new GitBash();
	}
	
}
