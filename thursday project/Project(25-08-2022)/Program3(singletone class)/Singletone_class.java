/*Q3)Write a program to implement the use of singleton class
*/
package Aug_25;

import java.util.Scanner;

public class Singletone_class {
	// static variable s of type Singleton having null value 
	private static Singletone_class s = null;
    public String str; 
    // create private constructor of class
    private Singletone_class()
      {// store the string value
     str = "Hello! This is a java program.\n In this we create a single tone class";
    }
    
    
    //Static method to create instance of Singleton class
    public static Singletone_class getInstance()
    {
     if (s == null)
     s = new Singletone_class();
     return s;
    }
  }
