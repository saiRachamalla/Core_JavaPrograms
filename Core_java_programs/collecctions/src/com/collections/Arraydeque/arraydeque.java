package com.collections.Arraydeque;

import java.util.ArrayDeque;

public class arraydeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad=new ArrayDeque();
		ad.add(100);
		ad.add(200);
		ad.add("sai");
		ad.addFirst("first");
		ad.addLast("last");
		System.out.println(ad);
		System.out.println(ad.descendingIterator());
		//ad.clear();
		//System.out.println(ad);
		 ArrayDeque k=(ArrayDeque)ad.clone();
		 System.out.println(k);
		 System.out.println(k.contains("sai"));
		 System.out.println(k.containsAll(ad));
		 System.out.println(k.element());
		 System.out.println(k.isEmpty());
		 System.out.println(k.peek());
		 System.out.println(k.poll());
		 System.out.println(k);
		 System.out.println(k.pop());
		 System.out.println(k);
		 System.out.println(k.toString());
		
	}

}
