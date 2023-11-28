package com.java.fileoperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fileops3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String p1="C:\\ioPrograms\\input.txt";
		String p2="C:\\ioPrograms\\output3.txt";
		
		FileReader fr=new FileReader(p1);
		BufferedReader br=new BufferedReader(fr);
		int temp;
		FileWriter fw=new FileWriter(p2);
		BufferedWriter bw=new BufferedWriter(fw);
		while((temp=br.read())!=-1) {
			//bw.write(temp);
			System.out.println(temp);
			Thread.sleep(3000);
		}
		bw.flush();
		bw.close();
		br.close();
		fw.close();
		fr.close();
	}

}
