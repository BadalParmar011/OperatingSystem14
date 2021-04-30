package Operating_System;
/** 
 * author@BadalParmar
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class Simulation extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simulation frame = new Simulation();
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
	public Simulation() {
		setTitle("Operating System Simulator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1024, 658);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240,223,  214));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(new Color(230, 230, 250));
		textField.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("SIMULATION");
		textField.setColumns(10);
		textField.setBounds(170, 21, 824, 60);
		contentPane.add(textField);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(170, 92, 824, 512);
		contentPane.add(tabbedPane_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 222, 173));
		tabbedPane_1.addTab("Disk Scheduling Algorithm", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBackground(new Color(230, 230, 250));
		tabbedPane_2.setBounds(10, 11, 799, 462);
		panel_2.add(tabbedPane_2);
		
		JPanel pFCFS = new JPanel();
		pFCFS.setBackground(new Color(230, 230, 250));
		tabbedPane_2.addTab("FCFS", null, pFCFS, null);
		pFCFS.setLayout(null);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(255, 218, 185));
		panel_19.setBounds(10, 11, 774, 412);
		pFCFS.add(panel_19);
		panel_19.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 11, 754, 390);
		panel_19.add(scrollPane_3);
		
		JTextPane txtpnFcfsfirstcomefirstserve = new JTextPane();
		txtpnFcfsfirstcomefirstserve.setBackground(Color.WHITE);
		txtpnFcfsfirstcomefirstserve.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		txtpnFcfsfirstcomefirstserve.setText("\r\n- FCFS (First-Come-First-Serve) is the easiest disk scheduling algorithm among all the scheduling algorithms. In the FCFS disk   scheduling algorithm, each input/output request is served in the order in which the requests arrive. In this algorithm, starvation does   not occur because FCFS addresses each request.\r\n\r\no Advantages - \r\n- In FCFS disk scheduling, there is no indefinite delay.\r\n- There is no starvation in FCFS disk scheduling because each request gets a fair chance.\r\n \r\no Disadvantages -  \r\n- FCFS scheduling is not offered as the best service.\r\n- In FCFS, scheduling disk time is not optimized.\r\n \r\no Algorithm -\r\n \r\n1. Let Request array represents an array storing indexes of tracks that have been requested in ascending order of their time of arrival. \u2018head\u2019 is the position of disk head.\r\n2. Let us one by one take the tracks in default order and calculate the absolute distance of the track from the head.\r\n3. Increment the total seek count with this distance.\r\n4. Currently serviced track position now becomes the new head position.\r\n5. Go to step 2 until all tracks in the request array have not been serviced.\r\n");
		scrollPane_3.setViewportView(txtpnFcfsfirstcomefirstserve);
		
		JPanel pSSTF = new JPanel();
		pSSTF.setBackground(new Color(230, 230, 250));
		tabbedPane_2.addTab("SSTF", null, pSSTF, null);
		pSSTF.setLayout(null);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(255, 218, 185));
		panel_13.setBounds(10, 11, 774, 412);
		pSSTF.add(panel_13);
		panel_13.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 11, 754, 390);
		panel_13.add(scrollPane_2);
		
		JTextArea txtrSstfStandsFor = new JTextArea();
		txtrSstfStandsFor.setEditable(false);
		txtrSstfStandsFor.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		txtrSstfStandsFor.setBackground(Color.WHITE);
		txtrSstfStandsFor.setText("\r\n- SSTF stands for Shortest Seek Time First. In SSTF, requests having the shortest seek time are executed first. \r\n  So, the seek time of everyrequest is calculated in advance in the queue and then they are scheduled \r\n  according to their calculated seek time. As a result, the request near the disk arm will get executed first.  \r\n  SSTF is certainly an improvement over FCFS as it decreases the average response time and increases the \r\n  throughput of the system. It breaks the tie in the direction of head movement.\r\n \r\no Advantages - \r\n\r\n- It reduces the total seek time as compared to FCFS.\r\n- It provides increased throughput.\r\n- It provides less average response time and waiting time.\r\n \r\no Disadvantages -\r\n \r\n- There is an overhead of finding out the closest request.\r\n- The requests which are far from the head might starve for the CPU.\r\n- It provides a high variance in response time and waiting time.\r\n- Switching the direction of the head frequently slows down the algorithm.\r\n\r\no Algorithm -\r\n\r\n- Let Request array represents an array storing indexes of tracks that have been requested. \u2018head\u2019 is the \r\n   position of disk head.\r\n- Find the positive distance of all tracks in the request array from the head.\r\n- Find a track from the requested array which has not been accessed/serviced yet and has a minimum \r\n   distance from the head.\r\n- Increment the total seek count with this distance.\r\n- Currently serviced track position now becomes the new head position.\r\n- Go to step 2 until all tracks in the request array have not been serviced.");
		scrollPane_2.setViewportView(txtrSstfStandsFor);
		
		JPanel pSCAN = new JPanel();
		pSCAN.setBackground(new Color(230, 230, 250));
		tabbedPane_2.addTab("SCAN", null, pSCAN, null);
		pSCAN.setLayout(null);
		
		JPanel panel_13_1 = new JPanel();
		panel_13_1.setBackground(new Color(255, 218, 185));
		panel_13_1.setLayout(null);
		panel_13_1.setBounds(10, 11, 774, 412);
		pSCAN.add(panel_13_1);
		
		JScrollPane scrollPane_2_1 = new JScrollPane();
		scrollPane_2_1.setBounds(10, 11, 754, 390);
		panel_13_1.add(scrollPane_2_1);
		
		JTextArea txtrInTheScan = new JTextArea();
		txtrInTheScan.setEditable(false);
		txtrInTheScan.setBackground(Color.WHITE);
		txtrInTheScan.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		txtrInTheScan.setText("- In the SCAN disk scheduling algorithm, the head starts from one end of the disk and moves towards the other end, \r\n  servicing requests in between one by one and reaching the other end. Then the direction of the head is reversed \r\n  and the process continues as the head continuously scans back and forth to access the disk. So, this algorithm \r\n  works as an elevator and hence is also known as the elevator algorithm. As a result, the requests at the midrange \r\n  are serviced more and those arriving behind the disk arm will have to wait.\r\n \r\no Advantages -\r\n- This algorithm is simple and easy to understand.\r\n- The SCAN algorithm is better than FCFS Scheduling Algotithm and has no starvation.\r\n\r\no Disadvantages - \r\n- More complex algorithm to implement.\r\n- This algorithm is not fair because it causes a long waiting time for the cylinders just visited by the head.\r\n- It causes the head to move till the end of the disk in this way the requests arriving ahead of the arm position \r\n  would get immediate   service but some other requests that arrive behind the arm position will have to wait \r\n  for the request to complete.\r\n \r\nAlgorithm - \r\n1. Let Request array represents an array storing indexes of tracks that have been requested in ascending order of \r\n    their time of arrival. \u2018head\u2019 is the position of disk head.\r\n2. Let direction represents whether the head is moving towards left or right.\r\n3. In the direction in which the head is moving service all tracks one by one.\r\n4. Calculate the absolute distance of the track from the head.\r\n5. Increment the total seek count with this distance.\r\n6. Currently serviced track position now becomes the new head position.\r\n7. Go to step 3 until we reach one of the ends of the disk.\r\n8. If we reach the end of the disk reverse the direction and go to step 2 until all tracks in the request array have \r\n    not been serviced.");
		scrollPane_2_1.setViewportView(txtrInTheScan);
		
		JPanel pCSAN = new JPanel();
		pCSAN.setBackground(new Color(230, 230, 250));
		tabbedPane_2.addTab("CSCAN", null, pCSAN, null);
		pCSAN.setLayout(null);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(255, 218, 185));
		panel_20.setBounds(10, 11, 774, 412);
		pCSAN.add(panel_20);
		panel_20.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 11, 754, 390);
		panel_20.add(scrollPane_4);
		
		JTextPane txtpnTheCircularScan = new JTextPane();
		txtpnTheCircularScan.setBackground(Color.WHITE);
		txtpnTheCircularScan.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		txtpnTheCircularScan.setText("The Circular SCAN (C-SCAN) scheduling algorithm is a modified version of the SCAN disk scheduling algorithm that deals with the inefficiency of the SCAN algorithm by servicing the requests more uniformly. This is also known as the \u201CCircular Elevator Algorithm\u201D as it essentially treats the cylinders as a circular list that wraps around from the final cylinder to the first one.\r\n\r\nAdvantages\r\n- The waiting time for the cylinders just visited by the head is reduced as compared to the SCAN Algorithm.\r\n- It provides a uniform waiting time and better response time.\r\n\r\nDisadvantages \r\n- It causes more seek movements as compared to the SCAN Algorithm.\r\n- It causes the head to move till the end of the disk even if there are no requests to be serviced.\r\n\r\nAlgorithm \r\n1. Let Request array represents an array storing indexes of tracks that have been requested in ascending order of their time of arrival. \u2018head\u2019 is the position of disk head.\r\n2. The head services only in the right direction from 0 to the size of the disk.\r\n3. While moving in the left direction do not service any of the tracks.\r\n4. When we reach the beginning(left end) reverse the direction.\r\n5. In right direction it services all tracks one by one and calculate the absolute distance of the track from the head.\r\n6. Increment the total seek count with this distance.\r\n7. Currently serviced track position now becomes the new head position.\r\n8. Go to step 6 until we reach the right end of the disk.\r\n9. If we reach the right end of the disk reverse the direction and go to step 3 until all tracks in the request array have not been serviced.");
		scrollPane_4.setViewportView(txtpnTheCircularScan);
		
		JPanel pLOOK = new JPanel();
		pLOOK.setBackground(new Color(230, 230, 250));
		tabbedPane_2.addTab("LOOK", null, pLOOK, null);
		pLOOK.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 218, 185));
		panel.setBounds(10, 11, 774, 412);
		pLOOK.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 754, 390);
		panel.add(scrollPane);
		
		JTextArea txtrLookIsThe = new JTextArea();
		txtrLookIsThe.setEditable(false);
		txtrLookIsThe.setForeground(new Color(0, 0, 0));
		txtrLookIsThe.setBackground(Color.WHITE);
		txtrLookIsThe.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		txtrLookIsThe.setText(" LOOK is the advanced version of SCAN (elevator) disk scheduling algorithm which gives slightly better seek time than\r\n any other algorithm in the hierarchy (FCFS->SSTF->SCAN->C-SCAN->LOOK). The LOOK algorithm services request \r\n similarly as SCAN algorithm meanwhile it also \u201Clooks'' ahead as if there are more tracks that are needed to be serviced \r\n in the same direction. If there are no pending requests in the moving direction the head reverses the direction and starts\r\n servicing requests in the opposite direction.\r\n \r\n The main reason behind the better performance of LOOK algorithm in comparison to SCAN is because in this algorithm \r\n the head is not allowed to move till the end of the disk. \r\n\r\n Advantages \r\n - In Look disk scheduling, there is no starvation.\r\n - Look disk scheduling offers low variance in waiting time and response time.\r\n - Look disk scheduling offers better performance as compared to the SCAN disk scheduling.\r\n - In LOOK disk scheduling, there is no requirement for the disk head to move till the end of the disk when we do not have\r\n   any request to be serviced.\r\n \r\n Disadvantages \r\n - In look disk scheduling, there is more overhead to find the end request.\r\n - Look disk scheduling is not used in case of more load.\r\n  \r\n Algorithm:\r\n 1. Let Request array represents an array storing indexes of tracks that have been requested in ascending order of their \r\ntime of arrival. \u2018head\u2019 is the position of disk head.\r\n 2. The initial direction in which the head is moving is given and it services in the same direction.\r\n 3. The head services all the requests one by one in the direction the head is moving.\r\n 4. The head continues to move in the same direction until all the requests in this direction are not finished.\r\n 5. While moving in this direction calculate the absolute distance of the track from the head.\r\n 6. Increment the total seek count with this distance.\r\n 7. Currently serviced track position now becomes the new head position.\r\n 8. Go to step 5 until we reach at last request in this direction.\r\n 9. If we reach where no requests are needed to be serviced in this direction, reverse the direction and go to step 3 until all\r\n     tracks in the request array have not been serviced.");
		scrollPane.setViewportView(txtrLookIsThe);
		
		JPanel pCLOOK = new JPanel();
		pCLOOK.setBackground(new Color(230, 230, 250));
		tabbedPane_2.addTab("CLOOK", null, pCLOOK, null);
		pCLOOK.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 218, 185));
		panel_1.setLayout(null);
		panel_1.setBounds(10, 11, 774, 412);
		pCLOOK.add(panel_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 754, 390);
		panel_1.add(scrollPane_1);
		
		JTextArea CLOOK = new JTextArea();
		CLOOK.setEditable(false);
		CLOOK.setBackground(Color.WHITE);
		CLOOK.setForeground(new Color(0, 0, 0));
		CLOOK.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		CLOOK.setText("- Given an array of disk track numbers and initial head position, our task is to find the total number of seek operations done\r\n   to access all the requested tracks if C-LOOK disk scheduling algorithm is used. Also, write a program to find the seek \r\n   sequence using C-LOOK disk scheduling algorithm.\r\n \r\n - C-LOOK is an enhanced version of both SCAN as well as LOOK disk scheduling algorithms. This algorithm also uses the \r\n   idea of wrapping the tracks as a circular cylinder as a C-SCAN algorithm but the seek time is better than the C-SCAN \r\n   algorithm. We know that C-SCAN is used to avoid starvation and services all the requests more uniformly, the same goes\r\n   for C-LOOK.\r\n\r\n-  In this algorithm, the head services requests only in one direction (either left or right) until all the requests in this direction \r\n   are not serviced and then jumps back to the farthest request on the other direction and service the remaining requests \r\n   which gives a better uniform servicing as well as avoids wasting seek time for going till the end of the disk.\r\n\r\no  Advantages\r\n\r\n - It does not cause the head to move till the ends of the disk when there are no requests to be serviced.\r\n - It reduces the waiting time for the cylinders just visited by the head.\r\n - It provides better performance as compared to LOOK Algorithm.\r\n - It does not lead to starvation.\r\n - It provides low variance in response time and waiting time.\r\n\r\no Disadvantages-\r\n\r\n - There is an overhead of finding the end requests.\r\n \r\no Algorithm -\r\n\r\n 1. Let Request array represents an array storing indexes of the tracks that have been requested in ascending order of their \r\n     time of arrival and head is the position of the disk head.\r\n 2. The initial direction in which the head is moving is given and it services in the same direction.\r\n 3. The head services all the requests one by one in the direction it is moving.\r\n 4. The head continues to move in the same direction until all the requests in this direction have been serviced.\r\n 5. While moving in this direction, calculate the absolute distance of the tracks from the head.\r\n 6. Increment the total seek count with this distance.\r\n 7. Currently serviced track position now becomes the new head position.\r\n 8. Go to step 5 until we reach the last request in this direction.\r\n 9. If we reach the last request in the current direction then reverse the direction and move the head in this direction  \r\n     until we reach the last request that is needed to be serviced in this direction without servicing the intermediate requests.\r\n 10. Reverse the direction and go to step 3 until all the requests have not been serviced.");
		scrollPane_1.setViewportView(CLOOK);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 222, 173));
		tabbedPane_1.addTab("Page Replacement Algorithm", null, panel_5, null);
		panel_5.setLayout(null);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(255, 222, 173));
		panel_14.setBounds(10, 11, 799, 462);
		panel_5.add(panel_14);
		panel_14.setLayout(null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBackground(new Color(230, 230, 250));
		tabbedPane_3.setBounds(10, 11, 779, 440);
		panel_14.add(tabbedPane_3);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(230, 230, 250));
		tabbedPane_3.addTab("FIFO", null, panel_15, null);
		panel_15.setLayout(null);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(230, 230, 250));
		panel_18.setBounds(10, 11, 754, 390);
		panel_15.add(panel_18);
		panel_18.setLayout(null);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(0, 0, 754, 390);
		panel_18.add(scrollPane_5);
		
		JTextArea txtrFirstInFirst = new JTextArea();
		txtrFirstInFirst.setLineWrap(true);
		txtrFirstInFirst.setWrapStyleWord(true);
		txtrFirstInFirst.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		txtrFirstInFirst.setText("First In First Out (FIFO) is the simplest page replacement algorithm. In this algorithm, the operating system keeps track of all pages in the memory in a queue, the oldest page is in the front of the queue. When a page needs to be replaced page in the front of the queue is selected for removal.\r\n\r\nAdvantages :\r\r\n1)It is simple and easy to understand & implement.\r\n\r\nDisadvantages \u2013:\r\r\n1)The process effectiveness is low.\r\n2)When we increase the number of frames while using FIFO, we are giving more memory to processes. So, page faults should decrease, but here the page faults are increasing. This problem is called Belady\u2019s Anomaly.\r\r\n3)Every frame needs to be taken into account off.\r\r\n\r\r\nAlgorithm:\r\r\n1- Start traversing the pages.\r\r\n\r\n i) If set holds less pages than capacity.\r\r\n\t a) Insert page into the set one by one until the size  of set reaches capacity or all page \trequests are processed.\r\r\n\t b) Simultaneously maintain the pages in the\r\n queue to perform FIFO.  \r\r\n\t c) Increment page fault\r\n \r\r\nii) Else \r\n \t  If current page is present in set, do nothing.\r\n   \r\r\nElse \r\r\n\t a) Remove the first page from the queue\r\n as it was the first to be entered in\r\n  the memory\r\r\n\t b) Replace the first page in the queue with \r\nthe current page in the string.  \t\r\r\n\t c) Store current page in the queue.\r\r\n\td) Increment page faults.\r\n2. Return page faults.");
		scrollPane_5.setViewportView(txtrFirstInFirst);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(230, 230, 250));
		tabbedPane_3.addTab("LRU", null, panel_16, null);
		panel_16.setLayout(null);
		
		JPanel panel_18_1 = new JPanel();
		panel_18_1.setBackground(new Color(230, 230, 250));
		panel_18_1.setBounds(10, 11, 754, 390);
		panel_16.add(panel_18_1);
		panel_18_1.setLayout(null);
		
		JScrollPane scrollPane_2_2_1 = new JScrollPane();
		scrollPane_2_2_1.setBounds(0, 0, 754, 390);
		panel_18_1.add(scrollPane_2_2_1);
		
		JTextArea txtrTheLeastRecently_2 = new JTextArea();
		txtrTheLeastRecently_2.setWrapStyleWord(true);
		txtrTheLeastRecently_2.setLineWrap(true);
		txtrTheLeastRecently_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		txtrTheLeastRecently_2.setText("The Least Recently Used (LRU) algorithm replaces the page which has not been referred to for a long time. This algorithm is just opposite to the optimal page replacement algorithm. In this, we look at the past instead of staring at the future.\n\r\nAdvantages :\r\n1)\nIt is open for full analysis.\nIn this, we replace the page which is least recently used, thus free from Belady\u2019s Anomaly.\r\n2)\nEasy to choose a page which has faulted and hasn\u2019t been used for a long time.\n\r\nDisadvantages :\r\n1)\nIt requires additional Data Structure to be implemented.\r\n2)\nHardware assistance is high.\r\nAlgorithm:\r\nLet capacity be the number of pages that\nmemory can hold.  Let set be the current\nset of pages in memory.\n\n\r\n1- Start traversing the pages.\n\r\n i) If set holds less pages than capacity.\n\r\n a) Insert page into the set one by one until \n      the size  of set reaches capacity or all\n      page requests are processed.\n   \r\nb) Simultaneously maintain the recent occurred\n      index of each page in a map called indexes.\n   c) Increment page fault\n \r\nii) Else \n  \r\n If current page is present in set, do nothing.\n  \r\n Else \n    \r\n a) Find the page in the set that was least recently used. We find it using index array.\n We basically need to replace the page with\n minimum index.\n   \r\n b) Replace the found page with current page.\n     \r\nc) Increment page faults.\n     \r\nd) Update index of current page.\n\n\r\n2. Return page faults.");
		scrollPane_2_2_1.setViewportView(txtrTheLeastRecently_2);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(230, 230, 250));
		tabbedPane_3.addTab("OPR", null, panel_17, null);
		panel_17.setLayout(null);
		
		JPanel panel_18_2 = new JPanel();
		panel_18_2.setBackground(new Color(230, 230, 250));
		panel_18_2.setLayout(null);
		panel_18_2.setBounds(10, 11, 744, 390);
		panel_17.add(panel_18_2);
		
		JScrollPane scrollPane_2_2_2 = new JScrollPane();
		scrollPane_2_2_2.setBounds(10, 11, 724, 368);
		panel_18_2.add(scrollPane_2_2_2);
		
		JTextArea txtrTheLeastRecently_1 = new JTextArea();
		txtrTheLeastRecently_1.setLineWrap(true);
		txtrTheLeastRecently_1.setWrapStyleWord(true);
		txtrTheLeastRecently_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		txtrTheLeastRecently_1.setText("An optimal page-replacement algorithm has the lowest page-fault rate of all algorithms. An optimal page-replacement algorithm exists and has been called OPT or MIN.\r\nIt replaces the page that will not be used for the longest period of time. Use the time when a page is to be used.\r\nAdvantages :\r\r\n\r\n1)Complexity is less and easy to implement.\r\r\n2)Assistance needed is low i.e Data structures used are easy and light.\r\r\n\r\nDisadvantages :\r\r\n1)OPR is perfect, but not possible in practice as the operating system cannot know future requests.\r\n2)Error handling is tough.\r\r\n\r\nAlgorithm:\r\r\n1.If referred page is already present, increment hit count.\r\r\n2.If not present, find if a page that is never referenced in future. If such a page exists, replace this page with new page. If no such page exists, find a page that is referenced farthest in future. Replace this page with new page.");
		scrollPane_2_2_2.setViewportView(txtrTheLeastRecently_1);
		
		JTextArea txtrTheLeastRecently = new JTextArea();
		txtrTheLeastRecently.setBounds(20, 42, 755, 394);
		panel_14.add(txtrTheLeastRecently);
		txtrTheLeastRecently.setTabSize(0);
		txtrTheLeastRecently.setLineWrap(true);
		txtrTheLeastRecently.setWrapStyleWord(true);
		txtrTheLeastRecently.setEditable(false);
		txtrTheLeastRecently.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		txtrTheLeastRecently.setText("The Least Recently Used (LRU) algorithm replaces the page which has not been referred to for a long time. This algorithm is just opposite to the optimal page replacement algorithm. In this, we look at the past instead of staring at the future.\r\n\nAdvantages :\r\n1)\nIt is open for full analysis.\n\r\n2)In this, we replace the page which is least recently used, thus free from Belady\u2019s Anomaly.\r\n\n3)Easy to choose a page which has faulted and hasn\u2019t been used for a long time.\n\r\nDisadvantages :\r\n\n1)It requires additional Data Structure to be implemented.\r\n2)\nHardware assistance is high.\r\nAlgorithm:\r\nLet capacity be the number of pages that\nmemory can hold.  Let set be the current\nset of pages in memory.\n\n\r\n1- Start traversing the pages.\n\r\n i) If set holds less pages than capacity.\n  \r\n\t a) Insert page into the set one by one until \nthe size  of set reaches capacity or all\n page \trequests are processed.\n   \r\n\tb) Simultaneously maintain the recent occurred\n index of each page in a map called indexes.\n  \r\n\t c) Increment page fault\n \r\nii) Else \n   \r\nIf current page is present in set, do nothing.\n   \r\nElse \n   \t\r\n\t  a) Find the page in the set that was least \n recently used. We find it using index array.\n We \t\t\tbasically need to replace the page with\n  minimum index.\n   \r\n\t  b) Replace the found page with current page.\n     \r\n\t  c) Increment page faults.\n   \r\n\t  d) Update index of current page.\r\n\n\n2. Return page faults.\n");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 222, 173));
		tabbedPane_1.addTab("CPU Scheduling Algorithm", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(230, 230, 250));
		panel_7.setBounds(10, 11, 799, 462);
		panel_4.add(panel_7);
		panel_7.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(230, 230, 250));
		tabbedPane.setBounds(10, 11, 779, 440);
		panel_7.add(tabbedPane);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_8, null);
		
		JPanel panel_9 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_9, null);
		
		JPanel panel_10 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_10, null);
		
		JPanel panel_11 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_11, null);
		
		JPanel panel_12 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_12, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("Concurrency And Deadlocks", null, panel_6, null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 11, 133, 607);
		contentPane.add(panel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("HomePage");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
		Firstpage frew = new Firstpage();
		frew.show();
		
			}
		});
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				About_Us frame210 = new About_Us();
				frame210.show();
			}
		});
		lblNewLabel_1_1_1.setIcon(new ImageIcon(Simulation.class.getResource("/Images/Team.png")));
		lblNewLabel_1_1_1.setToolTipText("Quiz");
		lblNewLabel_1_1_1.setBackground(Color.GRAY);
		lblNewLabel_1_1_1.setBounds(35, 481, 64, 68);
		panel_3.add(lblNewLabel_1_1_1);
		lblNewLabel.setIcon(new ImageIcon(Simulation.class.getResource("/Images/home.png")));
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(35, 52, 64, 68);
		panel_3.add(lblNewLabel);
		
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
		lblNewLabel_1.setIcon(new ImageIcon(Simulation.class.getResource("/Images/Algorithms.png")));
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setBounds(35, 161, 64, 68);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setToolTipText("Simulation");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		Error fre = new Error();
		fre.show();
		}
		});
		lblNewLabel_2.setIcon(new ImageIcon(Simulation.class.getResource("/Images/Simulator (2).png")));
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setBounds(35, 269, 64, 68);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setToolTipText("Quiz");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
		Quiz2 fre = new Quiz2();
		fre.show();
			}
		});
		lblNewLabel_1_1.setIcon(new ImageIcon(Simulation.class.getResource("/Images/Quiz.png")));
		lblNewLabel_1_1.setBackground(Color.GRAY);
		lblNewLabel_1_1.setBounds(37, 374, 64, 68);
		panel_3.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_7 = new JLabel(" ");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setIcon(new ImageIcon(Simulation.class.getResource("/Images/Disc.jpeg")));
		lblNewLabel_7.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_7.setBackground(new Color(0, 128, 0));
		lblNewLabel_7.setBounds(10, 11, 113, 585);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Simulation.class.getResource("/Images/BG.png")));
		lblNewLabel_4.setBounds(153, 11, 855, 607);
		contentPane.add(lblNewLabel_4);
	}
}
