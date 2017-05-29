package code.sStrina3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
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
public class GitGUI extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton alfa;
	private JTextPane beta;

	public GitGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		alfa = new JButton("New button");
		alfa.addActionListener(this);
		contentPane.add(alfa, BorderLayout.SOUTH);
		
		beta = new JTextPane();
		contentPane.add(beta, BorderLayout.CENTER);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			BufferedReader rb = new BufferedReader(new FileReader(new File("src//code//sStrina3//log.txt")));
			Vector<String> log = new Vector<String>();
			
			while(rb.ready())
			{
				log.add(rb.readLine());
				System.out.println("arabia");
				System.out.println(log.get(0));
			}
			
			beta.setText(log.toString());
			this.repaint();
			this.revalidate();
			
			rb.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("arabia");
		}
		
	}

}
