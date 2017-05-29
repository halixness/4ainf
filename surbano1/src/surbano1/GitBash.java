package surbano1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileReader;
import javax.swing.AbstractButton;
import java.util.Vector;


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
		if(arg0.getSource() == button)
		{
			File f1 = new File("log.txt");
			FileReader fr = null;
				String frase;
				Vector v = new vector(3);
			
			try{
			fr = new FileReader(f1);
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			BufferReader button = new BufferReader(fr);
			
			try
			{
				while(frase = button.readLine() != null)
				{
					v.add(frase);
				}
			}	catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			pannel.setText(v.toString());
		}
		
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
