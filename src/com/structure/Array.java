package com.structure;

import java.util.Arrays;

// This is a Dynamic Array structure
public class Array {

	private static int[] array;
	private int size;
	final static int DEFAULT_SIZE = 5;

	Array() {
		this(DEFAULT_SIZE);
	}

	Array(int size) {
		Array.array = new int[size];
	}

	// Adds element at last index
	public void add(int element) {
		if (isFull()) {
			int[] temp = new int[size * 2];
			for (int i = 0; i < size; i++) {
				temp[i] = array[i];
			}
			array = temp;

		}
		array[size] = element;
		size++;

	}
	
	public String toString() {
		String strArray = Arrays.toString(array);
		return strArray;
	}

	// Inserts the value at a particular index
	public void insert(int index, int element) {
		if (isFull()) {
			int[] temp = new int[size * 2];
			for (int i = 0; i < size; i++) {
				temp[i] = array[i];
			}
			array = temp;

		}

		size++;
		for (int i = array.length - 1; i >= index; i--) {
			array[i] = array[i - 1];
		}
		array[index] = element;

	}

	// Removes the last value
	public int remove() {
		int removed = array[size - 1];
		size--;
		return removed;
	}

	// Deletes the value at a particular index
	public void delete(int element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				for (int j = i; j < array.length - 1; j++) {
					array[j] = array[j + 1];
				}
				size--;
				break;
			}
		}
	}
	
	public void clear() {
		for (int i = 0; i < array.length; i++) {
			
		}
	}

	// Returns the value at index
	int get(int index) {
		return array[index];
	}

	// Overrides a value with new one
	public void set(int index, int element) {
		array[index] = element;
	}

	private boolean isFull() {
		if (size == array.length) {
			return true;
		}

		return false;
	}
	
	public void search(int x) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == x) {
				System.out.println(x + " is at index: " + i);
			}
		}
	}

	public int max() {
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}

		return maxValue;

	}

	public int min() {
		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		return minValue;

	}

	public String print() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
		return null;
		
		
		
	}

}
