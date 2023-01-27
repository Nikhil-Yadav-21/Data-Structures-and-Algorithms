package com.structure;

public class Queue {
	private int[] queue;
	final static int DEFAULT_SIZE = 5;
	private int size;
	
	private int front = 0;
	private int rear = 0;
	
	Queue(){
		this(DEFAULT_SIZE);
	}
	
	 Queue(int size) {
		this.size = size;
		this.queue = new int[size];
	}
	
	public void enqueue(int element) throws Exception{
		if (rear == size) {
			throw new ArrayIndexOutOfBoundsException("Queue is full");
		}
		
		queue[rear] = element;
		rear++;
	}
	
	public void dequeue() throws Exception {
		if (front == rear)  {
			throw new Exception("Queue is empty");
		}
		
		for (int i = front; i < rear - 1; i++) {
			queue[i] = queue[i + 1];
		}
		rear--;
	}
	
	public void display() {
		for (int i = 0; i < rear; i++) {
			System.out.println(queue[i]);
		}
	}
	
	public int peek() {
		return queue[front];
	}
	
	public boolean isFull() {
		return rear == size;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public int size() {
		return size;
	}
}
