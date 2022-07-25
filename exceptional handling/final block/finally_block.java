//this is a program of  try catch method using finally block in exceptional handling
package exceptional_handling;

import java.util.Scanner;

public class finally_block {
	int[] arr = new int[4];
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finally_block obj=new finally_block();
		obj.arth();
		
	
	}
public void arth()
{
	  try
      {
          int i = arr[4];
               
          // this statement will never execute
          // as exception is raised by above statement
          System.out.println("Inside try block");
      }
       
      catch(ArrayIndexOutOfBoundsException ex)
      {
          System.out.println("Exception caught in catch block");
      }
       
      finally
      {
          System.out.println("finally block executed");
      }
       
      // rest program will be executed
      System.out.println("Outside try-catch-finally ");
  
}
}