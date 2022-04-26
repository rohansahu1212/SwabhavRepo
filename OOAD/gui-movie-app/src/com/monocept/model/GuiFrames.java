package com.monocept.model;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuiFrames {
	void frame() {
		JFrame f=new JFrame("Movie App By Rohan");            
		JButton add=new JButton("Add Movie");    
		JButton delete=new JButton("Delete Movie");    
		add.setBounds(300,100,140, 40);    
		delete.setBounds(500,100,140, 40);  
	    JTextField t1,t2;  
	    JTextArea ta= new JTextArea("rohan movie");
	    ta.setBounds(200,400, 240,40);
	    t1=new JTextField("Enter Movie Name ");  
	    t1.setBounds(50,100, 240,40);
	    f.add(ta);
	    f.add(t1);
		f.add(add);    
		f.add(delete);    
		f.setSize(300,400);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
		
	}
}
