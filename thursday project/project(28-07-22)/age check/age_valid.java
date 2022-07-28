package exception_project;

import java.util.Scanner;

public class age_valid {
	Scanner s = new Scanner(System.in);
	  int age;
//main class
public static void main(String[] args) {
	age_valid obj=new age_valid();
	obj.age();
}
//creating age class
	public void age()
{
	
	  try {
		  System.out.print("Enter your age : ");
		   age = s.nextInt();
		   
		check_age(age);
	  }
	  catch (ArithmeticException e) {
	   System.out.println(e);
	  }
	 }
	//class created to check the age
	public void check_age(int b) 
	 {
		 if(b < 18)
		 {
			 throw new ArithmeticException("\n Invalid age ...."
			 		+ "\n age should be greater than 18"); 
			
		 }
		 else
		 {
			 throw new ArithmeticException("valid age....");
		 }
	 }
	
}
