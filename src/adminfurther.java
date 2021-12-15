import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class adminfurther {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminfurther window = new adminfurther();
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
	public adminfurther() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 584, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBounds(249, 111, 0, -32);
		frame.getContentPane().add(list);
		
		JLabel lblNewLabel = new JLabel("Admin Panel");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(182, 31, 172, 88);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnUser = new JButton("User Details");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File file = new File("wasil.txt");
				try {
					Scanner scan = new Scanner(file);
					System.out.println("______________________________________________________________________________________________________________________________________________________________________________");
					
					while(scan.hasNextLine())
					{
						System.out.println(scan.nextLine());
					}
				
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnUser.setBounds(205, 214, 149, 56);
		frame.getContentPane().add(btnUser);
		
		JButton btnBookDetails = new JButton("Books details");
		btnBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
				
				
				frame = new JFrame();
				frame.setBounds(100, 100, 672, 523);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JLabel lblNewLabel = new JLabel("Subjects");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setBounds(213, 74, 189, 45);
				frame.getContentPane().add(lblNewLabel);
				
				JButton btnNewButton = new JButton("Computer");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						File file = new File("Computer.txt");
						try {
							Scanner scan = new Scanner(file);
							
							System.out.println("______________________________________________________________________________________________________________________________________________________________________________");
							while(scan.hasNextLine())
							{
								System.out.println(scan.nextLine());
							}
						
							
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				
				btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnNewButton.setBounds(213, 130, 189, 56);
				frame.getContentPane().add(btnNewButton);
				
				JButton btnEnginerring = new JButton("Engineering");
				btnEnginerring.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						File file = new File("Engineering.txt");
						try {
							Scanner scan = new Scanner(file);
							
							System.out.println("______________________________________________________________________________________________________________________________________________________________________________");
							while(scan.hasNextLine())
							{
								System.out.println(scan.nextLine());
							}
						
							
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						}
				});
				btnEnginerring.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnEnginerring.setBounds(213, 197, 189, 56);
				frame.getContentPane().add(btnEnginerring);
				
				JButton btnMaths = new JButton("Maths");
				btnMaths.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						File file = new File("Maths.txt");
						
						System.out.println("______________________________________________________________________________________________________________________________________________________________________________");
						try {
							Scanner scan = new Scanner(file);
							
							
							while(scan.hasNextLine())
							{
								System.out.println(scan.nextLine());
							}
						
							
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						}
					
				});
				btnMaths.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnMaths.setBounds(213, 264, 189, 56);
				frame.getContentPane().add(btnMaths);
				
				JButton btnIslamicHistory = new JButton("Biology");
				btnIslamicHistory.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						File file = new File("biology.txt");
						
						System.out.println("______________________________________________________________________________________________________________________________________________________________________________");
						try {
							Scanner scan = new Scanner(file);
							
							
							while(scan.hasNextLine())
							{
								System.out.println(scan.nextLine());
							}
						
							
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
					
					
					}
				});
				btnIslamicHistory.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnIslamicHistory.setBounds(213, 331, 189, 56);
				frame.getContentPane().add(btnIslamicHistory);
				
				JButton btnBack = new JButton("Back");
				btnBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.dispose();
						adminfurther af4 = new adminfurther();
					}
				});
				btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnBack.setBounds(10, 415, 120, 40);
				frame.getContentPane().add(btnBack);
			}
			
			
		});
		btnBookDetails.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBookDetails.setBounds(205, 297, 149, 56);
		frame.getContentPane().add(btnBookDetails);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main flms2 = new Main();
				frame.dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBack.setBounds(10, 376, 111, 30);
		frame.getContentPane().add(btnBack);
		frame.setVisible(true);
	}
}
