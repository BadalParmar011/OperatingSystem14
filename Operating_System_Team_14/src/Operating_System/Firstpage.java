package Operating_System;
/** 
 * author @BadalParmar
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Firstpage extends JFrame {
	private JPanel contentPane;
	private final JPanel panel = new JPanel();


	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Firstpage frame = new Firstpage();
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
	public Firstpage() {
		setTitle("Operating System");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		
		setBounds(100, 100, 1024, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 133, 618);
		setLocationRelativeTo(null);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("Homepage");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			Error frame67 = new Error();
			frame67.show();
			}
		});
		
		JLabel lblNewLabel_2_1_2 = new JLabel("");
		lblNewLabel_2_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				About_Us frame210 = new About_Us();
				frame210.show();
			}
		});
		lblNewLabel_2_1_2.setIcon(new ImageIcon(Firstpage.class.getResource("/Images/Team.png")));
		lblNewLabel_2_1_2.setToolTipText("Our Team");
		lblNewLabel_2_1_2.setBackground(Color.GRAY);
		lblNewLabel_2_1_2.setBounds(35, 481, 64, 68);
		panel.add(lblNewLabel_2_1_2);
		lblNewLabel.setIcon(new ImageIcon(Firstpage.class.getResource("/Images/home.png")));
		lblNewLabel.setBounds(35, 52, 64, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setToolTipText("Algorithms");
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
		GUI frame134 = new GUI();
		frame134.show();

			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(Firstpage.class.getResource("/Images/Algorithms.png")));
		lblNewLabel_1.setBounds(35, 161, 64, 68);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setToolTipText("Simulator");
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
		Simulation jf7 = new Simulation();
		jf7.show();
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(Firstpage.class.getResource("/Images/Simulator (2).png")));
		lblNewLabel_2.setBounds(35, 269, 64, 68);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setToolTipText("Quiz");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			Quiz2 qwe = new Quiz2();
			qwe.show();
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon(Firstpage.class.getResource("/Images/Quiz.png")));
		lblNewLabel_2_1.setBackground(Color.GRAY);
		lblNewLabel_2_1.setBounds(35, 374, 64, 68);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_7 = new JLabel(" ");
		lblNewLabel_7.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setIcon(new ImageIcon(Firstpage.class.getResource("/Images/Disc.jpeg")));
		lblNewLabel_7.setBackground(new Color(0, 128, 0));
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(10, 11, 113, 596);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setToolTipText("Quiz");
		lblNewLabel_2_1_1.setBackground(Color.GRAY);
		lblNewLabel_2_1_1.setBounds(35, 461, 64, 68);
		panel.add(lblNewLabel_2_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(172, 353, 589, 251);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		tabbedPane.setBounds(10, 11, 569, 229);
		panel_2.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Seek Time", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(10, 11, 544, 155);
		panel_3.add(panel_8);
		panel_8.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 524, 133);
		panel_8.add(scrollPane);
		
		JTextPane txtpnSeekTimeIs = new JTextPane();
		txtpnSeekTimeIs.setEditable(false);
		txtpnSeekTimeIs.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtpnSeekTimeIs.setText("Seek time is the time taken to locate the disk arm to a specified track where the data is to be read or write. So the disk scheduling algorithm that gives minimum average seek time is better.");
		scrollPane.setViewportView(txtpnSeekTimeIs);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Rotational Latency", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(10, 11, 544, 155);
		panel_4.add(panel_9);
		panel_9.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 524, 133);
		panel_9.add(scrollPane_1);
		
		JTextPane txtpnRotationalLatencyIs = new JTextPane();
		txtpnRotationalLatencyIs.setEditable(false);
		txtpnRotationalLatencyIs.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtpnRotationalLatencyIs.setText("Rotational Latency is the time taken by the desired sector of disk to rotate into a position so that it can access the read/write heads. So the disk scheduling algorithm that gives minimum rotational latency is better.");
		scrollPane_1.setViewportView(txtpnRotationalLatencyIs);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Transfer time", null, panel_5, null);
		panel_5.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(10, 11, 544, 155);
		panel_5.add(panel_10);
		panel_10.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 11, 524, 133);
		panel_10.add(scrollPane_2);
		
		JTextPane txtpnTransferTimeIs = new JTextPane();
		txtpnTransferTimeIs.setEditable(false);
		txtpnTransferTimeIs.setText("Transfer time is the time to transfer the data. It depends on the rotating speed of the disk and number of bytes to be transferred.");
		txtpnTransferTimeIs.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		scrollPane_2.setViewportView(txtpnTransferTimeIs);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		tabbedPane.addTab("Disk Access Time", null, panel_5_1, null);
		
		JPanel panel_10_1 = new JPanel();
		panel_10_1.setLayout(null);
		panel_10_1.setBounds(10, 11, 544, 155);
		panel_5_1.add(panel_10_1);
		
		JScrollPane scrollPane_2_1 = new JScrollPane();
		scrollPane_2_1.setBounds(10, 11, 524, 133);
		panel_10_1.add(scrollPane_2_1);
		
		JTextArea txtrDiskAccessTime = new JTextArea();
		txtrDiskAccessTime.setEditable(false);
		txtrDiskAccessTime.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtrDiskAccessTime.setText("Disk Access Time = \r\nSeek Time + \r\nRotational Latency + \r\nTransfer Time");
		scrollPane_2_1.setRowHeaderView(txtrDiskAccessTime);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Firstpage.class.getResource("/Images/DAT.jpeg")));
		scrollPane_2_1.setViewportView(lblNewLabel_5);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setLayout(null);
		tabbedPane.addTab("Response Time", null, panel_5_2, null);
		
		JPanel panel_10_2 = new JPanel();
		panel_10_2.setLayout(null);
		panel_10_2.setBounds(10, 11, 544, 155);
		panel_5_2.add(panel_10_2);
		
		JScrollPane scrollPane_2_2 = new JScrollPane();
		scrollPane_2_2.setBounds(10, 11, 524, 133);
		panel_10_2.add(scrollPane_2_2);
		
		JTextPane txtpnResponseTimeIs = new JTextPane();
		txtpnResponseTimeIs.setEditable(false);
		txtpnResponseTimeIs.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtpnResponseTimeIs.setText("Response Time is the average of time spent by a request waiting to perform its I/O operation. Average Response time is the response time of the all requests. Variance Response Time is measure of how individual request are serviced with respect to average response time. So the disk scheduling algorithm that gives minimum variance response time is better.");
		scrollPane_2_2.setViewportView(txtpnResponseTimeIs);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(143, 11, 865, 618);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("DISK SCHEDULING ALGORITHM");
		btnNewButton_3.setBackground(new Color(255, 228, 181));
		btnNewButton_3.setFont(new Font("Bookman Old Style", Font.BOLD, 17));
		btnNewButton_3.setBounds(30, 77, 362, 46);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(30, 134, 362, 198);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 11, 342, 176);
		panel_6.add(scrollPane_3);
		
		JTextPane txtpnDiskScheduling = new JTextPane();
		txtpnDiskScheduling.setEditable(false);
		txtpnDiskScheduling.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		txtpnDiskScheduling.setText("* Disk scheduling is done by operating systems to schedule I/O requests arriving for the disk. Disk scheduling is also known as I/O scheduling.\r\n\r\no Multiple I/O requests may arrive by different processes and only one I/O request can be served at a time by the disk controller. Thus other I/O requests need to wait in the waiting queue and need to be scheduled.\r\n\r\no Two or more request may be far from each other so can result in greater disk arm movement.\r\n\r\no Hard drives are one of the slowest parts of the computer system and thus need to be accessed in n efficient manner.\r\n\r\no There are many Disk Scheduling Algorithms but before discussing them let\u2019s have a quick look at some of the important terms:");
		scrollPane_3.setViewportView(txtpnDiskScheduling);
		
		JLabel lblNewLabel_3 = new JLabel("OPERATING SYSTEM");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Cambria", Font.BOLD, 40));
		lblNewLabel_3.setBounds(64, 11, 750, 66);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setRolloverIcon(new ImageIcon(Firstpage.class.getResource("/Images/What_R.png")));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setForeground(Color.CYAN);

			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnNewButton.setForeground(Color.CYAN);
	}
		});
		btnNewButton.setBackground(new Color(255, 228, 196));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			What1 jf4 = new What1();
			jf4.show();
		
		
			}
		});
		btnNewButton.setIcon(new ImageIcon(Firstpage.class.getResource("/Images/What.png")));
		btnNewButton.setBounds(402, 77, 216, 255);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setRolloverIcon(new ImageIcon(Firstpage.class.getResource("/Images/Why_R.png")));
		btnNewButton_1.setForeground(new Color(255, 222, 173));
		btnNewButton_1.setBackground(new Color(255, 222, 173));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			Why1 jf6 = new Why1();
			jf6.show();
		
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Firstpage.class.getResource("/Images/Why.png")));
		btnNewButton_1.setBounds(628, 77, 209, 255);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setRolloverIcon(new ImageIcon(Firstpage.class.getResource("/Images/Where_R.png")));
		btnNewButton_2.setForeground(new Color(255, 222, 173));
		btnNewButton_2.setBackground(new Color(255, 222, 173));
		btnNewButton_2.setIcon(new ImageIcon(Firstpage.class.getResource("/Images/Where.jpeg")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			Where1 jf5 = new Where1();
			jf5.show();
			}
		});
		btnNewButton_2.setBounds(628, 343, 209, 249);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Firstpage.class.getResource("/Images/BG.png")));
		lblNewLabel_4.setBounds(10, 11, 845, 596);
		panel_1.add(lblNewLabel_4);
	}
}
