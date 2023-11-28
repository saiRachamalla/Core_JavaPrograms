package producer.consumer.solution2;

public class prod extends Thread {
Queue a;
prod(Queue q){
	a=q;
}
public void run() {
	// TODO Auto-generated method stub
    int i=0;
    while(true) {
    	a.produce(i++);
    }
}
}
