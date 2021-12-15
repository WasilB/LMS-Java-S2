import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Ml {

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
					Ml window = new Ml();
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
	public Ml() {
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
		
		JLabel lblNewLabel = new JLabel("Maths");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(120, 32, 346, 57);
		frame.getContentPane().add(lblNewLabel);
		
		JList list = new JList();
		list.setBounds(395, 258, -169, -86);
		frame.getContentPane().add(list);
		
		JList<?> list_1 = new JList();
		list_1.setToolTipText("");
		list_1.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				
				bn = list_1.getSelectedIndex();
				bn1 = (String) list_1.getSelectedValue();

			}
		});
		list_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"1. What Is Mathematics?", "2. G\u00F6del, Escher, Bach: an Eternal Golden Braid", "3. Zero: The Biography of a Dangerous Idea", "4. Journey through Genius", "5. Humble Pi: A Comedy of Maths Errors", "6. In Pursuit of the Unknown: 17 Equations That Changed the World", "7. A History of Pi", "8. The Princeton Companion to Mathematics", "9. Philosophi\u00E6 Naturalis Principia Mathematica", "10. Four Colors Suffice: How the Map Problem was Solved"};
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
							Ml c2 = new Ml();
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
							String[] values = new String[] {"What Is Mathematics? is a mathematics book written by Richard Courant and Herbert Robbins, published in England by Oxford University Press. It is an introduction to mathematics, intended both for the mathematics student and for the general public,\r\n", "Originally published: 1989."};
							public int getSize() {
								return values.length;
							}
							public Object getElementAt(int index) {
								return values[index];
							}
						});
					} else if(bn == 1) {
						
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
else if(bn == 2) {
						
						list_2.setModel(new AbstractListModel() {
							String[] values = new String[] {
									 "Zero: The Biography of a Dangerous Idea is a non-fiction book by American author and journalist Charles Seife. The book was initially released on February 7, 2000 by Viking\r\n"
									,"Originally published: February 7, 2000"};
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
		String[] values = new String[] {"Like masterpieces of art, music, and literature, great mathematical theorems are creative milestones, works of genius destined to last forever. Now William Dunham gives them the attention they deserve.\r\n"
				, "Originally published: March 30, 1990\r\n"
				+ ""};
		public int getSize() {
			return values.length;
		}
		public Object getElementAt(int index) {
			return values[index];
		}
	});
	
}else if(bn == 4) {
	
	list_2.setModel(new AbstractListModel() {
		String[] values = new String[] {"#1 INTERNATIONAL BESTSELLER   AN ADAM SAVAGE BOOK CLUB PICKThe book-length answer to anyone who ever put their hand up in math class and asked, “When am I ever going to use this in the real world?\r\n"
				, "Originally published: March 7, 2019"};
		public int getSize() {
			return values.length;
		}
		public Object getElementAt(int index) {
			return values[index];
		}
	});
	
}else if(bn == 5) {
	
	list_2.setModel(new AbstractListModel() {
		String[] values = new String[] {"From Newton's Law of Gravity to the Black-Scholes model used by bankers to predict the markets, equations, are everywhere - and they are fundamental to everyday life. Seventeen Equations that Changed the World examines seventeen groundbreaking equations that have altered the course of human history.\r\n"
				, "Originally published: February 2, 2012"};
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
		String[] values = new String[] {" A History of Pi is a 1970 non-fiction book by Petr Beckmann that presents a layman's introduction to the concept of the mathematical constant pi.\r\n"
				, "Originally published: 1970"};
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
		String[] values = new String[] {"The Princeton Companion to Mathematics is a book, edited by Timothy Gowers with associate editors June Barrow-Green and Imre Leader, and published in 2008 by Princeton University Press. It provides an extensive overview of mathematics, and is noted for the high caliber of the contributors.\r\n"
				, "Originally published: September 8, 2008"};
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
		String[] values = new String[] {"Philosophiæ Naturalis Principia Mathematica by Isaac Newton, often referred to as simply the Principia, is a work in three books written in Latin, first published 5 July 1687\r\n"
				, "Originally published: July 5, 1687"};
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
		String[] values = new String[] {"A puzzlers delight for over a century, the four-colour problem was one of the most famous conundrums in mathematics, if not the most famous, and many thousands of puzzlers - amateur problem-solvers and professional mathematicians alike - have struggled to answer it\r\n"
				, "Originally published: 2002"};
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
