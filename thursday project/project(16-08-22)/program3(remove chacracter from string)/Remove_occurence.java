/*Write a program to accept a string from the user and accept a character from the user 
 * and remove all occurrences of a given character from input String.
 * 
 */
package Aug_16;

import java.util.Scanner;

public class Remove_occurence {
	static Scanner sc= new Scanner(System.in);
	  static String str;// globally declared the string
	char ch;// globally declared the char
	
	public static void main(String[] args)
	{
		Remove_occurence obj=new Remove_occurence();// Creating object for the class
		obj.removechar();// calling remove character method
	}
	//creating accept class
	public void accept() {
		System.out.println("Enter the string  : "); 
		 str=sc.nextLine();// accept the string form user
		 System.out.println("Enter the character: "); 
		 ch=sc.next().charAt(0);// accept the string form user
	}
	//creating remove character class
	public void removechar() {
		accept();// print the accept class details
		int i;// declared variable
		char[] delete_ch=str.toCharArray(); //Set delete charcter array  to char array value of string
		// for loop execute to check condition of index value  with delete character length 
		for(i=0;i<delete_ch.length;i++) {
			if(delete_ch[i]==ch) {
				delete_ch[i]=' ';   //Set delete_ch[i] to 0  character to avoid printing visited word 
				continue;
			}
		}
		//display the string after delete the character from string
		System.out.println("After delete the ("+ch+") from string"+" ");
		System.out.println(delete_ch);
	}
 
	}
