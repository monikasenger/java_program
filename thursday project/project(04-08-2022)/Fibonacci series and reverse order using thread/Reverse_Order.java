/*Write a JAVA program which will generate the threads:

- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.
*/
package aug_4;

import java.util.Scanner;
//reverse order class extend by thread
public class Reverse_Order extends Thread
{
	int n;// globally declared the values
	Scanner sc=new Scanner(System.in); // globally declared scanner statement
	 public void run()
	{
        System.out.println("\nEnter the size of reverse number: "); // print size of reverse order
        n = sc.nextInt();
	System.out.println("\nReverse is:");// print the reverse number
	for(int i=n;i>=1;i--)// for loop execute for printing the number in reverse order
	System.out.println(i);// print the numbers
	try // try catch for sleep the thread
	{
	 Thread.sleep(1000);// sleep the series for 1milisec
	}

	catch(Exception e)
	{
	 }
	}
	}