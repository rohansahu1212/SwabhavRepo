package com.monocept.model;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import com.monocept.service.MovieManager;

public class AddMovie extends JFrame implements ActionListener {
	JTextField name = new JTextField("enter movie name");
	JTextField genre = new JTextField("Enter movie genre");
	JTextField year = new JTextField("Enter movie year");

	@Override
	public void actionPerformed(ActionEvent e) {

		frame();
		JButton button = (JButton) e.getSource();
		Window window = SwingUtilities.windowForComponent(button);
		window.dispose();

	}

	void frame() {
		setLayout(new FlowLayout());

		JButton add = new JButton("Add Movie");
		JButton back = new JButton("Back");

		add.setBounds(300, 100, 140, 40);
		back.setBounds(300, 500, 140, 40);

		name.setBounds(200, 200, 140, 40);
		genre.setBounds(200, 300, 140, 40);
		year.setBounds(200, 400, 140, 40);

		Border border = BorderFactory.createLineBorder(Color.BLACK);
		name.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		genre.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		year.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		// back.addActionListener(new MovieMenu());
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String name1 = name.getText();
				String genre1 = genre.getText();
				String year1 = year.getText();
				System.out.println(name1 + "   " + genre1 + " " + year1);

				MovieManager manager = null;
				try {
					manager = new MovieManager();
				} catch (IOException e1) {

					e1.printStackTrace();
				}
				try {
					manager.addMovie(new Movie(name1, genre1, year1));
				} catch (IOException e1) {

					e1.printStackTrace();
				}
				for(Movie mov:manager.getMovies())
				System.out.println(mov.getName());

			}
		});
		back.addActionListener(new MovieMenu());

		// adding component
		add(add);
		add(back);
		add(name);
		add(year);
		add(genre);
		setSize(300, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
