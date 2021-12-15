import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class subjectMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					subjectMenu window = new subjectMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public subjectMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 672, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Subjects");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(213, 74, 189, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Computer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Cl cl1 = new Cl();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(213, 130, 189, 56);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEnginerring = new JButton("Engineering");
		btnEnginerring.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			El el1 = new El();}
		});
		btnEnginerring.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEnginerring.setBounds(213, 197, 189, 56);
		frame.getContentPane().add(btnEnginerring);
		
		JButton btnMaths = new JButton("Maths");
		btnMaths.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Ml ml1 = new Ml();}
			
		});
		btnMaths.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMaths.setBounds(213, 264, 189, 56);
		frame.getContentPane().add(btnMaths);
		
		JButton btnIslamicHistory = new JButton("Biology");
		btnIslamicHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			Il il1 = new Il();}
		});
		btnIslamicHistory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIslamicHistory.setBounds(213, 331, 189, 56);
		frame.getContentPane().add(btnIslamicHistory);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				try {
					userLogin sL1 = new userLogin();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(10, 415, 120, 40);
		frame.getContentPane().add(btnBack);
		frame.setVisible(true);

	}
}
