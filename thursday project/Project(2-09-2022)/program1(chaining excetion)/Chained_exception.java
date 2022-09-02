/*Write a program to create the chained exception where one exception describes the cause of another exception.
 * 
 */

package Sep_02;

import java.io.IOException;

public class Chained_exception {
 static int a,b;// globally declared the variable
 
 //main method
 public static void main(String[] args) {
	 Chained_exception ex=new Chained_exception();// create an object of class
	 ex.Exception2();// calling the second exception method
 }
 
 /**********************************/
 //create first exception method
	public static void Exception1() {
		//try block is used for arithmetic  
		 try
		 {
		 		b=10/a; 
		 
		 }//Catching arithmetic exception
		 catch(ArithmeticException ae)
		 { 	//creating an exception
		 NullPointerException e = new NullPointerException("Error");
			 e.initCause(new IOException("\tcause by:\t"+ae));
		throw e;
		 }  
	     }
	
/****************************************/
	//create second exception method
	     public  void Exception2() {
	    	//try block is used for  first exception method
	         try {
	        	 Exception1();
	         } 
	         catch (NullPointerException e) {
	            //displaying top level exception
	            System.out.println("Caught = " + e);
	            //displaying cause exception
	            System.out.println("Original cause = " + e.getCause());
	         }
	     }
	
	
}
