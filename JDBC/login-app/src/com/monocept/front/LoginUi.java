package com.monocept.front;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.monocept.middle.UserData;
import com.monocept.middle.UserRepository;

public class LoginUi extends JFrame {

	

	public void loginFrame() {
		setLayout(new FlowLayout());
		JTextField username = new JTextField("Enter username");
		JTextField password = new JTextField("Enter password");
		JButton login = new JButton("Login");
		username.setBounds(600, 300, 140, 40);
		password.setBounds(600, 400, 140, 40);
		login.setBounds(600, 500, 140, 40);

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String name = username.getText();
				String pass = password.getText();
				UserData userObject = new UserRepository().authenticate(name, pass);
				if (userObject != null)
					JOptionPane.showMessageDialog(rootPane, "login pass");
				else
					JOptionPane.showMessageDialog(rootPane, "login fail");

			}
		});
		add(username);
		add(password);
		add(login);
		setSize(2100, 1400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
