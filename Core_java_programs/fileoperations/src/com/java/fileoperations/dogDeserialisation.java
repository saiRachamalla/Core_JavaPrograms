package com.java.fileoperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class dogDeserialisation {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		dog d = new dog(1000,"jonny","black",3, "german");
		System.out.println(d.getData());
		String path="C:\\ioPrograms\\dog2.txt";
		FileInputStream fos = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fos);
		dog d1=(dog)ois.readObject();
		System.out.println(d1.getData());
		Cricketer c3=(Cricketer) ois.readObject();
		System.out.println(c3.getData());
		
		


	}

}
