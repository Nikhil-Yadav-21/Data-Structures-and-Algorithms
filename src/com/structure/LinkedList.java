package com.structure;

import java.util.Iterator;

class LinkedList {

	private Node head;
	private Node tail;

	private int size;

	public LinkedList() {
		this.size = size;
	}

	private class Node {

		private int data;
		private Node link;

		public Node(int data) {
			this.data = data;
		}

	}

	public void insertFirst(int data) {
		if (head == null) {
			Node node = new Node(data);
			head = node;
			tail = head;
			size = size + 1;
			return;

		}
		Node node = new Node(data);
		node.link = head;
		head = node;
		size = size + 1;
	}

	public void insertAt(int index, int data) throws Exception {
		if (index == 0) {
			insertFirst(data);
			return;
		} else if (index == size + 1) {
			append(data);
			return;
		} else if (head == null) {
			throw new Exception("Cannot insert in empty list. Initialize first");
		}

		Node node = new Node(data);
		Node current = head;
		for (int i = 0; i < index - 1; i++) {
			current = current.link;
		}
		node.link = current.link;
		current.link = node;
		size = size + 1;

	}

	public void append(int data) {
		if (head == null) {
			insertFirst(data);
			return;
		}
		Node node = new Node(data);
		tail.link = node;
		tail = node;
		size = size + 1;

	}

	public int deleteFirst() throws Exception {
		if (head == null) {
			throw new Exception();
		}
		int removed = head.data;
		head = head.link;
		size = size - 1;
		return removed;
	}

	public int deleteAt(int index) throws Exception {
		if (head == null) {
			throw new Exception();
		}
		if (index == 0) {
			try {
				return deleteFirst();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		Node current = head;
		int removed;
		for (int i = 0; i < index - 1; i++) {
			current = current.link;
		}

		removed = current.link.data;
		current.link = current.link.link;
		size = size - 1;
		return removed;

	}
	
	public void deleteLast() {
		Node temp = head;
		for (int i = 0; i < size - 2; i++) {
			temp = temp.link;
		}
		temp.link = null;
		tail = temp;
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.link;
		}
		System.out.println("NULL");
	}

	public int getSize() {

		return size;
	}

}
