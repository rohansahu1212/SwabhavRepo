package com.monocept.frame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ObserverFrame extends JFrame {
	
	

	public void creatFrame() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		add(panel);
		setVisible(true);
		setSize(700, 500);
		JLabel statusLabel = new JLabel("", JLabel.CENTER);
		JButton button = new JButton();
		button.setText("hello");
		

		button.addActionListener(new GodListner());
		button.addActionListener(new DevilListner());
		
		
		add(button);
	}


}
