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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Color;
import javax.swing.border.TitledBorder;



import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class What1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtWhatDoWe;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					What1 frame = new What1();
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
	public What1() {
		setTitle("Operating System");
		setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		setForeground(Color.ORANGE);
		setResizable(false);
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
		tabbedPane.setBounds(162, 93, 833, 511);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		tabbedPane.addTab("Disk Scheduling Algorithm", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 11, 808, 460);
		panel_4.setBackground(new Color(240, 240, 240));
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 788, 438);
		panel_4.add(scrollPane);
		
		JTextArea txtrADiskIs = new JTextArea();
		txtrADiskIs.setEditable(false);
		txtrADiskIs.setForeground(Color.BLACK);
		txtrADiskIs.setSelectionColor(Color.YELLOW);
		txtrADiskIs.setLineWrap(true);
		txtrADiskIs.setWrapStyleWord(true);
		txtrADiskIs.setToolTipText("");
		txtrADiskIs.setText("\r\nA disk is a magnetic storage device which has a number of platters (or surfaces). The entire  assembly of platters rotates as a unit at high speeds (typically 5000-10000 RPM for a fixed disk). The  surface of each platter is organised as a concentric group of magnetic tracks on which data can be  stored. Each track is divided into a number of blocks of fixed size (typically 1024 bytes) in which the  data is stored. A block is the smallest amount of data that can be read from or written to the disk in  a single I/O operation.\r\n\r\nEach disk surface has a read/write head which can move linearly across the surface. Data from the  disk is requested by block number. The disk controller moves the head to the correct track and then  waits for the correct block to pass underneath it for access.\r\n\r\nThe slowest part of accessing a disk block is physically moving the head to the correct track This is  called the seek time. In a multitasking system, requests to access different parts of the disk arrive  from different processes. Correct scheduling of these requests can reduce the average seek time by  reducing the average distance the head has to travel.\r\n\r\nOn a single computer we can perform many operations at a single time so the management is also  necessary for all the Running Processes that are running on the system at a time. With the help of  Multiprogramming we can execute many programs at the same time. So for controlling and  providing the memory to all the processes, the Operating System uses the Concept of Disk  Scheduling.\r\n \r\nIn this the time of the CPU is divided into the various processes and also assures that all processes  are completed. So, Disk Scheduling will specify that at which time the process will be executed by  the CPU. Thereby, Scheduling means to execute all the processes that are given to a CPU at a time.\r\n \r\nScheduling is used to Divide the total time of the CPU between the number or Processes so that the  Processes can execute concurrently at a single time. For dividing the total time of the CPU, it uses  the Scheduling Techniques.");
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
		panel_5.setBounds(10, 11, 808, 461);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 788, 439);
		panel_5.add(scrollPane_1);
		
		JTextArea txtrThusToDesign = new JTextArea();
		txtrThusToDesign.setEditable(false);
		txtrThusToDesign.setForeground(new Color(0, 0, 0));
		txtrThusToDesign.setBackground(new Color(255, 228, 181));
		txtrThusToDesign.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		txtrThusToDesign.setText(" \r\n Thus, to design for robust concurrency in an operating system, a programmer needs to both \r\n reduce a problem into individual, parallel tasks and coordinate the execution, memory \r\n allocation and data exchange of those tasks.\r\n\r\n Concurrency is the execution of the multiple instruction sequences at the same time. It happens \r\n in the operating system when there are several process threads running in parallel. The running\r\n process threads always communicate with each other through shared memory or message \r\n passing.\r\n\r\n Although concurrent programming offers better program structure than sequential programming, \r\n it is not always more practical. In a concurrent system, computations being executed at the \r\n same time can diverge, giving indeterminate answers. They system may end in a deadlock \r\n if well-defined maxima are not assigned for the resource consumption of each of the executing\r\n threads. \r\n Can also result in resource starvation.");
		scrollPane_1.setViewportView(txtrThusToDesign);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 222, 173));
		tabbedPane.addTab("C.P.U Scheduling Algorithm", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 11, 808, 461);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(10, 11, 788, 439);
		panel_6.add(scrollPane_1_1);
		
		JTextArea txtrCpuSchedulingIs = new JTextArea();
		txtrCpuSchedulingIs.setEditable(false);
		txtrCpuSchedulingIs.setForeground(new Color(0, 0, 0));
		txtrCpuSchedulingIs.setBackground(new Color(255, 228, 181));
		txtrCpuSchedulingIs.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		txtrCpuSchedulingIs.setText(" \r\n CPU Scheduling is a process of determining which process will own CPU for execution while \r\n another process is on hold. The main task of CPU scheduling is to make sure that whenever \r\n the CPU remains idle, the OS at least select one of the processes available in the ready queue\r\n for execution. The selection process will be carried out by the CPU scheduler. It selects one \r\n of the processes in memory that are ready for execution.\r\n \r\n Two Types: -\r\n 1). Preemptive CPU Scheduling\r\n 2). Non - Preemptive CPU Scheduling\r\n");
		scrollPane_1_1.setViewportView(txtrCpuSchedulingIs);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 222, 173));
		tabbedPane.addTab("Page Replacement Algorithm", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 11, 808, 461);
		panel_3.add(panel_7);
		panel_7.setLayout(null);
		
		JScrollPane scrollPane_1_1_1 = new JScrollPane();
		scrollPane_1_1_1.setBounds(10, 11, 788, 439);
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
		panel_8.setBounds(10, 11, 133, 607);
		contentPane.add(panel_8);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setToolTipText("Homepage");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		Firstpage frn = new Firstpage();
		frn.show();}
		});
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				About_Us frame210 = new About_Us();
				frame210.show();
			}
		});
		lblNewLabel_2_1_1.setIcon(new ImageIcon(What1.class.getResource("/Images/Team.png")));
		lblNewLabel_2_1_1.setToolTipText("Our Team");
		lblNewLabel_2_1_1.setBackground(Color.GRAY);
		lblNewLabel_2_1_1.setBounds(35, 481, 64, 68);
		panel_8.add(lblNewLabel_2_1_1);
		lblNewLabel_1.setIcon(new ImageIcon(What1.class.getResource("/Images/home.png")));
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setBounds(35, 52, 64, 68);
		panel_8.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setToolTipText("Algorithms");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		GUI fra = new GUI();
		fra.show();
		}
		});
		lblNewLabel_2.setIcon(new ImageIcon(What1.class.getResource("/Images/Algorithms.png")));
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setBounds(35, 161, 64, 68);
		panel_8.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setToolTipText("Simulation");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			Simulation frame1234 = new Simulation();
			frame1234.show();
			
			}
		});
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setToolTipText("Quiz");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			Quiz2 fre = new Quiz2();
			fre.show();
			
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon(What1.class.getResource("/Images/Quiz.png")));
		lblNewLabel_2_1.setBackground(Color.GRAY);
		lblNewLabel_2_1.setBounds(35, 374, 64, 68);
		panel_8.add(lblNewLabel_2_1);
		lblNewLabel_3_1.setIcon(new ImageIcon(What1.class.getResource("/Images/Simulator (2).png")));
		lblNewLabel_3_1.setBackground(Color.GRAY);
		lblNewLabel_3_1.setBounds(35, 269, 64, 68);
		panel_8.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel(" ");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(What1.class.getResource("/Images/Disc.jpeg")));
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_4.setBackground(new Color(0, 128, 0));
		lblNewLabel_4.setBounds(10, 11, 113, 585);
		panel_8.add(lblNewLabel_4);
		
		txtWhatDoWe = new JTextField();
		txtWhatDoWe.setBackground(new Color(230, 230, 250));
		txtWhatDoWe.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		txtWhatDoWe.setEditable(false);
		txtWhatDoWe.setText("WHAT DO WE MEAN BY FOLLOWING ALGORITHMS?");
		txtWhatDoWe.setHorizontalAlignment(SwingConstants.CENTER);
		txtWhatDoWe.setBounds(162, 24, 833, 58);
		contentPane.add(txtWhatDoWe);
		txtWhatDoWe.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(What1.class.getResource("/Images/BG.png")));
		lblNewLabel_3.setBounds(10, 11, 998, 607);
		contentPane.add(lblNewLabel_3);
	}
}
