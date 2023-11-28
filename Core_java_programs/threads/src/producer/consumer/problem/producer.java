package producer.consumer.problem;

public class producer extends Thread{
	Queue a;
	producer(Queue q){
		a=q;
	}
	
	public void run() {
		int i=0;
		while(true) {
	   try {
		a.produce(i++);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    
		}
	}
}
