//this is a program in which we use different  catch method in exceptional handling
package exceptional_handling;

import java.util.Scanner;

public class mutliple_catch_block {
int b,x;
Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mutliple_catch_block obj=new mutliple_catch_block();
		obj.array();
	}
public void array()
{
	//try block of array
try {
	int a[]= {10,20,30,40,50};
	x=a[5]/b;
}	//Catching arithmetic exception
catch(ArithmeticException ae)
{
	System.out.println(ae);
}//catching array exception
catch(ArrayIndexOutOfBoundsException ar)
{
	System.out.println(ar);
}
// rest program will be executed
System.out.println("Outside try-catch-catch ");
}
}
