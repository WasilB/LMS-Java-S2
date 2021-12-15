import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class El {

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
					El window = new El();
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
	public El() {
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
		
		JLabel lblNewLabel = new JLabel("Engineering");
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
			String[] values = new String[] {"1. The Goal: A Process of Ongoing Improvement", "2. The Design of Everyday Things", "3. The Existential Pleasures of Engineering", "4. Skunk Works: A Personal Memoir of My Years at Lockheed", "5. Why Buildings Fall Down", "6. Engineering in the Mind\u2019s Eye", "7. The Seven Habits of Highly Effective People", "8. Unwritten Laws of Engineering: With Revisions and Additions", "9. The Four Hour Chef", "10. She Engineers"};
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
							El c2 = new El();
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
							String[] values = new String[] {"The Goal is a management-oriented novel by Eliyahu M. Goldratt, a business consultant known for his theory of constraints, and Jeff Cox, an author of multiple management-oriented novels. The Goal was originally published in 1984 and has since been revised and republished.", "Originally published: 1984."};
							public int getSize() {
								return values.length;
							}
							public Object getElementAt(int index) {
								return values[index];
							}
						});
					} else if(bn == 1) {
						
						list_2.setModel(new AbstractListModel() {
							String[] values = new String[] {"The Design of Everyday Things is a best-selling book by cognitive scientist and usability engineer Donald Norman about how design serves as the communication between object and user, and how to optimize that conduit of communication in order to make the experience of using the object pleasurable."
									, "Originally published: 1988"};
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
									 "Humans have always sought to change their environment--building houses, monuments, temples, and roads. In the process, they have remade the fabric of the world into newly functional objects that are also works of art to be admired"
									,"Originally published: 1976"};
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
		String[] values = new String[] {"This classic history of America's high-stakes quest to dominate the skies is \"a gripping technothriller in which the technology is real\" (New York Times Book Review). From the development of the U-2 to the Stealth fighter, Skunk Works is the true story of America's most secret and successful aerospace operation"
				, "Originally published: 1994\r\n"
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
		String[] values = new String[] {"Once upon a time, seven wonders of the world stood tall and brilliant and, it must have seemed, would stand forever, impervious to time and gravity. Now only one remains--the pyramid at Khufu, in the Egyptian desert near Cairo. All of the others have fallen down"
				, "Originally published: 1992"};
		public int getSize() {
			return values.length;
		}
		public Object getElementAt(int index) {
			return values[index];
		}
	});
	
}else if(bn == 5) {
	
	list_2.setModel(new AbstractListModel() {
		String[] values = new String[] {"Engineering and the Mind's Eye is a book by Eugene S. Ferguson, an engineer and historian of science and technology. It was published by MIT Press. In it, Ferguson discusses the importance of the mind's eye for the practicing engineer, including spatial visualization and visual thinking"
				, "Originally published: 1992"};
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
		String[] values = new String[] {" The 7 Habits of Highly Effective People, first published in 1989, is a business and self-help book written by Stephen R. Covey."
				, "Originally published: August 15, 1989"};
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
		String[] values = new String[] {"It's a little book with a big history. In the summer of 2005, the magazine Business 2.0 published a cover story on a self-published management pamphlet by William Swanson, CEO of American aerospace contractor Raytheon"
				, "Originally published: 1994"};
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
		String[] values = new String[] {"The 4-Hour Chef: The Simple Path to Cooking Like a Pro, Learning Anything, and Living the Good Life is the third book by Tim Ferriss, published on November 20, 2012. Like Ferriss' other \"4-Hour\" books, The 4-Hour Chef revolves around a theme of self-improvement through the lens of cooking"
				, "Originally published: November 20, 2012"};
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
		String[] values = new String[] {"Are you a female engineer or a manager of female engineers? Imagine a life where you choose your own career path. You love what you do. You are an influencer, a go-to person at your company and in your field. You aren’t working ridiculous hours. You have a life outside of work"
				, "Originally published:January 19, 2018"};
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
