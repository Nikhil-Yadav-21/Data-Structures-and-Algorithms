package com.structure;

public class Main {
	public static void main(String[] args) throws Exception {
		LinkedList linkedList = new LinkedList();
		linkedList.insertFirst(10);
		linkedList.append(30);
		linkedList.insertAt(1, 20);
		linkedList.append(40);
		linkedList.deleteFirst();
		linkedList.deleteAt(0);
		linkedList.deleteLast();
		
		
		
		linkedList.display();
		int size = linkedList.getSize();
		System.out.println("Size is " + size);
		
	}
}
