package Operating_System;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import com.jtattoo.plaf.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JProgressBar;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Splash extends JFrame {

	private JPanel contentPane;
	private static JProgressBar progressBar;
	private static JLabel lblNewLabel_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
		try {
		    UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
		}
		catch (Exception e) {
		    System.out.println("An Exception occured: "+e);
		}
	int x;
					Splash frame = new Splash();
					frame.setVisible(true);
					try {
					for(x=0; x<=100;x++) {
				Splash.progressBar.setValue(x);
						Thread.sleep(50);
						Splash.lblNewLabel_1.setText(Integer.toString(x)+" %");
						if(x==100) {	
							
						Firstpage frame18 = new Firstpage();
						frame18.show();
						frame.dispose();
						
						
					
	
							
						}
					} }catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					};
					
				 
	}

	/**
	 * Create the frame.
	 */
	public Splash() {
		setTitle("Operating System");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 906, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 11, 880, 527);
		contentPane.add(panel);
		panel.setLayout(null);
		
		 progressBar = new JProgressBar();
		 progressBar.setForeground(SystemColor.info);
		 progressBar.setBackground(SystemColor.controlText);
		progressBar.setBounds(10, 495, 860, 21);
		panel.add(progressBar);
		
		JLabel lblNewLabel_2 = new JLabel("                                     OPERATING SYSTEM");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		lblNewLabel_2.setBounds(0, 0, 850, 44);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(412, 448, 66, 36);
		panel.add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Splash.class.getResource("/Images/programming.gif")));
		lblNewLabel.setBounds(40, 11, 820, 463);
		panel.add(lblNewLabel);
	}
}
