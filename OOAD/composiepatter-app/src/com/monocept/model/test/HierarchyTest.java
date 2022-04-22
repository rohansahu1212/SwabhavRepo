package com.monocept.model.test;

import com.monocept.model.File;
import com.monocept.model.Folder;

public class HierarchyTest {
	public static void main(String[] args) {
		int level=0;
		Folder folder= new Folder("Monocept");
		
		Folder subFolder= new Folder("Monocept Employee");
		folder.addChild(subFolder);
		
		File emp1= new File("rohan", "24");
		subFolder.addChild(emp1);
		
		File emp2= new File("ankit", "24");
		subFolder.addChild(emp2);
		
		Folder sub= new Folder("folder one");
		subFolder.addChild(sub);
		
		Folder inside= new Folder("inside");
		sub.addChild(inside);
		
		Folder subFolder2= new Folder("Monocept customer");
		folder.addChild(subFolder2);
		folder.showHierarchy(level);
		
		
	}
}
