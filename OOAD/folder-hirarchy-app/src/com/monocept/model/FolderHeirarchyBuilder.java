package com.monocept.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FolderHeirarchyBuilder {
	private File file;

	public FolderHeirarchyBuilder(String path) throws FileNotFoundException {
		file = new File(path);
	}

	public Folder getRootFolder() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));

		Folder[] foldersObj = new Folder[10];
		Storage[] filesObj = new com.monocept.model.File[11];

		String st;
		String[] cvsFormat = null;

		while ((st = br.readLine()) != null) {

			cvsFormat = st.split("\\s+");
			int objCount = 0;

			if (!cvsFormat[0].contains("id")) {
				Storage storage;
				// System.out.println(cvsFormat[0] + " " + cvsFormat[1] + " " + cvsFormat[2] + "
				// " + cvsFormat[3] + " ");
				int id = Integer.parseInt(cvsFormat[0]);
				int pId = Integer.parseInt(cvsFormat[2]);
				if (!cvsFormat[3].contains("FL")) {
					foldersObj[id] = new Folder(cvsFormat[1]);
					storage = foldersObj[id];
				} else {
					filesObj[id] = new com.monocept.model.File(cvsFormat[1]);
					storage = filesObj[id];
				}
				if (pId != 0) {
					foldersObj[pId].addData(storage);
					// System.out.println(storage);
					// System.out.println(pId);
				}
			}
		}
		return foldersObj[1];

	}

}
