package Operating_System;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.TitledBorder;



import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Why1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtWhyDoWe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Why1 frame = new Why1();
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
	public Why1() {
		setResizable(false);
		setTitle("Operating System");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1024, 658);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 223, 214));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setAutoscrolls(true);
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(166, 93, 812, 486);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		tabbedPane.addTab("Disk Scheduling Algorithm", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 11, 787, 436);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 767, 414);
		panel_4.add(scrollPane);
		
		JTextArea txtrADiskIs = new JTextArea();
		txtrADiskIs.setEditable(false);
		txtrADiskIs.setForeground(new Color(0, 0, 0));
		txtrADiskIs.setSelectionColor(Color.YELLOW);
		txtrADiskIs.setLineWrap(true);
		txtrADiskIs.setWrapStyleWord(true);
		txtrADiskIs.setToolTipText("");
		txtrADiskIs.setText("\r\nMultiple I/O requests may arrive by different processes and only one I/O request can be served \r\nat a time by the disk controller. Thus other I/O requests need to wait in the waiting queue and\r\nneed to be scheduled.\r\nTwo or more requests may be far from each other so can result in greater disk arm movement.\r\nHard drives are one of the slowest parts of the computer system and thus need to be accessed\r\nin an efficient manner.");
		txtrADiskIs.setRows(5);
		txtrADiskIs.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		txtrADiskIs.setDisabledTextColor(Color.WHITE);
		txtrADiskIs.setColumns(20);
		txtrADiskIs.setBorder(null);
		txtrADiskIs.setBackground(new Color(255, 228, 181));
		scrollPane.setViewportView(txtrADiskIs);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 222, 173));
		tabbedPane.addTab("Concurrency and Deadlocks", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 11, 787, 436);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 767, 414);
		panel_5.add(scrollPane_1);
		
		JTextArea txtrThusToDesign = new JTextArea();
		txtrThusToDesign.setEditable(false);
		txtrThusToDesign.setForeground(new Color(0, 0, 0));
		txtrThusToDesign.setBackground(new Color(255, 228, 181));
		txtrThusToDesign.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		txtrThusToDesign.setText("\r\n Concurrency is also a programming design philosophy. In concurrent programming, programmers\r\n attempt to break down a complex problem into several simultaneous executing processes that \r\n can be addressed individually.\r\n It helps in techniques like coordinating execution of processes, memory allocation and execution\r\n scheduling for maximizing throughput.\r\n\r\n Principles of Concurrency:\r\n Both interleaved and overlapped processes can be viewed as examples of concurrent processes, \r\n they both present the same problems.\r\n The relative speed of execution cannot be predicted. It depends on the following:\r\n o   The activities of other processes\r\n o   The way operating system handles interrupts\r\n o   The scheduling policies of the operating system");
		scrollPane_1.setViewportView(txtrThusToDesign);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 222, 173));
		tabbedPane.addTab("C.P.U Scheduling Algorithm", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 11, 787, 436);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(10, 11, 767, 414);
		panel_6.add(scrollPane_1_1);
		
		JTextArea txtrCpuSchedulingIs = new JTextArea();
		txtrCpuSchedulingIs.setEditable(false);
		txtrCpuSchedulingIs.setForeground(new Color(0, 0, 0));
		txtrCpuSchedulingIs.setBackground(new Color(255, 228, 181));
		txtrCpuSchedulingIs.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		txtrCpuSchedulingIs.setText("\r\n A typical process involves both I/O time and CPU time. In a uni-programming system like \r\n MS-DOS, time spent waiting for I/O is wasted and CPU is free during this time. In \r\n multiprogramming systems, one process can use CPU while another is waiting for I/O. This\r\n is possible only with process scheduling.\r\n Some useful facts about Scheduling Algorithms:\r\n o   FCFS can cause long waiting times, especially when the first job takes too much CPU time.\r\n o  Both SJF and Shortest Remaining time first algorithms may cause starvation. Consider a \r\n situation when the long process is there in the ready queue and shorter processes keep \r\n coming.\r\n o   If time quantum for Round Robin scheduling is very large, then it behaves the same as FCFS\r\n scheduling.\r\n o   SJF is optimal in terms of average waiting time for a given set of processes,i.e., average waiting\r\n time is minimum with this scheduling, but problems are, how to know/predict the time of next \r\n job.");
		scrollPane_1_1.setViewportView(txtrCpuSchedulingIs);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 222, 173));
		tabbedPane.addTab("Page Replacement Algorithm", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 11, 787, 436);
		panel_3.add(panel_7);
		panel_7.setLayout(null);
		
		JScrollPane scrollPane_1_1_1 = new JScrollPane();
		scrollPane_1_1_1.setBounds(10, 11, 767, 414);
		panel_7.add(scrollPane_1_1_1);
		
		JTextArea txtrInAComputer = new JTextArea();
		txtrInAComputer.setEditable(false);
		txtrInAComputer.setBackground(new Color(255, 228, 181));
		txtrInAComputer.setForeground(new Color(0, 0, 0));
		txtrInAComputer.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		txtrInAComputer.setText(" \r\n In a computer operating system that uses paging for virtual memory management, Page\r\n replacement algorithms decide which memory pages to page out, sometimes called swap out, or\r\n write to disk, when a page of memory needs to be allocated. Page replacement happens when a\r\n requested page is not in memory (page fault) and a free page cannot be used to satisfy the\r\n allocation, either because there are none, or because the number of free pages is lower than \r\n some threshold.\r\n\r\n When the page that was selected for replacement and paged out is referenced again it has to be\r\n paged in (read in from disk), and this involves waiting for I/O completion. This determines the\r\n quality of the page replacement algorithm: the less time waiting for page-ins, the better the\r\n algorithm. A page replacement algorithm looks at the limited information about accesses to the\r\n pages provided by hardware, and tries to guess which pages should be replaced to minimize the\r\n total number of page misses, while balancing this with the costs (primary storage and processor\r\n time) of the algorithm itself.\r\n\r\n The page replacing problem is a typical online problem from the competitive analysis perspective \r\n in the sense that the optimal deterministic algorithm is known.");
		scrollPane_1_1_1.setViewportView(txtrInAComputer);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(10, 11, 137, 597);
		contentPane.add(panel_8);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setToolTipText("HomePage");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
	Firstpage fre = new Firstpage();
	fre.show();
			}
		});
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				About_Us frame210 = new About_Us();
				frame210.show();
			}
		});
		lblNewLabel_2_1_1.setIcon(new ImageIcon(Why1.class.getResource("/Images/Team.png")));
		lblNewLabel_2_1_1.setToolTipText("Our Team");
		lblNewLabel_2_1_1.setBackground(Color.GRAY);
		lblNewLabel_2_1_1.setBounds(35, 481, 64, 68);
		panel_8.add(lblNewLabel_2_1_1);
		lblNewLabel_1.setIcon(new ImageIcon(Why1.class.getResource("/Images/home.png")));
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setBounds(35, 52, 64, 68);
		panel_8.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setToolTipText("Algorithms");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		GUI fren = new GUI();
		fren.show();
		
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(Why1.class.getResource("/Images/Algorithms.png")));
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setBounds(35, 161, 64, 68);
		panel_8.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setToolTipText("Simulation");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			Simulation frent = new Simulation();
			frent.show();
			}
		});
		lblNewLabel_3_1.setIcon(new ImageIcon(Why1.class.getResource("/Images/Simulator (2).png")));
		lblNewLabel_3_1.setBackground(Color.GRAY);
		lblNewLabel_3_1.setBounds(35, 269, 64, 68);
		panel_8.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setToolTipText("Quiz");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		Quiz2 fre = new Quiz2();
		fre.show();
		}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon(Why1.class.getResource("/Images/Quiz.png")));
		lblNewLabel_2_1.setBackground(Color.GRAY);
		lblNewLabel_2_1.setBounds(35, 374, 64, 68);
		panel_8.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4 = new JLabel(" ");
		lblNewLabel_4.setIcon(new ImageIcon(Why1.class.getResource("/Images/Disc.jpeg")));
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_4.setBackground(new Color(0, 128, 0));
		lblNewLabel_4.setBounds(10, 11, 117, 575);
		panel_8.add(lblNewLabel_4);
		
		txtWhyDoWe = new JTextField();
		txtWhyDoWe.setBackground(new Color(230, 230, 250));
		txtWhyDoWe.setText("WHY DO WE USE DISK SCHEDULING ALGORITHM");
		txtWhyDoWe.setHorizontalAlignment(SwingConstants.CENTER);
		txtWhyDoWe.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		txtWhyDoWe.setEditable(false);
		txtWhyDoWe.setColumns(10);
		txtWhyDoWe.setBounds(166, 28, 812, 54);
		contentPane.add(txtWhyDoWe);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Why1.class.getResource("/Images/BG.png")));
		lblNewLabel_3.setBounds(143, 11, 855, 597);
		contentPane.add(lblNewLabel_3);
	}
}
