package com.collections.Arraylist;

import java.util.ArrayList;

public class arraylist3 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	
      al.add(10);
      al.add(20);
      al.add(70);
      al.add(80);
      al.add(90);
      al.add(15);
      al.add(18);
      al.add(10);
      System.out.println(al);
      
      //System.out.println(al.size());
      al.ensureCapacity(10);
       int size=al.size();
      System.out.println(size);
      
      System.out.println(al.get(1));
      
      System.out.println(al.getClass());
      
      System.out.println(al.hashCode());
      
      System.out.println(al.indexOf(10));
      
      System.out.println(al.lastIndexOf(10));
      
      System.out.println(al.isEmpty());
      
      ArrayList al1=new ArrayList();
      al1.add(1000);
      al1.add("sai");
      al1.add(500);
      al1.addAll(al);
      
      System.out.println(al.remove(1));
      
      System.out.println(al1.remove("sai"));
      
      System.out.println(al1.removeAll(al));
      
      System.out.println(al1);
      
      ArrayList<Integer> Numbers = new ArrayList<Integer>();
      
      // Add Number to list
      Numbers.add(23);
      Numbers.add(32);
      Numbers.add(45);
      Numbers.add(63);

      Numbers.removeIf(n->(n%2 ==0));
      
      System.out.println(Numbers);
      
      
}
}
