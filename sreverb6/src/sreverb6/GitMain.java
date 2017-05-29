package sreverb6;

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
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class GitMain extends JFrame implements WindowListener, ActionListener {
	private JButton button = null;
	private JTextPane testo = null;

	public GitMain() {
		this.setLayout(new GridLayout(2, 1));
		
		this.addWindowListener(this);
		this.setSize(500, 200);

		button = new JButton("Apri");
		testo = new JTextPane();

		button.addActionListener(this);
		this.add(testo);
		this.add(button);

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
		Vector<String> log = new Vector<String>(3);

		if (arg0.getSource() == button) {
			try {
				br = new BufferedReader(new FileReader(new File("log.txt")));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				while ((linea = br.readLine()) != null)
					log.add(linea);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			testo.setText(log.toString());

		}

	}

	public static void main(String[] args) {
		new GitMain();
	}
}
