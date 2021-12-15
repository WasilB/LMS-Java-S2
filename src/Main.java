import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Main {

	JFrame frmLibraryManagmentSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmLibraryManagmentSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLibraryManagmentSystem = new JFrame();
		frmLibraryManagmentSystem.getContentPane().setBackground(Color.WHITE);
		frmLibraryManagmentSystem.setTitle("Library Managment System");
		frmLibraryManagmentSystem.setBounds(100, 100, 693, 546);
		frmLibraryManagmentSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibraryManagmentSystem.getContentPane().setLayout(null);
		
		JButton btnAdmin = new JButton("Admin Login");
		btnAdmin.setBackground(Color.WHITE);
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLibraryManagmentSystem.dispose();
				frmLibraryManagmentSystem.setVisible(false);
				adminlogin admin1 = new adminlogin();
				
			}
		});
		btnAdmin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAdmin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnAdmin.setBounds(244, 295, 209, 70);
		frmLibraryManagmentSystem.getContentPane().add(btnAdmin);
		
		JButton btnUser = new JButton("User Login");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLibraryManagmentSystem.dispose();
				frmLibraryManagmentSystem.dispose(); 
				try {
					userLogin UL1 = new userLogin();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnUser.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnUser.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnUser.setBounds(244, 376, 209, 70);
		frmLibraryManagmentSystem.getContentPane().add(btnUser);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon("D:\\Wasil\\images\\download1.png"));
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setBounds(10, 11, 657, 273);
		frmLibraryManagmentSystem.getContentPane().add(logo);
		
		frmLibraryManagmentSystem.setVisible(true);
	}
}
