package producer.consumer.solution2;

public class consum extends Thread {
Queue b;
public consum(Queue q) {
	b=q;
}

public void run() {
	while(true) {
		b.consume();
	}

}
}
