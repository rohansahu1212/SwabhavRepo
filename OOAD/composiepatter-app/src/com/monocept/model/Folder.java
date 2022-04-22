package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

import org.omg.CosNaming.IstringHelper;

public class Folder implements IStorageItem {
	private String name;

	List<IStorageItem> childen = new ArrayList<IStorageItem>();

	public Folder(String name) {

		this.name = name;

	}

	public void addChild(IStorageItem item) {
		childen.add(item);
	}

	@Override
	public void showHierarchy(int level) {
	
		for(int i=0;i<level;i++)
			System.out.print("--| ");
		System.out.println(name +" at Level "+level);
		

		for (IStorageItem item : childen)
			item.showHierarchy(level+1);

	}

}
