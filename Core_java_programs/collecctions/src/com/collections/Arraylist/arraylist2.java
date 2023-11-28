package com.collections.Arraylist;

import java.util.ArrayList;

public class arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(70);
        al.add(80);
        al.add(90);
        al.add(15);
        al.add(18);
        System.out.println(al);
        
        //al.clear();
        //System.out.println(al);
        
        ArrayList al2=(ArrayList) al.clone();
        System.out.println(al2);
        
       boolean res= al.contains(70);
       System.out.println(res);
       
       res=al.contains(11);
       System.out.println(res);
       
       ArrayList al1=new ArrayList();
       al1.add(1000);
       al1.add(2000);
       al1.add(3000);
       al1.add(4000);
       al1.add(5000);
       al1.addAll(al);
       System.out.println(al1);
       
       res=al.containsAll(al1);
       System.out.println(res);
       
       res=al1.containsAll(al);
       System.out.println(res);

        
	}

}
