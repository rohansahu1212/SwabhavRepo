package com.sync.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SyncFrame extends JFrame {
	JPanel title = new JPanel();
	JPanel button_panel = new JPanel();
	JButton print;
	JButton hello;

	public void syncFrame() {

		print = new JButton("print");
		hello = new JButton("hello");

		hello.setBounds(20, 20, 140, 40);
		print.setBounds(20, 100, 140, 40);
		
		hello.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				  JFrame f=new JFrame();  
				    JOptionPane.showMessageDialog(f,"Hello, code written by rohan.");  
				
			}
		});

		print.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				while (true) {
					DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
					Calendar cal = Calendar.getInstance();
					System.out.println(dateFormat.format(cal.getTime()));
				}

			}
		});

		add(hello);
		add(print);
		// add(button_panel);

		setLayout(new BorderLayout());
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
