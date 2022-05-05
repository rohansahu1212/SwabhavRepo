package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Storage {
	private List<Storage> files = new ArrayList<Storage>();

	private String folderName;

	public Folder(String folderName) {

		this.folderName = folderName;
	}

	public void addData(Storage file) {
		files.add(file);
	}

	@Override
	public void display() {
		for (Storage st : files)
			st.display();
		System.out.println(folderName);

	}

}
