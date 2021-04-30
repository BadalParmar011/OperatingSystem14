package Operating_System;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener{
public static void main(String[] args) {
Quiz quiz = new Quiz();
}
String[] questions = 	{
						"In _______ information is recorded magnetically on platters.",
						"The heads of the magnetic disk are attached to a _____ that moves all the heads as a unit.",
						"The set of tracks that are at one arm position make up a ___________",
						"The time taken to move the disk arm to the desired cylinder is called the ____________",
						"The time taken for the desired sector to rotate to the disk head is called ____________",
						"When the head damages the magnetic surface, it is known as _________",
						"A floppy disk is designed to rotate ___________ as compared to a hard disk drive.",
						"What is the host controller?",
						"______ controller sends the command placed into it, via messages to the _____ controller.",
						"What is the disk bandwidth?"
					};
String[][] options = 	{
						{"Magnetic Disks","Electrical Disks","Assemblies","Cylinders"},
						{"Spindle","Disk Arm","Track","None of the mentioned"},
						{"Magnetic Disks","Electrical Disks","Assemblies","Cylinders"},
						{"Positioning time","Random Access time","Seek time","Rotational latency"},
						{"Positioning time","Random Access time","Seek time","Rotational latency"},
						{"Disk crash","Head crash", "Magnetic damage","All of the mentioned"},
						{"Faster","Slower","At the same speed","None of the mentioned"},
						{"Controller built at the end of each disk","Controller at the computer end of the bus","All of the mentioned","None of the mentioned"},
						{"host, host","disk, disk","host, disk","disk, host"},
						{"The total number of bytes transferred","Total time between the first request for service and the completion on the last transfer","The total number of bytes transferred divided by the total time between the first request for service and the completion on the last transfer","None of the mentioned"}
					};
char[] answers = 		{
						'A',
						'B',
						'D',
						'C',
						'D',
						'B',
						'B',
						'B',
						'C',
						'C'
					};
char guess;
char answer;
int index;
int correct_guesses =0;
int total_questions = questions.length;
int result;
int seconds=10;

JFrame frame = new JFrame();
JTextField textfield = new JTextField();
JTextArea textarea = new JTextArea();
JButton buttonA = new JButton();
JButton buttonB = new JButton();
JButton buttonC = new JButton();
JButton buttonD = new JButton();
JLabel answer_labelA = new JLabel();
JLabel answer_labelB = new JLabel();
JLabel answer_labelC = new JLabel();
JLabel answer_labelD = new JLabel();
JLabel time_label = new JLabel();
JLabel seconds_left = new JLabel();
JTextField number_right = new JTextField();
JTextField percentage = new JTextField();

Timer timer = new Timer(1000, new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
	seconds--;
	seconds_left.setText(String.valueOf(seconds));
	if(seconds<=0) {
		displayAnswer();
	}
	}
});
private final JLabel lblNewLabel = new JLabel("");
private final JLabel lblNewLabel_1 = new JLabel("OPERATING SYSTEM");
private final JLabel lblNewLabel_5_1 = new JLabel("");

