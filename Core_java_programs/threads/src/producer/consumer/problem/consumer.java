package producer.consumer.problem;

public class consumer extends Thread{
	Queue b;
    consumer(Queue q){
    	b=q;
    }
    
    public void run() {
    	while(true) {
    		try {
				b.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    	}
    }
}
