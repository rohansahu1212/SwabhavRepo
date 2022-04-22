package com.monocept.model;

public class File implements IStorageItem {
	private String name;
	private String size;

	public File(String name, String size) {

		this.name = name;
		this.size = size;
	}

	@Override
	public void showHierarchy(int level) {

		for (int i = 0; i < level; i++)
			System.out.print("--| ");
		
			System.out.println("Name "+name +" and Size "+size+" level "+level);
		
	}

}
