package Operating_System;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fifo_1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fifo_1 frame = new Fifo_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param input 
	 * @param frames 
	 */
	AlgorithmFunctions obj = new AlgorithmFunctions();
	private DefaultCategoryDataset createDataset(int frames, String input) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		String series1 = "LRU";  
	    String series2 = "fifo";  
	    String series3 = "OPR";
	    
	    int temp = 0;
	    if((frames-3) >0) {
    		temp = frames-3;
    	}
    	else
    		temp = 1;
	    for(int i=0;i<8;i++) {
	    	 dataset.addValue(obj.LruFunction(temp, input), series1, String.valueOf(temp)); 
	    	 dataset.addValue(obj.FifoFunction(temp, input), series2, String.valueOf(temp)); 
	    	 dataset.addValue(obj.OprFunction(temp, input), series3, String.valueOf(temp)); 
	    	 temp++;
	    }
	    
		return dataset;
	}
	
	public Fifo_1() {
             
              
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		panel.setAlignmentY(0.0f);
		panel.setAlignmentX(0.0f);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		setBounds(100, 100, 1024, 668);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel_7 = new JLabel("\"1\" \r\n Page fault");
		lblNewLabel_7.setFocusable(false);
		lblNewLabel_7.setFocusTraversalKeysEnabled(false);
		lblNewLabel_7.setInheritsPopupMenu(false);
		lblNewLabel_7.setRequestFocusEnabled(false);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		
		JLabel lblPageHit = new JLabel("\"0\" \r\n Page Hit");
		lblPageHit.setVerifyInputWhenFocusTarget(false);
		lblPageHit.setFocusable(false);
		lblPageHit.setFocusTraversalKeysEnabled(false);
		lblPageHit.setInheritsPopupMenu(false);
		lblPageHit.setHorizontalAlignment(SwingConstants.CENTER);
		lblPageHit.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		scrollPane_1.setBorder(null);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 419, Short.MAX_VALUE)
							.addComponent(lblPageHit, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addGap(177))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel_1, 0, 0, Short.MAX_VALUE)
									.addContainerGap())
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 850, GroupLayout.PREFERRED_SIZE)
									.addGap(25))))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 623, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPageHit)
								.addComponent(lblNewLabel_7))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel = new JLabel("First In First Out");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		JLabel lblNewLabel_1 = new JLabel("No.of Frame:");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
		
		JLabel lblNewLabel_2 = new JLabel("Input Page No.:");
		lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
		
		JLabel lblNewLabel_3 = new JLabel("Total Page Fault:");
		lblNewLabel_3.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
		
		textField = new JTextField();
		textField.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("0");
		lblNewLabel_4.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
		
		
		
		JLabel lblNewLabel_5 = new JLabel("Hit Rate:");
		lblNewLabel_5.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
		
		JLabel lblNewLabel_6 = new JLabel("0%");
		lblNewLabel_6.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
		
		
		JButton btnNewButton = new JButton("Implement");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=0,ct=0,num=0;
				String tempstr="";
				int frames = Integer.parseInt(textField.getText());
				String input = textField_1.getText();
				
				int[] farray = new int[frames];
				int[] pages = new int[input.length()];
				for(i=0;i<frames;i++)
				{
					farray[i]=-1;
				}
				
				i = 0;
				while(i<input.length()) {
					
					if(!Character.isWhitespace(input.charAt(i))) {
						tempstr+=input.charAt(i);
					}	
					else {
						pages[ct]=Integer.parseInt(tempstr);
						ct++;
						tempstr = "";
					}
					if(i == input.length()-1)
						pages[ct]=Integer.parseInt(tempstr);
					i++;
				}
				boolean flag = true;
				int pageHit =0;
				int length  = ct+1;
			    int arry[][] = new int[frames+1][length];
			   String processstr[][] = new String[frames+1][length];
			   String arraystr[] = new String[length];
				  for(i=0; i<length; i++)
			        {
			            flag = true;
			            int page = pages[i];
			            for(int j=0; j<frames; j++)
			            {
			                if(farray[j] == page)
			                {
			                	
			                    flag = false;
			                    pageHit++;
			                    for(j=0;j<frames;j++)
			                    {
			                    	arry[j][i] = farray[j];	
			                    }
			                    arry[frames][i] = 0;
			                    break;
			                }
			            }
			            if(num == frames)
			                num = 0;
			          
			            if(flag)
			            {
			                farray[num] = page;
			                for(int j=0;j<frames;j++)
			                {
			                arry[j][i] = farray[j];}
			                arry[frames][i] = 1;
			                num++;
			            }
				
			        }
				  for(i=0;i<frames+1;i++)
				  {
					  for(int j=0;j<length;j++)
					  {
						 if(i == frames) {
							 if(arry[i][j] == 1) {
									processstr[i][j] = String.valueOf("Fault");
								}
								else
									processstr[i][j] = String.valueOf("Hit");
						 }
						 else
							 processstr[i][j] = String.valueOf(arry[i][j]);
					  }
				  }
				  for(i=0;i<length;i++)
				  {
					  arraystr[i]= String.valueOf(pages[i]);
				  }
				  String pfault = String.valueOf(length - pageHit);
			      lblNewLabel_4.setText(pfault);
			       hit = (float)pageHit/length;
			       hit = hit*100;
			      DecimalFormat df = new DecimalFormat("#.##");
				     hitrate = df.format(hit);
				     hitrate = hitrate+"%";
				     lblNewLabel_6.setText(hitrate);
			      
				  DefaultTableModel dtm = new DefaultTableModel(processstr, arraystr);
					 table_1 = new JTable(dtm){
				         /**
						 * 
						 */
						private static final long serialVersionUID = 1L;

						public boolean editCellAt(int row, int column, java.util.EventObject e) {
				             return false;
				          }
				       };
				       table_1.setEnabled(false);
				       table_1.setRowSelectionAllowed(false);
					 
				    table_1.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
				    
				    if((frames+1) <=6)
				    	 table_1.setRowHeight(275/(frames+1));
				    else
				    	 table_1.setRowHeight(50 - (25/(frames+1)));
				    
				    /*int width = 50*length;
					int height = 50*frames;
					//scrollPane_1.setBounds(500, 400, width, height);
					//table_1.setBounds(50, 397, width, height);*/
					scrollPane_1.setViewportView(table_1);
			}
		});
		
		btnNewButton.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("0");
				textField_1.setText("0");
				lblNewLabel_4.setText("0");
				lblNewLabel_6.setText("0%");
				table_1.setVisible(false);
				table_1.setTableHeader(null);
				
			}
		});
		btnNewButton_1.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
		
		JButton btnNewButton_2 = new JButton("Graph");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int frames = Integer.parseInt(textField.getText());
				String input = textField_1.getText();
				
				//creating dataset
				DefaultCategoryDataset dataset = createDataset(frames,input);
				//creating chart
				JFreeChart chart = ChartFactory.createLineChart("Page Replacement Algorithms", "Frames", "Page Faults", dataset);
				
				CategoryPlot plot = chart.getCategoryPlot();
				LineAndShapeRenderer renderer = new LineAndShapeRenderer();
				plot.setRenderer(renderer);
				renderer.setSeriesStroke(0, new BasicStroke(2.0f));
				renderer.setSeriesStroke(1, new BasicStroke(2.0f));
				renderer.setSeriesStroke(2, new BasicStroke(2.0f));
				renderer.setSeriesStroke(3, new BasicStroke(2.0f));
				plot.setBackgroundPaint(Color.DARK_GRAY);
				plot.setRangeGridlinesVisible(true);
			    plot.setRangeGridlinePaint(Color.BLACK);
			    plot.setDomainGridlinesVisible(true);
			    plot.setDomainGridlinePaint(Color.BLACK);
				
				ChartFrame frame = new ChartFrame("Page Replacement Algorithm",chart);
				frame.setVisible(true);
				frame.setSize(800, 600);
				frame.setAlwaysOnTop(true);
				
			}
		});
		btnNewButton_2.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(237)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(292, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(262)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(308, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(171)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_2)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addGap(299))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(181)
					.addComponent(lblNewLabel_2)
					.addGap(10)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(243, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(234)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_3))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblNewLabel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_6, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(364, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(23)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(31)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_4))
					.addGap(6)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_6))
					.addGap(278))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(10, 0, 119, 612);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setIcon(new ImageIcon(Fifo_1.class.getResource("/Images/Disc.jpeg")));
		panel.setLayout(null);
		
		JLabel label_4 = new JLabel("New label");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				About_Us frame210 = new About_Us();
				frame210.show();
			}
		});
		label_4.setIcon(new ImageIcon(Fifo_1.class.getResource("/Images/Team.png")));
		label_4.setBounds(35, 494, 64, 68);
		panel.add(label_4);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon(Fifo_1.class.getResource("/Images/Quiz.png")));
		label_3.setBounds(35, 379, 64, 68);
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			Quiz2 qwe = new Quiz2();
			qwe.show();
			}});
		panel.add(label_3);
		
		JLabel label_2 = new JLabel("New label");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Simulation jf7 = new Simulation();
				jf7.show();
			}
		});
		label_2.setIcon(new ImageIcon(Fifo_1.class.getResource("/Images/Simulator (2).png")));
		label_2.setBounds(35, 282, 64, 68);
		panel.add(label_2);
		
		JLabel label_1 = new JLabel("New label");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				GUI frame134 = new GUI();
				frame134.show();
			}
		});
		label_1.setIcon(new ImageIcon(Fifo_1.class.getResource("/Images/Algorithms.png")));
		label_1.setBounds(35, 170, 64, 68);
		panel.add(label_1);
		
		JLabel label = new JLabel("New label");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
		        Firstpage frame12 = new Firstpage();
		        frame12.show();
		        
			}
		});
		label.setIcon(new ImageIcon(Fifo_1.class.getResource("/Images/home.png")));
		label.setBounds(35, 44, 64, 68);
		panel.add(label);
		panel.add(lblNewLabel_8);
		getContentPane().setLayout(groupLayout);
		
	}


	/**
	 * Initialize the contents of the frame.
	 */
	int frames;
	float hit;
	boolean flag;
	int pageHit=0;
	String pfault="";
	String hitrate="";
	int farray[];
	int pages[];
	private JTextField textField;
	private JTextField textField_1;
	private JTable table_1;
	}


