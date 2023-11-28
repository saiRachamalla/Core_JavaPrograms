package producer.consumer.problem;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			Queue q=new Queue();
			producer p=new producer(q);
			consumer c=new consumer(q);
			
			p.start();
			c.start();
	}

}
