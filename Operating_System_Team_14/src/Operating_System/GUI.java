package Operating_System;
/** 
 * author @BadalParmar
 */
import Algorithms.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JOptionPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.ui.UIUtils;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Canvas;
import javax.swing.JProgressBar;
import java.awt.Panel;

public class GUI extends javax.swing.JFrame {

    private static JProgressBar progressBar;
	public GUI() {
    
		getContentPane().setBackground(new java.awt.Color(240, 223, 214));
		setLocationRelativeTo(null);
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Operating System Algorithms");
        setBackground(new java.awt.Color(33, 33, 33));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.red);
        setResizable(false);
        
        JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.BOTTOM);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.WHITE);
        tabbedPane_2.addTab("Disk Scheduling ", null, panel_1, null);
        panel_1.setLayout(null);
        
        JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane_3.setBounds(10, 11, 221, 66);
        panel_1.add(tabbedPane_3);
                        RB1 = new javax.swing.JRadioButton();
                        RB1.setToolTipText("First Come First Serve");
                        RB1.setHorizontalAlignment(SwingConstants.CENTER);
                        tabbedPane_3.addTab("1.", null, RB1, null);
                        RB1.setBackground(new Color(255, 222, 173));
                        
                                buttonGroup1.add(RB1);
                                RB1.setFont(new Font("Bookman Old Style", Font.BOLD, 14)); // NOI18N
                                RB1.setText("FCFS");
                                                        
                                                        tabbedPane_8 = new JTabbedPane(JTabbedPane.TOP);
                                                        tabbedPane_8.setBounds(10, 88, 221, 66);
                                                        panel_1.add(tabbedPane_8);
                                                        RB2 = new javax.swing.JRadioButton();
                                                        RB2.setToolTipText("Shortest Seek Time First");
                                                        RB2.setHorizontalAlignment(SwingConstants.CENTER);
                                                        tabbedPane_8.addTab("2.", null, RB2, null);
                                                        RB2.setBackground(new Color(255, 222, 173));
                                                        
                                                                buttonGroup1.add(RB2);
                                                                RB2.setFont(new Font("Bookman Old Style", Font.BOLD, 14)); // NOI18N
                                                                RB2.setText("SSTF");
                                                                RB2.addMouseListener(new java.awt.event.MouseAdapter() {
                                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                        RB2MouseClicked(evt);
                                                                    }
                                                                });
                                                        
                                                        tabbedPane_7 = new JTabbedPane(JTabbedPane.TOP);
                                                        tabbedPane_7.setBounds(10, 165, 221, 66);
                                                        panel_1.add(tabbedPane_7);
                                                        RB5 = new javax.swing.JRadioButton();
                                                        RB5.setHorizontalAlignment(SwingConstants.CENTER);
                                                        tabbedPane_7.addTab("3.", null, RB5, null);
                                                        RB5.setBackground(new Color(255, 222, 173));
                                                        
                                                                buttonGroup1.add(RB5);
                                                                RB5.setFont(new Font("Bookman Old Style", Font.BOLD, 14)); // NOI18N
                                                                RB5.setText("LOOK");
                                                                RB5.addMouseListener(new java.awt.event.MouseAdapter() {
                                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                        RB5MouseClicked(evt);
                                                                    }
                                                                });
                                                        
                                                        tabbedPane_6 = new JTabbedPane(JTabbedPane.TOP);
                                                        tabbedPane_6.setBounds(472, 88, 221, 66);
                                                        panel_1.add(tabbedPane_6);
                                                        RB6 = new javax.swing.JRadioButton();
                                                        RB6.setToolTipText("Circular Look");
                                                        RB6.setHorizontalAlignment(SwingConstants.CENTER);
                                                        tabbedPane_6.addTab("5.", null, RB6, null);
                                                        RB6.setBackground(new Color(255, 222, 173));
                                                        
                                                                buttonGroup1.add(RB6);
                                                                RB6.setFont(new Font("Bookman Old Style", Font.BOLD, 14)); // NOI18N
                                                                RB6.setText("CLook");
                                                                RB6.addMouseListener(new java.awt.event.MouseAdapter() {
                                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                        RB6MouseClicked(evt);
                                                                    }
                                                                });
                                                        
                                                        tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
                                                        tabbedPane_5.setBounds(472, 11, 220, 66);
                                                        panel_1.add(tabbedPane_5);
                                                        RB3 = new javax.swing.JRadioButton();
                                                        RB3.setToolTipText("Elevator Scan");
                                                        RB3.setHorizontalAlignment(SwingConstants.CENTER);
                                                        tabbedPane_5.addTab("4.", null, RB3, null);
                                                        RB3.setBackground(new Color(255, 222, 173));
                                                        
                                                                buttonGroup1.add(RB3);
                                                                RB3.setFont(new Font("Bookman Old Style", Font.BOLD, 14)); // NOI18N
                                                                RB3.setText("SCAN");
                                                                RB3.addMouseListener(new java.awt.event.MouseAdapter() {
                                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                        RB3MouseClicked(evt);
                                                                    }
                                                                });
                                                        
                                                        tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
                                                        tabbedPane_4.setBounds(472, 165, 221, 66);
                                                        panel_1.add(tabbedPane_4);
                                                        RB4 = new javax.swing.JRadioButton();
                                                        RB4.setToolTipText("Circular Scan");
                                                        RB4.setHorizontalAlignment(SwingConstants.CENTER);
                                                        tabbedPane_4.addTab("6.", null, RB4, null);
                                                        RB4.setBackground(new Color(255, 222, 173));
                                                        
                                                                buttonGroup1.add(RB4);
                                                                RB4.setFont(new Font("Bookman Old Style", Font.BOLD, 14)); // NOI18N
                                                                RB4.setText("C-SCAN");
                                                                RB4.addMouseListener(new java.awt.event.MouseAdapter() {
                                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                        RB4MouseClicked(evt);
                                                                    }
                                                                });
                                                        
                                                        tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
                                                        tabbedPane_1.setBorder(null);
                                                        tabbedPane_1.setBounds(10, 366, 682, 157);
                                                        panel_1.add(tabbedPane_1);
                                                        
                                                        scrollPane = new JScrollPane();
                                                        tabbedPane_1.addTab("PREFACE", null, scrollPane, null);
                                                        
                                                        InfoTA = new JTextArea();
                                                        InfoTA.setForeground(Color.WHITE);
                                                        InfoTA.setWrapStyleWord(true);
                                                        InfoTA.setToolTipText("");
                                                        InfoTA.setRows(5);
                                                        InfoTA.setRequestFocusEnabled(false);
                                                        InfoTA.setLineWrap(true);
                                                        InfoTA.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
                                                        InfoTA.setFocusable(false);
                                                        InfoTA.setEnabled(false);
                                                        InfoTA.setDisabledTextColor(Color.WHITE);
                                                        InfoTA.setColumns(20);
                                                        InfoTA.setBorder(null);
                                                        InfoTA.setBackground(Color.BLACK);
                                                        scrollPane.setViewportView(InfoTA);
                                                        DiskQ = new javax.swing.JLabel();
                                                        DiskQ.setHorizontalAlignment(SwingConstants.CENTER);
                                                        DiskQ.setForeground(Color.WHITE);
                                                        DiskQ.setBounds(241, 242, 221, 33);
                                                        panel_1.add(DiskQ);
                                                        
                                                                DiskQ.setFont(new Font("Bookman Old Style", Font.BOLD, 17)); // NOI18N
                                                                DiskQ.setText("DISK QUEUE");
                                                                IHeaderL = new javax.swing.JLabel();
                                                                IHeaderL.setHorizontalAlignment(SwingConstants.CENTER);
                                                                IHeaderL.setForeground(Color.WHITE);
                                                                IHeaderL.setBounds(241, 11, 221, 25);
                                                                panel_1.add(IHeaderL);
                                                                
                                                                        IHeaderL.setFont(new Font("Bookman Old Style", Font.BOLD, 13)); // NOI18N
                                                                        IHeaderL.setText("INITIAL HEADER");
                                                                        PHeaderL = new javax.swing.JLabel();
                                                                        PHeaderL.setHorizontalAlignment(SwingConstants.CENTER);
                                                                        PHeaderL.setForeground(Color.WHITE);
                                                                        PHeaderL.setBounds(241, 87, 221, 33);
                                                                        panel_1.add(PHeaderL);
                                                                        
                                                                                PHeaderL.setFont(new Font("Bookman Old Style", Font.BOLD, 13)); // NOI18N
                                                                                PHeaderL.setText("PREVIOUS HEADER");
                                                                                TrackL = new javax.swing.JLabel();
                                                                                TrackL.setHorizontalAlignment(SwingConstants.CENTER);
                                                                                TrackL.setForeground(Color.WHITE);
                                                                                TrackL.setBounds(241, 165, 221, 33);
                                                                                panel_1.add(TrackL);
                                                                                
                                                                                        TrackL.setFont(new Font("Bookman Old Style", Font.BOLD, 13)); // NOI18N
                                                                                        TrackL.setText("TRAIL TRACK");
                                                                                        QueueTF = new javax.swing.JTextField();
                                                                                        QueueTF.setToolTipText("Enter Disk Queue (For eg. 62,55,83,16,19,10,67,56)");
                                                                                        QueueTF.setHorizontalAlignment(SwingConstants.CENTER);
                                                                                        QueueTF.setBounds(241, 278, 221, 33);
                                                                                        panel_1.add(QueueTF);
                                                                                        
                                                                                                QueueTF.setFont(new java.awt.Font("Product Sans", 0, 14));
                                                                                                InitialHeaderTF = new javax.swing.JTextField();
                                                                                                InitialHeaderTF.setToolTipText("Enter Initial Header (Numeric Values Only!!!)");
                                                                                                InitialHeaderTF.setHorizontalAlignment(SwingConstants.CENTER);
                                                                                                InitialHeaderTF.setBounds(241, 47, 221, 30);
                                                                                                panel_1.add(InitialHeaderTF);
                                                                                                
                                                                                                        InitialHeaderTF.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
                                                                                                        PreviousHeaderTF = new javax.swing.JTextField();
                                                                                                        PreviousHeaderTF.setToolTipText("Enter Previous Header (Numeric Values Only!!!)");
                                                                                                        PreviousHeaderTF.setHorizontalAlignment(SwingConstants.CENTER);
                                                                                                        PreviousHeaderTF.setBounds(241, 121, 221, 33);
                                                                                                        panel_1.add(PreviousHeaderTF);
                                                                                                        
                                                                                                                PreviousHeaderTF.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
                                                                                                                TrailTrackTF = new javax.swing.JTextField();
                                                                                                                TrailTrackTF.setToolTipText("Enter Trail Track (Numeric Values Only!!!)");
                                                                                                                TrailTrackTF.setHorizontalAlignment(SwingConstants.CENTER);
                                                                                                                TrailTrackTF.setBounds(241, 198, 221, 33);
                                                                                                                panel_1.add(TrailTrackTF);
                                                                                                                
                                                                                                                        TrailTrackTF.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
                                                                                                                        RunB = new javax.swing.JButton();
                                                                                                                        RunB.setText("RUN SIMULATION");
                                                                                                                        RunB.setBounds(472, 278, 221, 77);
                                                                                                                        panel_1.add(RunB);
                                                                                                                        RunB.setBackground(new Color(244, 164, 96));
                                                                                                                        
                                                                                                                                RunB.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
                                                                                                                                
                                                                                                                                btnNewButton_1 = new JButton("AUTOGENERATE");
                                                                                                                                btnNewButton_1.setBackground(new Color(255, 222, 173));
                                                                                                                                btnNewButton_1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
                                                                                                                                btnNewButton_1.addActionListener(new ActionListener() {
                                                                                                                                	public void actionPerformed(ActionEvent e) {
                                                                                                                                		  Random r = new Random();
                                                                                                                                	        int[] random = new int[8];
                                                                                                                                	        for (int i = 0; i < random.length; i++) {
                                                                                                                                	            random[i] = r.nextInt(100 - 1) + 1; // storing random integers in an array
                                                                                                                                	            //System.out.println(random[i]); // printing each array element
                                                                                                                                	        }

                                                                                                                                	        String[] strRandom = new String[random.length];
                                                                                                                                	        for (int i = 0; i < random.length; i++) {
                                                                                                                                	            strRandom[i] = String.valueOf(random[i]);
                                                                                                                                	        }

                                                                                                                                	        String result = "";

                                                                                                                                	        if (strRandom.length > 0) {
                                                                                                                                	            StringBuilder sb = new StringBuilder();
                                                                                                                                	            for (String s : strRandom) {
                                                                                                                                	                sb.append(s).append(",");
                                                                                                                                	            }

                                                                                                                                	            result = sb.deleteCharAt(sb.length() - 1).toString();
                                                                                                                                	        }
                                                                                                                                	        QueueTF.setText(result);

                                                                                                                                	    }
                                                                                                                                });
                                                                                                                                btnNewButton_1.setBounds(241, 322, 221, 33);
                                                                                                                                panel_1.add(btnNewButton_1);
                                                                                                                                
                                                                                                                                btnNewButton_2 = new JButton("COMPARE ALL");
                                                                                                                                btnNewButton_2.setToolTipText("Click to Compare all Algorithms");
                                                                                                                                btnNewButton_2.setBackground(new Color(244, 164, 96));
                                                                                                                                btnNewButton_2.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
                                                                                                                                btnNewButton_2.addActionListener(new ActionListener() {
                                                                                                                                	public void actionPerformed(ActionEvent e) {
                                                                                                                                	Compare demo = new Compare();
                                                                                                                                	demo.show();
                                                                                                                                	}
                                                                                                                                });
                                                                                                                                btnNewButton_2.setBounds(10, 278, 221, 77);
                                                                                                                                panel_1.add(btnNewButton_2);
                                                                                                                                
                                                                                                                                panel_5 = new JPanel();
                                                                                                                                panel_5.setBounds(0, 0, 706, 534);
                                                                                                                                panel_1.add(panel_5);
                                                                                                                                panel_5.setLayout(null);
                                                                                                                                
                                                                                                                                lblNewLabel_5 = new JLabel("");
                                                                                                                                lblNewLabel_5.setIcon(new ImageIcon(GUI.class.getResource("/Images/BG.png")));
                                                                                                                                lblNewLabel_5.setBounds(0, 0, 706, 534);
                                                                                                                                panel_5.add(lblNewLabel_5);
                                                                                                                                
                                                                                                                       
                                                                                                                          
                                                                                                                                
                                                                                                                                panel_2 = new JPanel();
                                                                                                                                tabbedPane_2.addTab("Page Replacement ", null, panel_2, null);
                                                                                                                                panel_2.setLayout(null);
                                                                                                                                
                                                                                                                                tabbedPane = new JTabbedPane(JTabbedPane.TOP);
                                                                                                                                tabbedPane.setBounds(10, 11, 686, 512);
                                                                                                                                panel_2.add(tabbedPane);
                                                                                                                                
                                                                                                                                JButton btnNewButton_3 = new JButton("First Input First Output");
                                                                                                                                btnNewButton_3.setVerticalAlignment(SwingConstants.BOTTOM);
                                                                                                                                btnNewButton_3.setIcon(new ImageIcon(GUI.class.getResource("/Images/queue_1.gif")));
                                                                                                                                btnNewButton_3.setBackground(SystemColor.info);
                                                                                                                                btnNewButton_3.addActionListener(new ActionListener() {
                                                                                                                                	public void actionPerformed(ActionEvent e) {
                                                                                                                                		dispose();
                                                                                                                        				Fifo_1 open = new Fifo_1();
                                                                                                                        				open.setVisible(true);  	
                                                                                                                                	}
                                                                                                                                });
                                                                                                                                btnNewButton_3.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
                                                                                                                                tabbedPane.addTab("FIFO", null, btnNewButton_3, null);
                                                                                                                                
                                                                                                                                JButton btnNewButton_5 = new JButton("");
                                                                                                                                btnNewButton_5.setIcon(new ImageIcon(GUI.class.getResource("/Images/queue.gif")));
                                                                                                                                btnNewButton_5.setBackground(SystemColor.info);
                                                                                                                                btnNewButton_5.addActionListener(new ActionListener() {
                                                                                                                                	public void actionPerformed(ActionEvent e) {
                                                                                                                                		dispose();
                                                                                                                        				OPR_Algo open = new OPR_Algo();
                                                                                                                        				open.setVisible(true);  
                                                                                                                                	}
                                                                                                                                });
                                                                                                                                btnNewButton_5.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
                                                                                                                                tabbedPane.addTab("OPR", null, btnNewButton_5, null);
                                                                                                                                
                                                                                                                                btnNewButton = new JButton("");
                                                                                                                                btnNewButton.setIcon(new ImageIcon(GUI.class.getResource("/Images/giphy (1).gif")));
                                                                                                                                btnNewButton.setBackground(SystemColor.info);
                                                                                                                                btnNewButton.addActionListener(new ActionListener() {
                                                                                                                                	public void actionPerformed(ActionEvent e) {
                                                                                                                                		dispose();
                                                                                                                        				lru open = new lru();
                                                                                                                        				open.setVisible(true);  	}
                                                                                                                                });
                                                                                                                                btnNewButton.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
                                                                                                                                tabbedPane.addTab("LRU", null, btnNewButton, null);
                                                                                                                                
                                                                                                                                panel_3 = new JPanel();
                                                                                                                                tabbedPane_2.addTab("CPU Scheduling", null, panel_3, null);
                                                                                                                                
                                                                                                                                panel_4 = new JPanel();
                                                                                                                                tabbedPane_2.addTab("Concurrency And Deadlocks", null, panel_4, null);
                                                                                                                                RunB.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                        RunBActionPerformed(evt);
                                                                                                                                    }
                                                                                                                                });
                                RB1.addMouseListener(new java.awt.event.MouseAdapter() {
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        RB1MouseClicked(evt);
                                    }
                                });
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(null);
        panel.setBackground(Color.WHITE);
        
        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setToolTipText("Homepage");
        lblNewLabel_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		dispose();
        Firstpage frame12 = new Firstpage();
        frame12.show();
        
        	}
        });
        
        lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		dispose();
        		About_Us frame210 = new About_Us();
				frame210.show();
        	}
        });
        lblNewLabel_6.setIcon(new ImageIcon(GUI.class.getResource("/Images/Team.png")));
        lblNewLabel_6.setToolTipText("Our Team");
        lblNewLabel_6.setBackground(Color.GRAY);
        lblNewLabel_6.setBounds(36, 481, 64, 68);
        panel.add(lblNewLabel_6);
        lblNewLabel_1.setIcon(new ImageIcon(GUI.class.getResource("/Images/home.png")));
        lblNewLabel_1.setBackground(Color.GRAY);
        lblNewLabel_1.setBounds(36, 52, 64, 68);
        panel.add(lblNewLabel_1);
        
        lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setToolTipText("Algorithms");
        lblNewLabel_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	Error fre = new Error();
        	fre.show();
        	}
        });
        lblNewLabel_2.setIcon(new ImageIcon(GUI.class.getResource("/Images/Algorithms.png")));
        lblNewLabel_2.setBackground(Color.GRAY);
        lblNewLabel_2.setBounds(36, 161, 64, 68);
        panel.add(lblNewLabel_2);
        
        lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setToolTipText("Simulator");
        lblNewLabel_3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		dispose();
        	Simulation frame123 = new Simulation();
        	frame123.show();
        	}
        });
        lblNewLabel_3.setIcon(new ImageIcon(GUI.class.getResource("/Images/Simulator (2).png")));
        lblNewLabel_3.setBackground(Color.GRAY);
        lblNewLabel_3.setBounds(36, 269, 64, 68);
        panel.add(lblNewLabel_3);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setToolTipText("Quiz");
        lblNewLabel.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		dispose();
        Quiz2 fre = new Quiz2();
        fre.show();
        }
        });
        lblNewLabel.setIcon(new ImageIcon(GUI.class.getResource("/Images/Quiz.png")));
        lblNewLabel.setBackground(Color.GRAY);
        lblNewLabel.setBounds(36, 374, 64, 68);
        panel.add(lblNewLabel);
        
        lblNewLabel_4 = new JLabel(" ");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setIcon(new ImageIcon(GUI.class.getResource("/Images/Disc.jpeg")));
        lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_4.setForeground(Color.WHITE);
        lblNewLabel_4.setFont(new Font("Stencil", Font.PLAIN, 20));
        lblNewLabel_4.setBackground(new Color(0, 128, 0));
        lblNewLabel_4.setBounds(10, 11, 113, 596);
        panel.add(lblNewLabel_4);
        
        txtDiskSchedulingAlgorithm = new JTextField();
        txtDiskSchedulingAlgorithm.setEditable(false);
        txtDiskSchedulingAlgorithm.setBackground(new Color(230, 230, 250));
        txtDiskSchedulingAlgorithm.setHorizontalAlignment(SwingConstants.CENTER);
        txtDiskSchedulingAlgorithm.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
        txtDiskSchedulingAlgorithm.setText("OPERATING SYSTEM ALGORITHMS");
        txtDiskSchedulingAlgorithm.setColumns(10);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(tabbedPane_2, GroupLayout.PREFERRED_SIZE, 711, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtDiskSchedulingAlgorithm, GroupLayout.PREFERRED_SIZE, 708, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(txtDiskSchedulingAlgorithm, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(tabbedPane_2, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
        				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 618, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        getContentPane().setLayout(groupLayout);

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void EnableAll(){
        PreviousHeaderTF.setEnabled(true);
        TrailTrackTF.setEnabled(true);
        PHeaderL.setForeground(Color.WHITE);
        TrackL.setForeground(Color.WHITE);
    }
    
    private void RB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB1MouseClicked
        EnableAll();
        PreviousHeaderTF.setEnabled(false);
        TrailTrackTF.setEnabled(false);
        PHeaderL.setForeground(Color.RED);
        TrackL.setForeground(Color.RED);
        InfoTA.setText("FCFS is the simplest of all the Disk Scheduling Algorithms."
                + " In FCFS, the requests are addressed in the order they arrive in the disk queue.");
    }//GEN-LAST:event_RB1MouseClicked

    private void RB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB2MouseClicked
        EnableAll();
        PreviousHeaderTF.setEnabled(false);
        TrailTrackTF.setEnabled(false);
        PHeaderL.setForeground(Color.RED);
        TrackL.setForeground(Color.RED);
        InfoTA.setText("In SSTF (Shortest Seek Time First), requests having shortest"
                + " seek time are executed first. So, the seek time of every request is "
                + "calculated in advance in queue and then they are scheduled according to their "
                + "calculated seek time. As a result, the request near the disk arm will get executed first.");
    }//GEN-LAST:event_RB2MouseClicked

    private void RB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB3MouseClicked
        EnableAll();
        InfoTA.setText("In SCAN algorithm the disk arm moves into a particular direction and "
                + "services the requests coming in its path and after reaching the end of disk,"
                + " it reverses its direction and again services the request arriving in its path. "
                + "Hence, also known as elevator algorithm. As a result, the requests at the midrange "
                + "are serviced more and those arriving behind the disk arm will have to wait.");
    }//GEN-LAST:event_RB3MouseClicked

    private void RB4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB4MouseClicked
        EnableAll();
        InfoTA.setText("In SCAN algorithm, the disk arm again scans the path that has been scanned, "
                + "after reversing its direction. So, it may be possible that too many requests are "
                + "waiting at the other end or there may be zero or few requests pending at the scanned area.");
    }//GEN-LAST:event_RB4MouseClicked

    private void RB5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB5MouseClicked
        EnableAll();
        TrailTrackTF.setEnabled(false);
        TrackL.setForeground(Color.RED);
        InfoTA.setText(" It is similar to the SCAN disk scheduling algorithm except the difference "
                + "that the disk arm in spite of going to the end of the disk goes only to the last "
                + "request to be serviced in front of the head and then reverses its direction from "
                + "there only. Thus it prevents the extra delay which occurred due to unnecessary traversal "
                + "to the end of the disk.");
    }//GEN-LAST:event_RB5MouseClicked

    private void RB6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB6MouseClicked
        EnableAll();
        TrailTrackTF.setEnabled(false);
        TrackL.setForeground(Color.RED);
        InfoTA.setText("As LOOK is similar to SCAN algorithm, in similar way, CLOOK is similar"
                + " to CSCAN disk scheduling algorithm. In CLOOK, the disk arm inspite of "
                + "going to the end goes only to the last request to be serviced in front "
                + "of the head and then from there goes to the other end’s last request. "
                + "Thus, it also prevents the extra delay which occurred due to unnecessary "
                + "traversal to the end of the disk.");
    }//GEN-LAST:event_RB6MouseClicked

    private void RunBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunBActionPerformed
        String[] SQueue = QueueTF.getText().split(",");
        int Queue[] = new int[SQueue.length];
        for(int i = 0;i < SQueue.length;i++){
            Queue[i] = Integer.parseInt(SQueue[i]);
        }
        Object[] Parameters;
        
        if(RB1.isSelected()){
            int IH = Integer.parseInt(InitialHeaderTF.getText());
            FCFS a = new FCFS();
            Parameters = a.FCFS(Queue, IH);
            Graph demo = new Graph("FCFS",Parameters);
            demo.pack();
            UIUtils.centerFrameOnScreen(demo);
            demo.setVisible(true);
        }
        else if(RB2.isSelected()){
            int IH = Integer.parseInt(InitialHeaderTF.getText());
            SSTF a = new SSTF();
            Parameters = a.SSTF(Queue, IH);
            Graph demo = new Graph("SSTF",Parameters);
            demo.pack();
            UIUtils.centerFrameOnScreen(demo);
            demo.setVisible(true);
        }
        else if(RB3.isSelected()){
            int IH = Integer.parseInt(InitialHeaderTF.getText());
            int PH = Integer.parseInt(PreviousHeaderTF.getText());
            int TT = Integer.parseInt(TrailTrackTF.getText());
            SCAN a = new SCAN();
            Parameters = a.SCAN(Queue,IH,PH,TT);
            Graph demo = new Graph("SCAN",Parameters);
            demo.pack();
            UIUtils.centerFrameOnScreen(demo);
            demo.setVisible(true);
        
        }
        else if(RB4.isSelected()){
            int IH = Integer.parseInt(InitialHeaderTF.getText());
            int PH = Integer.parseInt(PreviousHeaderTF.getText());
            int TT = Integer.parseInt(TrailTrackTF.getText());
            CSCAN a = new CSCAN();
            Parameters = a.CSCAN(Queue,IH,PH,TT);
            Graph demo = new Graph("CSCAN",Parameters);
            demo.pack();
            UIUtils.centerFrameOnScreen(demo);
            demo.setVisible(true);
        }
        else if(RB5.isSelected()){
            int IH = Integer.parseInt(InitialHeaderTF.getText());
            int PH = Integer.parseInt(PreviousHeaderTF.getText());
            LOOK a = new LOOK();
            Parameters = a.LOOK(Queue,IH,PH);
            Graph demo = new Graph("LOOK",Parameters);
            demo.pack();
            UIUtils.centerFrameOnScreen(demo);
            demo.setVisible(true);
        }
        else if(RB6.isSelected()){
            int IH = Integer.parseInt(InitialHeaderTF.getText());
            int PH = Integer.parseInt(PreviousHeaderTF.getText());
            CLOOK a = new CLOOK();
            Parameters = a.CLOOK(Queue, IH,PH);
            Graph demo = new Graph("CLOOK",Parameters);
            demo.pack();
            UIUtils.centerFrameOnScreen(demo);
            demo.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select an algorithm first");
        }
        
    }//GEN-LAST:event_RunBActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IHeaderL;
    private javax.swing.JTextField InitialHeaderTF;
    private javax.swing.JLabel PHeaderL;
    private javax.swing.JTextField PreviousHeaderTF;
    private javax.swing.JTextField QueueTF;
    private javax.swing.JRadioButton RB1;
    private javax.swing.JRadioButton RB2;
    private javax.swing.JRadioButton RB3;
    private javax.swing.JRadioButton RB4;
    private javax.swing.JRadioButton RB5;
    private javax.swing.JRadioButton RB6;
    private javax.swing.JButton RunB;
    private javax.swing.JLabel TrackL;
    private javax.swing.JTextField TrailTrackTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel DiskQ;
    private JTabbedPane tabbedPane_1;
    private JScrollPane scrollPane;
    private JTextArea InfoTA;
    private JPanel panel_2;
    private JPanel panel_3;
    private JPanel panel_4;
    private JTabbedPane tabbedPane;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;
    private JTabbedPane tabbedPane_4;
    private JTabbedPane tabbedPane_5;
    private JTabbedPane tabbedPane_6;
    private JTabbedPane tabbedPane_7;
    private JTabbedPane tabbedPane_8;
    private static JLabel ProgressBar123;
    private JPanel panel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JPanel panel_5;
    private JLabel lblNewLabel_5;
    private JTextField txtDiskSchedulingAlgorithm;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_6;
}
