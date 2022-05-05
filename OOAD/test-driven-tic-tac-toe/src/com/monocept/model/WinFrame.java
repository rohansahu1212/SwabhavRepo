package com.monocept.model;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class WinFrame extends JFrame {
	private String winnerName;

	JPanel title = new JPanel();
	JPanel button_panel = new JPanel();
	JLabel textArea = new JLabel();
	JButton restart = new JButton();

	public WinFrame(String name) throws HeadlessException {

		this.winnerName = name;
	}

	public void winnnerFrame() {
		JTextField winner = new JTextField();
		winner.setFont(new Font("ink free", Font.BOLD, 50));
		winner.setText(winnerName + " is winner congo");
	
		JButton restart = new JButton("Replay");
		title.add(winner);
		
		title.setBounds(40, 40,500, 500);
		restart.setBounds(650, 40,250, 40);
		add(title);

		add(restart);
		
		restart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			GameLoginUI gmu= new GameLoginUI();
			gmu.loginFrame();
			JButton button = (JButton) e.getSource();
			Window window = SwingUtilities.windowForComponent(button);
			window.dispose();
				
			}
		});

		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 800);
		setVisible(true);
	}

}
