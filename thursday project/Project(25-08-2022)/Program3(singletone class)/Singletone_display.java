
/*Q3)Write a program to implement the use of singleton class
*/
package Aug_25;

public class Singletone_display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Instantiating Singleton class with variable text1 and text2 and text3
		Singletone_class text1 = Singletone_class.getInstance();
		Singletone_class text2 = Singletone_class.getInstance(); 
		Singletone_class text3 = Singletone_class.getInstance();
		  System.out.println("\t\t\t\t.......BY CREATING SINGLETONE CLASS......");
		  // text1 in original form
		  System.out.println("\nString in original form..........");
		    System.out.println("String from text1 :--- \n" + text1.str+"\n Value of text1: "+text1.hashCode());
		  //text2 in upper case with value
		    System.out.println("\nString in Upper Case..........");
		    System.out.println("String from text2 :--- \n" + text2.str.toUpperCase()+"\n Value of text2: "+text2.hashCode());
		    //text3 in lower case with value
		    System.out.println("\nString in Lower Case..........");
		    System.out.println("String from text2:--- \n" + text3.str.toLowerCase()+"\n Value of text3: "+text3.hashCode());
		 
		    
	
	} 
}
