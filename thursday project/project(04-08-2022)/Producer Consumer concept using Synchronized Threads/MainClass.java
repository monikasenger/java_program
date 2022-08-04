/*Write a Java program using Synchronized Threads, which demonstrates Producer Consumer concept.
Producer Consumer problem:
The producer-consumer problem is the classical concurrency of a multi process synchronization problem. 
It is also known as bound-buffer problem.
The problem describes two processes, the producer and the consumer, who share a common, fixed-size buffer used as a queue. 
The producer generates a piece of data, put it into the buffer and starts again.
*/package aug_4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem c = new Problem(); 
         Producer p1 = new Producer(c,1); //object create for producer thread 
         p1.start();//call run method of producer thread
         Consumer c1 = new Consumer(c,1);//object create for consumer thread
         c1.start();//call run method of consumer thread
	}

}
