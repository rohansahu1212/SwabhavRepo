package com.monocept.model;

import com.mysql.cj.jdbc.Blob;

public class Image {
	private int id;
	private byte[] image;


	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Image(int id, byte[] image) {
		super();
		this.id = id;
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public byte[] getImage() {
		return image;
	}

}
