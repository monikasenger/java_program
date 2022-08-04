/*Write a program that creates 2 threads - each displaying a message 
 * (Pass the message as a parameter to the constructor).
 *The threads should display the messages continuously till the user presses any key.
*/
package aug_4;

public class MultiThread_Main {

	public static void main(String args[])  
	{
		MultiThread t1=new MultiThread("thread1 is running........"); // object of thread 1
		 MultiThread t2=new MultiThread("thread2 is running........"); // object of thread 2
		System.out.println("thread details");
		t1.start(); //  execute thread1  
		t2.start(); // execute thread2
	}

}
//the output of this program can't be terminate on eclipse but this program run properly in cmd