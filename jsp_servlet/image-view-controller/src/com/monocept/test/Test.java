package com.monocept.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

import com.monocept.model.Image;
import com.monocept.repo.ImageRepository;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, SQLException, ClassNotFoundException {
		ImageRepository ir = new ImageRepository();
		//ir.uploadImage();
		List<Image> images=ir.viewImage();
		
	}
}
