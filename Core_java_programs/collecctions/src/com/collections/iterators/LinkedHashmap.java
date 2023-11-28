package com.collections.iterators;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
        hm.put(5, "Sai");
        hm.put(2,"noshitha");
        hm.put(1, "ramya");
        hm.put(3, "bhavana");
        System.out.println(hm);
        
        LinkedHashMap<String, String> hm1 = new LinkedHashMap<String, String>();
        hm1.put("Sai", "Sai");
        hm1.put("noshitha","noshitha");
        hm1.put("ramya", "ramya");
        hm1.put("bhavana", "bhavana");
        hm1.put("bindu", "bindu");
        System.out.println(hm1);
        
        LinkedHashMap<Integer, String> hm3 = new LinkedHashMap<Integer, String>();
        hm3.put(6, "Sai");
        hm3.put(7,"noshitha");
        hm3.put(8, "ramya");
        hm3.put(9, "bhavana");
        
        
        hm.putIfAbsent(8,"sai");
        hm.replace(5, "Sai");
        hm.merge(5, "Poornima",String::concat);
        System.out.println(hm.values());
        System.out.println(hm.keySet());
        System.out.println(hm1.containsKey("yamuna"));
        System.out.println(hm);
        System.out.println(hm.containsValue("SaiPoornima"));
        System.out.println(hm.equals(hm1));
        System.out.println(hm.get(8));
        hm.remove(8);
        System.out.println(hm);
        hm.remove(3,"yamuna");
        System.out.println(hm);
        hm.remove(5,"SaiPoornima");
        System.out.println(hm);
        hm.replace(2,"noshitha","Noshitha");
        System.out.println(hm);
        hm.putAll(hm3);
        System.out.println(hm);
        
	}

}
