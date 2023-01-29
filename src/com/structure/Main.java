package com.structure;

import com.structure.Array.Type;

public class Main {
	public static void main(String[] args) {
		Array list = new Array();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.search(20);
		System.out.println(list.type);
		

	}
}
