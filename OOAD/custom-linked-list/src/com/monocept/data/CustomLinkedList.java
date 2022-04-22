package com.monocept.data;

import java.util.Iterator;

public class CustomLinkedList<T> implements Iterable<T> {
	Node head;

	public void insert(T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		}

		else {
			Node nodeTraverse = head;
			while (nodeTraverse.next != null) {
				nodeTraverse = nodeTraverse.next;
			}
			nodeTraverse.next = node;
		}
	}

	public void insertAt(int index, T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = null;
		if (index == 0)
			insertAtStart(data);

		else {
			Node nodeTraverse = head;

			for (int i = 0; i < index - 1; i++)
				nodeTraverse = nodeTraverse.next;
			node.next = nodeTraverse.next;
			nodeTraverse.next = node;
		}
	}

	public void remove(int index) {
		if (index == 0)
			head = head.next;
		else {
			Node nodeTraverse = head;

			for (int i = 0; i < index - 1; i++)
				nodeTraverse = nodeTraverse.next;
			nodeTraverse.next = nodeTraverse.next.next;
		}

	}

	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;

		}
		System.out.println(node.data);
	}

	public void insertAtStart(T data) {
		Node node = new Node();
		node.data = data;
		node.next = head;

		head = node;

	}


	@Override
	public Iterator<T> iterator() {
		return new MyLinkedListIterator();
	}

  class MyLinkedListIterator implements Iterator<T>{

	  Node current = head;

      @Override
      public boolean hasNext() {
          return current != null;
      }

      @Override
      public T next() {
          if(hasNext()){
              T data = (T) current.data;
              current = current.next;
              return data;
          }
          return null;
      }
  }

}