public Quiz() {
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(882,682);
frame.getContentPane().setBackground(new Color(240, 223, 214));
frame.getContentPane().setLayout(null);
frame.setResizable(false);
textfield.setHorizontalAlignment(SwingConstants.CENTER);

textfield.setBounds(153,99,100,86);
textfield.setBackground(new Color(230, 230, 250));
textfield.setForeground(new Color(0, 0, 0));
textfield.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
textfield.setBorder(BorderFactory.createBevelBorder(1));
textfield.setEditable(false);

textarea.setBounds(263,99,595,86);
textarea.setLineWrap(true);
textarea.setWrapStyleWord(true);
textarea.setBackground(new Color(255, 222, 173));
textarea.setForeground(new Color(0, 0, 0));
textarea.setFont(new Font("Bookman Old Style", Font.PLAIN, 21));
textarea.setBorder(BorderFactory.createBevelBorder(1));
textarea.setEditable(false);
buttonA.setBackground(new Color(230, 230, 250));

buttonA.setBounds(153,196,100,100);
buttonA.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
buttonA.setFocusable(false);
buttonA.addActionListener(this);
buttonA.setText("A");
buttonB.setBackground(new Color(230, 230, 250));

buttonB.setBounds(153,307,100,100);
buttonB.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
buttonB.setFocusable(false);
buttonB.addActionListener(this);
buttonB.setText("B");
buttonC.setBackground(new Color(230, 230, 250));

buttonC.setBounds(153,418,100,100);
buttonC.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
buttonC.setFocusable(false);
buttonC.addActionListener(this);
buttonC.setText("C");
buttonD.setBackground(new Color(230, 230, 250));

buttonD.setBounds(153,529,100,100);
buttonD.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
buttonD.setFocusable(false);
buttonD.addActionListener(this);
buttonD.setText("D");

answer_labelA.setBounds(263,196,500,100);
answer_labelA.setBackground(new Color(50,50,50));
answer_labelA.setForeground(new Color(25,255,0));
answer_labelA.setFont(new Font("Bookman Old Style", Font.BOLD, 35));

answer_labelB.setBounds(263,307,500,100);
answer_labelB.setBackground(new Color(50,50,50));
answer_labelB.setForeground(new Color(25,255,0));
answer_labelB.setFont(new Font("Bookman Old Style", Font.BOLD, 35));

answer_labelC.setBounds(263,418,500,100);
answer_labelC.setBackground(new Color(50,50,50));
answer_labelC.setForeground(new Color(25,255,0));
answer_labelC.setFont(new Font("Bookman Old Style", Font.BOLD, 35));

answer_labelD.setBounds(263,529,500,100);
answer_labelD.setBackground(new Color(50,50,50));
answer_labelD.setForeground(new Color(25,255,0));
answer_labelD.setFont(new Font("Bookman Old Style", Font.BOLD, 35));

seconds_left.setBounds(774,562,84,67);
seconds_left.setBackground(new Color(230, 230, 250));
seconds_left.setForeground(new Color(255,0,0));
seconds_left.setFont(new Font("Bookman Old Style", Font.BOLD, 60));
seconds_left.setBorder(BorderFactory.createBevelBorder(1));
seconds_left.setOpaque(true);
seconds_left.setHorizontalAlignment(JTextField.CENTER);
seconds_left.setText(String.valueOf(seconds));

time_label.setBounds(774,536,84,25);
time_label.setBackground(new Color(50,50,50));
time_label.setForeground(Color.WHITE);
time_label.setFont(new Font("Bookman Old Style",Font.BOLD,16));
time_label.setHorizontalAlignment(JTextField.CENTER);
time_label.setText("timer >:D");

number_right.setBounds(225,225,200,100);
number_right.setBackground(new Color(25,25,25));
number_right.setForeground(new Color(25,255,0));
number_right.setFont(new Font("Bookman Old Style",Font.BOLD,50));
number_right.setBorder(BorderFactory.createBevelBorder(1));
number_right.setLocation(400, 300);
number_right.setHorizontalAlignment(JTextField.CENTER);
number_right.setEditable(false);

percentage.setBounds(225,325,200,100);
percentage.setBackground(new Color(25,25,25));
percentage.setLocation(400, 400);
percentage.setForeground(new Color(25,255,0));
percentage.setFont(new Font("Bookman Old Style",Font.BOLD,50));
percentage.setBorder(BorderFactory.createBevelBorder(1));
percentage.setHorizontalAlignment(JTextField.CENTER);
percentage.setEditable(false);

frame.getContentPane().add(time_label);
frame.getContentPane().add(seconds_left);
frame.getContentPane().add(answer_labelA);
frame.getContentPane().add(answer_labelB);
frame.getContentPane().add(answer_labelC);
frame.getContentPane().add(answer_labelD);
frame.getContentPane().add(buttonA);
frame.getContentPane().add(buttonB);
frame.getContentPane().add(buttonC);
frame.getContentPane().add(buttonD);
frame.getContentPane().add(textarea);
frame.getContentPane().add(textfield);

JPanel panel = new JPanel();
panel.setLayout(null);
panel.setBorder(null);
panel.setBackground(Color.WHITE);
panel.setBounds(10, 11, 133, 631);
frame.getContentPane().add(panel);

JLabel lblNewLabel_1_1 = new JLabel("");
lblNewLabel_1_1.setToolTipText("Homepage");
lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		frame.dispose();
Firstpage frame12345 = new Firstpage();
frame12345.show();
}
});
lblNewLabel_5_1.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		frame.dispose();
		About_Us frame210 = new About_Us();
		frame210.show();
	}
});
lblNewLabel_5_1.setIcon(new ImageIcon(Quiz.class.getResource("/Images/Team.png")));
lblNewLabel_5_1.setToolTipText("Our Team");
lblNewLabel_5_1.setBounds(35, 481, 64, 68);
panel.add(lblNewLabel_5_1);
lblNewLabel_1_1.setIcon(new ImageIcon(Quiz.class.getResource("/Images/home.png")));
lblNewLabel_1_1.setBackground(Color.GRAY);
lblNewLabel_1_1.setBounds(35, 52, 64, 68);
panel.add(lblNewLabel_1_1);

JLabel lblNewLabel_2 = new JLabel("");
lblNewLabel_2.setToolTipText("Algorithms");
lblNewLabel_2.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		frame.dispose();
GUI fr = new GUI();
fr.show();
}
});
lblNewLabel_2.setIcon(new ImageIcon(Quiz.class.getResource("/Images/Algorithms.png")));
lblNewLabel_2.setBackground(Color.GRAY);
lblNewLabel_2.setBounds(35, 161, 64, 68);
panel.add(lblNewLabel_2);

