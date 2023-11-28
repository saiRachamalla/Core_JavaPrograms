package com.thread.group;
import java.lang.Runnable;
class operations implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
	
}
public class threadgroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup tg=new ThreadGroup("Group1");
        Thread t1=new Thread(tg,new operations(),"t1");
        Thread t2=new Thread(tg,new operations(),"t2");
        Thread t3=new Thread(tg,new operations(),"t3");
        
      
        ThreadGroup tg1=new ThreadGroup("Group2");
        Thread t4=new Thread(tg1,new operations(),"t4");
        Thread t5=new Thread(tg1,new operations(),"t5");
        Thread t6=new Thread(tg1,new operations(),"t6");
        tg1.setMaxPriority(1);
        tg.setMaxPriority(6);;
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        
        
        System.out.println(tg.activeCount());
        System.out.println(tg.activeGroupCount());
       
	}

}
