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
	//globally declared
	String name,email,uname,sname,semail;
	long phone_no,sphone;                         
	double percentage,spercentage;                                     
	int no,i,temp;                         
	Scanner sc=new Scanner(System.in);                 
	ArrayList<String> u_name=new ArrayList<>(no);	   //ArrayList1
	ArrayList<String> u_email=new ArrayList<>(no);       //ArrayList2
	ArrayList<Long> u_phone=new ArrayList<>(no);       //ArrayList3
	ArrayList<Double> u_percentage=new ArrayList<>(no);       //ArrayList4
	
	
	 // main method
	 public static void main(String[] args)
		{
		 Studentdetails obj=new  Studentdetails();//creating object of class
			   obj.display();//calling display method
			  obj.search();// calling search method
			   obj.delete();// calling delete method
			   }
	  
	  /*****************************************************/
	  
	  //method to display the details
	  public void display(){
		  //get size form user to store the no of user details
		  System.out.println("Enter the number how much data you want to store the user details:\t");  
			no=sc.nextInt();  
			//loop for storing the data according the size given by user
			for(i=1;i<=no;i++) { 
				System.out.println("\nDetails of "+i +" user........");
				System.out.println("\nEnter user name:");    //name of user
				name=sc.next();		
				System.out.println("Enter user E-mail:");       //email of user
				email=sc.next();		
				System.out.println("Enter user Phone no:");     //phone no of user
				phone_no=sc.nextLong();	
				System.out.println("Enter user Percentage :");   //percentage of user
				percentage=sc.nextDouble();
				
			 //stored the data in array list
			u_name.add(name);   
			u_email.add(email);
			u_phone.add(phone_no);
			u_percentage.add(percentage);
			}
			  System.out.println("**=============**=================**");
			  //display the details of user in array list
			System.out.println("\n\t\t\t\t...........Details of users are................");
			System.out.println("\nNames of users: "+u_name);					
			System.out.println("Emails of users: "+u_email);					
			System.out.println("Phone Nos of users: "+u_phone);					
			System.out.println("Percentages of users: "+u_percentage);
			  System.out.println("**=============**=================**");
}
	  
	  
 /******************************************/
	  
	  //method to search
	  public void search() {
		  System.out.println("\n\t\t\t\t...... SEARCH THE DATA FROM LIST.......");
		 //accept  the name from user to delete the data from list
			System.out.println("Enter the name of user for search:");           
			name=sc.next();
			//condition to search the data in the list
			if(u_name.contains(name))                          
			{
				// if condition is true than search the data
				u_name.indexOf(name);
				temp=u_name.indexOf(name);
				 sname=u_name.get(temp);
				 semail=u_email.get(temp);
				 sphone=u_phone.get(temp);
				 spercentage=u_percentage.get(temp);
				 // display the details of user for which we are searching
				System.out.println("\tSearching data of user ...........");
			System.out.println("Name of user= "+sname);
			System.out.println("Email id of user= "+semail);
			System.out.println("Phone no of user= "+sphone);
			System.out.println("Percentage of user= "+spercentage);
			 System.out.println("**=============**=================**");
			}
			else
			{// if condition is false than print statement
				System.out.println("\nUser data does not find......");
			}
			}
	  
	  
	  /*******************************************************/
	  
	  //method to delete
	  public void delete() {
		  System.out.println("\n\t\t\t\t...... DELETE THE DATA FROM LIST.......");
		  //accept the name from user for delete the data for list
			System.out.println("Enter the name of user to delete:");           
			uname=sc.next();
			//condition to delete the data in the list
			if(u_name.contains(uname))                          
			{
				// if condition is true than delete the data form list 
				u_name.indexOf(uname);
				temp=u_name.indexOf(uname);
				u_name.remove(temp);
				u_email.remove(temp);
				u_phone.remove(temp);
				u_percentage.remove(temp);
				System.out.println("\nUser data deleted successfully......!");
				 // display the details of user after delete the data
				System.out.println("\tAfter delete the data of user ...........");
				System.out.println("Name of user= "+u_name);
				System.out.println("Email id of user= "+u_email);
				System.out.println("Phone no of user= "+u_phone);
				System.out.println("Percentage of user= "+u_percentage);
				 System.out.println("**=============**=================**");
			}
			else
			{// if condition is false than print statement
				System.out.println("\nUser data does not find......");
			}		  
			}		 		
}
