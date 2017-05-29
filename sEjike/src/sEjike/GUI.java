package sEjike;

import java.awt.BorderLayout;
import java.io.FileOutputStream;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.EventQueue;
public class GUI extends JFrame {

	private JPanel contentPane;
private File f;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI()
	{
		f = new File ("log.txt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnSalvaFile = new JButton("Salva");
		btnSalvaFile.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(f.exists())
				{
					FileOutputStream fos = null;
					try {
						
					 fos = new FileOutputStream  ("log.txt",true);
					 PrintWriter Scrivi = new PrintWriter(f);
						Scrivi.close();
						
				
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Il file esiste");
					
				} 
			}
		});
		contentPane.add(btnSalvaFile, BorderLayout.CENTER);
	}

}

