package com.monocept.Test;

import java.util.Iterator;

import com.monocept.data.CustomLinkedList;

public class CustomLinkedListTest<T> {
	public static void main(String[] args) {
		CustomLinkedList<Integer> cus= new CustomLinkedList<Integer>();
		cus.insert(12);
		cus.insert(18);
		cus.insert(12);
		cus.insert(12);
		cus.insertAtStart(199);
		cus.insertAt(1, 34);
		//cus.show();
		System.out.println("------------------------");
		cus.remove(0);
	//	cus.show();
		Iterator<Integer> itr= cus.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------------------");
		for(int i:cus) {
			System.out.println(i);
		}
		
		
		System.out.println(cus.listArray());
		CustomLinkedList<String> cusName= new CustomLinkedList<String>();
		cusName.insert("rohan");
		cusName.insert("sahu");
		cusName.show();
	}
}
