package com.monocept.model;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;

import com.monocept.service.MovieManager;

public class MovieDisplay extends JFrame implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			frame();
		} catch (IOException e1) {
		
			e1.printStackTrace();
		}
		JButton button = (JButton) e.getSource();
		Window window = SwingUtilities.windowForComponent(button);
		window.dispose();
	}

	void frame() throws IOException {
		setLayout(new FlowLayout());

		JButton back = new JButton("back");

		back.setBounds(700, 100, 140, 40);
		String txt = "";
        setFont(new Font("Courier", Font.BOLD,105));		int i = 0;
		for (Movie mov : new MovieManager().getMovies()) {

			System.out.println("eeeeeeeeeeeeeee" + mov.toString());
			txt += mov.toString();

			JLabel jl = new JLabel(mov.toString());

			jl.setBounds(300, 80 + 20 * i, 600, 600);
			jl.setFont(new Font("Courier", Font.BOLD,17));
			i++;
			this.add(jl);

		}
		System.out.println("hhhhhhhhhhhhh \n" + txt);

		back.addActionListener(new MovieMenu());

		add(back);
		setSize(300, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
