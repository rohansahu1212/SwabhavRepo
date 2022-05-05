package com.monocept.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class GameLoginUI extends JFrame {
	JPanel title = new JPanel();
	JPanel button_panel = new JPanel();
	JLabel textArea = new JLabel();
	JButton start;

	public static void main(String[] args) {
		GameLoginUI go = new GameLoginUI();
		go.loginFrame();
	}

	void loginFrame() {
		start = new JButton();
		getContentPane().setBackground(Color.DARK_GRAY);
		setLayout(new BorderLayout());
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JTextArea name1 = new JTextArea();
		JTextArea name2 = new JTextArea();
		name1.setText("Enter player 1 name");
		name2.setText("Enter player 2 name");
		name1.setBounds(10, 10, 200, 40);
		name2.setBounds(10, 80, 200, 40);

		add(name1);
		add(name2);
		// adding stuff
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String player1=name1.getText();
				String player2=name2.getText();
				Player[] players= new Player[2];
				players[0]= new Player(player1, Mark.O);
				players[1]= new Player(player2, Mark.X);
				Board board = new Board();
				Game game= new Game(players, board);
				new TicTacUiFrame(game).ticTacFrame();
				JButton button = (JButton) e.getSource();
				Window window = SwingUtilities.windowForComponent(button);
				window.dispose();
				
			}
		});
		
		button_panel.add(start);
		start.setText("Start Game");
		start.setBounds(20, 20, 100, 30);
		button_panel.add(start);
		add(title, BorderLayout.NORTH);
		add(button_panel);
	}

}
