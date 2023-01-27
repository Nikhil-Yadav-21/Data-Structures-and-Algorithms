package com.structure;

// This is a Dynamic Stack
public class Stack {
	private int stack[];
	private int size;
	private int top = -1;
	static final int DEFAULT_SIZE = 4;

	public Stack() {
		this(DEFAULT_SIZE);
	}

	Stack(int size) {
		this.size = size;
		this.stack = new int[size];
	}

	public void push(int element) {
		if (isFull()) {
			expand();
		}

		top++;
		stack[top] = element;
	}

	public int pop() throws ArrayIndexOutOfBoundsException {
		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("Stack is empty");
		}

		int removed = stack[top];
		top--;
		shrink();
		return removed;
	}

	public int peek() throws ArrayIndexOutOfBoundsException {
		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("Stack is empty");
		}

		return stack[top];
	}

	private void expand() {
		int length = size * 2;
		int[] tempStack = new int[length];
		for (int i = 0; i < stack.length; i++) {
			tempStack[i] = stack[i];
		}
		stack = tempStack;
		size = length;
	}

	private boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	private void shrink() {
		int length = size;
		length = size / 2;
		size = length;
	}

	private boolean isFull() {
		if (top == size - 1) {
			return true;
		}
		return false;
	}

	public int size() {
		return stack.length;
	}

	public void print() {
		for (int i = 0; i <= top; i++) {
			System.out.println(stack[i]);
		}
	}

}
