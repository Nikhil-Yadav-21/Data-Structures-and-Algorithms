package com.structure;

/*For insertion, There are three cases:
 * 		Queue is full
 * 		is Empty
 * 		There are elements but it is not full
 * 
 * Similarly, for deletion:
 * 		Check if it is empty
 * 		If there is only one element
 * */

public class CircularQueue {

	private int[] queue;
	private int size;
	private int front = -1;
	private int rear = -1;

	final static int DEFAUL_SIZE = 5;

	public CircularQueue() {
		this(DEFAUL_SIZE);
	}

	CircularQueue(int size) {
		this.size = size;
		this.queue = new int[size];
	}

	public void enQueue(int element) throws Exception {
		if (rear == size - 1 || front == rear + 1) {
			throw new Exception("Queue is Full");
		}

		else if (front == -1 && rear == -1) {
			front = front + 1;
			rear = rear + 1;

			queue[rear] = element;
//			rear++;

		} else {
			rear = (rear + 1) % size;
			queue[rear] = element;
			
		}
	}

	public int deQueue() throws Exception {
		int removed = 0;
		if (front == -1 && rear == -1) {
			throw new Exception("Queue is empty");
		} else if (rear == front) {
			removed = queue[front];
			front = -1;
			rear = -1;

		} else {
			removed = queue[front];
			front = front + 1;
		}

		return removed;
	}

	public void display() {
		for (int i = front; i <= rear; i++) {
			System.out.println(queue[i]);
		}
	}

}
