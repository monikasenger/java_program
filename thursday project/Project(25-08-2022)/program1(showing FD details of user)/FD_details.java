/*Write a Java Program to Create a new text file and read the input from the user Name, Phone No,Bank name ,Account No,Type of Account,Amount for FD, Duration for FD 
 * Calculate the amount and display the final amount. Save the input in the text file and also store the FD imformation.
  */
package Aug_25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FD_details {
  // globally declared 
	static String filename;
	static String name,bank_name,acc_no,acc_type,phone_no;
	static Scanner sc=new Scanner(System.in);
	static int duration,amount=0,final_amount=0;
	static int interest;
	
	/******************************************/
  //main method
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    // calling create, write, read file method which is static
file_create(); 
file_write();
file_read();
	}
  
  /******************************************/
  
	//creating file create  method with throws exception
	public static void file_create() throws IOException {
		System.out.println("Enter your file name to create:");
		filename=sc.nextLine();
    // create a file 
	File obj= new File("C:\\Users\\shubham\\Desktop\\anudip\\"+filename);
		obj.createNewFile();
		System.out.println("file is created with ("+filename+") name ");
	}
	
	/******************************************/
	
	//creating file write method with throws exception
	public static void file_write() throws IOException {
		File obj= new File("C:\\Users\\shubham\\Desktop\\anudip\\"+filename);
		FileWriter fw1=new FileWriter(obj);
    // write the user details 
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your  Phone No :");
		phone_no=sc.nextLine();
		System.out.println("Enter your  Bank name :");
		bank_name=sc.nextLine();
		System.out.println("Enter your account number :");
		acc_no=sc.nextLine();
		System.out.println("Enter your  Type of Account :");
		acc_type=sc.nextLine();
		System.out.println("Enter your initial Amount for FD:");
		amount=sc.nextInt();
		System.out.println("Enter your  Duration for FD:");
		duration=sc.nextInt();
    // condition to find the final amount
		if(amount<1000) {
			interest=10;
			final_amount=amount+((amount*interest*duration)/100);
		}else if(amount<5000) {
			interest=20;
			final_amount=amount+((amount*interest*duration)/100);
		}else if(amount<10000) {
			interest=30;
			final_amount=amount+((amount*interest*duration)/100);
		} else if(amount<500000) {
			interest=50;
			final_amount=amount+((amount*interest*duration)/100);
		}else if(amount>500000) {
			System.out.println("there is no interest");
			final_amount=amount+((amount*interest*duration)/100);
		}
    // writte all the details
		fw1.write("Name of user: "+name
		+"\n Phone No of user: "+phone_no
		+"\n Bank name  of user: "+bank_name
		+"\nBank name  of user: "+acc_no
	+"\nType of Account of user: "+acc_type
		+"\nAmount for FD of user: "+amount
		+"\nDuration for FD : "+duration
		);
    // close the write function
		fw1.close();
		System.out.println("FD details is writen in your file");
	}
	
	/******************************************/
	
	//creating file read method with throws exception
	public static void file_read() throws FileNotFoundException {
		File obj= new File("C:\\Users\\shubham\\Desktop\\anudip\\"+filename);
		Scanner sc=new Scanner(obj);
		System.out.println("\nDetails of user are.............\n ");
    // condition for read the data of user
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine()+"\n Final amount : "+final_amount);	
		}
	}
	
	
	

}
