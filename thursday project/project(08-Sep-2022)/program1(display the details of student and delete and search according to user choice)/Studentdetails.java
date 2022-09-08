/*write a program to accept name, Email, Phone Number, Percentage from the user and store the data using arraylist.
 * Accept name from the user and remove all the data from the list and display the output. and also perform the searching operation with the help of the name.
 * 
 */
package Sep_08;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;



public class  Studentdetails
{
	String uname;
	 Scanner sc=new Scanner(System.in);
	
	 
	 // main method
	 public static void main(String[] args)
		{
		 Studentdetails obj=new  Studentdetails();
			   obj.display();
			   obj.search();
			   obj.delete();
			   }
	 
	 /*******************************************/
	 
	  ArrayList<Student_details_encap> studentData()
	   { 
	// Create three objects of the class Student and pass arguments to the constructor. 
		  Student_details_encap s1 = new Student_details_encap("monika", "ms23@gmail.com","9475748394",85); 
		  Student_details_encap s2 = new Student_details_encap("pia", "pi6@gmail.com","943564394",56 ); 
		  Student_details_encap s3 = new Student_details_encap("tanvi", "tanvi87@gmail.com","7854648394",67); 
		  Student_details_encap s4 = new Student_details_encap("kirti", "ki677@gmail.com","7654788894",77); 
		  Student_details_encap s5 = new Student_details_encap("sakshi", "sak6gh@gmail.com","7677898394",67); 

	// Create the object of ArrayList of generic type 'Student'. 
	    ArrayList<Student_details_encap> studentlist = new ArrayList<Student_details_encap>(); 

	// Now add Student objects in the ArrayList using reference variable studentlist. 
	     studentlist.add(s1); 
	     studentlist.add(s2); 
	     studentlist.add(s3); 
	     studentlist.add(s4); 
	     studentlist.add(s5); 
	// Return object reference variable 'studentlist' of the array list to the method 'studentValue'. 
	     return studentlist; 
	   } 
	  
	  /*****************************************************/
	  
	  //method to display the details
	  public void display(){
	  { 
	  // Call AddingData class by creating object of that class. 
		  Studentdetails  data = new Studentdetails (); 

	  // Call studentData() method using reference variable data. 
	     ArrayList<Student_details_encap> listst = data.studentData(); 

	  // Now iterate and display all the Student data. 
	     for(Student_details_encap st:listst)
	     { 
	       System.out.println("Student's name: " +st.name); 
	       System.out.println("Student email id " +st.email); 
	       System.out.println("Phone number: " +st.phone_no); 
	       System.out.println("Percentage: " +st.percentage); 
	     } 
	    } 
	  }
	  
	  /*******************************************************/
	  
	  //method to delete
	  public void delete() {
		  Studentdetails  data = new Studentdetails (); 

		  // Call studentData() method using reference variable data. 
		     ArrayList<Student_details_encap> listst = data.studentData(); 
		     System.out.println("Enter the Name to delete : ");
				uname = sc.next();
		  // Now iterate and display all the Student data. 
		     for(Student_details_encap st:listst) {
		    	 if(st.name==uname) {
		    		int a= st.name.indexOf(uname);
		    		 listst.remove(a);
		    		 System.out.println("Student's name: " +st.name); 
		  	       System.out.println("Student email id " +st.email); 
		  	       System.out.println("Phone number: " +st.phone_no); 
		  	       System.out.println("Percentage: " +st.percentage);
		    	 }
		     }
	  }
	  
	  /******************************************/
	  
	  //method to search
	  public void search() {
		  Studentdetails  data = new Studentdetails (); 

		  // Call studentData() method using reference variable data. 
		     ArrayList<Student_details_encap> listst = data.studentData(); 
		     System.out.println("Enter the Name to search : ");
				uname = sc.next();
		  // Now iterate and display all the Student data. 
		     for(Student_details_encap st:listst) {
		    	 if(st.name==uname) {
		    		int a= st.name.indexOf(uname);
		    		 listst.get(a);
		    		 System.out.println("Student's name: " +st.name); 
		  	       System.out.println("Student email id " +st.email); 
		  	       System.out.println("Phone number: " +st.phone_no); 
		  	       System.out.println("Percentage: " +st.percentage);
		    	 }
		     }
	  }
}
