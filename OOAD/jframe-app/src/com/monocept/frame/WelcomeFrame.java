package com.monocept.frame;

import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WelcomeFrame {
	private String msg ;

	public WelcomeFrame() {
		this("welcome");

	}

	public WelcomeFrame(String msg) {

		this.msg = msg;
		fameCreate();

	}

	public void fameCreate() {
		JFrame frm = new JFrame(msg);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		frm.add(panel);
		frm.setVisible(true);
		frm.setSize(500, 300);
	}

}
