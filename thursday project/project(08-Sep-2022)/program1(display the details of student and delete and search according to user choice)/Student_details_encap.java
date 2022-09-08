*write a program to accept name, Email, Phone Number, Percentage from the user and store the data using arraylist.
 * Accept name from the user and remove all the data from the list and display the output. and also perform the searching operation with the help of the name.
 * 
 */
package Sep_08;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;




public class Student_details_encap {
  //globally declared
	 String name; 
	   String email;
	   String phone_no;
	   int percentage; 

	// Create three parameters constructor with parameters name, email, and phoneno,percentage. 
	   Student_details_encap(String name,String email,String phone_no,int percentage) 
	   { 
	     this.name = name; 
	     this.email=email;
	     this.phone_no=phone_no;
	     this.percentage=percentage;
	   } 
}
