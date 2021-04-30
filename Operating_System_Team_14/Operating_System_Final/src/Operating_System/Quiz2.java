package Operating_System;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;

public class Quiz2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz2 frame = new Quiz2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Quiz2() {
		setResizable(false);
		setTitle("Operating System Quiz");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1024, 668);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 223, 214));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 132, 607);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("Homepage");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
		Firstpage fre = new Firstpage();
		fre.show();
			}
		});
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				About_Us frame210 = new About_Us();
				frame210.show();
			}
		});
		lblNewLabel_2_1_1.setIcon(new ImageIcon(Quiz2.class.getResource("/Images/Team.png")));
		lblNewLabel_2_1_1.setToolTipText("Our Team");
		lblNewLabel_2_1_1.setBackground(Color.GRAY);
		lblNewLabel_2_1_1.setBounds(35, 481, 64, 68);
		panel.add(lblNewLabel_2_1_1);
		lblNewLabel.setIcon(new ImageIcon(Quiz2.class.getResource("/Images/home.png")));
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(35, 52, 64, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setToolTipText("Algorithms");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			GUI frame = new GUI();
			frame.show();
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(Quiz2.class.getResource("/Images/Algorithms.png")));
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setBounds(35, 161, 64, 68);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setToolTipText("Simulator");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			Simulation frew = new Simulation();
			frew.show();
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(Quiz2.class.getResource("/Images/Simulator (2).png")));
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setBounds(35, 269, 64, 68);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setToolTipText("Quiz");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			Error fre = new Error();
			fre.show();
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon(Quiz2.class.getResource("/Images/Quiz.png")));
		lblNewLabel_2_1.setBackground(Color.GRAY);
		lblNewLabel_2_1.setBounds(35, 374, 64, 68);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_7 = new JLabel(" ");
		lblNewLabel_7.setIcon(new ImageIcon(Quiz2.class.getResource("/Images/Disc.jpeg")));
		lblNewLabel_7.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_7.setBackground(new Color(0, 128, 0));
		lblNewLabel_7.setBounds(10, 11, 112, 585);
		panel.add(lblNewLabel_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(142, 11, 856, 607);
		contentPane.add(panel_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(20, 88, 814, 489);
		panel_1.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 222, 173));
		tabbedPane.addTab("QUIZ", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(230, 230, 250));
		panel_3.setBounds(10, 11, 789, 360);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 769, 338);
		panel_3.add(scrollPane);
		
		JTextPane txtpnDirectionsForThe = new JTextPane();
		txtpnDirectionsForThe.setEditable(false);
		txtpnDirectionsForThe.setBackground(new Color(255, 222, 173));
		txtpnDirectionsForThe.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		txtpnDirectionsForThe.setText("\r\n                                           DIRECTIONS FOR THE QUIZ!!!!\r\n");
		scrollPane.setColumnHeaderView(txtpnDirectionsForThe);
		
		JTextPane txtpnOTheFollowing = new JTextPane();
		txtpnOTheFollowing.setEditable(false);
		txtpnOTheFollowing.setBackground(new Color(255, 222, 173));
		txtpnOTheFollowing.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
		txtpnOTheFollowing.setText("o The following quiz consists of 10 questions; each of which is compulsory to attempt. \r\no  The player would be given 10 seconds to answer each question else the question would be answer automatically.\r\no Not attempted questions will have random options selected as answers and the final score will be evaluated accordingly. \r\no At the end of the quiz the player wii be given a thorough analysis of their answers to the questions asked.\r\no Click on the Start button to start the Quiz\r\n\r\n                                                 HAPPY LEARNING!!!!");
		scrollPane.setViewportView(txtpnOTheFollowing);
		
		JButton btnNewButton = new JButton("Start the Quiz");
		btnNewButton.setBounds(10, 378, 789, 72);
		panel_2.add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			Quiz fe = new Quiz();
			fe.show();
			
			}
		});
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		
		JLabel lblNewLabel_3_1 = new JLabel("OPERATING SYSTEM");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Cambria", Font.BOLD, 40));
		lblNewLabel_3_1.setBounds(10, 23, 836, 54);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Quiz2.class.getResource("/Images/BG.png")));
		lblNewLabel_3.setBounds(10, 11, 836, 585);
		panel_1.add(lblNewLabel_3);
	}
}
