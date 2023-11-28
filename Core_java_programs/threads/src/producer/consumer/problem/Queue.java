package producer.consumer.problem;

import java.util.concurrent.Semaphore;

public class Queue {
	int x;
	 //static Semaphore Con = new Semaphore(0);
	  //static Semaphore Prod = new Semaphore(1);
	
	public void produce(int i) throws InterruptedException {
		// TODO Auto-generated method stub
		//Con.acquire();
		x=i;
		System.out.println("producer has produced the data "+x);
		//Prod.release();
	}

	public void consume() throws InterruptedException {
		//Prod.acquire();
		// TODO Auto-generated method stub
		System.out.println("consumer has consumed the data "+x);
		//Con.release();
	}

}
