package com.async.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PrintClock extends Thread implements ActionListener {
	public void run() {

		while (true) {
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Calendar cal = Calendar.getInstance();
			System.out.println(dateFormat.format(cal.getTime()));
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		start();

	}
}
