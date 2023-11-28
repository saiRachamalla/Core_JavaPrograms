package com.collections.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		  l.add(100);
		  l.add(200);
		  l.add(50);
		  l.add("sai");
		  l.add(true);
		  l.add(43.67f);
		  System.out.println(l);
		
		LinkedList<String> ll = new LinkedList<String>(); 
		  
	        // Adding elements to the linked list 
	        ll.add("A"); 
	        ll.add("B"); 
	        ll.addLast("C"); 
	        ll.addFirst("D"); 
	        ll.add(2, "E"); 
	        System.out.println(ll); 
	        ll.addAll(l);
	  
	        System.out.println(ll); 
	       // ll.clear();
	       // System.out.println(ll);
	        LinkedList ll2 =(LinkedList) l.clone();
	        System.out.println(ll2);
	        
	        System.out.println(ll2.contains("sai"));
	        System.out.println(ll.containsAll(l));
	        System.out.println(l.equals(ll2));
	        System.out.println(ll.get(8));
	        System.out.println(ll.getFirst());
	        System.out.println(ll2.getLast());
	        System.out.println(ll.indexOf("sai"));
	        System.out.println(ll.isEmpty());
	        System.out.println(ll.offer("b"));
	        System.out.println(ll); 
	        
	        
	        //we cant cast linkedlist to arraylist
	        //  ArrayList al=(ArrayList) l.clone();
	        //System.out.println(al);
	        //al.add(100,20);
	        
//	        
//	        ArrayList al1 =new ArrayList();
//	        al1.add(100);
//	        al1.add(300);
//	        al1.add(400);
//	        al1.add(400);
//	        al1.add(500);
//	       
//	        
//	        LinkedList al=(LinkedList) al1.clone();
//	        System.out.println(al);
	        

	}

}
