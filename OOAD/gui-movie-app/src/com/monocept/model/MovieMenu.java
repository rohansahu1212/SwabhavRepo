package com.monocept.model;

import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.monocept.service.MovieManager;

public class MovieMenu extends JFrame implements ActionListener {
	void frame() {
		setLayout(new FlowLayout());
		JButton add = new JButton("Add Movie");
		JButton delete = new JButton("Clear Movie");
		JButton show = new JButton("Show Movies");
		add.setBounds(300, 100, 140, 40);
		add.addActionListener(new AddMovie());
		delete.setBounds(500, 100, 140, 40);
		show.setBounds(700, 100, 140, 40);
		JTextField t1, t2;
		delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					MovieManager mm = new MovieManager();
					mm.clearMovie();
					System.out.println("movie clear");
				} catch (IOException e1) {

					e1.printStackTrace();
				}
				

			}
		});
		
		show.addActionListener(new MovieDisplay());
		add(add);
		add(delete);
		add(show);
		setSize(300, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame();
		JButton button = (JButton) e.getSource();
		Window window = SwingUtilities.windowForComponent(button);
		window.dispose();

	}
}
