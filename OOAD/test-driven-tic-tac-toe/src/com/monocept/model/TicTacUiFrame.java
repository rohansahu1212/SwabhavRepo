package com.monocept.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TicTacUiFrame extends JFrame implements ActionListener {
	JPanel title = new JPanel();
	JPanel button_panel = new JPanel();
	JLabel textArea = new JLabel();
	JButton[] buttons = new JButton[9];
	private Game game;

	public TicTacUiFrame(Game game) {
		this.game = game;
	}

	public void ticTacFrame() {

		textArea.setFont(new Font("ink free", Font.BOLD, 30));
		textArea.setText("Designed by Rohan");

		title.setLayout(new BorderLayout());
		title.setBounds(0, 0, 800, 100);

		title.add(textArea);

		button_panel.setLayout(new GridLayout(3, 3));
		button_panel.setBackground(Color.YELLOW);

		Board board = new Board();
		for (int i = 0; i < 9; i++) {
			buttons[i] = new JButton();

			// buttons[i].
			button_panel.add(buttons[i]);
			buttons[i].setFocusable(false);
			buttons[i].setText("" + (i + 1));
			//buttons[i].id;
			
			buttons[i].setFont(new Font("MV bolvi", Font.BOLD, 50));
			buttons[i].addActionListener(this);
		}

		// playerTurn();
		getContentPane().setBackground(Color.DARK_GRAY);
		setLayout(new BorderLayout());
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		// adding stuff
		add(title, BorderLayout.NORTH);
		add(button_panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Player currentPlayer = game.getCurrentPlayer();
		textArea.setText(currentPlayer.getName() + " just make move wiht mark " + currentPlayer.getMrk().toString());
		for (int i = 0; i < 9; i++) {
			if (e.getSource() == buttons[i]) {
				System.out.println(e.TEXT_EVENT_MASK);
				buttons[i].setEnabled(false);
				buttons[i].setText(game.getCurrentPlayer().getMrk().toString());
				Result progress = game.play(i);
				System.out.println(progress);

				if (progress == Result.DRAW) {
					new GameLoginUI().loginFrame();
					JButton button = (JButton) e.getSource();
					Window window = SwingUtilities.windowForComponent(button);
					window.dispose();

				}
				if (progress == Result.WIN) {
					for (int i1 = 0; i1 < 9; i1++)
						buttons[i1].setEnabled(false);
					new WinFrame(currentPlayer.getName()).winnnerFrame();

					JButton button = (JButton) e.getSource();
					Window window = SwingUtilities.windowForComponent(button);
					window.dispose();
					System.out.println("winnnnnnnnnnnnnnnnnnn");
				}

			}

		}
	}

}
