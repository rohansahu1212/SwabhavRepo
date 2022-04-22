package com.monocept.test;

import com.monocept.model.Image;
import com.monocept.model.ProxyImage;

public class CaseTest2 {
	public static void main(String[] args) {
		Image img1 = new ProxyImage("file1.jpg");
		Image img2 = new ProxyImage("file2.jpg");
		Image img3 = new ProxyImage("file3.jpg");
		Image img4 = new ProxyImage("file4.jpg");
		img4.display();
	}
}
