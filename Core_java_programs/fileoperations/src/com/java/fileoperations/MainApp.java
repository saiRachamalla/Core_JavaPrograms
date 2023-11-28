package com.java.fileoperations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class dog implements Serializable{

	int cost;
	transient String name;
	transient String colour;
	int age;
	String breed;

	dog(int cost,String name,String colour,int age,String breed){
		this.cost=cost;
		this.name=name;
		this.colour=colour;
		this.age=age;
		this.breed=breed;

	}
	String getData() {
		return "cost="+cost+" --name="+name+" --colour="+colour+ "--breed= "+breed+" age="+age;
	}
}
public class MainApp {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		dog d = new dog(1000,"jonny","black",3, "german");
		System.out.println(d.getData());
		String path="C:\\ioPrograms\\dog2.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		Cricketer c2=new Cricketer(2, "virat", "ind", 2000);
		System.out.println(c2.getData());
		oos.writeObject(c2);
		
		
		

	}

}
