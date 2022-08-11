/*Write a program using string builtin function where you have to implement something by using the functions
 * 
 */
package string;

import java.util.Scanner;

public class String1 {
Scanner sc= new Scanner(System.in);
String s1,s2;// globally declared the variables
	public static void main(java.lang.String[] args) {// main class
		// TODO Auto-generated method stub
		String1 obj=new String1(); // creating the object of string class
		obj.compareto();	//calling campare to class
	obj.length();     //calling length class
		obj.indexof(); //calling index of class
		obj.charAt();   //calling char At class
	obj.replace();      //calling replace class
		obj.split();      //calling split class
	obj.morestring();     //calling more string class
	}
	// creating accept class
public void accept() {
	System.out.println("First String: "); // printing first string
	 s1=sc.next(); // accept first string from user
		System.out.println("Second String: "); // printing second string
		 s2=sc.next(); // accept second string from user
}
//creating compare to class
public void compareto() {
	System.out.println("\n\t\t.....THIS IS COMPARE TO STRING METHOD.....");
	accept(); // display the details of accept class
	boolean result=s1.equals(s2); // compare both string
	if(s1==s2)// check the condition
		System.out.println(result+","+"\tBoth string are equal.....");
	else
		System.out.println(result+","+"\tBoth string are not equal.....");
}
//creating length class
public void length()
{	System.out.println("\n\t\t.....THIS IS LENGTH STRING METHOD.....");
	accept();// display the details of accept class
	  // storing the length of both the  strings in variables
  int len1 = s1.length();
  int len2 = s2.length();
  if (len1 == len2) { // checking whether the length of the strings is equal or not
      System.out.println("The length of both the strings are equal which is: " + len1);// print if condition is true
  }
  else {
	  System.out.println("The length of both the strings are not equal");// print if condition is false
  }     	 
}
// creating the indexof class
public void indexof()
{ 	System.out.println("\n\n\t\t.....THIS IS INDEX OF STRING METHOD.....");
  accept();// display the details of accept class
  System.out.println("Enter the character to find that index:");
  String ch=sc.next();
  String ch1=sc.next();
  System.out.println("Found "+ch+" in string s1: "+s1.indexOf(ch));//printing the statement for string 1
  System.out.println("Found "+ch1+" in string s2: "+s2.indexOf(ch1));//printing the statement for string 2
}
//creating char at class
public void charAt() {
	System.out.println("\n\t\t.....THIS IS CHAR AT STRING METHOD.....");
	accept();// display the details of accept class
	System.out.println("String1");
	for (int i=0; i<=s1.length()-1; i++) {  // loop for checking the odd position of character
        if(i%2!=0) {  
         System.out.println("Char at "+i+" place: "+s1.charAt(i));        
        }  }System.out.println("String2");
	for (int i=0; i<=s2.length()-1; i++) {  // loop for checking the odd position of character
        if(i%2!=0) {  
         System.out.println("Char at "+i+" place: "+s2.charAt(i));        
        }  }
}
// creating the replace class
public void replace()
{	System.out.println("\n\t\t.....THIS IS REPLACE STRING METHOD.....");
	accept();// display the details of accept class
	  String str=s1.replace(s1,s2); // replacing the string1 with string 2
	 System.out.println("After replace s1 with s2: "+str); // print string after replace
	 String str2=s2.replace(s2,s1);// replacing the string2 with string 1
	 System.out.println("After replace s2 with s1: "+str2);// print string after replace
}
// creating split class
public void split()
{	System.out.println("\n\t\t.....THIS IS SPLIT STRING METHOD.....");
System.out.println("Enter the sentence or word to split:");
String str=sc.next();// accept the sentence or word from user
	 System.out.println("Enter the word from which we split the string:");
	String ch=sc.next();// accept the character from user to split
	 System.out.println("After the split : ");
	String[] word=str.split(ch);//splits the string based on whitespace  
	for(String w:word){  //using java foreach loop to print elements of string array 
	System.out.println(w);
}
}
// creating the class for using more string method
public void morestring()
{	System.out.println("\n\t\t.....SOME MORE STRING METHODS.....");
	accept();// display the details of accept class
	System.out.println("\n\t\t.....THIS IS UPPER CASE STRING METHOD.....");
	System.out.println("String1: "+s1.toUpperCase()+"\n"+"String2: "+s2.toUpperCase());// printing the strings in capital letters
	System.out.println("\n\t\t.....THIS IS LOWER CASE STRING METHOD.....");
	System.out.println("String1: "+s1.toLowerCase()+"\n"+"String: "+s2.toLowerCase());// printing the strings in small letters
	System.out.println("\n\t\t.....THIS IS START WITH STRING METHOD.....");
	 System.out.println("Enter the word :");
		String ch=sc.next();// accept the character from user to check
	System.out.println("String1 start with "+ch+": "+s1.startsWith(ch)+"\n"+
		"String2 start with "+ch+": "+s2.startsWith(ch));//check whether a string1 starts with a particular prefix
}
}
