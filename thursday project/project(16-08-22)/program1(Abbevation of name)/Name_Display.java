/*Write a program to accept full name form the user and 
 * display the abbreviations of the first and middle names except the last name which is displayed as it is.
 *  EG: Name:Manoj Rakesh Gupta  . (M.R.Gupta)
 * 
 */
package Aug_16;

import java.util.Scanner;

public class Name_Display {
	Scanner sc= new Scanner(System.in);
	String fname, mname, lname,abbrivate;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name_Display obj= new Name_Display();// Creating object for the class
		obj.abbreviate(); //calling abbreviate method
	}
	//creating class to accept the name
	public void accept() {
		System.out.println("Enter the first name of the user: "); 
		 fname=sc.next(); // accept first name from user
		 System.out.println("Enter the middle name of the user: "); 
		 mname=sc.next(); // accept  middle name from user
		 System.out.println("Enter the last name of the user: "); 
		 lname=sc.next(); // accept last name from user
	}
	//creating class to abbreviate  the name
	public void abbreviate() {
		accept();// print the accept class details
	String	string=fname+mname+lname;
		String[] word=string.split(" ");//splits the string based on whitespace  
		for(String w:word){  //using java foreach loop to print elements of string array 
		System.out.print(w);
			/*System.out.println("\nEnter the full name of the user: \n"+fname+" "+mname+" "+lname); // display whole name of user
		abbrivate=fname.charAt(0)+"."+mname.charAt(0)+"."+lname; // abbreviating the fist and middle name
	    System.out.println("\nAfter Abbrevation of name:\n"+abbrivate);  // display after abbreviate the user name
		*/}}
}