JLabel lblNewLabel_3 = new JLabel("");
lblNewLabel_3.setToolTipText("Simulator");
lblNewLabel_3.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		frame.dispose();
	Simulation fre = new Simulation();
	fre.show();
	}
});
lblNewLabel_3.setIcon(new ImageIcon(Quiz.class.getResource("/Images/Simulator (2).png")));
lblNewLabel_3.setBackground(Color.GRAY);
lblNewLabel_3.setBounds(35, 269, 64, 68);
panel.add(lblNewLabel_3);

JLabel lblNewLabel_5 = new JLabel("");
lblNewLabel_5.setToolTipText("Quiz");
lblNewLabel_5.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
Error hu = new Error();
hu.show();
}
});
lblNewLabel_5.setIcon(new ImageIcon(Quiz.class.getResource("/Images/Quiz.png")));
lblNewLabel_5.setBounds(34, 374, 64, 68);
panel.add(lblNewLabel_5);

JLabel lblNewLabel_4 = new JLabel(" ");
lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4.setIcon(new ImageIcon(Quiz.class.getResource("/Images/Disc.jpeg")));
lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
lblNewLabel_4.setForeground(Color.WHITE);
lblNewLabel_4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
lblNewLabel_4.setBackground(new Color(0, 128, 0));
lblNewLabel_4.setBounds(10, 11, 113, 609);
panel.add(lblNewLabel_4);
lblNewLabel_1.setForeground(Color.WHITE);
lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_1.setBounds(153, 19, 705, 67);

frame.getContentPane().add(lblNewLabel_1);
lblNewLabel.setIcon(new ImageIcon(Quiz.class.getResource("/Images/BG.png")));
lblNewLabel.setBounds(10, 11, 856, 631);

frame.getContentPane().add(lblNewLabel);
frame.setVisible(true);

nextQuestion();
}
public void nextQuestion() {

if(index>=total_questions) {
	results();
}
else {
	textfield.setText("Question "+(index+1));
	textarea.setText(questions[index]);
	answer_labelA.setText(options[index][0]);
	answer_labelB.setText(options[index][1]);
	answer_labelC.setText(options[index][2]);
	answer_labelD.setText(options[index][3]);
	timer.start();
}
}
@Override
public void actionPerformed(ActionEvent e) {

	buttonA.setEnabled(false);
	buttonB.setEnabled(false);
	buttonC.setEnabled(false);
	buttonD.setEnabled(false);
	
	if(e.getSource()==buttonA) {
		answer= 'A';
		if(answer == answers[index]) {
			correct_guesses++;
		}
	}
	if(e.getSource()==buttonB) {
		answer= 'B';
		if(answer == answers[index]) {
			correct_guesses++;
		}
	}
	if(e.getSource()==buttonC) {
		answer= 'C';
		if(answer == answers[index]) {
			correct_guesses++;
		}
	}
	if(e.getSource()==buttonD) {
		answer= 'D';
		if(answer == answers[index]) {
			correct_guesses++;
		}
	}
	displayAnswer();
}
public void displayAnswer() {

timer.stop();

buttonA.setEnabled(false);
buttonB.setEnabled(false);
buttonC.setEnabled(false);
buttonD.setEnabled(false);

if(answers[index] != 'A')
	answer_labelA.setForeground(new Color(255,0,0));
if(answers[index] != 'B')
	answer_labelB.setForeground(new Color(255,0,0));
if(answers[index] != 'C')
	answer_labelC.setForeground(new Color(255,0,0));
if(answers[index] != 'D')
	answer_labelD.setForeground(new Color(255,0,0));

Timer pause = new Timer(2000, new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		answer_labelA.setForeground(new Color(25,255,0));
		answer_labelB.setForeground(new Color(25,255,0));
		answer_labelC.setForeground(new Color(25,255,0));
		answer_labelD.setForeground(new Color(25,255,0));
		
		answer = ' ';
		seconds=10;
		seconds_left.setText(String.valueOf(seconds));
		buttonA.setEnabled(true);
		buttonB.setEnabled(true);
		buttonC.setEnabled(true);
		buttonD.setEnabled(true);
		index++;
		nextQuestion();
	}
});
pause.setRepeats(false);
pause.start();
}
public void results(){

buttonA.setEnabled(false);
buttonB.setEnabled(false);
buttonC.setEnabled(false);
buttonD.setEnabled(false);

result = (int)((correct_guesses/(double)total_questions)*100);

textfield.setText("RESULTS!");
textarea.setText("");
answer_labelA.setText("");
answer_labelB.setText("");
answer_labelC.setText("");
answer_labelD.setText("");

number_right.setText("("+correct_guesses+"/"+total_questions+")");
percentage.setText(result+"%");

frame.getContentPane().add(number_right);
frame.getContentPane().add(percentage);

}
public void show() {
// TODO Auto-generated method stub

}
}