package com.collections.Arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ArrayList al =new ArrayList();
        al.add(10);
        al.add(30);
        al.add(40);
        al.add(40);
        al.add(50);
        al.add(0,60);
        System.out.println(al);
        
        //al.add(100,20);
        ArrayList al1 =new ArrayList();
        al1.add(100);
        al1.add(300);
        al1.add(400);
        al1.add(400);
        al1.add(500);
       
        System.out.println(al1);
        
        al.add(al1);
        System.out.println(al);
        al.addAll(5,al1);
        System.out.println(al);
        
        al1.add("sai");
        al1.add('r');
        al1.add(true);
        al1.add(234.567f);
        al1.add(123456.45678);
        System.out.println(al1);
        
        ArrayList<Integer> aList=new ArrayList<Integer>();
        aList.add(100);
        aList.add(20);
       // aList.add(int,"1");
        
        System.out.println(aList);
        
        aList.remove(1);
        System.out.println(aList);
        al1.remove("sai");
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
