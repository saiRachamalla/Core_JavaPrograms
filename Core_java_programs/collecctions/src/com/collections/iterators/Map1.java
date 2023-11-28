package com.collections.iterators;

import java.util.HashMap;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
            hm.put(5, "Sai");
            hm.put(2,"noshitha");
            hm.put(1, "ramya");
            hm.put(3, "bhavana");
            System.out.println(hm);
            
            HashMap<String, String> hm1 = new HashMap<String, String>();
            hm1.put("Sai", "Sai");
            hm1.put("noshitha","noshitha");
            hm1.put("ramya", "ramya");
            hm1.put("bhavana", "bhavana");
            hm1.put("bindu", "bindu");
            System.out.println(hm1);
	}

}
