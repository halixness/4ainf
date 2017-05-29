package scapella;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class Git extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton alfa;
	private JTextPane beta;

	public Git() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		alfa = new JButton("Clicca il bottone");
		alfa.addActionListener(this);
		contentPane.add(alfa, BorderLayout.SOUTH);
		
		beta = new JTextPane();
		beta.setEditable(false);
		contentPane.add(beta, BorderLayout.CENTER);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			BufferedReader rb = new BufferedReader(new FileReader(new File("log.txt")));
			Vector<String> log = new Vector<String>();
			
			while(rb.ready())
			{
				log.add(rb.readLine());
			}
			
			beta.setText(log.toString());
			this.repaint();
			this.revalidate();
			
			rb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args)
	{
		new Git();
	}

}
