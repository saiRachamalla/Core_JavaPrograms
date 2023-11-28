package com.java.threads;
class Msoffice1 extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("Typing")) {
			typing();
		}else if(Thread.currentThread().getName().equals("spellcheck")) {
			spellcheck();
		}
		else {
			saving();
		}
	}
	public void typing() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				for(int i=0;i<=5;i++) {
					try {
						System.out.println("typing");
						Thread.sleep(3000);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
				
		
	}


	

   public void spellcheck() {
		// TODO Auto-generated method stub
	// TODO Auto-generated method stub
			for(; ;) {
				try {
					System.out.println("spellchecking");
					Thread.sleep(3000);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		
	}public void saving() {
		// TODO Auto-generated method stub
		for(; ;) {
			try {
				System.out.println("saving");
				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
	
public class raceConditionSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Msoffice1 o1=new Msoffice1();
		Msoffice1 o2=new Msoffice1();
		Msoffice1 o3=new Msoffice1();
		
		o1.setName("Typing");
		o2.setName("spellcheck");
		o3.setName("saving");
		
		o2.setDaemon(true);
		o3.setDaemon(true);
		
		o2.setPriority(8);
		o3.setPriority(9);
		
		o1.start();
		o2.start();
		o3.start();
		
		


	}

}
