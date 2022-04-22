package com.monocept.model.test;

import com.monocept.model.Node;

public class NodeTest {
	public static void main(String[] args) {
		Node<String> n1 = new Node<String>();
		n1.setData("Abhishek");

		Node<String> n2 = new Node<String>();
		n2.setData("vineet");

		Node<String> n3 = new Node<String>();
		n3.setData("Nikhil");

		n1.setNext(n2);
		n2.setNext(n3);

		printDetails(n1);
	}

	static <T> void printDetails(Node<T> obj) {
		Node<T> head = obj;
		while (head.getNext() != null) {
			System.out.println(head.getData());
			head = head.getNext();
		}
		System.out.println(head.getData());
	}

}
