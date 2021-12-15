import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Cl {

	private JFrame frame;
    int bn;
    String bn1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cl window = new Cl();
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
	public Cl() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 607, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Computer Sciences");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(120, 32, 346, 57);
		frame.getContentPane().add(lblNewLabel);
		
		JList list = new JList();
		list.setBounds(395, 258, -169, -86);
		frame.getContentPane().add(list);
		
		JList<?> list_1 = new JList();
		list_1.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				
				bn = list_1.getSelectedIndex();
				bn1 = (String) list_1.getSelectedValue();

			}
		});
		list_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"1. Introduction to Algorithms", "2. Code: The Hidden Language of Computer Hardware and Software", "3. Algorithms to Live By: The Computer Science of Human Decisions", "4. Structure and Interpretation of Computer Programs", "5. The C Programming Language", "6. Clean code", "7. G\u00F6del, Escher, Bach: an Eternal Golden Braid", "8. The Elements of Computing Systems: Building a Modern Computer from First Principles", "9. Algorithms", "10. Code Complete"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setBounds(10, 145, 540, 195);
		frame.getContentPane().add(list_1);
		
		JLabel lblNewLabel_1 = new JLabel("Select a book from the available list please.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(46, 97, 294, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNextCl = new JButton("Next");
		btnNextCl.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				if(bn >= 0 && bn <= 9)
				{
					frame = new JFrame();
					frame.setBounds(100, 100, 689, 506);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.getContentPane().setLayout(null);
					
					JList list = new JList();
					list.setBounds(76, 324, 356, -178);
					frame.getContentPane().add(list);
					
					JList list_1 = new JList();
					list_1.setBounds(177, 338, 314, -192);
					frame.getContentPane().add(list_1);
					
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setBounds(10, 157, 632, 208);
					frame.getContentPane().add(scrollPane);
					
					JButton btnIssue = new JButton("Issue Book");
					btnIssue.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							JOptionPane.showMessageDialog(btnIssue," "+ bn1+ "  has been issued to you.Please return the book in 7 days." );
							FileWriter writer = null;
							try {
								writer = new FileWriter("wasil.txt",true);
							} catch (IOException e3) {
								// TODO Auto-generated catch block
								e3.printStackTrace();
							}
							try {
								writer.write("\nBook Issued:"+bn1+"\n*******************************************************************************************************************************");
							} catch (IOException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
							try {
								writer.write(System.getProperty("line.separator"));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							try {
								writer.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							
							subjectMenu sbm88 = new subjectMenu();
							frame.dispose();
							
						}
					});
					btnIssue.setBounds(511, 387, 131, 51);
					frame.getContentPane().add(btnIssue);
					
					JLabel lblNewLabel = new JLabel("About the Book: ");
					lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
					lblNewLabel.setBounds(10, 112, 141, 45);
					frame.getContentPane().add(lblNewLabel);
					
					JButton btnBack = new JButton("Back");
					btnBack.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frame.dispose();
							Cl c2 = new Cl();
						}
					});
					btnBack.setBounds(10, 387, 131, 51);
					frame.getContentPane().add(btnBack);
					
					JLabel lblBookDetail = new JLabel(bn1);
					lblBookDetail.setFont(new Font("Tahoma", Font.BOLD, 12));
					lblBookDetail.setHorizontalAlignment(SwingConstants.CENTER);
					lblBookDetail.setBounds(10, 31, 600, 51);
					frame.getContentPane().add(lblBookDetail);
					frame.setVisible(true);
					
					JList<?> list_2 = new JList();
					scrollPane.setViewportView(list_2);
					
					if(bn == 0) {
						
						
						list_2.setModel(new AbstractListModel() {
							String[] values = new String[] {"Introduction to Algorithms is a book on computer programming by Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, and Clifford Stein.", "Originally published: 1989."};
							public int getSize() {
								return values.length;
							}
							public Object getElementAt(int index) {
								return values[index];
							}
						});
					} else if(bn == 1) {
						
						list_2.setModel(new AbstractListModel() {
							String[] values = new String[] {"Code: The Hidden Language of Computer Hardware and Software is a book by Charles Petzold that seeks to teach how personal computers work at a hardware and software level.\r\n"
									, "Originally published: October 23, 1999."};
							public int getSize() {
								return values.length;
							}
							public Object getElementAt(int index) {
								return values[index];
							}
						});
						
					}
