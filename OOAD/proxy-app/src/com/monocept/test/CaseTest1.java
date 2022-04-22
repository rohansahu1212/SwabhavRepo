package com.monocept.test;

import com.monocept.model.Image;
import com.monocept.model.RealImage;

public class CaseTest1 {
	public static void main(String[] args) {
		Image img1 = new RealImage("file1.jpg");
		Image img2 = new RealImage("file1.jpg");
		Image img3 = new RealImage("file1.jpg");
		Image img4 = new RealImage("file1.jpg");
		img4.display();
	}
}
