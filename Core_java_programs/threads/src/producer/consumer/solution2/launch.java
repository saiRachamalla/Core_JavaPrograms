package producer.consumer.solution2;

public class launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Queue q1=new Queue();
         prod p=new prod(q1);
         consum c=new consum(q1);
         
         p.start();
         c.start();
	}

}