else if(bn == 2) {
						
						list_2.setModel(new AbstractListModel() {
							String[] values = new String[] {"Algorithms to Live By: The Computer Science of Human Decisions\r\n"
									+ "A fascinating exploration of how computer algorithms can be applied to our everyday lives. In this dazzlingly interdisciplinary work, acclaimed author Brian Christian and cognitive scientist Tom Griffiths show us how the simple, precise algorithms used by computers can also untangle very human questions.\r\n"
									, "Originally published: April 19, 2016"};
							public int getSize() {
								return values.length;
							}
							public Object getElementAt(int index) {
								return values[index];
							}
						});
						
					}
else if(bn == 3) {
	
	list_2.setModel(new AbstractListModel() {
		String[] values = new String[] {"Structure and Interpretation of Computer Programs is a computer science textbook by Massachusetts Institute of Technology professors Harold Abelson and Gerald Jay Sussman with Julie Sussman. It is known as the Wizard Book in hacker culture.\r\n"
				, "Originally published: 1985"};
		public int getSize() {
			return values.length;
		}
		public Object getElementAt(int index) {
			return values[index];
		}
	});
	
}else if(bn == 4) {
	
	list_2.setModel(new AbstractListModel() {
		String[] values = new String[] {"The C Programming Language is a computer programming book written by Brian Kernighan and Dennis Ritchie, the latter of whom originally designed and implemented the language, as well as co-designed the Unix operating system with which development of the language was closely intertwined.\r\n"
				, "Originally published: 1978"};
		public int getSize() {
			return values.length;
		}
		public Object getElementAt(int index) {
			return values[index];
		}
	});
	
}else if(bn == 5) {
	
	list_2.setModel(new AbstractListModel() {
		String[] values = new String[] {"Clean code\r\n"
				+ "Even bad code can function. But if code isn’t clean, it can bring a development organization to its knees. Every year, countless hours and significant resources are lost because of poorly written code. But it doesn’t have to be that way\r\n"
				, "\nOriginally published: August 1, 2008"};
		public int getSize() {
			return values.length;
		}
		public Object getElementAt(int index) {
			return values[index];
		}
	});
	
}
else if(bn == 6) {
	
	list_2.setModel(new AbstractListModel() {
		String[] values = new String[] {"Gödel, Escher, Bach: an Eternal Golden Braid, also known as GEB, is a 1979 book by Douglas Hofstadter. By exploring common themes in the lives and works of logician Kurt Gödel, artist M. C. Escher, and composer Johann Sebastian Bach, the book expounds concepts fundamental to mathematics, symmetry, and intelligence.\r\n"
				, "Originally published: 1979"};
		public int getSize() {
			return values.length;
		}
		public Object getElementAt(int index) {
			return values[index];
		}
	});
	
}
else if(bn == 7) {
	
	list_2.setModel(new AbstractListModel() {
		String[] values = new String[] {"he Elements of Computing Systems: Building a Modern Computer from First Principles (Textbook by Noam Nisan and Shimon Schocken)\r\n"
				, "Originally published: 2005"};
		public int getSize() {
			return values.length;
		}
		public Object getElementAt(int index) {
			return values[index];
		}
	});
	
}
else if(bn == 8) {
	
	list_2.setModel(new AbstractListModel() {
		String[] values = new String[] {"Algorithms is a book written by Robert Sedgewick and Kevin Wayne. This book covers all the most important computer algorithms currently in use. The book teaches you searching, sorting, graph processing, and string processing.\r\n"
				+ "Book by Robert Sedgewick\r\n"
				, "Originally published: 1983"};
		public int getSize() {
			return values.length;
		}
		public Object getElementAt(int index) {
			return values[index];
		}
	});
	
}
else if(bn == 9) {
	
	list_2.setModel(new AbstractListModel() {
		String[] values = new String[] {"Code Complete is a software development book, written by Steve McConnell and published in 1993 by Microsoft Press, encouraging developers to continue past code-and-fix programming and the big design up front and waterfall models.\r\n"
				, "Originally published: 1993"};
		public int getSize() {
			return values.length;
		}
		public Object getElementAt(int index) {
			return values[index];
		}
	});
	
}			
				}	
			}
		});
		btnNextCl.setBounds(426, 374, 124, 37);
		frame.getContentPane().add(btnNextCl);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
				subjectMenu sm2 = new subjectMenu();
			}
		});
		btnBack.setBounds(22, 374, 124, 37);
		frame.getContentPane().add(btnBack);
		frame.setVisible(true);
		
		
	}
}
