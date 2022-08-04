/*Write a JAVA program which will generate the threads:

- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.
*/
package aug_4;

import java.util.Scanner;
//fibonacci series class extend by thread
public class Fibonacci_series extends Thread
{ 
	int n,a=0, b=1, c=0; // globally declared the values
	Scanner sc=new Scanner(System.in);// globally declared scanner statement
    public void run()
    {
    	System.out.print("\nEnter the size for fabonacci: \n"); // print size of fibonacci series
              n=sc.nextInt();
              System.out.println("\nFibonacci series:"); // print the fibonacci series
              while (n>0)// check the condition the size should greater than zero
              {
                   System.out.print(c+" "); // loop execute if condition is true
                   a=b;
                   b=c;
                   c=a+b;
                   n=n-1;
         try // try catch for sleep the thread
         { 
                  Thread.sleep(1000); // sleep the series for 1milisec
              }
         catch (Exception ex)
         {
              ex.printStackTrace();
         }
  }}}