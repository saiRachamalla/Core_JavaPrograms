package com.java.threads;
class human extends Thread{
	public void run() {
		try {
		System.out.println(Thread.currentThread().getName()+"entered room");
		Thread.sleep(3000);
		System.out.println(Thread.currentThread().getName()+"using room");
		Thread.sleep(3000);
		System.out.println(Thread.currentThread().getName()+"left room");
		Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class threadlock {
	public static void main(String[] args) throws InterruptedException {
		human s1=new human();
		human s2=new human();
		human s3=new human();
		s1.setName("boy");
		s2.setName("girl");
		s3.setName("others");
		
		s1.start();
		s1.join();
		s2.start();
		s2.join();
		s3.start();
		s3.join();
	}

}
