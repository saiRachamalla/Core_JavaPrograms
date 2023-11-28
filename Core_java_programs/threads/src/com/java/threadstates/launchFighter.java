package com.java.threadstates;
class Fighter extends Thread{
	String res1="ak47";
	String res2="m24";
	String res3="sniper";
     @Override
	public void run() {
		try {
			if(Thread.currentThread().getName().equals("Arjun")) {
				arjunsnached();
			}
			else {
				sunilsnached();
			}                    
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void arjunsnached() throws InterruptedException {
		// TODO Auto-generated method stub
		synchronized(res1) {
			System.out.println(Thread.currentThread().getName()+" has snatched "+res1);
			Thread.sleep(3000);
			synchronized(res2) {
				System.out.println(Thread.currentThread().getName()+" has snatched "+res2);
				Thread.sleep(3000);

				synchronized(res3) {
					System.out.println(Thread.currentThread().getName()+" has snatched "+res3);
					Thread.sleep(3000);
				}
			}
		}

	}

	public void sunilsnached() throws InterruptedException {
		// TODO Auto-generated method stub
		synchronized(res3) {
			System.out.println(Thread.currentThread().getName()+" has snatched "+res1);
			Thread.sleep(3000);

			synchronized(res2) {
				System.out.println(Thread.currentThread().getName()+" has snatched "+res2);
				Thread.sleep(3000);

				synchronized(res1) {
					System.out.println(Thread.currentThread().getName()+" has snatched "+res3);
					Thread.sleep(3000);
				}
			}
		}
	}



}
public class launchFighter {
	public static void main(String[] args) {
		System.out.println("main started");
		Fighter f1=new Fighter();
		f1.setName("Arjun");
		Fighter f2=new Fighter();
		f2.setName("Sunil");

		f1.start();
		f2.start();
		System.out.println("main ended");

	}
}
