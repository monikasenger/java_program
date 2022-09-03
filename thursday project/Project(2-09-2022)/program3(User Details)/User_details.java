/*Q3: Write a program to accept N User details Name, No , Address, email , UserID , Password .
 * Store user ID and password in the file .Accept  a  userID from the user and delete that record from the file.
 * 
 */
package Sep_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


import javax.swing.JOptionPane;

public class User_details {
	static String filename;// globally declared the variable
	static String name,address,email_id,user_id,password,phone_no;
	static Scanner sc=new Scanner(System.in);
	 private static Scanner x;
	 
	 
	//main method
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    file_create();
   file_write();
	    	  details_delete();
	  
	}
	
	/*************************************/
	//creating file create  method with throws exception
		public static void file_create() throws IOException {
			System.out.println("Enter your file name to create:");
			filename=sc.nextLine();
			//create a file
		File obj= new File("C:\\Users\\shubham\\Desktop\\anudip\\"+filename);
			obj.createNewFile();
			System.out.println("file is created with ("+filename+") name ");
		}
		
		/******************************************/
		
		//creating file write method with throws exception
		public static void file_write() throws IOException {
			Scanner sc1=new Scanner(System.in);
			File obj= new File("C:\\Users\\shubham\\Desktop\\anudip\\"+filename);
			FileWriter fw1=new FileWriter(obj);
			//create file writer for store the data
			// to store the data  in file
			System.out.println("How many user detail store in file:");
		      int n=sc.nextInt(); 
		      // user choice how many details they store in file 
	    	  for(int i=1;i<=n;i++) 
	    	  {	
			System.out.println("Enter your name:");
			name=sc1.nextLine();
			System.out.println("Enter your  Phone No :");
			phone_no=sc1.nextLine();
			System.out.println("Enter your  Address :");
			address=sc1.nextLine();
			System.out.println("Enter your Email Id :");
			email_id=sc1.nextLine();
			System.out.println("Enter your  UserID :");
			user_id=sc1.nextLine();
			System.out.println("Enter your Password :");
			password=sc1.nextLine();
			//write a data in the file
	    		  fw1.write("\n"+
	    		  user_id +","+name
			+","+phone_no+","+email_id+","+
					address);
	    	  }
			fw1.close();
		System.out.println("user details is writen in your file");
		}
		
		
		/**
		 * @throws IOException *******************************/
		
		//creating delete the details method with throws exception
		
		public static void details_delete() throws IOException {
			System.out.println("enter user id");
			// data use to delete form file
			String lineToRemove = sc.nextLine();
			File inputFile = new File(filename);
			File tempFile = new File("mona.txt");

			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
			String currentLine;

			while((currentLine = reader.readLine()) != null) {
			    // trim newline when comparing with lineToRemove
			    String trimmedLine = currentLine.trim();
			    if(trimmedLine.equals(lineToRemove)) continue;
			    writer.write(currentLine + System.getProperty("line.separator"));
			}
			writer.close(); 
			reader.close(); 
			boolean successful = tempFile.renameTo(inputFile); 
			}
	
}
