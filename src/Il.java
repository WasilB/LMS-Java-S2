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

public class Il {

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
					Il window = new Il();
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
	public Il() {
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
		
		JLabel lblNewLabel = new JLabel("Biology");
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
			String[] values = new String[] {"1. Stern's Introductory Plant Biology", "2. Raven Biology of Plants", "3. Laboratory Manual for Stern's Introductory Plant Biology", "4. Exploring Biology in the Laboratory", "5. A Beginner's Guide to Targeted Cancer Treatments", "6. Fundamentals of Systems Biology", "7. Ultimate AP Biology: Everything you need to get a 5 Ultimate AP Biology", "8. Concepts of Biology", "9. Molecular and Cell Biology of Cancer: When Cells Break the Rules and Hijack Their Own Planet", "10. Intermediate Physics for Medicine and Biology"};
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
							Il c2 = new Il();
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
							String[] values = new String[] {"This introductory text assumes little prior scientific knowledge on the part of the student. It includes sufficient information for some shorter introductory botany courses open to both majors and nonmajors, and is arranged so that certain sections can be omitted without disrupting the overall continuity of the course. Stern emphasizes current interests while presenting basic botanical principles. This latest edition incorporates measurable learning outcomes and updated readings", "Originally published: 2017."};
							public int getSize() {
								return values.length;
							}
							public Object getElementAt(int index) {
								return values[index];
							}
						});
					} else if(bn == 1) {
						
						list_2.setModel(new AbstractListModel() {
							String[] values = new String[] {"Long acclaimed as the definitive introductory botany text, Raven Biology of Plants, Eighth Edition by Ray Evert, Susan Eichhorn, stands as the most significant revision in the book’s history. Every topic was updated with information obtained from the most recent primary literature, making the book valuable for both students and professionals."
									, "Originally published: 2012"};
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
									 "This laboratory manual assumes no previous knowledge of the biological sciences on the part of the student. It is designed for use in a one-semester or one-quarter introductory course in plant biology and shorter introductory botany courses open to both nonmajors and majors.Both the principles of biology and the scientific method are introduced, using plants as illustrations. The exercises demonstrate the underlying unity of all living organisms at the cellular level.The manual is designed so that students can work independently"
									,"Originally published: 2017"};
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
		String[] values = new String[] {"This full-color, comprehensive, affordable introductory biology manual is appropriate for both majors and nonmajors laboratory courses. All general biology topics are covered extensively, and the manual is designed to be used with a minimum of outside reference material. The activities emphasize the unity of all living things and the evolutionary forces that have resulted in, and continue to act on, the diversity that we see around us today. Features: An extensive full-color art and photography program includes many specimen and dissection images, labeled diagrams, cladograms, and helpful life-cycle illustrations"
				, "Originally published: 2018\r\n"
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
		String[] values = new String[] {"Highly Commended in the category of Oncology at the British Medical Association Awards 2019 The accessible guide to the principles behind new, more targeted drug treatments for cancer Written for anyone who encounters cancer patients, cancer data or cancer terminology, but have no more than a passing knowledge of cell biology. A Beginner's Guide to Targeted Cancer Treatments provides an understanding of how cancer works and the many new treatments available."
				, "Originally published: 2018"};
		public int getSize() {
			return values.length;
		}
		public Object getElementAt(int index) {
			return values[index];
		}
	});
	
}else if(bn == 5) {
	
	list_2.setModel(new AbstractListModel() {
		String[] values = new String[] {"For decades biology has focused on decoding cellular processes one gene at a time, but many of the most pressing biological questions, as well as diseases such as cancer and heart disease, are related to complex systems involving the interaction of hundreds, or even thousands, of gene products and other factors. How do we begin to understand this complexity? Fundamentals of Systems Biology: From Synthetic Circuits to Whole-cell Models introduces students to methods they can use to tackle complex systems head-on, carefully walking them through studies that comprise the foundation and frontier of systems biology."
				, "Originally published: 2017"};
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
		String[] values = new String[] {" Find everything you need to score a 5 on your AP Biology exam—and save over 20% OFF items when purchased separately! This Ultimate study pack features three must-have tools to help you prepare and succeed on exam day. It includes: Barron's AP BIOLOGY This fully updated, must-have manual includes 3 full-length tests (two in the book and one online), all questions thoroughly answered and explained, an extensive review covering all AP test topics, hundreds of additional multiple-choice and free-response practice questions with answer explanations, test-taking tactics and strategies. 560 pp."
				, "Originally published: 2018"};
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
		String[] values = new String[] {"Concepts of Biology is designed for the introductory biology course for nonmajors taught at most two- and four-year colleges. The scope, sequence, and level of the program are designed to match typical course syllabi in the market. Concepts of Biology includes interesting applications, features a rich art program, and conveys the major themes of biology."
				, "Originally published: 2013"};
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
		String[] values = new String[] {"This textbook takes you on a journey to the basic concepts of cancer biology. It combines developmental, evolutionary and cell biology perspectives, to then wrap-up with an integrated clinical approach.The book starts with an introductory chapter, looking at cancer in a nut shell. The subsequent chapters are detailed and the idea of cancer as a mass of somatic cells undergoing a micro-evolutionary Darwinian process is explored. Further, the main Hanahan and Weinberg “Hallmarks of Cancer” are revisited.  In most chapters, the fundamental experiments that led to key concepts, connecting basic biology and biomedicine are highlighted."
				, "Originally published: 2019"};
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
		String[] values = new String[] {"This classic text has been used in over 20 countries by advanced undergraduate and beginning graduate students in biophysics, physiology, medical physics, neuroscience, and biomedical engineering. It bridges the gap between an introductory physics course and the application of physics to the life and biomedical sciences. \r\n"
				+ "Extensively revised and updated, the fifth edition incorporates new developments at the interface between physics and biomedicine."
				, "Originally published: 2015"};
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
