import java.awt.EventQueue;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class userLogin {

	private JFrame frmLibraryManagmentSystem;
	/**
	 * @wbp.nonvisual location=219,4
	 */
	private final JButton button = new JButton("New button");
	private JTextField NameText;
	private JTextField SapText;
	private JTextField DepText;
	private JButton btnSap;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userLogin window = new userLogin();
					window.frmLibraryManagmentSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public userLogin() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	@SuppressWarnings("resource")
	private void initialize() throws IOException {
		
		
		//File data1 = new File("D:\\Wasil\\dataa.txt");
	
		
		frmLibraryManagmentSystem = new JFrame();
		frmLibraryManagmentSystem.getContentPane().setBackground(new Color(0, 0, 128));
		frmLibraryManagmentSystem.setBackground(new Color(0, 0, 128));
		frmLibraryManagmentSystem.setTitle("Library Managment System");
		frmLibraryManagmentSystem.setBounds(100, 100, 651, 618);
		frmLibraryManagmentSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibraryManagmentSystem.getContentPane().setLayout(null);
		
		JButton btnName = new JButton("Name");
		btnName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnName.setBounds(179, 177, 105, 33);
		frmLibraryManagmentSystem.getContentPane().add(btnName);
		
		NameText = new JTextField();
		NameText.setBounds(331, 177, 147, 32);
		frmLibraryManagmentSystem.getContentPane().add(NameText);
		NameText.setColumns(10);
		String name = NameText.getText();
		
		btnSap = new JButton("SapID");
		btnSap.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSap.setBounds(179, 244, 105, 33);
		frmLibraryManagmentSystem.getContentPane().add(btnSap);
		
		JButton btnDepartment = new JButton("Department");
		btnDepartment.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDepartment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDepartment.setBounds(179, 306, 105, 33);
		frmLibraryManagmentSystem.getContentPane().add(btnDepartment);
		
		SapText = new JTextField();
		SapText.setBounds(331, 244, 147, 33);
		frmLibraryManagmentSystem.getContentPane().add(SapText);
		SapText.setColumns(10);
		String sap = SapText.getText();
		
		DepText = new JTextField();
		DepText.setBounds(331, 307, 147, 32);
		frmLibraryManagmentSystem.getContentPane().add(DepText);
		DepText.setColumns(10);
		String dep = DepText.getText();
		/*FileOutputStream fos = null;
		File dataa;
		dataa = new File("D:\\Wasil\\dataa.txt");
		fos = new FileOutputStream(dataa);
		byte[] bytesArray = name.getBytes();
		byte[] bytesArray1 = dep.getBytes();
		byte[] bytesArray2 = sap.getBytes();
		*/
		
		JButton btnSubmitUser = new JButton("Submit");
		btnSubmitUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String name = NameText.getText();
					String sap = SapText.getText();
					String dep = DepText.getText();
					frmLibraryManagmentSystem.dispose();
					
					FileWriter writer = new FileWriter("wasil.txt",true);
					writer.write("Name: "+name+"\n"+"Sap ID: "+sap+"\n"+"Department: "+dep);
					writer.write(System.getProperty("line.separator"));
					writer.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				// FIX tHisssssssssssssssssss
				if(NameText.getText().equals("")||DepText.getText().equals("")||SapText.getText().equals(""))
				{
					JOptionPane.showMessageDialog(btnSubmitUser, "Please fill the form.You cannot leave it empty.");
					try {
						userLogin fm1 = new userLogin();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else
				{
					JOptionPane.showMessageDialog(btnSubmitUser, "Information Submited!");
					subjectMenu sM1 = new subjectMenu();
				}
			}
		});
		
			
				
				
		
		btnSubmitUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSubmitUser.setBounds(234, 390, 167, 44);
		frmLibraryManagmentSystem.getContentPane().add(btnSubmitUser);
		
		btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main m3 = new Main();
				frmLibraryManagmentSystem.dispose();
			}
		});
		btnNewButton.setBounds(10, 390, 99, 44);
		frmLibraryManagmentSystem.getContentPane().add(btnNewButton);
		frmLibraryManagmentSystem.setVisible(true);
		
		
	}
	

}
