package com.monocept.service;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.monocept.model.Image;
import com.monocept.repo.ImageRepository;

public class ImageService {
	private List<Image> images;

	public ImageService() {
		super();
		images = new ArrayList<Image>();
	}
	public void uploadImage(int id, InputStream img) throws FileNotFoundException, ClassNotFoundException, SQLException {
		new ImageRepository().uploadImage(img, id); 
	}
	
	

}
