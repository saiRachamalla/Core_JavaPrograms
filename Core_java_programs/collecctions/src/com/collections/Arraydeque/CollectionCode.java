package com.collections.Arraydeque;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionCode {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(100);
		al.add(100);
		al.add(300);
		al.add(50);
		al.add(25);
		al.add(125);
		al.add(150);
		al.add(175);
		System.out.println(al);
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		System.out.println(Collections.frequency(al, 100));
		Collections.sort(al);;
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, 50));
		System.out.println(Collections.binarySearch(al, 150));
	}
}
