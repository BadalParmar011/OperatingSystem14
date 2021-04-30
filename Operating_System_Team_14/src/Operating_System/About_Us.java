package Operating_System;
/**
 * author @BadalParmar
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class About_Us extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About_Us frame = new About_Us();
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
	public About_Us() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 668);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane_1.setBounds(153, 11, 855, 607);
		contentPane.add(tabbedPane_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		tabbedPane_1.addTab("Disk Scheduling Algorithm", null, panel_1, null);
		panel_1.setBackground(new Color(255, 235, 205) );
		panel_1.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_5.setBounds(10, 10, 830, 558);
		panel_5.setBackground(SystemColor.text);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(About_Us.class.getResource("/Images/dc40bb3d-5425-43a2-bd28-52c1515ee940 (1).png")));
		lblNewLabel_5.setBounds(10, 11, 810, 536);
		panel_5.add(lblNewLabel_5);
		
	
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("Page Replacement Algorithm", null, panel_2, null);
		panel_2.setBackground(new Color(255, 222, 173));
		panel_2.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_6.setBounds(10, 10, 830, 558);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setIcon(new ImageIcon(About_Us.class.getResource("/Images/Screenshot 2021-04-27 172646.png")));
		lblNewLabel_3.setBounds(10, 11, 810, 536);
		panel_6.add(lblNewLabel_3);
		
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("CPU Scheduling Algorithm", null, panel_3, null);
		panel_3.setBackground(new Color(255, 222, 173));
		panel_3.setLayout(null);
		
		
		JPanel panel_4 = new JPanel();
		tabbedPane_1.addTab("Concurrency & Deadlock", null, panel_4, null);
		panel_4.setBackground(new Color(255, 222, 173));
		panel_4.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 133, 607);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("");
		lblNewLabel_2_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Error frame67 = new Error();
				frame67.show();
			}
		});
		lblNewLabel_2_1_2.setIcon(new ImageIcon(About_Us.class.getResource("/Images/Team.png")));
		lblNewLabel_2_1_2.setToolTipText("Our Team");
		lblNewLabel_2_1_2.setBackground(Color.GRAY);
		lblNewLabel_2_1_2.setBounds(35, 481, 64, 68);
		panel.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				 Firstpage frame12 = new Firstpage();
			        frame12.show();
			}
		});
		lblNewLabel.setIcon(new ImageIcon(About_Us.class.getResource("/Images/home.png")));
		lblNewLabel.setToolTipText("Homepage");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(35, 52, 64, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				GUI frame134 = new GUI();
				frame134.show();

			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(About_Us.class.getResource("/Images/Algorithms.png")));
		lblNewLabel_1.setToolTipText("Algorithms");
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setBounds(35, 161, 64, 68);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Simulation jf7 = new Simulation();
				jf7.show();
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(About_Us.class.getResource("/Images/Simulator (2).png")));
		lblNewLabel_2.setToolTipText("Simulator");
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setBounds(35, 269, 64, 68);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Quiz2 qwe = new Quiz2();
				qwe.show();
			}
			
		});
		lblNewLabel_2_1.setIcon(new ImageIcon(About_Us.class.getResource("/Images/Quiz.png")));
		lblNewLabel_2_1.setToolTipText("Quiz");
		lblNewLabel_2_1.setBackground(Color.GRAY);
		lblNewLabel_2_1.setBounds(35, 374, 64, 68);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_7 = new JLabel(" ");
		lblNewLabel_7.setIcon(new ImageIcon(About_Us.class.getResource("/Images/Disc.jpeg")));
		lblNewLabel_7.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_7.setBackground(new Color(0, 128, 0));
		lblNewLabel_7.setBounds(10, 11, 113, 585);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setToolTipText("Quiz");
		lblNewLabel_2_1_1.setBackground(Color.GRAY);
		lblNewLabel_2_1_1.setBounds(35, 461, 64, 68);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Simulation.class.getResource("/Images/BG.png")));
		lblNewLabel_4.setBounds(153, 11, 855, 607);
		contentPane.add(lblNewLabel_4);
	}
}
