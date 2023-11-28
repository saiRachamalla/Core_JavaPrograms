package com.collections.Arraydeque;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          HashSet hs=new HashSet();
          hs.add(21);
          hs.add(35);
          hs.add(12);
          hs.add(21);
          System.out.println(hs);
          
          hs.add("sai");
          hs.add("Sai");
          hs.add(true);
          hs.add(40.5);
          hs.add(2);
          System.out.println(hs.size());
          
          System.out.println(hs);
          LinkedHashSet lhs=new LinkedHashSet();
          
          lhs.add(21);
          lhs.add(35);
          lhs.add(12);
          lhs.add(21);
          System.out.println(lhs);
          
          lhs.add("sai");
          lhs.add("Sai");
          lhs.add(true);
          lhs.add(40.5);
          lhs.add(2);
          System.out.println(lhs);
          
	}

}
