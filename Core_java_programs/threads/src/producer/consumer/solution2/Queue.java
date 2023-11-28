package producer.consumer.solution2;

public class Queue {
    int x;
    boolean value_x=false;

	synchronized void produce(int i) {
		// TODO Auto-generated method stub
		try {
			if(value_x==false) {
				x=i;
				System.out.println("producer produced "+x);
				value_x=true;
				notify();
			}
			else {
				wait();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	synchronized void consume() {
		// TODO Auto-generated method stub
		try {
			if(value_x==true) {
				System.out.println("consumer consumed "+x);
				value_x=false;
				notify();
			}
			else {
				wait();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
