//this is a program in which we use throw method with try catch block in exceptional handling

package exceptional_handling;

import java.util.Scanner;

public class throw_block {
	  
	int a;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		throw_block obj=new throw_block();
		obj.even_odd();
	}
//creating even odd class where we accept number from user and display it with try catch method
	public void even_odd()
	{
		try
		{
			System.out.println("Enter a number");
			a=sc.nextInt();
			check_demo(a);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	
	  System.out.println("Outside try-catch of even odd ");
	}
// class to check and using throw method by using if else loop
	public void check_demo(int b) 
	 {
		 if(b %2==0)
		 {
			 throw new ArithmeticException("It is an even Number ....");
		 }
		 else
		 {
			 throw new ArithmeticException("It is odd...");
		 }
	 } 
}