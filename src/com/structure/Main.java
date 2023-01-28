package com.structure;

public class Main {
	public static void main(String[] args) throws Exception {
		CircularQueue queue = new CircularQueue();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		System.out.println("Removed " + queue.deQueue());
		queue.display();
		
		
	}

}
