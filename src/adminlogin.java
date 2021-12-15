import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class adminlogin {

	private JFrame frmAdminLogin;
	private JTextField UNtextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminlogin window = new adminlogin();
					window.frmAdminLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public adminlogin() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdminLogin = new JFrame();
		frmAdminLogin.setTitle("Admin Login");
		frmAdminLogin.setBounds(100, 100, 450, 300);
		frmAdminLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminLogin.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("User name");
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblUserName.setBounds(138, 62, 100, 24);
		frmAdminLogin.getContentPane().add(lblUserName);
		
		UNtextField = new JTextField();
		UNtextField.setBounds(148, 103, 96, 19);
		frmAdminLogin.getContentPane().add(UNtextField);
		UNtextField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setBounds(138, 148, 100, 24);
		frmAdminLogin.getContentPane().add(lblPassword);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String user = UNtextField.getText();
			String pass = passwordField.getText();
			
			
			if(UNtextField.getText().equals("admin") && passwordField.getText().equals("admin"))
			{
				JOptionPane.showMessageDialog(submitButton, "Login Successful! ");
				
				adminfurther af1 = new adminfurther();
				frmAdminLogin.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(submitButton, "Incorrect Username or Password!");
			}
			}
			
		});
		submitButton.setBounds(295, 129, 85, 21);
		frmAdminLogin.getContentPane().add(submitButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main m2 = new Main();
				m2.frmLibraryManagmentSystem.setVisible(true);
				frmAdminLogin.dispose();
			}
		});
		btnBack.setBounds(295, 176, 89, 23);
		frmAdminLogin.getContentPane().add(btnBack);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(147, 183, 91, 20);
		frmAdminLogin.getContentPane().add(passwordField);
		
		frmAdminLogin.setVisible(true);
	}
}
