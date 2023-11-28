package com.java.fileoperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer implements Serializable{
	int cric_id;
	transient String name;
	transient String country;
	int runs;
	
	Cricketer(int cric_id,String name,String country,int runs){
		this.cric_id=cric_id;
		this.name=name;
		this.country=country;
		this.runs=runs;
		
	}
	String getData() {
		return "id="+cric_id+" --name="+name+" --country="+country+" --runs="+runs;
	}
	
}
public class launch {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Cricketer c=new Cricketer(1,"Rohith","india",10000);
		System.out.println(c.getData());
		String path="C:\\ioPrograms\\cricketer2.txt";
		FileOutputStream fos=new FileOutputStream(path);
		ObjectOutputStream oos=new  ObjectOutputStream(fos);
		oos.writeObject(c);
		FileInputStream fis=new FileInputStream(path);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Cricketer c1  = (Cricketer) ois.readObject();
		System.out.println(c1.getData()); 
		
	}

}
