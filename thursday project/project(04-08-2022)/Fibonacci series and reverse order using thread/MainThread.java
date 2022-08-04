/*Write a JAVA program which will generate the threads:

- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.
*/
package aug_4;

public class MainThread {
    public static void main(String[] args)
    { 
    	Fibonacci_series fi = new Fibonacci_series();//object of Fibonacci series thread 
              fi.start();//call run method of Fibonacci series thread
         try
         { 
              fi.sleep(10000);// sleep the series for 10milisec 
         }
         catch (Exception ex)
         {
              ex.printStackTrace();
         }
         Reverse_Order rev = new Reverse_Order();//object of reverse order thread 
              rev.start();//call run method of reverse order thread
    }
}