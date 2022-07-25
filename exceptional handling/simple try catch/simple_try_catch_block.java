//this is a program of simple try catch method in exceptional handling
package exceptional_handling;

import java.util.Scanner;

public class simple_try_catch_block {
int a,b ;
	
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simple_try_catch_block obj=new simple_try_catch_block();
		obj.arth();
	}
public void arth()
{
	//try block is used for arithmetic  
	try
{
		b=10/a;
		System.out.println("Error");
}
	//Catching arithmetic exception
catch(ArithmeticException ae)
{
	System.out.println(ae);
}
	 // rest program will be executed
    System.out.println("Outside try-catch ");
}
}
