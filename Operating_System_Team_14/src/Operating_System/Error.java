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
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Window.Type;

public class Error extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Error frame = new Error();
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
	public Error() {
		setType(Type.POPUP);
		setResizable(false);
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 483, 312);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textInactiveText);
		panel.setBounds(10, 11, 450, 253);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 11, 429, 76);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 11, 409, 54);
		textField_1.setText("You are already on that page!!!!");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		panel_3.add(textField_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(9, 155, 430, 92);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setToolTipText("Homepage");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		Firstpage frn = new Firstpage();
		frn.show();
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
		lblNewLabel_2_1_1.setIcon(new ImageIcon(Error.class.getResource("/Images/Team.png")));
		lblNewLabel_2_1_1.setToolTipText("Our team");
		lblNewLabel_2_1_1.setBounds(350, 11, 64, 70);
		panel_2.add(lblNewLabel_2_1_1);
		lblNewLabel_1.setIcon(new ImageIcon(Error.class.getResource("/Images/home.png")));
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setBounds(15, 11, 64, 70);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setToolTipText("Algorithms");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		GUI frne = new GUI();
		frne.show();
		
			}
		});
		lblNewLabel_1_1.setIcon(new ImageIcon(Error.class.getResource("/Images/Algorithms.png")));
		lblNewLabel_1_1.setBackground(Color.GRAY);
		lblNewLabel_1_1.setBounds(100, 11, 64, 70);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setToolTipText("Simulator");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		Simulation fre = new Simulation();
		fre.show();
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(Error.class.getResource("/Images/Simulator (2).png")));
		lblNewLabel_2.setBounds(180, 11, 64, 70);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setToolTipText("Quiz");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		Quiz2 fre =new Quiz2();
		fre.show();
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon(Error.class.getResource("/Images/Quiz.png")));
		lblNewLabel_2_1.setBounds(259, 11, 64, 70);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Error.class.getResource("/Images/Disc.jpeg")));
		lblNewLabel.setBounds(0, 0, 430, 92);
		panel_2.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 98, 429, 46);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 409, 24);
		textField.setText("Click on the following buttons to reach the respective pages!!!");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		textField.setEditable(false);
		textField.setColumns(10);
		panel_1.add(textField);
	}
}
