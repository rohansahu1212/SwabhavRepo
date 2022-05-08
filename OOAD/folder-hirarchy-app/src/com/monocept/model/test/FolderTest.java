package com.monocept.model.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.monocept.model.FolderHeirarchyBuilder;

public class FolderTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		FolderHeirarchyBuilder fhb = new FolderHeirarchyBuilder("folder_hierarchy.txt");
		fhb.getRootFolder().display();
	}
}
