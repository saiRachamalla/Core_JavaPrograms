package com.java.fileoperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileops1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String p1="C:\\ioPrograms\\input.txt";
		String p2="C:\\ioPrograms\\output.txt";
		FileInputStream fis = new FileInputStream(p1);
		int temp;
		FileOutputStream fos = new FileOutputStream(p2);
		while((temp=fis.read())!=-1) {
			fos.write(temp);
		}
		//fos.close();
		//fis.close(); 
	}

}
