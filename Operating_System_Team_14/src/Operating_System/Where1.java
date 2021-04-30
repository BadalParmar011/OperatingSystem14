package Operating_System;

/**
 * author @BadalParmar
 */
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

public class Where1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Where1 frame = new Where1();
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
	public Where1() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1024, 658);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 223, 214));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setAutoscrolls(true);
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(167, 93, 819, 488);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		tabbedPane.addTab("Disk Scheduling Algorithm", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(240, 240, 240));
		panel_4.setBounds(10, 11, 794, 438);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 774, 416);
		panel_4.add(scrollPane);
		
		JTextArea txtrADiskIs = new JTextArea();
		txtrADiskIs.setText("\r\nThe simple answer is that these days, this all takes place in the drive controller.\r\n\r\nIn ye olde days, operating systems usually implemented disk I/O in two layers. At the the top was a drive independent logical layer. This viewed the drive as an array of blocks. Below this was a physical layer that viewed disks as platters, tracks, and sectors. Because the physical details varied among drives, the physical layer was usually implemented in a disk-(or class of disks) specific device driver.\r\n\r\nIn these dark times, you often had to wait for your drive vendor to create a new device driver before you could upgrade your operating system.\r\n\r\nIn the mid-1980's it started to become common for disk drives to provide a logical I/O interface. The device driver no longer saw disks/platters/sectors. Instead, it just saw an array of logical blocks. The drive took care of physical locations and redirecting of bad blocks (tasks that the operating system used to handle). This allowed single device driver to manage multiple types of devices, sharing the same interface and differing only in the number of logical blocks.\r\n\r\nThese days, you'd be hard pressed to find a disk drive that does not provide a logical interface.\r\n\r\nAll the scheduling algorithms that involve physical locations have to take place within the disk drive.\r\n\r\nUnless you are doing disk drive engineering, such scheduling algorithms are quite meaningless. If you learning hard drive engineering, expect that occupation to disappear soon.");
		txtrADiskIs.setEditable(false);
		txtrADiskIs.setForeground(Color.BLACK);
		txtrADiskIs.setSelectionColor(Color.YELLOW);
		txtrADiskIs.setLineWrap(true);
		txtrADiskIs.setWrapStyleWord(true);
		txtrADiskIs.setToolTipText("");
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
		panel_5.setBounds(10, 11, 794, 438);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 774, 416);
		panel_5.add(scrollPane_1);
		
		JTextArea txtrThusToDesign = new JTextArea();
		txtrThusToDesign.setEditable(false);
		txtrThusToDesign.setForeground(new Color(0, 0, 0));
		txtrThusToDesign.setBackground(new Color(255, 228, 181));
		txtrThusToDesign.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		txtrThusToDesign.setText("\r\n Deadlock can arise if the following four conditions hold simultaneously (Necessary Conditions)\r\n Mutual Exclusion: One or more than one resource is non-shareable (Only one process can use\r\n at a  time)\r\n Hold and Wait: A process is holding at least one resource and waiting for resources.\r\n No Preemption: A resource cannot be taken from a process unless the process releases the \r\n resource.\r\n Circular Wait: A set of processes are waiting for each other in circular form.\r\n \r\n o Resource-Request Algorithm\r\n o Safety algorithm\r\n o Banker's Algorithm\r\n");
		scrollPane_1.setViewportView(txtrThusToDesign);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 222, 173));
		tabbedPane.addTab("C.P.U Scheduling Algorithm", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 11, 794, 438);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(10, 11, 774, 416);
		panel_6.add(scrollPane_1_1);
		
		JTextArea txtrCpuSchedulingIs = new JTextArea();
		txtrCpuSchedulingIs.setEditable(false);
		txtrCpuSchedulingIs.setForeground(new Color(0, 0, 0));
		txtrCpuSchedulingIs.setBackground(new Color(255, 228, 181));
		txtrCpuSchedulingIs.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		txtrCpuSchedulingIs.setText("\r\n CPU Scheduling algorithm is an algorithm which is used to assign system resources to processes\r\n in a computing system. Consider the case where you are using two apps namely a game like \r\n Fortnite and a desktop application like Evernote. Both require the use of a graphics processor, \r\n but only one can use it at a time.\r\n\r\n Max CPU utilization [Keep CPU as busy as possible]\r\n\r\n o Fair allocation of CPU.\r\n o Max throughput [Number of processes that complete their execution per time unit]\r\n o Min turnaround time [Time taken by a process to finish execution]\r\n o Min waiting time [Time a process waits in ready queue]\r\n o Min response time [Time when a process produces first response]\r\n");
		scrollPane_1_1.setViewportView(txtrCpuSchedulingIs);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 222, 173));
		tabbedPane.addTab("Page Replacement Algorithm", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 11, 794, 438);
		panel_3.add(panel_7);
		panel_7.setLayout(null);
		
		JScrollPane scrollPane_1_1_1 = new JScrollPane();
		scrollPane_1_1_1.setBounds(10, 11, 774, 416);
		panel_7.add(scrollPane_1_1_1);
		
		JTextArea txtrInAComputer = new JTextArea();
		txtrInAComputer.setEditable(false);
		txtrInAComputer.setBackground(new Color(255, 228, 181));
		txtrInAComputer.setForeground(new Color(0, 0, 0));
		txtrInAComputer.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		txtrInAComputer.setText("\r\n The conservative impleemntation of the Page Replacement Algorithm is for checking page fault, \r\n meeting the demand of fast page fetching and replacement by the usage of virtual memory.\r\n\r\n Use in techniques for Hardrware with no Reference Bit :-\r\n Apart from this conservative page replacement algorithm work and believe that each page has a\r\n reference bit. But, some hardwares don't have one reference bit for the pages appearing and thus\r\n pages may be selected for working set removal in an essentially random fashion, with the\r\n expectation that if a poor choice is made, a future reference may retrieve that page from the Free\r\n or Modified list before it is removed from physical memory. A page referenced this way will be\r\n removed from the Free or Modified list and placed back into a process working set. The Modified\r\n Page List additionally provides an opportunity to write pages out to backing store in groups of \r\n more than one page, increasing efficiency. These pages can then be placed on the Free Page \r\n List. The sequence of pages that works its way to the head of the Free Page List resembles the \r\n results of a LRU or NRU mechanism and the overall effect has similarities to the \r\n Second-Chance algorithm described earlier.\r\n\r\n Page Cache in Linux :-\r\n o The Page Caching works on the concept and manipulation of small pages and huge pages \r\n in linux.\r\n o The pages are divided into two sets an active set and the passive set. And the fetching and\r\n transferring is done between these sets of page caches.");
		scrollPane_1_1_1.setViewportView(txtrInAComputer);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(null);
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setBounds(10, 11, 137, 597);
		contentPane.add(panel_3_1);
		
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
		lblNewLabel_2_1_1.setIcon(new ImageIcon(Where1.class.getResource("/Images/Team.png")));
		lblNewLabel_2_1_1.setToolTipText("Our Team");
		lblNewLabel_2_1_1.setBackground(Color.GRAY);
		lblNewLabel_2_1_1.setBounds(35, 481, 64, 68);
		panel_3_1.add(lblNewLabel_2_1_1);
		lblNewLabel.setIcon(new ImageIcon(Where1.class.getResource("/Images/home.png")));
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(35, 52, 64, 68);
		panel_3_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setToolTipText("Algorithms");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			GUI frame123 = new GUI();
			frame123.show();
			
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(Where1.class.getResource("/Images/Algorithms.png")));
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setBounds(35, 161, 64, 68);
		panel_3_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setToolTipText("Simulation");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			Simulation frew = new Simulation();
			frew.show();
			
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(Where1.class.getResource("/Images/Simulator (2).png")));
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setBounds(35, 269, 64, 68);
		panel_3_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setToolTipText("Quiz");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
		Quiz2 fre = new Quiz2();
		fre.show();
		}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon(Where1.class.getResource("/Images/Quiz.png")));
		lblNewLabel_2_1.setBackground(Color.GRAY);
		lblNewLabel_2_1.setBounds(36, 374, 64, 68);
		panel_3_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_7 = new JLabel(" ");
		lblNewLabel_7.setIcon(new ImageIcon(Where1.class.getResource("/Images/Disc.jpeg")));
		lblNewLabel_7.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_7.setBackground(new Color(0, 128, 0));
		lblNewLabel_7.setBounds(10, 11, 117, 575);
		panel_3_1.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBackground(new Color(230, 230, 250));
		textField.setText("WHERE DO WE USE DISK SCHEDULING ALGORITHM");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(167, 28, 819, 54);
		contentPane.add(textField);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Where1.class.getResource("/Images/BG.png")));
		lblNewLabel_3.setBounds(145, 11, 853, 597);
		contentPane.add(lblNewLabel_3);
	}
}
