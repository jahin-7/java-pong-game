import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameFrame implements ActionListener{
	
	GamePanel panel;
	JButton button1;
	JButton button2;
	JPanel panel_;
	JFrame frame1 = new JFrame();
	JFrame frame2 = new JFrame();
	JLabel label;
	
	
	GameFrame(){
		label = new JLabel("Want to Play Pong Game?");
		label.setForeground(Color.WHITE);
		label.setBounds(130, -80, 400, 400);
		
		button1 = new JButton("START");
		button1.setBounds(100, 160, 200, 40);
		button1.setFocusable(false);
		button1.addActionListener(this);
		
		button2 = new JButton("Exit");
		button2.setBounds(100, 190, 200, 40);
		button2.setFocusable(false);
		button2.addActionListener(this);
		
		panel_ = new JPanel();
		panel_.setLayout(null);
		panel_.setSize(420, 420);
		panel_.setBackground(Color.BLACK);
		panel_.add(label);
		panel_.add(button1);
		panel_.add(button2);
		
		
		frame1.add(panel_);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(420, 420);;
		frame1.setLayout(null);
		frame1.setVisible(true);
		frame1.setLocationRelativeTo(null);
		
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button1) {
			frame1.dispose();
			
			panel = new GamePanel();
			
			frame2 = new JFrame();
			frame2.add(panel);
			frame2.setTitle("Pong Game");
			frame2.setResizable(false);
			frame2.setBackground(Color.BLACK);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.pack();
			frame2.setVisible(true);
			frame2.setLocationRelativeTo(null);
		}
		
		if(e.getSource()==button2) {
			System.exit(1);
		}
		
	}
	
}
